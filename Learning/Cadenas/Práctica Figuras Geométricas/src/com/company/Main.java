package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String asterisco = "*", espacio = " ";
        int alto, ancho, i, j, k;

        System.out.print("Dime el alto que quieras:");
        alto = sc.nextInt();
        System.out.print("Dime el ancho quieras:");
        ancho = sc.nextInt();
        System.out.println();

        if (ancho == alto)
        {
            System.out.println("Cuadrado\n");
            for (i = 0; i < alto; i++) // Cuadrado
            {
                for (j = 0; j < ancho*2.5d; j++)
                {
                    System.out.print(asterisco);
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("Rectángulo\n");
            for (i = 0; i < alto; i++) // Cuadrado
            {
                for (j = 0; j < ancho; j++)
                {
                    System.out.print(asterisco);
                }
                System.out.println();
            }
        }
        System.out.println();


        System.out.println("Triángulo Rectángulo\n");
        for (i = 0; i < alto; i++)
        {
            for (j = 0; j <= i; j++)
            {
                System.out.print(asterisco);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Triángulo Rectángulo Hueco\n");
        int hueco = 0;
        for (i = 0; i < alto; i++)
        {
            for (j = 0; j <= i; j++)
            {
                if (i <= 1)
                {
                    System.out.print(asterisco);
                }
                if (i >= 2)
                {
                    System.out.print(asterisco);
                        while (j >= 0 && j < i)
                        {
                                j++;
                                System.out.print(espacio);
                        }
                    System.out.print(asterisco);
                }
            }
            System.out.println();
            if (i == alto-1)
            {
                while (hueco < ancho+2)
                {
                    System.out.print(asterisco);
                    hueco++;
                }
            }
        }
        System.out.println();


//        System.out.println("Triángulo Rectángulo Hueco\n");
//        int hueco = 0;
//        for (i = 0; i < alto; i++)
//        {
//            for (j = 0; j <= i; j++)
//            {
//                if (i == 0)
//                {
//                    System.out.println(asterisco);
//                }
//                System.out.print(asterisco);
//                while (j < i)
//                {
//                    j++;
//                    System.out.print(espacio);
//                }
//                System.out.print(asterisco);
//            }
//            if (i == alto-1)
//            {
//                System.out.println();
//                while (hueco < ancho+2)
//                {
//                    System.out.print(asterisco);
//                    hueco++;
//                }
//            }
//            System.out.println();
//        }
//        System.out.println();

        System.out.println("Triángulo Rectángulo Invertido\n");
        for (i = 0; i < alto; i++)
        {
            for (k = ancho; k > i+1; k--)
            {
                System.out.print(espacio);
            }
            for (j = 0; j <= i; j++)
            {
                System.out.print(asterisco);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Triángulo Rectángulo Invertido Hueco\n");
        hueco = 0;
        for (i = 0; i < alto; i++) // Altura
        {
            for (k = ancho; k > i; k--) // Ancho
            {
                System.out.print(espacio);
            }
            for (j = 0; j <= i; j++) // Hueco
            {
                if (i <= 0)
                {
                    System.out.print(espacio);
                    System.out.print(asterisco);
                }
                if (i == 1)
                {
                    System.out.print(asterisco);
                    System.out.print(espacio);
                }
                if (i > 1)
                {
                    System.out.print(asterisco);
                        while (j >= 0 && j < i)
                        {
                                j++;
                                System.out.print(espacio);
                        }
                    System.out.print(asterisco);
                }
            }
            System.out.println();
            if (i == alto-1)
            {
                while (hueco < ancho+2)
                {
                    System.out.print(asterisco);
                    hueco++;
                }
            }
        }
        System.out.println();

        System.out.println("Triangulo equilatero\n");
        for (i = 0; i < alto; i++)
        {
            for (k = ancho; k > i+1; k--)
            {
                System.out.print(espacio);
            }
            for (j = -i; j <= i; j++)
            {
                System.out.print(asterisco);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Rombo\n");
        for (i = 0; i < alto; i++)
        {
            for (k = ancho; k > i+1; k--)
            {
                System.out.print(espacio);
            }
            for (j = -i; j <= i; j++)
            {
                System.out.print(asterisco);
            }
            System.out.println();
        }
        for (i = alto-1; i > 0; i--)
        {
            for (k = i; k < ancho; k++)
            {
                System.out.print(espacio);
            }
            for (j = i-1; j > -i; j--)
            {
                System.out.print(asterisco);
            }
            System.out.println();
        }
        System.out.println();

        int asp = 3;
        double h;

        System.out.println("Círculo (Profesor)\n");
        for (i = -alto; i < alto; i++)
        {
            for (j = -alto*asp; j < alto*asp; j++)
            {
                h = Math.sqrt(i*i + (j/(double)asp*j)/(double)asp);

                if (h >= alto)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}