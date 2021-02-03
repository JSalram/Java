package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Introduce un número y le hago su factorial: ");
        n = sc.nextInt();
        System.out.println("Factorial de " + n + " = " + factorial(n));
    }
    public static int factorial (int n){
        int fact, i;
        fact = n;
        for (i = 1; i < n; i++){
            fact = fact * i;
        }
        return  fact;
    }
}
