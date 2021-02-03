package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        // Ejercicio 1: Secuencias de números impares

        Scanner sc  = new Scanner(System.in);
        int n = 0, n2 = 0, i;
        for (i = 0; i < 1; i++)
        {
            System.out.print("Indica un número impar: ");
            n = sc.nextInt();
            if (n % 2 == 0)
            {
                System.out.println("El número indicado no es impar. Vuelve a intentarlo.");
                i--;
            }
        }
        for (i = 0; i < 1; i++)
        {
            System.out.println("Indica otro número impar y mayor que el anterior: ");
            n2 = sc.nextInt();
            if ((n2 % 2 == 0) || n2 < n)
            {
                System.out.println("El número indicado no es impar o mayor que el primero. Vuelve a intentarlo.");
                i--;
            }
        }
        for (i = n; i <= n2; i+=2)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = n2; i >= n; i-=2)
        {
            System.out.print(i + " ");
        }
    }
}
