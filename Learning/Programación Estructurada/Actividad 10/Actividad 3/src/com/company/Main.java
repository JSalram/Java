package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double c1, c2;
        System.out.print("Indica una cantidad de dinero en euros: ");
        c1 = sc.nextDouble();
        System.out.println("Cantidad en euros= " + c1 + "€");
        c2 = c1 * 166.386;
        System.out.println("Su equivalente en pesetas es de " + c2 + " ptas.");
    }
}
