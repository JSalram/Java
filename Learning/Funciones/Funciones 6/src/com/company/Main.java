package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Indica dos números y te digo el mayor:");
        System.out.print("Número A: ");
        a = sc.nextInt();
        System.out.print("Número B: ");
        b = sc.nextInt();

        System.out.println("Mayor = " + max(a,b));

    }

    public static int max(int a, int b){

        if (a > b){
            return a;
        }
        else {
            return b;
        }
    }

}
