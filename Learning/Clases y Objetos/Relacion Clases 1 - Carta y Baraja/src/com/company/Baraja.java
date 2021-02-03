package com.company;

import java.security.InvalidParameterException;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Baraja
{   // Atributos
    private List<Carta> listaCartas;

    // Constructores
    public Baraja() {listaCartas = new LinkedList<>();}
    public Baraja(int tipoBaraja)
    {
    this();

    Carta c;
    int i;
    if (tipoBaraja == 1)
    {
        for (i = 0; i < 40; i++)
        {
            c = new Carta(i);
            listaCartas.add(c);
        }
    }
    else if (tipoBaraja == 2)
    {
        for (i = 0; i < 40; i++)
        {
            c = new Carta(i);
            listaCartas.add(c);
            c = new Carta(i);
            listaCartas.add(c);
        }
    }
    else
    {
        throw new InvalidParameterException("Tipo de baraja inválido");
    }
    }
    public Baraja(int tipoBaraja, boolean barajar)
    {
        this(tipoBaraja);

        int i;
        barajar = false;
        for (i = 0; i < listaCartas.size(); i++)
        {
            if (i != listaCartas.size()-1 &&
               (listaCartas.get(i).getNumero() == listaCartas.get(i+1).getNumero() ||
                listaCartas.get(i).getNumero() == listaCartas.get(i).getNumero()+1))
            {
                barajar = true;
                i = listaCartas.size();
            }
        }
    }

    // Métodos
    public void barajar()
    {Collections.shuffle(listaCartas);}
    public void cortar (int numeroCartas)
    {
        int i;
        if (numeroCartas < listaCartas.size())
        {
            while (numeroCartas > 0)
            {
                listaCartas.add(listaCartas.size(), listaCartas.get(0));
                listaCartas.remove(0);
                numeroCartas--;
            }
        }
        else
        {
            throw new InvalidParameterException("No hay tantas cartas como para cortar en esa posición");
        }
    }
    public Carta robar ()
    {
        Carta cartaRobada = listaCartas.get(0);
        listaCartas.remove(listaCartas.get(0));
        return cartaRobada;
    }
    public void insertaCartaFinal (int idCarta)
    {
        Carta c = new Carta(idCarta);
        listaCartas.add(c);
    }
    public void insertaCartaPrincipio (int idCarta)
    {
        Carta c = new Carta(idCarta);
        listaCartas.add(0, c);
    }
    public void insertaCartaFinal (Carta c)
    {
        listaCartas.add(c);
    }
    public void insertaCartaPrincipio (Carta c)
    {
        listaCartas.add(0, c);
    }
    public int numeroCartas () {return listaCartas.size();}
    public boolean vacia()
    {
        return listaCartas.size() == 0;
    }
}
