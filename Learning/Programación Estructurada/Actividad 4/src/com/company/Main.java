package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double X,Y,Z;
        System.out.println("Indica tres números aleatorios:");
        System.out.print("1º= ");
        X = sc.nextDouble();
        System.out.print("2º= ");
        Y = sc.nextDouble();
        System.out.print("3º= ");
        Z = sc.nextDouble();

        if (X <= Y && Y <= Z)
            System.out.println("Están ordenados de menor a mayor");
        else
            System.out.println("No están ordenados de menor a mayor");

    }
}
