package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

enum RazaGato
{
    Comun, Siames, Persa, Angora, ScottishFold
}

public class Gato extends Animal
{
    private RazaGato raza;
    private String microchip;

    public Gato(String nombre, RazaGato raza, LocalDate fechaNacimiento, double peso, String microchip)
    {
        this.nombre = nombre;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.microchip = microchip;
    }

    public RazaGato getRaza() {return raza;}
    public String getMicrochip() {return microchip;}

    @Override
    public String toString()
    {
        String[] gatos = {"Común", "Siamés", "Persa", "Angora", "Scottish Fold"};
        String ficha = "\u001B[32m" + "Ficha de gato" + "\u001B[0m" + "\u001B[0m" + "\n";
        ficha += "Nombre: " + nombre + "\n";
        ficha += "Raza: " + gatos[raza.ordinal()] + "\n";
        ficha += "Fecha de Nacimiento: " + fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n";
        ficha += "Peso: " + peso + "\n";
        ficha += "Microchip: " + microchip + "\n";
        ficha += "Comentarios: " + comentarios;
        return ficha;
    }
}
