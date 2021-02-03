package com.company;

import java.security.InvalidParameterException;

public class Coche
{
    // TODO Atributos

    String matricula;
    String marca;
    String modelo;
    private int cilindrada;
    private double precio;
    boolean nuevo;

    // TODO Constructores

    public Coche(String matricula, String marca, String modelo,
                 int cilindrada, double precio, boolean nuevo)
    {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        if (cilindrada >= 50)
        {
            this.cilindrada = cilindrada;
        }
        else
        {
            throw new InvalidParameterException("Cilindrada no válida");
        }
        this.precio = precio;
        this.nuevo = nuevo;
    }

    public Coche() {} // No se debe hacer, preferible el otro constructor

    public Coche(String matricula, String marca, String modelo)
    {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = 0; // Valores por defecto
        this.precio = 0.0;
        this.nuevo = true;
    }

    // TODO Métodos

    public double rebaja(double porcentaje)
    {
        double descuento = (this.precio * porcentaje) / 100.0;
        double precioFinal = this.precio - descuento;
        return precioFinal;
    }

    // TODO Propiedades (son mentiras en Java = no existen)

    public double getPrecio() // Propiedad de sólo lectura
    {
        return this.precio;
    }
    public void setPrecio(double nuevoValor)
    {
        if (nuevoValor > 0)
        {
            this.precio = nuevoValor;
        }
        else
        {
            throw new InvalidParameterException("El precio no puede ser negativo");
        }
    }

    public double getCilindrada() // Propiedad de sólo lectura
    {
        return this.cilindrada;
    }
    public void setCilindrada(int nuevoValor)
    {
        if (nuevoValor > 0)
        {
            this.cilindrada = nuevoValor;
        }
        else
        {
            throw new InvalidParameterException("Cilindrada inválida");
        }
    }

    @Override
    public String toString()
    {
        return this.marca + " " + this.modelo + ", matrícula " + this.matricula;
    }
}
