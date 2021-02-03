package com.company;

import java.security.InvalidParameterException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Coche
{
    private String matricula;
    private LocalDate fechaMatriculacion;
    private String marca;
    private String modelo;
    private double precio;

    public Coche(String matricula, LocalDate fechaMatriculacion, String marca, String modelo, double precio)
    {
        setMatricula(matricula);
        setFechaMatriculacion(fechaMatriculacion);
        setMarca(marca);
        setModelo(modelo);
        setPrecio(precio);
    }

    public String getMatricula() {return this.matricula;}
    public LocalDate getFechaMatriculacion() {return this.fechaMatriculacion;}
    public String getMarca() {return this.marca;}
    public String getModelo() {return this.modelo;}
    public double getPrecio() {return this.precio;}
    public void setMatricula(String matricula)
    {
        if (compruebaMatricula(matricula))
        {
            this.matricula = matricula;
        }
        else
        {
            throw new InvalidParameterException("Matrícula inválida");
        }
    }
    public void setFechaMatriculacion(LocalDate fechaMatriculacion)
    {
        if (fechaMatriculacion.getDayOfYear() <= LocalDate.now().getDayOfYear()
            && fechaMatriculacion.getYear() == LocalDate.now().getYear() - 1
            || fechaMatriculacion.getYear() <= LocalDate.now().getYear() - 2)
        {
            this.fechaMatriculacion = fechaMatriculacion;
        }
        else
        {
            throw new InvalidParameterException("Fecha inválida");
        }
    }
    public void setMarca(String marca)
    {
        if (!marca.equals(""))
        {
            this.marca = marca;
        }
        else
        {
            throw new InvalidParameterException("Marca inválida");
        }
    }
    public void setModelo(String modelo)
    {
        if (!modelo.equals(""))
        {
            this.modelo = modelo;
        }
        else
        {
            throw new InvalidParameterException("Modelo inválido");
        }
    }
    public void setPrecio(double precio)
    {
        if (precio >= 500.0)
        {
            this.precio = precio;
        }
        else
        {
            throw new InvalidParameterException("Precio inválido");
        }
    }

    public boolean compruebaMatricula (String matricula)
    {
        boolean val = true;
        int i, let = 0, num = 0;
        if (matricula.length() == 7)
        {
            for (i = 0; i < matricula.length(); i++)
            {
                if (i < 4 && Character.isLetter(matricula.charAt(i)))
                {
                    val = false;
                }
                if (i >= 4 && Character.isDigit(matricula.charAt(i)))
                {
                    val = false;
                }
            }
        }
        else
        {
            val = false;
        }

        return val;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", fechaMatriculacion=" + fechaMatriculacion +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
