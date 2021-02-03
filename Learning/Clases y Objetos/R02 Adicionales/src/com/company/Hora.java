package com.company;

import java.security.InvalidParameterException;

public class Hora
{
    private int segundos;

    public Hora (int segundos)
    {
        setSegundosTotales(segundos);
    }
    public Hora (int hora, int minutos, int segundos)
    {
        setSegundosTotales(hora * 3600 + minutos * 60 + segundos);
    }

    public int getSegundosTotales () {return this.segundos;}
    public void setSegundosTotales (int segundos)
    {
        if (segundos >= 0)
        {
            this.segundos = segundos;
        }
        else
        {
            throw new InvalidParameterException("La hora no puede ser negativa");
        }
    }
    public int getHoras() {return this.segundos / 3600;}
    public int getMinutos() {return (this.segundos % 3600) / 60;}
    public int getSegundos() {return (this.segundos % 3600) % 60;}

    public void add (Hora h)
    {
        setSegundosTotales(this.segundos + h.getSegundosTotales());
    }
    public void substract (Hora h)
    {
        setSegundosTotales(this.segundos - h.getSegundosTotales());
    }

    @Override
    public String toString()
    {
        String minutos = String.valueOf(getMinutos());
        if (getMinutos() < 10)
        {
            minutos = "0" + getMinutos();
        }
        return getHoras() + ":" + minutos + ":" + getSegundos();
    }
}
