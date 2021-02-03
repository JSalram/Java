package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Actor
{
    public int id;
    public String nombre;
    public LocalDate fechaNacimiento;

    public Actor(int id, String nombre, LocalDate fechaNacimiento)
    {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString()
    {
        return "Actor {" +
                "ID: " + id +
                "; Nombre: '" + nombre + '\'' +
                "; Fecha Nacimiento: " + fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                '}';
    }
}
