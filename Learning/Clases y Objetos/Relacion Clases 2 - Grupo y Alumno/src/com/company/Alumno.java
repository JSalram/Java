package com.company;

import java.security.InvalidParameterException;

public class Alumno
{
    private String nombre;
    private int edad;
    private double calificacion;

    // Constructores
    public Alumno(String nombre, int edad, double calificacion)
    {
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setCalificacion(calificacion);
    }

    // Propiedades
    public String getNombre() {return this.nombre;}
    public int getEdad() {return this.edad;}
    public double getCalificacion() {return this.calificacion;}
    public void setNombre(String nombre)
    {
        if (!nombre.equals(""))
        {
        this.nombre = nombre;
        }
        else
        {
            throw new InvalidParameterException("Nombre inválido");
        }
    }
    public void setEdad(int edad)
    {
        if (edad >= 17 && edad <= 100)
        {
            this.edad = edad;
        }
        else
        {
            throw new InvalidParameterException("Edad inválida");
        }
    }
    public void setCalificacion(double calificacion)
    {
        if (calificacion >= 0 && calificacion <= 10)
        {
            this.calificacion = calificacion;
        }
        else
        {
            throw new InvalidParameterException("Calificación inválida");
        }
    }

    // Métodos
    @Override
    public String toString()
    {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", calificacion=" + calificacion +
                '}';
    }
}
