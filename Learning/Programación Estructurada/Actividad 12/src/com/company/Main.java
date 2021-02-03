package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int n, par, impar;
        System.out.print("Presiona '1' para números pares y '2' para números impares: ");
        n = sc.nextInt();
        par = 2;
        impar = 1;

        while (par <=10 && impar <= 10){
        if (n == 1){
                System.out.println(par);
                par = par + 2;}
        else if (n == 2){
                System.out.println(impar);
                impar = impar + 2;
            }
        }
    }
}
