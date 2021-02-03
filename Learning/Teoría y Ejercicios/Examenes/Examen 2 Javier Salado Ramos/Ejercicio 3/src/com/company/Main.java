package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("¡Bienvenido al 'detectaConsecutivos'!");
        System.out.println("Indica los números que quieres detectar (-1 para terminar):");

        List<Integer> numeros = new ArrayList<>();
        leeLista(numeros);

        int[] consec = detectaConsecutivos(listToArray(numeros));
        escribeArray(consec);
    }

    public static int[] detectaConsecutivos (int[] a)
    {
        List<Integer> array = arrayToList(a);
        List<Integer> consec = new ArrayList<>();
        int i;

        for (i = 0; i < array.size(); i++)
        {
            if (i != array.size()-1 && array.get(i).equals(array.get(i + 1)))
            {
                i++;
                if (i != array.size()-1 && array.get(i).equals(array.get(i + 1)))
                {
                    i++;
                    consec.add(array.get(i));
                }
            }
        }

        return listToArray(consec);
    }

    public static void leeLista (List<Integer> l)
    {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        while (n != -1)
        {
            l.add(n);
            n = sc.nextInt();
        }
    }
    public static List<Integer> arrayToList (int[] a)
    {
        List<Integer> l = new LinkedList<>();
        int i;
        for (i = 0; i < a.length; i++)
        {
            l.add(a[i]);
        }
        return l;
    }
    public static int[] listToArray (List<Integer> a)
    {
        int[] b = new int[a.size()];
        int i;
        for (i = 0; i < b.length; i++)
        {
            b[i] = a.get(i);
        }

        return b;
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


}
