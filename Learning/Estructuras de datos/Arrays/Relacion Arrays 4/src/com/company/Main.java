package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println();
        System.out.println("Menú:");
        System.out.print("1. concatenaArraysPro");
        System.out.println("                                       " + "2. copiaArrayPro");
        System.out.print("3. insertaEnArray");
        System.out.println("                                           " + "4. borraDeArray");
        System.out.print("5. elimina1ElementoArray");
        System.out.println("                                    " + "6. eliminaElementosArray");
        System.out.print("7. insertaArrayEnArray");
        System.out.println("                                      " + "8. subArray");
        System.out.print("9. recortaArray");
        System.out.println("                                             " + "10. ordenaBurbuja");
        System.out.println();
        System.out.print("Elige una opción: ");
        opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                System.out.print("Indica el tamaño del array A: ");
                int[] a = new int[sc.nextInt()];
                leeArray(a);
                System.out.println();
                System.out.println("Indica el tamaño del array B: ");
                int[] b = new int[sc.nextInt()];
                leeArray(b);
                System.out.println(Arrays.toString(concatenaArraysPro(a, b)));
            }
                break;
            case 2:
            {
                System.out.print("Indica el tamaño del array: ");
                int n = sc.nextInt();
                int[] a = new int[n];
                leeArray(a);
                System.out.print("El array A es: ");
                escribeArray(a);
                System.out.print("El array B será: ");
                int[] b = new int[n];
                b = copiaArrayPro(a);
                escribeArray(b);
            }
                break;
            case 3:
            {
                System.out.print("Indica el tamaño del array: ");
                int[] a = new int[sc.nextInt()];
                leeArray(a);
                int n, pos;
                System.out.print("Indica la posición que quieres cambiar: ");
                pos = sc.nextInt();
                while (pos >= a.length || pos < 0)
                {
                    System.out.print("Posición inexistente, vuelve a introducir la posición: ");
                    pos = sc.nextInt();
                }
                System.out.print("Indica el valor que quieres introducir en la posicion " + pos + ": ");
                n = sc.nextInt();
                System.out.println("Una vez cambiado el valor de la posición pos " + pos + " tenemos que ");
                insertaEnArray(a, n, pos);
                escribeArray(a);
            }
                break;
            case 4:
            {
                System.out.print("Indica el tamaño del array: ");
                int[] a = new int[sc.nextInt()];
                leeArray(a);
                System.out.print("Indica la posición que quieres eliminar: ");
                int pos = sc.nextInt();
                while (pos >= a.length || pos < 0)
                {
                    System.out.print("Posición inexistente, vuelve a introducir la posición: ");
                    pos = sc.nextInt();
                }
                System.out.println("El array con la posición eliminada quedaría así: ");
                System.out.println(Arrays.toString(borraDeArray(a, pos)));
            }
                break;
            case 5:
            {
                System.out.print("Indica el tamaño del array: ");
                int[] a = new int[sc.nextInt()];
                leeArray(a);
                System.out.print("Indica el valor que quieres eliminar: ");
                int num = sc.nextInt();
                System.out.println("El array con el valor eliminado quedaría así: ");
                System.out.println(Arrays.toString(elimina1ElementoArray(a, num)));
            }
                break;
            case 6:
            {
                System.out.print("Indica el tamaño del array: ");
                int[] a = new int[sc.nextInt()];
                leeArray(a);
                System.out.print("Indica el valor que quieres eliminar: ");
                int num = sc.nextInt();
                System.out.println("El array con el valor/valores eliminado(s) quedaría así: ");
                System.out.println(Arrays.toString(eliminaElementosArray(a, num)));
            }
                break;
            case 7:
            {
                System.out.print("Indica el tamaño del array A: ");
                int[] a = new int[sc.nextInt()];
                System.out.print("Array A - ");
                leeArray(a);
                System.out.print("Indica el tamaño del array B: ");
                int[] b = new int[sc.nextInt()];
                System.out.print("Array B - ");
                leeArray(b);
                System.out.print("Indica la posición de A en la que quieres introducir el array B: ");
                int pos = sc.nextInt();
                System.out.println(Arrays.toString(insertaArrayEnArray(a, pos, b)));
            }
                break;
            case 8:
            {
                System.out.print("Indica el tamaño del array: ");
                int[] a = new int[sc.nextInt()];
                leeArray(a);
                System.out.println("Indica de dónde a dónde quieres que corte el array");
                System.out.print("Posicion 1: ");
                int pos1 = sc.nextInt();
                System.out.print("Posicion 2: ");
                int pos2 = sc.nextInt();
                escribeArray(subArray(a, pos1, pos2));
            }
                break;
            case 9:
            {
                System.out.print("Indica el tamaño del array: ");
                int[] a = new int[sc.nextInt()];
                leeArray(a);
                System.out.println("Indica de dónde a dónde quieres que corte el array");
                System.out.print("Posicion 1: ");
                int pos1 = sc.nextInt();
                System.out.print("Posicion 2: ");
                int pos2 = sc.nextInt();
                escribeArray(recortaArray(a, pos1, pos2));
            }
                break;
            case 10:
            {
                System.out.print("Indica el tamaño del array: ");
                int[] a = new int[sc.nextInt()];
                leeArray(a);
                System.out.print("El array sin ordenar será: ");
                escribeArray(a);
                System.out.print("El array ordenado queda así: ");
                ordenaBurbuja(a);
                escribeArray(a);
            }
                break;
            default:
                System.out.println("Ese ejercicio no existe");
                break;
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
    public static void escribeArray(int[] a)
    {
        int i;
        System.out.print("[");
        for (i = 1; i < a.length; i++) {
            System.out.print(a[i - 1] + ", ");
        }
        System.out.println(a[i - 1] + "]");
    }
    public static int repiteNumeros (int[] a, int num)
    {
        int j = 0, rep = 0;
        while (j < a.length)
        {
            if (a[j] == num)
            {
                rep++;
            }
            j++;
        }
        return rep;
    }
    public static int[] concatenaArraysPro (int[] a, int[] b)
    {
        int[] c = new int[a.length + b.length];
        int i;
        for (i = 0; i < a.length; i++)
        {
            c[i] = a[i];
        }
        for (i = 0; i < b.length; i++)
        {
            c[i + a.length] = b[i];
        }
        return c;
    }
    public static int[] copiaArrayPro (int[] a)
    {
        int[] b = new int[a.length];
        int i;
        for (i = 0; i < a.length; i++)
        {
            b[i] = a[i];
        }
        return b;
    }
    public static void insertaEnArray (int[] a, int num, int pos)
    {
            a[pos] = num;
    }
    public static int[] borraDeArray (int[] a, int pos)
    {
        int[] b = new int[a.length-1];
        int i, j = 0;
        if (b.length > 1) {
            for (i = 0; j < b.length; i++) {
                if (i == pos)
                {
                    i++;
                }
                    b[j] = a[i];
                    j++;
            }
        }
        else {
            System.out.println("----- FATAL ERROR -----");
        }
        return b;
    }
    public static int[] elimina1ElementoArray (int[] a, int num)
    {
        int i, rep = 0;
        int[] b = new int[0];
        rep = repiteNumeros(a, num);
        if (rep > 0)
        {
            for (i = 0; i < a.length; i++) {
                if (a[i] == num) {
                    b = borraDeArray(a, i);
                    i = a.length;
                }
            }
        }
        else
        {
            for (i = 0; i < a.length; i++)
            {
                b = copiaArrayPro(a);
            }
        }
        return b;
    }
    public static int[] eliminaElementosArray (int[] a, int num)
    {
        int i, j = 0, rep = 0;
        int[] b = new int[0];
        rep = repiteNumeros(a, num);
        if (rep > 0) {
            b = new int[a.length - rep];
            for (i = 0; j < b.length; i++) {
                if (a[i] == num)
                {
                    i++;
                }
                b[j] = a[i];
                j++;
            }
        }
        else
        {
            for (i = 0; i < a.length; i++)
            {
                b = copiaArrayPro(a);
            }
        }
        return b;
    }
    public static int[] insertaArrayEnArray (int[] a, int pos, int[] b)
    {
        int[] c = new int[a.length + b.length];
        int i, j = 0, k;
        if (pos < a.length)
        {
            for (i = 0; i < c.length; i++)
            {
                c[i] = a[j];
                j++;
                if (j == pos)
                {
                    for (k = 0; k < b.length; k++)
                    {
                        i++;
                        c[i] = b[k];
                    }
                }
            }
        }
        else
        {
            System.out.println("----- FATAL ERROR -----");
        }
        return c;
    }
    public static int[] subArray (int[] a, int pos1, int pos2)
    {
        int i, j = 0, posMin, posMax;
            if (pos1 < pos2) {
                posMin = pos1;
                posMax = pos2;
            } else {
                posMax = pos1;
                posMin = pos2;
            }
            int[] b = new int[(posMax + 1) - posMin];

        if (pos1 > 0 && pos2 > 0) {
            for (i = 0; i < a.length; i++) {
                if (i >= posMin) {
                    b[j] = a[i];
                    j++;
                }
                if (i == posMax) {
                    i = a.length;
                }
            }
        }
        else if (pos1 < 0 || pos2 < 0)
        {
            System.out.println("----- FATAL ERROR -----");
        }
        return b;
    }
    public static int[] recortaArray (int[] a, int pos1, int pos2)
    {
        int i, j = 0, posMin, posMax;
        if (pos1 < pos2) {
            posMin = pos1;
            posMax = pos2;
        } else {
            posMax = pos1;
            posMin = pos2;
        }
        int[] b = new int[a.length - ((posMax + 1) - posMin)];
        if (pos1 > 0 && pos2 > 0)
        {
            for (i = 0; i < a.length; i++)
            {
                while (i < posMin)
                {
                    b[j] = a[i];
                    i++; j++;
                }
                while (i > posMax && i < a.length)
                {
                    b[j] = a[i];
                    i++; j++;
                }
            }
        }
        else if (pos1 < 0 || pos2 < 0)
        {
            System.out.println("----- FATAL ERROR -----");
        }
        return b;
    }
    public static void ordenaBurbuja (int[] a)
    {
        int i, j = 0, min = 0, max = 0;
        for (i = 0; i < (a.length-1); i++)
        {
            j++;
            if (a[i] < a[j])
            {
                min = a[i];
                max = a[j];
            }
            else
            {
                max = a[i];
                min = a[j];
            }
            a[i] = min;
            a[j] = max;
        }
    }
}