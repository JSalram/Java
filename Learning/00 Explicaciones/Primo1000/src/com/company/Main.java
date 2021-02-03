package com.company;

public class Main {

    public static void main(String[] args) {
        int n, i, divisores;

        for (n = 2; n <= 1000; n++) {
            divisores = 0;
            for (i = 1; i <= n; i++) {
                if (n % i == 0) {
                    divisores++;
                }
            }
            if (divisores == 2) {
                System.out.println(n);
            }
        }

    }
}