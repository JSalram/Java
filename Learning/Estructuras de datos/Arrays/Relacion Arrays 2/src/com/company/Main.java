package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println();
        System.out.println("Menú:");
        System.out.print("1. rellenaEnOrden");
        System.out.println("                       " + "2. rellenaEnOrdenDesc");
        System.out.print("3. rellenaAleatorio");
        System.out.println("                     " + "4. estaOrdenado");
        System.out.print("5. numeroImpares");
        System.out.println("                        " + "6. minArray");
        System.out.print("7. maxArray");
        System.out.println("                             " + "8. numeroAprobados");
        System.out.print("9. porEncimaDe");
        System.out.println("                          " + "10. cuantosCeros");
        System.out.println();
        System.out.print("Elige una opción: ");
        opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                System.out.println("Indica el tamaño del array: ");
                int[] a = new int[sc.nextInt()];
                rellenaEnOrden(a);
                escribeArray(a);
            }
                break;
            case 2:
            {
                System.out.println("Indica el tamaño del array: ");
                int[] a = new int[sc.nextInt()];
                rellenaEnOrdenDesc(a);
                escribeArray(a);
            }
                break;
            case 3:
            {
                System.out.println("Indica el tamaño del array: ");
                int[] a = new int[sc.nextInt()];
                rellenaAleatorio(a);
                escribeArray(a);
            }
                break;
            case 4:
            {
                System.out.println("Indica el tamaño del array: ");
                int[] a = new int[sc.nextInt()];
                leeArray(a);
                if (estaOrdenado(a))
                {
                    System.out.println("El array está ordenado");
                }
                else
                {
                    System.out.println("El array no está ordenado");
                }
            }
                break;
            case 5:
            {
                System.out.println("Indica el tamaño del array: ");
                int[] a = new int[sc.nextInt()];
                leeArray(a);
                System.out.println("Son números impares: " + numeroImpares(a));
            }
                break;
            case 6:
            {
                System.out.println("Indica el tamaño del array: ");
                int[] a = new int[sc.nextInt()];
                leeArray(a);
                System.out.println("El menor número es: " + minArray(a));
            }
                break;
            case 7:
            {
                System.out.println("Indica el tamaño del array: ");
                int[] a = new int[sc.nextInt()];
                leeArray(a);
                System.out.println("El mayor número es: " + maxArray(a));
            }
                break;
            case 8:
            {
                System.out.println("Indica el tamaño del array: ");
                int[] a = new int[sc.nextInt()];
                leeArrayNotas(a);
                System.out.println("Hay " + numeroAprobados(a) + " aprobados");
            }
                break;
            case 9:
            {
                System.out.println("Indica el tamaño del array: ");
                int[] a = new int[sc.nextInt()];
                System.out.println("Indica el límite del cual quieres saber cuántos nºs lo sobrepasan: ");
                int limite = sc.nextInt();
                leeArray(a);
                System.out.println(porEncimaDe(a, limite) + " números sobrepasan el límite de " + limite);
            }
                break;
            case 10:
            {
                System.out.println("Indica el tamaño del array: ");
                int[] a = new int[sc.nextInt()];
                leeArray(a);
                System.out.println("En el array hay: " + cuantosCeros(a) + " ceros");
            }
                break;
        }
    }
    public static void escribeArray(int[] a)
    {
        int i;
        System.out.print("[");
        for (i = 1; i < a.length; i++) {
            System.out.print(a[i - 1] + ", ");
        }
        System.out.println(a[i - 1] + "]");
    }
    public static void leeArray(int[] a)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Indica los valores del array:");
        for (i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }
    }
    public static void leeArrayNotas(int[] a)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Indica los valores del array:");
        for (i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
            if (a[i] < 0 || a[i] > 10)
            {
                System.out.print("No es una nota válida, vuelve a introducir la nota: ");
                i--;
            }
        }
    }
    public static void rellenaEnOrden (int[] a)
    {
        int i;
        for (i = 0; i < a.length; i++)
        {
            a[i] = i + 1;
        }
    }
    public static void rellenaEnOrdenDesc (int[] a)
    {
        int i, j = 0;
        for (i = a.length; i > 0; i--)
        {
            a[j] = i;
            j++;
        }
    }
    public static void rellenaAleatorio (int[] a)
    {
        Random r = new Random();
        int i, n;
        for (i = 0; i < a.length; i++)
        {
            n = r.nextInt(10)+1;
            a[i] = n;
        }
    }
    public static boolean estaOrdenado (int[] a)
    {
        boolean ordenado = false;
        int i, n;
        n = a[0];
        for (i = 0; i < a.length; i++)
        {
            if (n <= a[i])
            {
                ordenado = true;
                n = a[i];
            }
            else
            {
                ordenado = false;
                i = a.length;
            }
        }
        return ordenado;
    }
    public static int numeroImpares (int[] a)
    {
        int impares = 0, i;
        for (i = 0; i < a.length; i++)
        {
            if (a[i] % 2 != 0)
            {
                impares++;
            }
        }
        return impares;
    }
    public static int minArray (int[] a)
    {
        int min = a[0], i;
        for (i = 0; i < a.length; i++)
        {
            if (min > a[i])
            {
                min = a[i];
            }
        }
        return min;
    }
    public static int maxArray (int[] a)
    {
        int max = a[0], i;
        for (i = 0; i < a.length; i++)
        {
            if (max < a[i])
            {
                max = a[i];
            }
        }
        return max;
    }
    public static int numeroAprobados (int[] a)
    {
        int i, aprobados = 0;
        for (i = 0; i < a.length; i++)
        {
            if (a[i] >= 5 && a[i] <= 10)
            {
                aprobados++;
            }
        }
        return aprobados;
    }
    public static int porEncimaDe (int[] a, int limite)
    {
        int i, nlimites = 0;
        for (i = 0; i < a.length; i++)
        {
            if (a[i] >= limite)
            {
                nlimites++;
            }
        }
        return nlimites;
    }
    public static int cuantosCeros (int[] a)
    {
        int i, ceros = 0;
        for (i = 0; i < a.length; i++)
        {
            if (a[i] == 0)
            {
                ceros++;
            }
        }
        return ceros;
    }
}
