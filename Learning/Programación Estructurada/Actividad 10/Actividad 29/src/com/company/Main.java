package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mayor, menor, i, a, b;

        System.out.println("Indica dos números y te digo los impares entre ellos:");
        System.out.print("Número 1: ");
        a = sc.nextInt();
        System.out.print("Número 2: ");
        b = sc.nextInt();


        if ( a > b){
            mayor = a;
            menor = b;
            System.out.println("El número más grande es " + mayor);
            System.out.println("El número más pequeño es " + menor);
        }
        else {
            mayor = b;
            menor = a;
            System.out.println("El número más grande es " + mayor);
            System.out.println("El número más pequeño es " + menor);
        }
        System.out.println("Números impares entre " + menor + " y " + mayor + ":");
        for (i = menor; i <= mayor; i++) {
            if (i % 2 == 1) {
                System.out.println("Nº " + i);
            }
        }
    }
}
