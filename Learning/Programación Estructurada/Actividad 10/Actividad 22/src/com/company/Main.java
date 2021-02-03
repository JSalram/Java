package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Indicame un número y le hago su factorial: ");
        int n = sc.nextInt();
        int cont, suma, mult = 1;
        cont = 1;

        while (cont <= n){
            mult = mult * cont;
            cont = cont + 1;
        }
        System.out.print("Factorial de " + n + "= " + mult);
    }
}
