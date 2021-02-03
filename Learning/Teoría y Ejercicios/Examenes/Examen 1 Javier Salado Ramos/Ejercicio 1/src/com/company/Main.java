package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.println("Escribe tres arrays y te digo los números que tienen en común:");
        System.out.println("ARRAY 1");
        System.out.print("Tamaño: ");
        int[] a = new int[sc.nextInt()];
        leeArray(a);
        System.out.println();

        System.out.println("ARRAY 2");
        System.out.print("Tamaño: ");
        int[] b = new int[sc.nextInt()];
        leeArray(b);
        System.out.println();

        System.out.println("ARRAY 3");
        System.out.print("Tamaño: ");
        int[] c = new int[sc.nextInt()];
        leeArray(c);
        System.out.println();

        System.out.print("El elemento o elementos comunes son: ");
        elementosComunes3(a, b, c);


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
    public static void elementosComunes3 (int[] a, int[] b, int[] c)
    {
        boolean aparece2;
        int i, j, k, ap = 0;
        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < b.length; j++)
            {
                if (a[i] == b[j])
                {
                    aparece2 = true;
                }
                else
                {
                    aparece2 = false;
                }
                if (aparece2)
                {
                    for (k = 0; k < c.length; k++)
                    {
                        if (b[j] == c[k])
                        {
                            ap++;
                            if (ap > 1)
                            {
                                System.out.print(" y ");
                            }
                            System.out.print(c[k]);
                        }
                    }
                }
            }
        }



    }
}
