package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Suma de números pares entre 1 y 1000:");

        int a , b, res, suma;
        a = 2;
        b = 2;
        suma = 1;

        while (b < 1000 ){
            res = a + b;
            b = b + 2;
            System.out.println("Suma nº " + suma + " (+"+b+")" + " = " + res);
            a = res;
            suma++;
        }
    }
}
