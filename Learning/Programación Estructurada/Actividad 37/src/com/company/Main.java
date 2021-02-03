package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n; int i, numero = 1;

        System.out.println("Diferentes opciones.");
        System.out.println("'a': Múltiplos de 11 entre 1 y 100");
        System.out.println("'b': Múltiplos de 17 entre 1 y 100");
        System.out.println("'c': Múltiplos de 23 entre 1 y 100");
        System.out.print("Elige la opción que prefieras: ");

        for (i = 0; i < 1; i++) {
            n = sc.next();

            if (n.equals("a")) {
                while (numero < 1000){
                    if (numero % 11 == 0){
                        System.out.println(numero);
                    }
                    numero++;
                }
            } else if (n.equals("b")) {
                while (numero < 1000){
                    if (numero % 17 == 0){
                        System.out.println(numero);
                    }
                    numero++;
                }
            } else if (n.equals("c")) {
                while (numero < 1000){
                    if (numero % 23 == 0){
                        System.out.println(numero);
                    }
                    numero++;
                }
            } else {
                System.out.print("Opción errónea, vuelve a intentarlo: ");
                i--;
            }
        }



    }
}
