package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        System.out.print("Indica un número de entre 1 y 5 cifras: ");
        a = sc.nextInt();

        if ((a <= 99999 && a >= 9999) || (a <= -9999 && a >= -99999))
            System.out.println("El número " + a + " es de 5 cifras");
        else if ((a <= 9999 && a >= 999) || (a <= -999 && a >= -9999))
            System.out.println("El número " + a + " es de 4 cifras");
        else if ((a <= 999 && a >= 99) || (a <= -99 && a >= -999))
            System.out.println("El número " + a + " es de 3 cifras");
        else if ((a <= 99 && a >= 9) || (a <= -9 && a >= -99))
            System.out.println("El número " + a + " es de 2 cifras");
        else if ((a <= 9 && a >= 0) || (a <= 0 && a >= -9))
            System.out.println("El número " + a + " es de 1 cifra");
        else
            System.out.println("El número " + a + " contiene más de 5 cifras");
    }
}
