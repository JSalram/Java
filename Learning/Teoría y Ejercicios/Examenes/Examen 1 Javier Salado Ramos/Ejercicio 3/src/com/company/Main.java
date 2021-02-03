package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.println("Escribe una frase y te dejo las palabras con un nº de letras impar");
        System.out.print("Frase: ");
        String s = sc.nextLine();
        s = palabrasImpares(s);
        System.out.println();
        System.out.println("La frase con palabras impares quedaría así:");
        System.out.println(s);

    }
    public static String palabrasImpares (String s)
    {
        int i, cont = 0;
        s = quitaEspaciosSobrantes(s);
        String[] palabras = s.split(" ");
        String s2 = "";
        for (i = 0; i < palabras.length; i++)
        {
            if (palabras[i].length() % 2 != 0)
            {
                cont++;
                if (cont > 1)
                {
                    s2 = s2 + ' ';
                }
                s2 = s2 + palabras[i];
            }
        }
        return s2;
    }
    public static String quitaEspaciosSobrantes (String s)
    {
        s = s.trim();
        String s2 = "";
        int i;
        for (i = 0; i < s.length(); i++)
        {
            if (i > 0)
            {
                if (s.charAt(i-1) == ' ')
                {
                    s2 = s2 + ' ';
                    while (s.charAt(i) == ' ' && i < s.length() - 1)
                    {
                        i++;
                    }
                }
            }
            while (s.charAt(i) != ' ' && i < s.length()-1)
            {
                s2 = s2 + s.charAt(i);
                i++;
            }
            if (i == s.length()-1 && s.charAt(i) != ' ')
            {
                s2 = s2 + s.charAt(i);
            }
        }
        return s2;
    }
}
