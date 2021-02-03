package com.company;

import java.util.ArrayList;
import java.util.List;

public class Coleccion
{
    private List<Videojuego> lista;

    public Coleccion()
    {
        lista = new ArrayList<>();
    }

    public void insertaVideojuego(Videojuego v) {lista.add(v);}
    public void eliminaVideojuego(int pos) {lista.remove(pos);}
    public Videojuego getVideojuego(int pos) {return lista.get(pos);}

    @Override
    public String toString()
    {
        int maxTitulo = cuentaChar(1);
        int maxPlataforma = cuentaChar(2);
        int maxTipoJuego = cuentaChar(3);

        String listastr = "";
        listastr += "Videojuegos";
        listastr += espaciado(maxTitulo - 8);
        listastr += "Año    ";
        listastr += "Plataforma";
        listastr += espaciado(maxPlataforma - 7);
        listastr += "Tipo de juego";
        listastr += espaciado(maxTipoJuego - 10);
        listastr += "Val." + "\n";

        int i;
        String lineas = "";
        for (i = 0; i < listastr.length(); i++)
        {
            lineas += "-";
        }
        listastr += lineas + "\n";

        String[] plataforma = {"PC", "PlayStation 4", "Xbox One", "Switch"};
        for (i = 0; i < lista.size(); i++)
        {
            listastr += lista.get(i).getNombre();
            int espacios = maxTitulo - lista.get(i).getNombre().length();
            listastr += espaciado(espacios + 3);
            listastr += lista.get(i).getAnno() + "   ";
            listastr += plataforma[lista.get(i).getPlataforma().ordinal()];
            espacios = maxPlataforma - lista.get(i).getPlataforma().toString().length();
            listastr += espaciado(espacios + 3);
            listastr += lista.get(i).getTipoJuego().toString();
            espacios = maxTipoJuego - lista.get(i).getTipoJuego().toString().length();
            listastr += espaciado(espacios + 3);
            listastr += lista.get(i).getValoracion() + "\n";
        }
        return listastr;
    }
    public String toStringNum()
    {
        String listanum = "";
        int i;
        for (i = 1; i <= lista.size(); i++)
        {
            listanum += i + "- ";
            listanum += lista.get(i-1).getNombre() + "\n";
        }
        return listanum;
    }
    public int cuentaChar(int columna)
    {
        int i, max = 0;
        switch (columna)
        {
            case 1:
            {
                max = "Videojuegos".length();
                for (i = 0; i < lista.size(); i++)
                {
                    if (lista.get(i).getNombre().length() > max)
                    {
                        max = lista.get(i).getNombre().length();
                    }
                }
            }
                break;
            case 2:
            {
                max = "Plataforma".length();
                for (i = 0; i < lista.size(); i++)
                {
                    if (lista.get(i).getPlataforma().toString().length() > max)
                    {
                        max = lista.get(i).getPlataforma().toString().length();
                    }
                }
            }
            break;
            case 3:
            {
                max = "Tipo de juego".length();
                for (i = 0; i < lista.size(); i++)
                {
                    if (lista.get(i).getTipoJuego().toString().length() > max)
                    {
                        max = lista.get(i).getTipoJuego().toString().length();
                    }
                }
            }
                break;
            default:
                System.out.println("------ERROR------");
        }

        return max;
    }
    public String espaciado(int i)
    {
        String espacios = "";
        while (i > 0)
        {
            espacios += " ";
            i--;
        }
        return espacios;
    }
}
