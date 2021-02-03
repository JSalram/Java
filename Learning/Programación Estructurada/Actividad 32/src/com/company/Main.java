package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, n2, i, max;

        System.out.println("Dime 10 números y te digo el mayor de ellos: ");
        n = sc.nextInt();
        max = n;

        for (i = 1; i < 10; i++){
            n = sc.nextInt();

            if (n > max){
                max = n;
            }
        }
        System.out.println(max);
    }
}
