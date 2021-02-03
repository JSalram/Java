package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Indica un número y te digo si es primo o no: ");
        num = sc.nextInt();

        System.out.println("Es primo: " + primo(num));

    }
    public static boolean primo(int num){
        int div = 0, i;
        boolean p = false;

        for (i = num; i >= 1; i--){
            if (num % i == 0){
                div++;
            }
        }
        if (div == 2){
            p = true;
        }
        return p;
    }
}
