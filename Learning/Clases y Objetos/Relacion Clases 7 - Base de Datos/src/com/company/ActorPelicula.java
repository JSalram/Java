package com.company;

import java.time.LocalDate;
import java.util.List;

public class ActorPelicula
{
    public int id;
    public String nombre;
    public LocalDate fechaNacimiento;
    public boolean principal;

    public ActorPelicula(int id, String nombre, LocalDate fechaNacimiento, boolean principal)
    {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.principal = principal;
    }

    @Override
    public String toString()
    {
        return "ActorPelicula {" +
                "ID: " + id +
                "; Nombre: '" + nombre + '\'' +
                "; Fecha Nacimiento: " + fechaNacimiento +
                "; Principal: " + principal +
                '}';
    }
}
