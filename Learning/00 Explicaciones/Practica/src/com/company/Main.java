package com.company;

public class Main {

    public static void main(String[] args) {

        rombo(4);

    }
    public static void rombo(int tam)
    {
        int nivel;

        for(nivel = 1; nivel < tam; nivel++)
        {
            repiteEspacio(tam - nivel);
            repiteEstrella(nivel * 2);
            System.out.println();
        }
    }
    public static void repiteEspacio(int n)
    {
        int i;
        for(i = 0; i < n; i++)
        {
            System.out.print(" ");
        }
    }
    public static void repiteEstrella(int n)
    {
        int i;
        for(i = 0; i < n; i++)
        {
            System.out.print("*");
        }
    }
}
