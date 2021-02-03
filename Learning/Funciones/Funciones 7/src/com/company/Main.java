package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Indica dos números y te digo el menor:");
        System.out.print("Número A: ");
        a = sc.nextInt();
        System.out.print("Número B: ");
        b = sc.nextInt();

        System.out.println("Menor = " + min(a,b));

    }

    public static int min(int a, int b){

        if (a > b){
            return b;
        }
        else {
            return a;
        }
    }
}
