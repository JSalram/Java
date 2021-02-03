package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, max, cont;
        System.out.println("Indica 10 números y te digo cuál es mayor:");
        cont = 1;
        System.out.print("Número " + cont + ": ");
        n = sc.nextInt();
        max = n;

        while (cont < 10){
            cont++;
            System.out.print("Número " + cont + ": ");
            if (n >= max){
                max = n;
            }
            n = sc.nextInt();
        }
        System.out.println("El valor máximo es: " + max);
    }
}
