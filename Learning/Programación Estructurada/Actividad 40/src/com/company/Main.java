package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, divisores = 0;

        System.out.print("Indica un número: ");
        n = sc.nextInt();

        for (i = 1; i <= n; i++){
            if (n % i == 0){
                divisores++;
            }
        }
        if (divisores == 2){
            System.out.println("Es primo");
        }
        else
            System.out.println("No es primo");
    }
}
