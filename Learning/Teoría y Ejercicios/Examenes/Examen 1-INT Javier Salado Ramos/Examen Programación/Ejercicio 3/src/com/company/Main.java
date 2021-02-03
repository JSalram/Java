package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Segundos totales: " + leeHoraSegundos());
    }
    public static int leeHora()
    {
        Scanner sc = new Scanner(System.in);
        int n = 0, i;
        System.out.print("Hora: ");
        for (i = 0; i < 1; i++)
        {
            n = sc.nextInt();
            if (n > 23 || n < 0)
            {
                System.out.print("Hora errónea, vuelve a intentarlo: ");
                i--;
            }
        }
        return n;
    }
    public static int leeMinutos()
    {
        Scanner sc = new Scanner(System.in);
        int n = 0, i;
        System.out.print("Minutos: ");
        for (i = 0; i < 1; i++)
        {
            n = sc.nextInt();
            if (n > 59 || n < 0)
            {
                System.out.print("Minutos erróneos, vuelve a intentarlo: ");
                i--;
            }
        }
        return n;
    }
    public static int leeSegundos()
    {
        Scanner sc = new Scanner(System.in);
        int n = 0, i;
        System.out.print("Segundos: ");
        for (i = 0; i < 1; i++)
        {
            n = sc.nextInt();
            if (n > 59 || n < 0)
            {
                System.out.print("Segundos erróneos, vuelve a intentarlo: ");
                i--;
            }
        }
        return n;
    }
    public static int leeHoraSegundos()
    {
        int h, min, seg, segTotales;
        h = leeHora();
        min = leeMinutos();
        seg = leeSegundos();
        segTotales = horaASegundos(h, min, seg);
        return segTotales;
    }
    public static int horaASegundos (int h, int min, int seg)
    {
        int segTotales;
        segTotales = (h * 3600) + (min * 60) + seg;
        return segTotales;
    }
}
