package com.company;

import java.util.LinkedList;
import java.util.List;

public class Jugador
{
    private int numJugador;
    private List<Carta> cartasRobadas;

    public Jugador (int numJugadores)
    {
        int i;
        for (i = 0; i < numJugadores; i++)
        {
            cartasRobadas = new LinkedList<>();
        }
    }

    public int getNumJugador() {return numJugador;}
}
