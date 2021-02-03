package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Ejercicio 2: Raíz Cuadrada cutre

        Scanner sc = new Scanner(System.in);
        int n1, i, raiz = 0;
        System.out.print("Indica un número y te digo su raíz cuadrada aproximada: ");
        n1 = sc.nextInt();

        if (n1 > 0)
        {
            while (raiz * raiz < n1)
            {
                raiz++;
            }
            if (n1 % raiz != 0 || raiz == 2)
            {
                System.out.println("Raiz de " + n1 + " = " + (raiz - 1) + " y pico");
            }
            else
                {
                System.out.println("Raiz de " + n1 + " = " + raiz);
            }
        }
        else
        {
            System.out.println("Número erróneo");
        }
    }
}
