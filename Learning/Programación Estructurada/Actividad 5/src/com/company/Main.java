package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X, Y, Z;
        System.out.println("Indica tres números aleatorios:");
        System.out.print("1º= ");
        X = sc.nextInt();
        System.out.print("2º= ");
        Y = sc.nextInt();
        System.out.print("3º= ");
        Z = sc.nextInt();

        if (Z == Y + 1 && Y == X + 1)
            System.out.println("Los números son consecutivos");
        else
            System.out.println("Los números no son consecutivos");
    }
}
