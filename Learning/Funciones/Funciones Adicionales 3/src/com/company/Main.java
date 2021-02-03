package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime una cantidad de dinero menor a 5€ y te digo su cantidad en monedas: ");
        double dinero = sc.nextDouble();

        calderilla(dinero);
    }
    public static void calderilla(double dinero)
    {
        if(dinero <= 5)
        {
            while(dinero >= 2.0)
            {
                System.out.println("2€");
                dinero = dinero - 2.0;
            }

            while(dinero >= 1.0)
            {
                System.out.println("1€");
                dinero = dinero - 1.0;
            }

            while(dinero >= 0.50)
            {
                System.out.println("50cent");
                dinero = dinero - 0.50;
            }

            while(dinero >= 0.20)
            {
                System.out.println("20cent");
                dinero = dinero - 0.20;
            }

            while(dinero >= 0.10)
            {
                System.out.println("10cent");
                dinero = dinero - 0.10;
            }

            while(dinero >= 0.05)
            {
                System.out.println("5cent");
                dinero = dinero - 0.05;
            }

            while(dinero >= 0.02)
            {
                System.out.println("2cent");
                dinero = dinero - 0.02;
            }

            while(dinero >= 0.01)
            {
                System.out.println("1cent");
                dinero = dinero - 0.01;
            }

        }
        else
        {
            System.out.println("Cantidad demasiado grande");
        }
    }
}
