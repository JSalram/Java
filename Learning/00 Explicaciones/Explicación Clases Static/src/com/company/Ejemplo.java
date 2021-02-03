package com.company;

enum DiaSemana
{
    Lunes, martes, miercoles, jueves, viernes, sabado, domingo
}

public class Ejemplo
{
    int a;
    // Atributo estático
    static int s;

    // Constructor estático
    // Inicializa el valor estático
    static
    {
        s = 0;
    }

    public Ejemplo(int a)
    {
        this.a = a;
    }

    public void escribeS()
    {
        System.out.println(s);
    }
    public void incrementaS()
    {
        s += 1;
    }

    // Método estático
    public static void incrementa100()
    {
        s += 100;
    }

//    public static void incrementaA() // No funciona
//    {
//        a += 1;
//    }
}
