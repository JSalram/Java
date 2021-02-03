package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Indica dos números y te digo su MCM: ");
        System.out.print("Número A: ");
        a = sc.nextInt();
        System.out.print("Número B: ");
        b = sc.nextInt();

        System.out.println(mcm(a, b));
    }

    public static int mcm(int a, int b){
        int max, i,tope;

        if (a > b) {
            max = b;
        }
        else {
            max = a;
        }
        tope = a * b;
        for (i = max; i <= tope; i++){
            if (i % a == 0 && i % b == 0){
                max = i;
                i = tope;
            }
        }
        return max;
    }

}
