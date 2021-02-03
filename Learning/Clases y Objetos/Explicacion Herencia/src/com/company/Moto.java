package com.company;

public class Moto extends Vehiculo
{
    public boolean sidecar;

    @Override
    public String toString()
    {
        return "Moto{" +
                "tieneSidecar=" + sidecar +
                ", matricula='" + matricula + '\'' +
                '}';
    }

    public boolean tieneMatricula()
    {
        return !this.matricula.equals("");
    }
}
