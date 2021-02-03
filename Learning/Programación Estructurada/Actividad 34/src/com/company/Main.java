package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, mult = 1, i;
        System.out.print("Indicame un número y le hago su factorial: ");
        n = sc.nextInt();

        for (i = 1; i <=n; i++){
            mult = mult * i;
        }
        System.out.println("Factorial de " + n + " = " + mult);
    }
}
