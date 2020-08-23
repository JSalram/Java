package com.company;

import java.util.Scanner;

public class Condicionales
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


// ========================================================================================


        // REPASO CONDICIONALES

        int numero = 5;
        if (numero > 10)
        {
            System.out.println("Se cumple la primera condición");
        }
        else if (numero == 10)
        {
            System.out.println("No se cumple la anterior condición pero sí esta");
        }
        else  // ==> (numero < 10)
        {
            System.out.println("No se cumple ninguna de las condiciones anteriores");
        }


        //// Si no existe 'else' en un conjunto de condicionales y se cumple,
        //// no se ejecuta ninguno y continúa con el código de después

        int numero2 = 5;
        if (numero > 10)
        {
            System.out.println("Se cumple la primera condición");
        }
        else if (numero == 10)
        {
            System.out.println("No se cumple la anterior condición pero sí esta");
        }

        // Código...
        // Código...
        // Código...
        // Código...
    }
}
