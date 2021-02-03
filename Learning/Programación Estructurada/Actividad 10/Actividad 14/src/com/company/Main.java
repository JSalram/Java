package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;
        System.out.print("Indica el primer número: ");
        a = sc.nextInt();
        System.out.print("Indica el segundo número (debe ser mayor que el anterior): ");
        b = sc.nextInt();

        while (a > b) {
            System.out.println("Recuerda que el primer número debe ser menor que " + b + ", indíca de nuevo el primer número: ");
            a = sc.nextInt();
        }
        System.out.println("Entre el número " + a + " y el número " + b + " están los siguientes números:");
        while (a <= b) {
            System.out.println("Número " + a);
            a++;
        }
    }
}
