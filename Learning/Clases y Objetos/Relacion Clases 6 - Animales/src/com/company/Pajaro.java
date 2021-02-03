package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

enum EspeciePajaro
{
    Canario, Periquito, Agapornis
}

public class Pajaro extends Animal
{
    private EspeciePajaro especie;
    private boolean cantor;

    public Pajaro(String nombre, EspeciePajaro especie, LocalDate fechaNacimiento, double peso, boolean cantor)
    {
        this.nombre = nombre;
        this.especie = especie;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.cantor = cantor;
    }

    public EspeciePajaro getEspecie() {return especie;}
    public boolean getCantor() {return cantor;}

    @Override
    public String toString()
    {
        String canta;
        if (cantor)
        {
            canta = "Sí";
        }
        else
        {
            canta = "No";
        }

        String ficha = "\u001B[32m" + "Ficha de pájaro" + "\u001B[0m" + "\n";
        ficha += "Nombre: " + nombre + "\n";
        ficha += "Especie: " + especie + "\n";
        ficha += "Fecha de Nacimiento: " + fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n";
        ficha += "Peso: " + peso + "\n";
        ficha += "Canta: " + canta + "\n";
        ficha += "Comentarios: " + comentarios;
        return ficha;
    }
}
