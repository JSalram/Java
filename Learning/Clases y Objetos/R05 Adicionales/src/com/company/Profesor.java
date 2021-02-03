package com.company;

import java.security.InvalidParameterException;

enum TipoGenero { Hombre, Mujer }

public class Profesor
{
    private String nombre;
    private String dni;
    private TipoGenero genero;

    public Profesor(String nombre, String dni, TipoGenero genero)
    {
        setNombre(nombre);
        setDni(dni);
        setGenero(genero);
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre)
    {
        if (!nombre.equals(""))
        {
            this.nombre = nombre;
        }
        else
        {
            throw new InvalidParameterException("El nombre no puede estar vacío");
        }
    }
    public String getDni() {return dni;}
    public void setDni(String dni)
    {
        if (dni.length() == 9)
        {
            this.dni = dni;
        }
        else
        {
            throw new InvalidParameterException("El DNI debe tener 9 caracteres");
        }
    }
    public TipoGenero getGenero() {return genero;}
    public void setGenero(TipoGenero genero)
    {
        this.genero = genero;
    }


    @Override
    public String toString()
    {
        return nombre + " - " + dni;
    }
}
