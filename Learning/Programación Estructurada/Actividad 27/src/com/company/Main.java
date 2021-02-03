package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Indica un número y te digo su tabla de multiplicar: ");
        int n = sc.nextInt();
        int res;

        for (int i = 1 ; i <= 10 ; i++){
            res = n * i;
            System.out.println(n + "x" + i + "= " + res);
        }
    }
}
