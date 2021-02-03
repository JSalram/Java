package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Dime un número entero y te digo cuantas cifras tiene: ");
        num = sc.nextInt();
        System.out.println("Cifras: " + numeroCifras(num));

    }
    public static int numeroCifras (int num)
    {
        int cifras;
        if (num == 0)
        {
            cifras = 1;
        }
        else if (num > 0)
        {
            for (cifras = 0; num > 0; cifras++)
            {
                num = num / 10;
            }
        }
        else {
            for (cifras = 0; num < 0; cifras++)
            {
                num = num / 10;
            }
        }
        return cifras;
    }
}
