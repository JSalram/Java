package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, x , xn;
        System.out.println("Indica los valores de los números para formar una ecuación de 2º grado:");
        System.out.print("Primer número = ");
        a = sc.nextDouble();
        System.out.print("Segundo número = ");
        b = sc.nextDouble();
        System.out.print("Tercer número = ");
        c = sc.nextDouble();
        System.out.println("La ecuación de segundo grado es la siguiente: " + "("+ a +")" + "x2" + " + " + "("+ b +")" + "x" + " + " + "("+ c +")" + " = 0");

        System.out.println("Los resultados son los siguientes: ");
        xn = ((b * b) - (4 * a * c));

        x = (-b + Math.sqrt(xn)) / (2 * a);
        System.out.println("X1 = " + x);

        x = (-b - Math.sqrt(xn)) / (2 * a);
        System.out.println("X2 = " + x);


    }
}
