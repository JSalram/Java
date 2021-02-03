package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indica dos números y te digo los que hay entre ellos:");
        System.out.print("Número 1: ");
        int a = sc.nextInt();
        System.out.print("Número 2: ");
        int b = sc.nextInt();

        if (a < b){
            for (int num = a; a <= b; num++){
                System.out.println("Num: " + num);
                a++;
            }
        }
        else {
            for (int num = a; a >= b; num--){
                System.out.println("Num: " + num);
                a--;
            }
        }
    }
}
