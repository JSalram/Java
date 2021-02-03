package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        int i;

        for (i = 0; i < 1; i++){
            System.out.print("Nota Alumno: ");
            nota = sc.nextDouble();
            if (nota >= 0 && nota < 5){
                System.out.println("Suficiente");
            }
            else if (nota >= 5 && nota < 6){
                System.out.println("Bien");
            }
            else if (nota >= 6 && nota < 7){
                System.out.println("Notable");
            }
            else if (nota >= 7 && nota < 9){
                System.out.println("Notable");
            }
            else if (nota >= 9 && nota <=10){
                System.out.println("Sobresaliente");
            }
            else {
                System.out.println("Número erróneo, vuelve a intentarlo");
                i--;
            }
        }
    }
}
