package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        // Variables (int, double, char, String, boolean, ...)
        //// Definición de variables (Necesario definir el tipo la 1ª vez)
        int i = 12;
        double d = 2.3;
        char c = 'c';
        String s = "Frase";
        boolean b = true;       // boolean = true / false

        //// Operaciones con variables
        int suma = 2 + 2;
        double sumaDouble = 2.5 + 2.5;
        String saludo = "Hola";
        String mundo = "Mundo";
        String saludoMundo = saludo + " " + mundo;
        b = false;


        // System.out.println()
        System.out.print("Hola");       // print --> Imprime la cadena sin salto de línea
        System.out.println("Mundo");    // println --> Imprime un salto de línea tras la cadena


        // Scanner
        Scanner sc = new Scanner(System.in);    // Necesario crear la variable de Scanner para su posterior uso
        System.out.print("Número: ");
        int scInt = sc.nextInt();
        System.out.println("Tú número es " + scInt);

//        double scDouble = sc.nextDouble();
//        boolean scBoolean = sc.nextBoolean();

        System.out.print("Cadena 1: ");
        String scString = sc.next();        // sc.next() --> Leer hasta el siguiente espacio
        sc.nextLine();  // Necesario para limpiar la memoria antes de un sc.nextLine()
        System.out.print("Cadena 2: ");
        String scString2 = sc.nextLine();   // sc.nextLine() --> Leer hasta que presiones Enter

        System.out.println("Cadena 1: " + scString);
        System.out.println("Cadena 2: " + scString2);


        // If - else if - else
        System.out.println("Calculadora. Elige una opción");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();

        if (opcion == 1)        // == --> Es igual a
        {
            // Haga esto
            System.out.print("Número 1: ");
            int n1 = sc.nextInt();
            System.out.print("Número 2: ");
            int n2 = sc.nextInt();
            System.out.println("Suma: " + (n1 + n2));
        }
        else if (opcion == 2)
        {
            // Haga esto otro
            System.out.print("Número 1: ");
            int n1 = sc.nextInt();
            System.out.print("Número 2: ");
            int n2 = sc.nextInt();
            System.out.println("Resta: " + (n1 - n2));
        }
        else
        {
            System.out.println("Opción incorrecta");
        }
    }
}
