package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Indica un número y te proporciono su tabla de multiplicar: ");
        int n = sc.nextInt();
        int multiplo = 1;
        System.out.println("Has elegido el número " + n);
        System.out.println("La tabla de multiplicar de " +n+ " es la siguiente:");
        while (multiplo <= 10){
            System.out.println(n * multiplo);
            multiplo++;
        }
    }
}
