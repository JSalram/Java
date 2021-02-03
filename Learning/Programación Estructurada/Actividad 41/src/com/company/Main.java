package com.company;

public class Main {

    public static void main(String[] args) {
        int n, i, divisores;

        System.out.println("Números primos entre el 2 y el 1000:");

        for (i = 2; i <= 1000; i++){
            divisores = 0;
            for (n = 1; n <= i; n++) {
                if (i % n == 0) {
                    divisores++;
                }
                }
            if (divisores == 2) {
                System.out.println(i);
            }
        }
    }
}
