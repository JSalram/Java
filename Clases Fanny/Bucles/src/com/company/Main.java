package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        // Ejercicio: Calcular año bisiesto
        Scanner sc = new Scanner(System.in);

        System.out.print("Año: ");
        int anno = sc.nextInt();

        int resto4 = anno % 4;
        int resto100 = anno % 100;
        int resto400 = anno % 400;

        if (resto4 == 0 && resto100 != 0 && resto400 == 0)
        {
            System.out.println("Es bisiesto");
        }
        else
        {
            System.out.println("No es bisiesto");
        }


// ========================================================================================


        // Convertir variables

        //// Decimal a entero
        int entero = (int) 4.5;
        System.out.println(entero);

        //// Entero a decimal
        double decimal = (double) 2;
        System.out.println(decimal);

        //// Cualquier tipo de variable a cadena
        int numero = 1234;
        String numeroStr = String.valueOf(numero);
        System.out.println(numeroStr);

        //// Cadenas a cualquier tipo de variable
        String numero2 = "1234";
        int numeroStr2 = Integer.parseInt(numero2);
        numero2 = "1234.567";
        double decimalStr = Double.parseDouble(numero2);
        numero2 = "true";
        boolean booleanStr = Boolean.parseBoolean(numero2);


// ========================================================================================


        // While (int, boolean, String)
        System.out.print("Palabra a recorrer: ");
        String s = sc.nextLine();

        int i = 0; // i --> Índice
        while (i < s.length())
        {
            System.out.println(i + " - " + s.charAt(i));
            i++; // Necesario modificar el índice
        }

        i = 0; // Restaurar índice antes de cada bucle
        while (i < 5)
        {
            System.out.println("Hola");
            i++;
        }
        System.out.println(i);


        // For
        // Switch
    }
}
