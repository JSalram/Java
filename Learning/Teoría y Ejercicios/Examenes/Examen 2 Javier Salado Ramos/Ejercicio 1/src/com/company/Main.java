package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("¡Bienvenido al 'leeSopaLetras'!");
        System.out.print("Indica el nombre del fichero que contiene la sopa de letras que quieras leer: ");
        String s = "..\\Ficheros\\" + sc.next() + ".txt";
        System.out.println();

        char[][] sopa = leeSopaLetras(s);
        if (sopa.length > 0 && sopa[0].length > 0)
        {
            escribeArrayBi(sopa);
        }
        else
        {
            System.out.println("Ésta sopa de letras no es válida");
        }

    }

    public static char[][] leeSopaLetras (String s)
    {
        String linea;
        List<String> filas = new ArrayList<>();
        char[][] letras;
        int ancho = 0, alto = 0;

        try
        {
            FileReader fr = new FileReader(s);
            BufferedReader br = new BufferedReader(fr);

            linea = br.readLine();
            while (linea != null)
            {
                filas.add(linea);
                alto++;
                linea = br.readLine();
            }
            ancho = filas.get(0).length();

            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        int i, j;
        boolean valido = true;

        for (i = 0; i < filas.size(); i++)
        {
            if (filas.get(i).length() != ancho)
            {
                valido = false;
            }
        }

        if (valido)
        {
            letras = new char[alto][ancho];
            for (i = 0; i < alto; i++)
            {
                for (j = 0; j < ancho; j++)
                {
                    letras[i][j] = filas.get(i).charAt(j);
                }
            }
        }
        else
        {
            letras = new char[0][0];
        }

        return letras;
    }

    public static void escribeArrayBi (char[][] a)
    {
        int i, j, numCifra, cifraMax = 0;
        int[][] cifras = new int[a.length][a[0].length];

        for (i = 0; i < a.length; i++) // CUENTACIFRAS[][]
        {
            for (j = 0; j < a[i].length; j++)
            {
                numCifra = String.valueOf(a[i][j]).length();
                cifras[i][j] = numCifra;
                if (numCifra > cifraMax)
                {
                    cifraMax = numCifra;
                }
            }
        }

        for (i = 0; i < a.length; i++) // ESCRIBECIFRAS
        {
            if (i == 0)
            {
                System.out.print("┌");
            }
            else if (i != a.length - 1)
            {
                System.out.print("│");
            }
            else
            {
                System.out.print("└");
            }
            for (j = 0; j < a[i].length; j++)
            {
                if (j == 0)
                {
                    System.out.print(" ");
                }
                while (cifraMax > cifras[i][j])
                {
                    System.out.print(" ");
                    cifras[i][j]++;
                }
                System.out.print(a[i][j] + " ");
            }
            if (i == 0)
            {
                System.out.println("┐");
            }
            else if (i != a.length - 1)
            {
                System.out.println("│");
            }
            else
            {
                System.out.println("┘");
            }
        }
    }
}
