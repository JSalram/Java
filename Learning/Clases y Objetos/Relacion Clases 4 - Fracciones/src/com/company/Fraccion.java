package com.company;

import java.security.InvalidParameterException;

public class Fraccion
{
    private int numerador;
    private int denominador;

    public Fraccion (int numerador, int denominador)
    {
        this.numerador = numerador;
        setDenominador(denominador);
    }
    public Fraccion (int numerador)
    {
        this.numerador = numerador;
        this.denominador = 1;
    }
    public Fraccion (double numero)
    {
        this.denominador = 1;
        while (numero % 1 != 0)
        {
            numero *= 10;
            this.denominador *= 10;
        }
        this.numerador = (int)numero;
        simplificar();
    }

    public int getNumerador() {return numerador;}
    public void setNumerador(int numerador) {this.numerador = numerador;}
    public int getDenominador() {return denominador;}
    public void setDenominador(int denominador)
    {
        if (denominador != 0)
        {
            this.denominador = denominador;
        }
        else
        {
            throw new InvalidParameterException("Denominador no puede ser 0");
        }
    }
    public double getValor() {return (double)this.numerador / (double)this.denominador;}

    public Fraccion negate()
    {
        Fraccion f = new Fraccion(numerador, denominador);

        if (numerador > 0 && denominador > 0 || numerador < 0 && denominador > 0)
        {
            numerador = numerador * -1;
        }
        else if (numerador < 0 && denominador < 0 || numerador > 0 && denominador < 0)
        {
            denominador = denominador * -1;
        }
        return f;
    }
    public Fraccion add(Fraccion f2)
    {
        Fraccion f = new Fraccion(numerador, denominador);
        int denomComun = denominador * f2.getDenominador();
        numerador = (denomComun / denominador) * numerador;
        f2.setNumerador((denomComun / f2.getDenominador()) * f2.getNumerador());
        numerador += f2.getNumerador();
        denominador = denomComun;
        simplificar();
        return f;
    }
    public Fraccion substract(Fraccion f2)
    {
        Fraccion f = new Fraccion(numerador, denominador);
        int denomComun = denominador * f2.getDenominador();
        numerador = (denomComun / denominador) * numerador;
        f2.setNumerador((denomComun / f2.getDenominador()) * f2.getNumerador());
        numerador -= f2.getNumerador();
        denominador = denomComun;
        simplificar();
        return f;
    }
    public Fraccion multiply(Fraccion f2)
    {
        Fraccion f = new Fraccion(numerador, denominador);
        numerador *= f2.getNumerador();
        denominador *= f2.getDenominador();
        simplificar();
        return f;
    }
    public Fraccion divide(Fraccion f2)
    {
        Fraccion f = new Fraccion(numerador, denominador);
        numerador *= f2.getDenominador();
        denominador *= f2.getNumerador();
        simplificar();
        return f;
    }
    public boolean equals(Fraccion f2)
    {
        boolean igual = false;
        Fraccion f = new Fraccion(numerador, denominador);
        f.simplificar(); f2.simplificar();
        if (f.getDenominador() == f2.getDenominador() && f.getNumerador() == f.getNumerador())
        {
            igual = true;
        }
//        if (f.getValor() == f2.getValor())
//        {
//            igual = true;
//        }
        return igual;
    }
    public int compareTo(Fraccion f2)
    {
        Fraccion f = new Fraccion(numerador, denominador);

        return Double.compare(f.getValor(), f2.getValor());
        // Devuelve -1 si es menor, 0 si es igual y 1 si es mayor
    }

    public void simplificar()
    {
        int i, max;
        max = Math.max(numerador, denominador);
        for (i = 1; i <= max; i++)
        {
            if (numerador % i == 0 && denominador % i == 0)
            {
                numerador = numerador/i;
                denominador = denominador/i;
            }
        }
    }
    @Override
    public String toString()
    {
        return numerador + "/" + denominador;
    }
}