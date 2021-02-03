package com.company;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class Dinero
{
    static List<Moneda> listamonedas;
    private double cantidad;
    private TipoMoneda tMoneda;

    // STATIC
    static
    {
        listamonedas = new ArrayList<>();
        listamonedas.add(new Moneda(TipoMoneda.euro, 2, "€", 1.0, "EUR"));
        listamonedas.add(new Moneda(TipoMoneda.dolar, 2, "$", 1.14, "USD"));
        listamonedas.add(new Moneda(TipoMoneda.yen, 0, "¥", 118.81, "JPY"));
        listamonedas.add(new Moneda(TipoMoneda.libra, 2, "£", 0.87, "GBP"));
        listamonedas.add(new Moneda(TipoMoneda.bitcoin, 0, "₿", 0.00014, "BTC"));
        actualizaListaInternet();
    }

    // CONSTRUCTORES
    public Dinero(double cantidad, TipoMoneda tMoneda)
    {
        this.tMoneda = tMoneda;
        this.cantidad = cantidad;
    }
    public Dinero(int cantidad, TipoMoneda tMoneda)
    {
        this.tMoneda = tMoneda;
        this.cantidad = cantidad;
    }

    // PROPIEDADES
    public double getCantidad() {return this.cantidad;}
    public void setCantidad(double cantidad)
    {
        this.cantidad = cantidad;
    }
    public TipoMoneda gettMoneda() {return this.tMoneda;}
    public void settMoneda(TipoMoneda tMoneda)
    {
        this.tMoneda = tMoneda;
    }

    // MÉTODOS
    public static void actualizaCambio (TipoMoneda t, double cambio)
    {
        if (cambio >= 0.0)
        {
            int decimales = listamonedas.get(t.ordinal()).getDecimales();
            String simbolo = listamonedas.get(t.ordinal()).getSimbolo();
            String codigo = listamonedas.get(t.ordinal()).getCodigo();
            Moneda act = new Moneda(t, decimales, simbolo, cambio, codigo);
            listamonedas.set(t.ordinal(), act);
        }
        else
        {
            throw new InvalidParameterException("No se puede actualizar");
        }
    }
    private static Moneda buscaMoneda (TipoMoneda t) {return listamonedas.get(t.ordinal());}
    public double valorEn(TipoMoneda t)
    {
            double valor = this.cantidad / buscaMoneda(tMoneda).getCambioEuro();
            return valor * buscaMoneda(t).getCambioEuro();
    }
    public Dinero convierteEn(TipoMoneda t)
    {
        double valor = this.cantidad / buscaMoneda(tMoneda).getCambioEuro();
        return new Dinero(valor * buscaMoneda(t).getCambioEuro(), t);
    }
    @Override
    public String toString()
    {
        double redondeo = 1.0;
        int i;
        for (i = 0; i < buscaMoneda(tMoneda).getDecimales(); i++)
        {
            redondeo *= 10.0;
        }
        cantidad = Math.round(cantidad * redondeo) / redondeo;
        return cantidad + buscaMoneda(tMoneda).getSimbolo();
    }
    public String toString(TipoMoneda t)
    {
        double redondeo = 1.0;
        int i;
        for (i = 0; i < buscaMoneda(tMoneda).getDecimales(); i++)
        {
            redondeo *= 10.0;
        }
        cantidad = Math.round(cantidad * redondeo) / redondeo;
        return cantidad + buscaMoneda(t).getSimbolo();
    }

    // OPERADORES
    public Dinero add(Dinero d)
    {
        if (this.tMoneda != d.gettMoneda())
        {
            d = d.convierteEn(this.tMoneda);
        }
        return new Dinero(this.cantidad + d.getCantidad(), this.tMoneda);
    }
    public Dinero substract(Dinero d)
    {
        if (this.tMoneda != d.gettMoneda())
        {
            d = d.convierteEn(this.tMoneda);
        }
        return new Dinero(this.cantidad - d.getCantidad(), this.tMoneda);
    }
    public Dinero multiply(Dinero d)
    {
        if (this.tMoneda != d.gettMoneda())
        {
            d = d.convierteEn(this.tMoneda);
        }
        return new Dinero(this.cantidad * d.getCantidad(), this.tMoneda);
    }
    public Dinero divide(Dinero d)
    {
        if (this.tMoneda != d.gettMoneda())
        {
            d = d.convierteEn(this.tMoneda);
        }
        return new Dinero(this.cantidad / d.getCantidad(), this.tMoneda);
    }
    public Dinero negate()
    {return new Dinero(this.cantidad * -1, this.tMoneda);}
    public boolean equals(Dinero d)
    {
        boolean igual = false;
        if (this.tMoneda == d.gettMoneda() && this.valorEn(TipoMoneda.euro) == d.valorEn(TipoMoneda.euro))
        {
                igual = true;
        }
        else
        {
            d = d.convierteEn(TipoMoneda.euro);
            if (this.valorEn(TipoMoneda.euro) == d.valorEn(TipoMoneda.euro))
            {
                igual = true;
            }
        }
        return igual;
    }
    public int compareTo(Dinero d)
    {
        return Double.compare(this.valorEn(TipoMoneda.euro), d.valorEn(TipoMoneda.euro));
        // Devuelve -1 si es menor, 0 si es igual y 1 si es mayor
    }
    public static double actualizaInternet(String codigo)
    {
        //TODO: Arreglar operaciones con Bitcoins
        double cambio = 0.0;
        String enlace = "";
            try
            {
                if (codigo.equals("BTC"))
                {
                    enlace += "https://blockchain.info/tobtc?currency=EUR&value=1";
                }
                else
                {
                    enlace += "https://api.exchangeratesapi.io/latest?symbols=" + codigo;
                }
                URL usd = new URL(enlace);
                InputStream is = usd.openStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                String page = br.readLine();
                if (codigo.equals("BTC"))
                {
                    cambio += Double.parseDouble(page);
                }
                else
                {
                    cambio += Double.parseDouble(page.substring(16, page.indexOf('}')));
                }
                br.close();
                is.close();
            }
            catch (Exception e) {}

        return cambio;
    }
    public static void actualizaListaInternet()
    {
        int i;
        for (i = 1; i < listamonedas.size(); i++)
        {
            double cambio = actualizaInternet(listamonedas.get(i).getCodigo());
            if (cambio > 0.0)
            {
                listamonedas.get(i).setCambioEuro(cambio);
            }
        }
    }
}

