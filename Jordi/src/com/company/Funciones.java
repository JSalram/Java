package com.company;

import java.util.Scanner;

public class Funciones
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // FUNCIONES

        System.out.println(suma(2, 2));
        String saludo = "Hola mundo";
        imprimeCadena(2);
        imprimeCadena(saludo);

        boolean salir = false;
        while (!salir)
        {
            System.out.println("¿Quieres salir?");
            System.out.println("1.Si       2.No");
            System.out.print("Opción: ");
            int opcion = sc.nextInt();
            if (opcion == 1)
            {
                salir = true;
            }
            else if (opcion != 2)
            {
                System.out.println("Opción inválida");
            }
        }
    }

    // MÉTODOS / FUNCIONES

        // Void

    public static void imprimeCadena (String cadena)
    {
        System.out.println(cadena);
    }
    public static void imprimeCadena (int cadena)
    {
        System.out.println(cadena);
    }
    public static void menu ()
    {
        System.out.println("Menú");
        System.out.println("1. Tal");
        System.out.println("2. Tal");
    }

        // Con parámetros (return)

    public static int suma (int a, int b)
    {
        return a + b;
    }
}
