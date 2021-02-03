package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;
        System.out.print("Indica el primer número: ");
        a = sc.nextInt();
        System.out.print("Indica el segundo número: ");
        b = sc.nextInt();

        if (a < b){
            System.out.println("El número más grande es: " + b);
            System.out.println("El número más pequeño es: " + a);
        }
        else{
            System.out.println("El número más grande es: " + a);
            System.out.println("El número más pequeño es " + b);
        }
        System.out.println("Los números impares comprendidos entre " + a + " y " + b + " son:");
        if ((a % 2) == 0){
            a = a + 1;
        }
        while ( a < b ){
            System.out.println(a);
            a = a + 2;
        }
        if ((b % 2) == 0){
            b = b + 1;
        }
        while ( b < a ){
            System.out.println(b);
            b = b + 2;
        }
    }
}
