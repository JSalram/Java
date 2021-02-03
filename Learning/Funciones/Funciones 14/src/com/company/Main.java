package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero = 0, n;
        leeNatural(numero);
        n =leeNatural2();
    }
    public static void leeNatural (int numero){
        Scanner sc = new Scanner(System.in);
        int i;

        for (i = 0; i < 1; i++){
            System.out.print("Introduce un número: ");
            numero = sc.nextInt();
            if (numero < 0){
                i--;
            }
        }
    }
    public static int leeNatural2 (){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        while (n < 0){
            System.out.println("Error");
            n = sc.nextInt();
        }
        return n;
    }
}
