package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indica tres números aleatorios:");
        int A, B, C;
        System.out.print("1º: ");
        A = sc.nextInt();
        System.out.print("2º: ");
        B = sc.nextInt();
        System.out.print("3º: ");
        C = sc.nextInt();

        if (A >= B && A >= C)
            System.out.println("El primer número, " + A + ", es el mayor");
        else if ((A >= B && A <=C) || (A <= B && A >= C))
            System.out.println("El primer número, " + A + ", es el mediano");
        else if (A <= B && A <= C)
            System.out.println("El primer número, " + A + ", es el menor");

        if (B >= A && B >= C)
            System.out.println("El segundo número, " + B + ", es el mayor");
        else if ((B >= A && B <=C) || (B <= A && B >= C))
            System.out.println("El segundo número, " + B + ", es el mediano");
        else if (B <= A && B <= C)
            System.out.println("El segundo número, " + B + ", es el menor");

        if (C >= A && C >= B)
            System.out.println("El tercer número, " + C + ", es el mayor");
        else if ((C >= A && C <=B) || (C <= A && C >= B))
            System.out.println("El tercer número, " + C + ", es el mediano");
        else if (C <= A && C <= B)
            System.out.println("El tercer número, " + C + ", es el menor");
    }
}
