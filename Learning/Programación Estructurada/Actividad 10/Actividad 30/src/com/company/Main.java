package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Suma de números pares entre 1 y 1000:");
        int i;
        for (i = 1; i <= 1000; i++){
            if (i % 2 == 0){
                System.out.println("Nº " + i);
            }
        }

    }
}
