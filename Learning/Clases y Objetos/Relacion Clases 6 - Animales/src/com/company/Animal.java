package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Animal implements Comparable<Animal>
{
    protected String nombre;
    protected LocalDate fechaNacimiento;
    protected double peso;
    protected String comentarios;

    public String getNombre() {return nombre;}
    public LocalDate getFechaNacimiento() {return fechaNacimiento;}
    public double getPeso() {return peso;}
    public void setPeso(double peso) {this.peso = peso;}
    public String getComentarios() {return comentarios;}
    public void setComentarios(String comentarios) {this.comentarios = comentarios;}

    @Override
    public abstract String toString();

    @Override
    public int compareTo(Animal o)
    {
        List<Class> tipos = new ArrayList<>(Arrays.asList(Perro.class, Gato.class, Pajaro.class, Reptil.class));
        Class s1 = this.getClass();
        Class s2 = o.getClass();
        int i1 = tipos.indexOf(s1);
        int i2 = tipos.indexOf(s2);
        return Integer.compare(i1, i2);
    }
}
