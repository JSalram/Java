package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Introduce un número A: ");
        a = sc.nextInt();
        System.out.print("Introduce un número B: ");
        b = sc.nextInt();

        System.out.println(a + " elevado a " + b + " = " + elevado(a, b));
    }
    public static int elevado (int a, int b){
        int n, i;
        n = a;
        for (i = 1; i < b; i++){
            n = n * a;
        }
        return n;
    }
}
