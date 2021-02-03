package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.println("Dime dos números y te digo los existentes entre ambos:");
        System.out.print("Número A: ");
        a = sc.nextInt();
        System.out.print("Número B: ");
        b = sc.nextInt();

        imprimeSerie(a,b);

    }
    public static int imprimeSerie(int a, int b){
        int num;
        if (a > b){
            for (num = a; num >= b; num--){
                System.out.println(num);
            }
            }
        else{
            for (num = a; num <= b; num++){
                System.out.println(num);
            }
        }
        return num;
    }

}
