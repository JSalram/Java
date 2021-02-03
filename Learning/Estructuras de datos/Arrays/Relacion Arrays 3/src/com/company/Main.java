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
        System.out.print("1. copiaArray");
        System.out.println("                                     " + "2. copiaArrayInvertido");
        System.out.print("3. sumaArrays");
        System.out.println("                                     " + "4. restaArrays, multiplicaArrays y divideArrays");
        System.out.print("5. invierteArray");
        System.out.println("                                  " + "6. comparaArrays");
        System.out.print("7. ponNotasArray");
        System.out.println("                                  " + "8. concatenaArrays55");
        System.out.print("9. concatenaArrays");
        System.out.println("                                " + "10. contiene");
        System.out.println();
        System.out.print("Elige una opción: ");
        opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                System.out.println("Indica el tamaño del array A: ");
                int[] a = new int[sc.nextInt()];
                leeArray(a);
                System.out.println("Indica el tamaño del array B: ");
                int[] b = new int[sc.nextInt()];
                leeArray(b);
                copiaArray(a, b);
                System.out.print("Array A: ");
                escribeArray(a);
                System.out.print("Array B: ");
                escribeArray(b);
            }
                break;
            case 2:
            {
                System.out.println("Indica el tamaño del array A: ");
                int[] a = new int[sc.nextInt()];
                leeArray(a);
                System.out.println("Indica el tamaño del array B: ");
                int[] b = new int[sc.nextInt()];
                leeArray(b);
                copiaArrayInvertido(a, b);
                System.out.print("Array A: ");
                escribeArray(a);
                System.out.print("Array B: ");
                escribeArray(b);
            }
                break;
            case 3:
            {
                System.out.println("Indica el tamaño de los arrays: ");
                int n = sc.nextInt();
                int[] a = new int[n];
                System.out.print("Array A - ");
                leeArray(a);
                int[] b = new int[n];
                System.out.print("Array B - ");
                leeArray(b);
                int[] c = new int[n];
                System.out.println("A + B = " + Arrays.toString(sumaArrays(a, b, c)));
            }
                break;
            case 4:
            {
                System.out.println("Indica el tamaño de los arrays: ");
                int n = sc.nextInt();
                int[] a = new int[n];
                System.out.print("Array A - ");
                leeArray(a);
                int[] b = new int[n];
                System.out.print("Array B - ");
                leeArray(b);
                int[] c = new int[n];
                System.out.println("A - B = " + Arrays.toString(restaArrays(a, b, c)));
                System.out.println("A * B = " + Arrays.toString(multiplicaArrays(a, b, c)));
                System.out.println("A / B = " + Arrays.toString(divideArrays(a, b, c)));
            }
                break;
            case 5:
            {
                System.out.print("Indica el tamaño del array: ");
                int[] a = new int[sc.nextInt()];
                leeArray(a);
                escribeArray(a);
                invierteArray(a);
                System.out.println("Array invertido: ");
                escribeArray(a);
            }
                break;
            case 6:
            {
                System.out.print("Indica el tamaño del array A: ");
                int[] a = new int[sc.nextInt()];
                System.out.print("Array A - ");
                leeArray(a);
                System.out.print("Indica el tamaño del array B: ");
                int[] b = new int[sc.nextInt()];
                System.out.print("Array B - ");
                leeArray(b);
                if (comparaArrays(a, b))
                {
                    System.out.println("A y B son arrays idénticos.");
                }
                else
                {
                    System.out.println("A y B son diferentes en tamaño/valores.");
                }
            }
                break;
            case 7:
            {
                System.out.println("Indica el tamaño de los arrays: ");
                int n = sc.nextInt();
                double[] a = new double[n];
                System.out.print("Notas de alumnos - ");
                leeArrayNotas(a);
                boolean[] b = new boolean[n];
                ponNotasArray(a, b);
                escribeArrayBoolean(b);
            }
                break;
            case 8:
            {
                int[] a = new int[5];
                System.out.print("Array A - ");
                leeArray(a);
                int[] b = new int[5];
                System.out.print("Array B - ");
                leeArray(b);
                int[] c = new int[10];
                concatenaArrays55(a, b, c);
                escribeArray(c);
            }
                break;
            case 9:
            {
                System.out.println("Indica el tamaño de los arrays: ");
                int n = sc.nextInt();
                int[] a = new int[n];
                System.out.print("Array A - ");
                leeArray(a);
                int[] b = new int[n];
                System.out.print("Array B - ");
                leeArray(b);
                int[] c = new int[2*n];
                concatenaArrays(a, b, c);
                escribeArray(c);
            }
                break;
            case 10:
            {
                System.out.println("Indica el tamaño del array: ");
                int n = sc.nextInt();
                int[] a = new int[n];
                leeArray(a);
                System.out.println("Indica el número que quieres saber si contiene: ");
                int num = sc.nextInt();
                if (contiene(a, num))
                {
                    System.out.println("El array contiene el número " + num);
                }
                else
                {
                    System.out.println("El array NO contiene el número " + num);
                }

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
    public static void escribeArrayBoolean(boolean[] a)
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
    public static void leeArrayNotas(double[] a)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Indica los valores del array:");
        for (i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
            if (a[i] < 0.0 && a[i] >10.0)
            {
                System.out.print("Nota errónea, vuelve a introducirla: ");
                i--;
            }
        }
    }
    public static void copiaArray (int[] a, int[] b)
    {
        int i;
        if (a.length == b.length)
        {
            for (i = 0; i < a.length; i++)
            {
                b[i] = a[i];
            }
        }
        else
        {
            System.out.println("Los arrays no son del mismo tamaño");
        }
    }
    public static void copiaArrayInvertido (int[] a, int[] b)
    {
        int i, j = b.length-1;
        if (a.length == b.length)
        {
            for (i = 0; i < a.length; i++)
            {
                b[j] = a[i];
                j--;
            }
        }
        else
        {
            System.out.println("Los arrays no son del mismo tamaño");
        }
    }
    public static int[] sumaArrays (int[] a, int[] b, int[] c)
    {
        int suma, i;
            for (i = 0; i < a.length; i++)
            {
                suma = a[i] + b[i];
                c[i] = suma;
            }
        return c;
    }
    public static int[] restaArrays (int[] a, int[] b, int[] c)
    {
        int resta, i;
        for (i = 0; i < a.length; i++)
        {
            resta = a[i] - b[i];
            c[i] = resta;
        }
        return c;
    }
    public static int[] multiplicaArrays (int[] a, int[] b, int[] c)
    {
        int mult, i;
        for (i = 0; i < a.length; i++)
        {
            mult = a[i] * b[i];
            c[i] = mult;
        }
        return c;
    }
    public static int[] divideArrays (int[] a, int[] b, int[] c)
    {
        int div, i;
        for (i = 0; i < a.length; i++)
        {
            div = a[i] / b[i];
            c[i] = div;
        }
        return c;
    }
    public static void invierteArray (int[] a)
    {
        int i, j, temp;
        j = a.length-1;
        for (i = 0; i < j; i++)
        {
            temp = a[j];
            a[j] = a[i];
            a[i] = temp;
            j--;
        }
    }
    public static boolean comparaArrays (int[] a, int[] b)
    {
        int i;
        boolean comparacion = false;
        if (a.length == b.length)
        {
            for (i = 0; i < a.length; i++)
            {
                if (a[i] == b[i])
                {
                    comparacion = true;
                }
                else
                {
                    comparacion = false;
                    i = a.length;
                }
            }
        }
        return comparacion;
    }
    public static void ponNotasArray (double[] notas, boolean[] aprobado)
    {
        int i;
        for (i = 0; i < notas.length; i++)
        {
            if (notas[i] >= 5.0 && notas[i] <= 10.0)
            {
                aprobado[i] = true;
            }
            else
            {
                aprobado[i] = false;
            }
        }
    }
    public static void concatenaArrays55 (int[] a, int[] b, int[] c)
    {
        int i = 0;
        while (i < 5)
        {
            c[i] = a[i];
            c[i + 5] = b[i];
            i++;
        }
    }
    public static void concatenaArrays (int[] a, int[] b, int[] c)
    {
        int i = 0;
        while (i < a.length)
        {
            c[i] = a[i];
            c[i + a.length] = b[i];
            i++;
        }
    }
    public static boolean contiene (int[] a, int n)
    {
        int i;
        boolean cont = false;
        for (i = 0; i < a.length; i++)
        {
            if (a[i] == n)
            {
                cont = true;
            }
        }
        return cont;
    }
}
