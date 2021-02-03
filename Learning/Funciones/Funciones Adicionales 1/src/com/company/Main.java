package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Dime dos números y te digo si son primos relativos: ");
        System.out.print("Número 1: ");
        num1 = sc.nextInt();
        System.out.print("Número 2: ");
        num2 = sc.nextInt();

        if (primosRelativos(num1, num2)){
            System.out.println(num1 + " y " + num2 + " SON primos relativos");
        }
        else {
            System.out.println(num1 + " y " + num2 + " NO SON primos relativos");
        }

    }
    public static boolean primosRelativos (int num1, int num2){
        boolean primo;
        int min, max, i, div = 0;

        if (num1 > num2){
            max = num1;
            min = num2;
        }
        else {
            max = num2;
            min = num1;
        }
        for (i = 1; i <= min; i++){
            if (max % i == 0){
                div++;
            }
        }
        if (div <= 2){
            primo = true;
        }
        else {
            primo = false;
        }

        return primo;
    }
}
