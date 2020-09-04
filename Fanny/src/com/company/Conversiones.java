package com.company;

import java.util.Scanner;

public class Conversiones
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

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
    }
}
