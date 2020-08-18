package com.company;

import java.util.Scanner;

public class Condicionales_Cadenas
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Ejercicio variables
        String nombre = "Javier";
        String apellidos = "Salado Ramos";
        int edad = 22;

        String presentacion = "Hola me llamo " + nombre + " " + apellidos + " y tengo " + edad + " años.";

        System.out.println(presentacion);


        // If - else if - else
        //// Operadores lógicos y más condicionales (==, !=, <, >, <=, >=, &&, ||)
        System.out.print("Número: ");
        int i =  sc.nextInt();

        if (i == 5) {} // == --> Igual a
        if (i != 5) {} // != --> Diferente de
        if (i < 5) {} // < --> Menor que
        if (i > 5) {} // > --> Mayor que
        if (i <= 5) {} // <= --> Menor o igual que
        if (i >= 5) {} // Mayor o igual que

        if (i >= 0 && i <= 10) // && --> AND
        {
            System.out.println("Está entre 0 y 10");
        }
        if (i <= 0 || i >= 10) // || --> OR
        {
            System.out.println("Es menor que 0 o mayor que 10");
        }

        // Módulo (resto)
        if (i % 2 == 0)
        {
            System.out.println("Es par");
        }
        else
        {
            System.out.println("Es impar");
        }


        // Cadenas y sus funciones
        //// .equals(cadena)  -->  Devuelve true si la cadena original es igual a la que le pasamos

        String s = "Hola";
        String s2 = "Adiós";

        if (s.equals(s2)) // Igual a (s == s2)
        {
            System.out.println("Son iguales");
        }
        else if (!s.equals(s2)) // Igual a (s != s2)
        {
            System.out.println("No son iguales");
        }

        //// .length()  -->  Devuelve la longitud de la cadena

        String s3 = "Adiós mi amigo ...";
        System.out.println(s3.length());


        //// .substring(posInicial, posFinal)  -->  Devuelve una cadena comprendida entre las posiciones que le pasamos

        s3 = "Adiós mi amigo ...";
        int posInicial = s3.indexOf("amigo");
        int posFinal = s3.indexOf(" ...");
        String s3Sub = s3.substring(posInicial, posFinal);

        //// .contains(cadena)  -->  Devuelve true o false si contiene la cadena que le pasemos

        String s4 = "Adiós mi amigo";
        if (s4.contains("Adiós"))
        {
            System.out.println("Contiene la palabra");
        }
        else
        {
            System.out.println("No contiene la palabra");
        }


        //// .indexOf(caracter/cadena)  -->  Devuelve la posición en la que empieza el caracter o cadena que le pasemos

        String s5 = "Javier Salado Suarez";
        System.out.println(s5.indexOf("Suarez"));


        //// .charAt(índice)  -->  Devuelve el caracter que se encuentre en la posición que le pasamos

        String s6 = "Hola";
        System.out.println(s6.charAt(0));
    }
}
