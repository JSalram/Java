package com.company;

import java.security.InvalidParameterException;

public class Carta
{   // Atributos
    private int numero;
    private int palo;

    // Constructores
    public Carta (int numero, int palo)
    {
        if (numero > 0 && numero <= 10)
        {
            this.numero = numero;
        }
        else
        {
            throw new InvalidParameterException("El número de la carta debe ser entre 1 y 10");
        }
        if (palo > 0 && palo <= 4)
        {
            this.palo = palo;
        }
        else
        {
            throw new InvalidParameterException("El palo de la carta debe ser entre 1 y 4");
        }
    }
    public Carta (int id)
    {
        int[] palo = {0, 10, 20, 30};
        int i;

        if (id >= 0 && id < 40)
        {
            this.numero = id - palo[id/10];
            this.palo = palo[id/10] / 10;
        }
        else
        {
            throw new InvalidParameterException("El número de la carta en la baraja debe ser entre 1 y 40");
        }
    }

    // Propiedades
    public int getNumero()
    {
        return this.numero;
    }
    public int getPalo()
{
    return this.palo;
}

    // Métodos
    public String nombreNumero()
    {
        String[] nombre =   {"As", "Dos", "Tres", "Cuatro", "Cinco",
                            "Seis", "Siete", "Sota", "Caballo", "Rey"};
        return nombre[this.numero];
    }
    public String nombrePalo()
    {
        String[] nombre = {"oros", "copas", "espadas", "bastos"};
        return nombre[this.palo];
    }
    public String nombreCarta()
    {
        return nombreNumero() + " de " + nombrePalo();
    }
    public double valor7ymedia()
    {
        if (this.numero <= 6)
        {
            return this.numero+1;
        }
        else
        {
            return 0.5;
        }
    }
}

