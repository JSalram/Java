package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Indica un año: ");
        int anyo, bisiesto;
        anyo = sc.nextInt();
        bisiesto = anyo % 4;

        if (bisiesto == 0)
            System.out.println("El año indicado es bisiesto");
        else
            System.out.println("El año indicado no es bisiesto");

    }
}
