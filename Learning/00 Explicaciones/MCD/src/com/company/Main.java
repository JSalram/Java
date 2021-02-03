package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, min, i;

        System.out.println();
        a = sc.nextInt();
        System.out.println();
        b = sc.nextInt();

        if (a<b){
            min = a;
        }
        else{
            min = b;
        }

        for (i = min; i >=1; i--){
            if (a % i == 0 && b % i == 0){
                System.out.println("MCD: " + i);
                i = 1;
            }
        }

        i = min;
        while ((a % i == 0 && b % i == 0) == false){
            i--;
        }
        System.out.println("MCD= " + i);
    }
}
