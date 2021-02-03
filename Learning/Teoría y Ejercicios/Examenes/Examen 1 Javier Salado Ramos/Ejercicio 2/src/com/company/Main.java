package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.println("Escribe un array y te lo ordeno en negativos y positivos");
        System.out.print("Tamaño del array: ");
        int[] a = new int[sc.nextInt()];
        leeArray(a);

        System.out.println();
        System.out.println("El array ordenado quedaría así:");
        System.out.println(Arrays.toString(separaNegativosPositivos(a)));

    }
    public static int[] separaNegativosPositivos (int[] a)
    {
        int i, j, cont = 0, temp;
        if (a.length > 1)
        {
            int[] b = copiaArrayPro(a);
            while (cont < b.length)
            {
                j = 0;
                for (i = 0; i < (b.length-1); i++)
                {
                    j++;
                    if (b[i] >= 0 && b[j] < 0)
                    {
                        temp = b[i];
                        b[i] = b[j];
                        b[j] = temp;
                    }
                }
                cont++;
            }

            return b;
        }
        else
        {
            return a;
        }
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
}

/*
                if (b[i] < 0)
                {
                    neg1 = b[i];
                }
                else
                {
                    pos1 = b[i];
                }
                if (b[j] < 0)
                {
                    neg2 = b[j];
                }
                if (b[j] > 0 && pos1 != b[i])
                {
                    pos2 = b[j];
                }
                b[i] = neg1;
                b[j] = pos1;
 */
