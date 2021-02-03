package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

enum EspecieReptil
{
    Tortuga, Iguana, DragonDeComodo
}

public class Reptil extends Animal
{
    private EspecieReptil especie;
    private boolean venenoso;

    public Reptil(String nombre, EspecieReptil especie, LocalDate fechaNacimiento, double peso, boolean venenoso)
    {
        this.nombre = nombre;
        this.especie = especie;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.venenoso = venenoso;
    }

    public EspecieReptil getEspecie() {return especie;}
    public boolean getVenenoso() {return venenoso;}

    @Override
    public String toString()
    {
        String venenoso;
        if (this.venenoso)
        {
            venenoso = "Sí";
        }
        else
        {
            venenoso = "No";
        }

        String ficha = "\u001B[32m" + "Ficha de reptil" + "\u001B[0m" + "\n";
        ficha += "Nombre: " + nombre + "\n";
        ficha += "Especie: " + especie + "\n";
        ficha += "Fecha de Nacimiento: " + fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n";
        ficha += "Peso: " + peso + "\n";
        ficha += "Venenoso: " + venenoso + "\n";
        ficha += "Comentarios: " + comentarios;
        return ficha;
    }
}
