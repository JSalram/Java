package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Indica un número y te digo si es positivo (1), cero (0) o negativo (-1): ");
        num = sc.nextInt();
        System.out.println("Tu número es: " + signo(num));

    }

    public static int signo(int num){
        int signo;
        if (num > 0){
            signo = 1;
        }
        else if (num == 0){
            signo = 0;
        }
        else {
            signo = -1;
        }
        return signo;
    }
}
