package com.company;

enum UnidadLongitud {metros, pulgadas, pies, yardas}

public class Longitud
{
    private double cantidad;
    private final UnidadLongitud unidad;
    private static final double[] valores = {1, 0.0254, 0.3048, 0.9144};

    // Constructores
    public Longitud(int cantidad, UnidadLongitud unidad)
    {
        this.cantidad = cantidad;
        this.unidad = unidad;
    }
    public Longitud(double cantidad, UnidadLongitud unidad)
    {
        setCantidad(cantidad);
        this.unidad = unidad;
    }

    // Propiedades
    public double getCantidad() {return this.cantidad;}
    public void setCantidad(double cantidad) {this.cantidad = cantidad;}
    public UnidadLongitud getUnidad() {return this.unidad;}

    // Métodos
    public double valorEnMetros() {return this.cantidad * valores[getUnidad().ordinal()];}
    @Override
    public String toString()
    {
        String[] unidades = {"m", "in", "ft", "yd"};
        return cantidad + unidades[unidad.ordinal()];
    }

    // Operadores aritméticos
    public void add(Longitud l2)
    {
        cantidad = valorEnMetros() + l2.valorEnMetros();
        if (unidad.ordinal() == l2.getUnidad().ordinal())
        {
            cantidad *= valores[unidad.ordinal()];
        }
    }
    public void substract(Longitud l2)
    {
        cantidad = valorEnMetros() - l2.valorEnMetros();
        if (unidad.ordinal() == l2.getUnidad().ordinal())
        {
            cantidad *= valores[unidad.ordinal()];
        }
    }
    public void multiply(Longitud l2) {cantidad = (valorEnMetros() * l2.valorEnMetros()) * valores[unidad.ordinal()];}
    public void divide(Longitud l2) {cantidad = (valorEnMetros() / l2.valorEnMetros()) * valores[unidad.ordinal()];}

    // Operadores de comparación
    public boolean equals(Longitud l2)
    {
        if (unidad == l2.getUnidad())
        {
            return cantidad == l2.getCantidad();
        }
        else
        {
            return valorEnMetros() == l2.valorEnMetros();
        }
    }
    public int compareTo(Longitud l2) {return Double.compare(valorEnMetros(), l2.valorEnMetros());}
}
