package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

enum RazaPerro
{
    PastorAleman, Husky, FoxTerrier, Dalmata, SanBernardo
}

public class Perro extends Animal
{
    private RazaPerro raza;
    private String microchip;

    public Perro(String nombre, RazaPerro raza, LocalDate fechaNacimiento, double peso, String microchip)
    {
        this.nombre = nombre;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.microchip = microchip;
    }

    public RazaPerro getRaza() {return raza;}
    public String getMicrochip() {return microchip;}

    @Override
    public String toString()
    {
        String[] perros = {"Pastor Alemán", "Husky", "Fox Terrier", "Dalmata", "San Bernardo"};
        String ficha = "\u001B[32m" + "Ficha de perro" + "\u001B[0m" + "\n";
        ficha += "Nombre: " + nombre + "\n";
        ficha += "Raza: " + perros[raza.ordinal()] + "\n";
        ficha += "Fecha de Nacimiento: " + fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n";
        ficha += "Peso: " + peso + "\n";
        ficha += "Microchip: " + microchip + "\n";
        ficha += "Comentarios: " + comentarios;
        return ficha;
    }
}
