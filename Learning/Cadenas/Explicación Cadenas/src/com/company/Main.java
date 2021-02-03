package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        char c = 'a';
        //char eai = '\u255A';
        //char eari = '\u2554';
        //char eard = '\u2557';
        //char ead = '\u255D';
        //System.out.print(eari);
        //System.out.println(eard);
        //System.out.print(eai);
        //System.out.print(ead);

        String s = "hola";
        String s1 = "a";
        String s0 = "";
==================================================================================================
//      Como copiar una cadena

        String scopia = s;
        s = "patata";
==================================================================================================
//      Operaciones con cadenas

        String s2 = "hola" + "adios";
        s2 = "El resultado es " + 5;
        s2 = "cadena" + 'a' + "cadena";

        String s3 = "hola";
        s3 = s3 + "adios";
==================================================================================================
//      Para recorrer una cadena con un for

        String s4 = "patata";
        int i, cont = 0;

        for (i = 0; i < s4.length(); i++)
        {
            System.out.println(s4.charAt(i)); // Lo mismo que s4[i]
        }
        System.out.println();
==================================================================================================
//      Contar el numero de 'a' que aparece en la cadena

        for (i = 0; i < s4.length(); i++)
        {
            if (s4.charAt(i) == 'a')
            {
                cont++;
            }
        }
        System.out.println("Número de veces que aparece 'a': " + cont);
        System.out.println();
==================================================================================================
//      Quitar la letra a de una cadena
        String s5 = "";
        for (i = 0; i < s4.length(); i++)
        {
            if (s4.charAt(i) != 'a')
            {
                s5 = s5 + s4.charAt(i);
            }
        }
        System.out.println("'patata' sin la letra 'a'= " + s5);
==================================================================================================
//      Cómo se lee una cadena del teclado

        Scanner sc = new Scanner(System.in);
        String s6 = sc.nextLine(); // Lee hasta que presiones enter
        s6 = sc.next(); // Sólo lee hasta el siguiente separador (p.e.: un espacio)

        int n = sc.nextInt();
        sc.nextLine(); // Sirve para limpiar los saltos de linea / buffer antes de leer una cadena
==================================================================================================
//      Funciones de cadenas

        String s7 = "patata";

        //equals = comparar cadenas
        // if (s5 == s7) // esto no funciona
        if (s5.equals(s7)) // esto ok
        {
            System.out.println("Son iguales");
        }
        // if (!s5.equals(s7) // si son distintas

        // s7.compareTo() // Compara dos cadenas alfabéticamente
        // Devuelve 0 si son iguales                                // NO SE USA
        // Devuelve <0 si la primera es más pequeña y >0 si es al contrario
==================================================================================================
//      Busqueda dentro de la cadena
        //s7.contains() // Nos dice si la cadena contiene algo
        if (s7.contains("a"))
        {
            System.out.println(s7);
        }

        // s7.indexOf('a') // Nos dice la posicion de algo
        // Devuelve -1 si no está

        int pos = s7.indexOf('a');
        int pos2 = s7.indexOf('a', pos+1); // Busca la siguiente 'a' a partir de
                                                        // la posición de la primera que encontró

        int posn = s7.lastIndexOf('a'); // Igual pero empieza a contar desde el final
==================================================================================================
//      Para ver si una cadena está vacía

        if (s7.isEmpty())
        {
        }
==================================================================================================
//      Para ver si una cadena empieza por / acaba por algo
        if (s7.startsWith("<html>"))
        {
        }

        if (s7.endsWith(".exe"))
        {
        }
==================================================================================================
//      to(Upper/Lower)Case == Para convertir una cadena a mayúscula o minúscula
        s7 = "Patata";
        System.out.println(s7.toUpperCase()); // Lo convierte a mayúscula
        System.out.println(s7.toLowerCase()); // Lo convierte a minúscula

        char c1 = 'a';
        char cMay = Character.toUpperCase(c1); // Lo convierte a mayúscula
        char cMin = Character.toLowerCase(c1); // Lo convierte a minúscula
==================================================================================================
//      is(Letter/Digit) == Funciones de caracteres para ver qué tipo de caracter es

        if (Character.isLetter(c1)) // Para saber si es una letra
        { }
        if (Character.isDigit(c1)) // Para saber si es un dígito
        { }
        if (Character.isUpperCase(c1)) // Para saber si es una mayúscula
        { }
        if (Character.isLowerCase(c1)) // Para saber si es una minúscula
        { }

==================================================================================================
//      replace == Una función muy chula que NO quiere que usemos
        String s8 = "hola    adios  goodbye";
        s8 = s8.replace("  ", " "); // Reemplaza 4 espacios por 2
        s8 = s8.replace("  ", " ");
        s8 = s8.replace('a', 'u'); // Cambia las 'a' por 'u'

        System.out.println(s8);
==================================================================================================
//      trim == Quita espacios de delante y de detrás

        String s9 = "      hola      ";
        s9 = s9.trim();
        System.out.println(s9);
        System.out.println(">"+s9+"<");

        s9 = "      hola y adios      ";
        s9 = s9.trim();
        System.out.println(">"+s9+"<");
==================================================================================================
//      toCharArray == Convertir cadena en array y viceversa // TAMPOCO quiere que lo usemos

        String s10 = "hola que tal";
        char[] array = s10.toCharArray(); // cadena a array
        array[0] = 'H';
        s10 = new String(array); // array a cadena
        System.out.println(s10);
==================================================================================================
//      SubString == Recorta una subcadena
        String s11 = "hola que tal";
        String s12 = s11.substring(0, 4); // la última posición no se incluye = (0,3)
        System.out.println(s12);
        //String s13 = s11.substring(9 , s11.length());
        String s13 = s11.substring(9); // desde 9 hasta el final
        System.out.println(s13);

        // Cambiar 'q' por 'Q'
        String s14 = s11.substring(0, 5) + "Q" + s11.substring(6);
        System.out.println(s14);
==================================================================================================
//      Split y Join == Trocear una cadena y pegarla de nuevo
        String s15 = "hola que tal";
        String[] palabras = s15.split(" "); // Trocea la frase en un array con tamaño de 3
                                                  // en el que cada posición contiene una palabra
        //regex = expresion regular

        // Escribo la primera letra de la última palabra (t)
        System.out.println(palabras[palabras.length-1].charAt(0)); //palabras.length-1 == posición 2
        String ultimaPalabra = palabras[2];
        char primeraLetra = ultimaPalabra.charAt(0);

        s15 = s15.trim().toUpperCase().substring(3, 7); //Quita espacios (trim), convierte a mayúscula
                                                        //(toUpperCase) y recorta la cadena (substring)

        //Cambio 'que' por 'QUE'
        palabras[1] = "QUE";

        //Recomponemos la cadena
        String s16 = String.join(" ", palabras);
        System.out.println(s16);


        String s17 = quitaEspacios(s16);
    }
    public static String quitaEspacios (String s)
    {
        return s.replace(" ", "");
    }
}
