package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        int A, B , resultado;
        System.out.print("Indica un número: ");
        A = sc.nextInt();
        System.out.print("Indica un número: ");
        B = sc.nextInt();

        if (A>=B)
            resultado = A - B;
        else
            resultado = B - A;
        System.out.println("Resultado = " + resultado);


    }
}
