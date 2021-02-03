package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, i;
        n = 0;

        System.out.println("10 primeros números que no son múltiplos de 2 ni de 3:");
        for (i = 1; i <= 10; i++){
            n = n + 1;
            if ((n % 2 != 0) && (n % 3 != 0)){
                System.out.println("Nº primo " + i + ": " + n);
            }
            else{
                i--;
            }
        }

    }
}
