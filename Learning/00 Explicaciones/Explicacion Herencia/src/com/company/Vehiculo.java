package com.company;

// Abstract == No se puede referenciar directamente
// Vehiculo moto = new Moto(), ¡¡nunca new Vehiculo()!!
public abstract class Vehiculo
{
    // Protected == Tienen acceso desde la propia clase y sus heredadas (JAVA tambien el Main)
    // Private == Solo se tiene acceso desde la propia clase
    protected String matricula;

    @Override
    public String toString()
    {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                '}';
    }

    public abstract boolean tieneMatricula();
}
