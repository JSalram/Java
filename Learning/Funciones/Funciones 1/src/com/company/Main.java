package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean n;
        System.out.print("Indica un número para saber si es par o impar: ");
        n = par(sc.nextInt());

        if (n){
            System.out.println("Es par");
        }
        else{
            System.out.println("Es impar");
        }
    }
    public static boolean par(int numero) {
        boolean numPar;
        if (numero % 2 == 0){
            numPar  = true;
    }
        else{
            numPar = false;
        }
        return numPar ;
    }

}
