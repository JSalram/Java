package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime una cantidad de dinero menor a 5€ y te digo su cantidad en monedas: ");
        double dinero = sc.nextDouble();

        calderilla(dinero);

        System.out.print("Dime el tamaño del triángulo: ");
        int tam = sc.nextInt();
        trianguloEstrellitas(tam);

        System.out.println("Rombo");
        tam = sc.nextInt();
        rombo(tam);

    }
    public static void calderilla (double dinero)
    {
        if (dinero <= 5.0)
        {
            while (dinero >= 2.0)
            {
                System.out.println("2€");
                dinero = dinero - 2.0;
            }
            while (dinero >= 1.0)
            {
                System.out.println("1€");
                dinero = dinero - 1.0;
            }
            while (dinero >= 0.5)
            {
                System.out.println("50 cent.");
                dinero = dinero - 0.5;
            }
            while (dinero >= 0.20)
            {
                System.out.println("20 cent.");
                dinero = dinero - 0.20;
            }
            while (dinero >= 0.10)
            {
                System.out.println("10 cent.");
                dinero = dinero - 0.10;
            }
            while (dinero >= 0.050)
            {
                System.out.println("5 cent.");
                dinero = dinero - 0.050;
            }
            while (dinero >= 0.020)
            {
                System.out.println("2 cent.");
                dinero = dinero - 0.020;
            }
            while (dinero >= 0.010)
            {
                System.out.println("1 cent.");
                dinero = dinero - 0.010;
            }
        }
        else
        {
            System.out.println("Cantidad demasiado grande");
        }
    }

    public static void repiteEstrellitas (int n)
    {
        int i;
        for (i = 1; i <= n; i++)
        {
            System.out.print("*");
        }
    }

    public static void repiteEspacios (int n)
    {
        int i;
        for (i = 1; i <= n; i++)
        {
            System.out.print(" ");
        }
    }

    public static void trianguloEstrellitas (int tam)
    {
        int nivel, i;
        if (tam >= 3 && tam <= 20)
        {
            for (nivel = 1; nivel <= tam; nivel++)
            {
                // repiteEstrellitas(nivel);
                for (i = 1; i <= nivel; i++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("---ERROR---");
        }
    }

    public static void rombo (int tam)
    {
        int nivel;
        for (nivel = 1; nivel <= tam; nivel++)
        {
            repiteEspacios(tam - nivel);
            repiteEstrellitas(nivel * 2);
            System.out.println();
        }
        for (nivel = tam - 1; nivel >= 1; nivel--)
        {
            repiteEspacios(tam - nivel);
            repiteEstrellitas(nivel * 2);
            System.out.println();
        }
    }
}
