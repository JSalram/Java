package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, n2, i = 1, max, min;
        double media, suma = 0, div = 1;

        System.out.println("Dime 10 números y te digo el mayor, el menor y la media entre ellos: ");
        System.out.print("Nº" + i + ": ");
        n = sc.nextInt();
        max = n;
        min = n;
        suma = suma + n;

        for (i = 2; i <= 10; i++){
            div++;
            if (n > max){
                max = n;
            }
            else if (n < min){
                min = n;
            }
            System.out.print("Nº" + i + ": ");
            n = sc.nextInt();
            suma = suma + n;
        }
        if (n > max){
            max = n;
        }
        else if (n < min){
            min = n;
        }
        media = suma / div;
        System.out.println("El mayor nº es: " + max);
        System.out.println("El menor nº es: " + min);
        System.out.println("Media: " + media);
    }
}
