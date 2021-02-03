package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.println("Escribe un array y te hago una gráfica con los valores (máx. 9):");
        System.out.print("Tamaño del array: ");
        int[] a = new int[sc.nextInt()];
        leeArray(a);
        System.out.println();

        System.out.println("\u001B[34m" + "_____GRÁFICA_____");
        graficaBarras(a);



    }
    public static void graficaBarras (int[] a)
    {
        int i, k, num = 10;
        boolean valido = false;
        boolean[] mayor5 = new boolean[a.length];
        for (i = 0; i < a.length; i++)
        {
            if (a[i] < 10)
            {
                valido = true;
                if (a[i] >= 5)
                {
                    mayor5[i] = true;
                }
            }
            else
            {
                valido = false;
                i = a.length;
            }

        }
        if (valido)
        {
            for (i = 0; i < 10; i++)
            {
                for (k = 0; k < a.length; k++)
                {
                    if (mayor5[k])
                    {
                        System.out.print("\u001B[32m");
                    }
                    else
                    {
                        System.out.print("\u001B[31m");
                    }
                    if (a[k] == num)
                    {
                        System.out.print('\u2588');
                        System.out.print(" ");
                        a[k]--;
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
                System.out.println();
                num--;
            }
        }
        else
        {
            System.out.println("\u001B[31m" + "----------FATAL-ERROR----------");
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
}
