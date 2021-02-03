package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Quieres números 'pares' o 'impares'?: (Del 1 al 10)");
        String parImpar = sc.next();

        if (parImpar.equals("pares") || parImpar.equals("impares")) {
            int num = 0;

            for (num = 0; num <= 10; num++ ) {
                if (parImpar.equals("pares")) {
                    boolean par = (num % 2) == 0;
                    if (par){
                        System.out.println(num);
                    }
                }
                if (parImpar.equals("impares")) {
                    boolean impar = (num % 2) == 1;
                    if (impar){
                        System.out.println(num);
                    }
                    }
                }
            }
        else {
            System.out.println("Respuesta incorrecta, vuelve a intentarlo.");
        }
    }
}

