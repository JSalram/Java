package com.company;

import java.security.InvalidParameterException;

public class Videojuego
{
    private String nombre;
    private int anno;
    private Plataforma plataforma;
    private TipoJuego tipoJuego;
    private int valoracion;

    public Videojuego(String nombre, int anno, Plataforma plataforma, TipoJuego tipoJuego, int valoracion)
    {
        this.nombre = nombre;
        this.anno = anno;
        this.plataforma = plataforma;
        this.tipoJuego = tipoJuego;
        this.valoracion = valoracion;
    }

    public String getNombre() {return nombre;}
    public int getAnno() {return anno;}
    public Plataforma getPlataforma() {return plataforma;}
    public TipoJuego getTipoJuego() {return tipoJuego;}
    public int getValoracion() {return valoracion;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setAnno(int anno) {this.anno = anno;}
    public void setPlataforma(Plataforma plataforma) {this.plataforma = plataforma;}
    public void setTipoJuego(TipoJuego tipoJuego) {this.tipoJuego = tipoJuego;}
    public void setValoracion(int valoracion)
    {
        if (valoracion >= 0 && valoracion <= 100)
        {
            this.valoracion = valoracion;
        }
        else
        {
            throw new InvalidParameterException("El valor debe estar entre 0 y 100");
        }
    }

    @Override
    public String toString() {
        return "Videojuego {" +
                "Nombre: '" + nombre + '\'' +
                "; Año: " + anno +
                "; Plataforma: " + plataforma +
                "; Tipo de juego: " + tipoJuego +
                "; Valoracion: " + valoracion +
                '}';
    }
}
