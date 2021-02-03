package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Indica dos números y te digo su MCD: ");
        System.out.print("Número A: ");
        a = sc.nextInt();
        System.out.print("Número B: ");
        b = sc.nextInt();

        System.out.println("MCD: " + mcd(a , b));

    }

    public static int mcd(int a, int b) {
        int min, i;

        if (a > b) {
            min = b;
        }
        else {
            min = a;
        }
        for (i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                min = i;
                i = 1;
            }
        }
        return min;
    }

}
