package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println();
        System.out.println("Menú:");
        System.out.print("1. escribeArray5");
        System.out.println("                    " + "2. escribeArray");
        System.out.print("3. leeArray5");
        System.out.println("                        " + "4. leeArray");
        System.out.print("5. ponCeros5");
        System.out.println("                        " + "6. ponCero");
        System.out.print("7. sumaArray5");
        System.out.println("                       " + "8. sumaArray");
        System.out.print("9. mediaArray5");
        System.out.println("                      " + "10. mediaArray");
        System.out.println();
        System.out.print("Elige una opción: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
            {
                int[] a = { 12, 4, 5, 71, 22};
                escribeArray5(a);
            }
                break;
            case 2:
            {
                int[] a = {54, 2, 67, 44, 12, 9, 40, 27, 77};
                escribeArray(a);
            }
                break;
            case 3:
            {
                int[] a = new int[5];
                leeArray5(a);
                escribeArray5(a);
            }
                break;
            case 4:
            {
                System.out.print("Indica el tamaño del array: ");
                int[] a = new int[sc.nextInt()];
                leeArray(a);
                escribeArray(a);
            }
                break;
            case 5:
            {
                int[] a = {1, 2, 3, 4, 5};
                ponCeros5(a);
                escribeArray5(a);
            }
                break;
            case 6:
            {
                int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                ponCero(a);
                escribeArray(a);
            }
                break;
            case 7:
            {
                int[] a = new int[5];
                leeArray5(a);
                System.out.println("Suma: " + sumaArray5(a));;
            }
                break;
            case 8:
            {
                System.out.print("Indica el tamaño del array: ");
                int[] a = new int[sc.nextInt()];
                leeArray(a);
                System.out.println("Suma: " + sumaArray(a));;
            }
                break;
            case 9:
            {
                double[] a = new double[5];
                leeArrayDouble(a);
                System.out.println("Media: " + mediaArray5(a));
            }
                break;
            case 10:
            {
                System.out.print("Indica el tamaño del array: ");
                double[] a = new double[sc.nextInt()];
                leeArrayDouble(a);
                System.out.println("Media: " + mediaArray(a));
            }
                break;
            default:
                System.out.println("Ese ejercicio no existe");
                break;

        }
    }
    public static void escribeArray5(int[] a)
    {
        int i;
        System.out.print("[");
        for (i = 0; i < 4; i++)
        {
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[4] + "]");
    }
    public static void escribeArray(int[] a)
    {
        int i;
        System.out.print("[");
        for (i = 1; i < a.length; i++)
        {
            System.out.print(a[i-1] + ", ");
        }
        System.out.println(a[i-1] + "]");
    }
    public static void leeArray5(int[] a)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Indica los valores del array:");
        for (i = 0; i < 5; i++)
        {
            a[i] = sc.nextInt();
        }
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
    public static void ponCeros5(int[] a)
    {
        int i;
        for (i = 0; i < 5; i++)
        {
            a[i] = 0;
        }
    }
    public static void ponCero(int[] a)
    {
        int i;
        for (i = 0; i < a.length; i++)
        {
            a[i] = 0;
        }
    }
    public static int sumaArray5(int[] a)
    {
        int i, suma = 0;
        for (i = 0; i < 5; i++)
        {
            suma = suma + a[i];
        }
        return suma;
    }
    public static int sumaArray(int[] a)
    {
        int i, suma = 0;
        for (i = 0; i < a.length; i++)
        {
            suma = suma + a[i];
        }
        return suma;
    }
    public static void leeArrayDouble(double[] a)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Indica los valores del array:");
        for (i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }
    public static double mediaArray5(double[] a)
    {
        int i;
        double suma = 0, media;
        for (i = 0; i < 5; i++)
        {
            suma = suma + a[i];
        }
        media = suma / 5;
        return media;
    }
    public static double mediaArray(double[] a)
    {
        int i;
        double suma = 0, media;
        for (i = 0; i < a.length; i++)
        {
            suma = suma + a[i];
        }
        media = suma / (i);
        return media;
    }
}
