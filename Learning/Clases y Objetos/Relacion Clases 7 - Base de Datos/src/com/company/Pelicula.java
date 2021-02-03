package com.company;

public class Pelicula
{
    public int id;
    public String titulo;
    public int anno;
    public boolean tieneOscar;
    public double valoracion;

    public Pelicula(int id, String titulo, int anno, boolean tieneOscar, double valoracion)
    {
        this.id = id;
        this.titulo = titulo;
        this.anno = anno;
        this.tieneOscar = tieneOscar;
        this.valoracion = valoracion;
    }

    @Override
    public String toString()
    {
        return "Pelicula {" +
                "ID: " + id +
                "; Título: '" + titulo + '\'' +
                "; Año: " + anno +
                "; Tiene Óscar: " + tieneOscar +
                "; Valoración: " + valoracion +
                '}';
    }
}
