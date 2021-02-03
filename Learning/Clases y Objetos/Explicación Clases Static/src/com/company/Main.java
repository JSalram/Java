package com.company;

public class Main {

    public static void main(String[] args)
    {
        Ejemplo e1 = new Ejemplo(10);
        System.out.println(e1.a);

        Ejemplo.s = 1;

        Ejemplo e2 = new Ejemplo(20);
        System.out.println(e2.a);

        e1.escribeS();
        e1.incrementaS();
        e2.escribeS();


        // Ejemplo enum
        DiaSemana d = DiaSemana.domingo;
    }
}
