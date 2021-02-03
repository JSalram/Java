package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, nota, aprob = 0, susp = 0;
        for (i = 1 ; i <= 30 ; i++){
            System.out.print("Nota del alumno Nª" + i + ": ");
            nota = sc.nextInt();
            if (nota < 5 && nota >= 0){
                susp++;
            }
            else if (nota >= 5 && nota <= 10){
                aprob++;
            }
            else {
                System.out.println("Nota errónea, vuelve a ponerla: ");
                i--;
            }
        }
        System.out.println("Aprobados: " + aprob);
        System.out.println("Suspensos: " + susp);
    }
}
