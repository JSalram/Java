package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 0, b = 0;
        leeNumero(a, b);

    }
    public static void leeNumero (int a, int b){
        Scanner sc = new Scanner(System.in);
        int n, i;

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.print("Introduce un número: ");
        for (i = 0; i < 1; i++){
            n = sc.nextInt();
            if (!(n >= a && n <= b) && !(n <= a && n >= b)){
                System.out.print("Vuelve a introducir el número: ");
                i--;
            }
        }
    }
}
