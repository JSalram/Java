package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.println("Escribe una frase y te digo cuantos diptongos tiene");
        System.out.print("Frase: ");
        String s = sc.nextLine();
        System.out.println("La frase tiene " + cuentaDiptongos(s) + " diptongo(s)");

    }
    public static int cuentaDiptongos (String s)
    {
        int dipt = 0, i, j;
        String voc = "aeiouáéíóú";
        for (i = 0; i < (s.length()-1); i++)
        {
            if (s.charAt(i) == 'u' || s.charAt(i) == 'i') // Diptongos normales
            {
                if (i > 0 && s.charAt(i-1) != 'q' && s.charAt(i-1) != 'g') // 'u' muda
                {
                    i++;
                    for (j = 0; j < voc.length(); j++)
                    {
                        if (s.charAt(i) == voc.charAt(j))
                        {
                            dipt++;
                        }
                    }
                }
            }
            for (j = 0; j < voc.length(); j++) // Semivocal
            {
                if (s.charAt(i) == voc.charAt(j))
                {
                    i++;
                    if (s.charAt(i) == 'y')
                    {
                        dipt++;
                    }
                    if (s.charAt(i) == 'h') // h intercalada
                    {
                        i++;
                        for (j = 0; j < voc.length(); j++)
                        {
                            if (s.charAt(i) == voc.charAt(j))
                            {
                                dipt++;
                            }
                        }
                    }
                }

            }
            if (s.charAt(i) == 'ü') // Diéresis
            {
                if (s.charAt(i-1) == 'q' || s.charAt(i-1) == 'g')
                {
                    i++;
                    for (j = 0; j < voc.length(); j++)
                    {
                        if (s.charAt(i) == voc.charAt(j))
                        {
                            dipt++;
                        }
                    }
                }
            }
        }
        return dipt;
    }
}
