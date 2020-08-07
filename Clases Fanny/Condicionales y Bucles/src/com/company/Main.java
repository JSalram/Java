package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // If - else if - else
        System.out.println("Calculadora. Elige una opción");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();

        if (opcion == 1)        // == --> Es igual a
        {
            // Haga esto:
            System.out.print("Número 1: ");
            int n1 = sc.nextInt();
            System.out.print("Número 2: ");
            int n2 = sc.nextInt();
            System.out.println("Suma: " + (n1 + n2));
        }
        else if (opcion == 2)
        {
            // Haga esto otro:
            System.out.print("Número 1: ");
            int n1 = sc.nextInt();
            System.out.print("Número 2: ");
            int n2 = sc.nextInt();
            System.out.println("Resta: " + (n1 - n2));
        }
        else
        {
            // Por defecto hace esto:
            System.out.println("Opción incorrecta");
        }

        //// Operadores lógicos y más condicionales (==, !=, <, >, <=, >=, &&, ||)

        // Cadenas y sus funciones

        //// .equals(cadena);
        //// .length();
        //// .contains(cadena);
        //// .indexOf(caracter/cadena);
        //// .charAt(índice);

        // Convertir variables

        // While (int, boolean, String)

        // For

        // Estructuras
        //// Cadenas
        ////// Funciones (equals, length, contains, indexOf, ...)
        //// Arrays
        //// Listas
    }
}
