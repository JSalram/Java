package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aprob, susp, cont;
        double a;
        a = 0;
        cont = 0;
        aprob = 0;
        susp = 0;

        while (cont < 30){
            cont = cont + 1;
            System.out.print("Nota del alumno Nº" + cont + ": ");
            a = sc.nextDouble();
            if (a >= 5 && a <=10){
                aprob++;
            }
            else if (a < 5 && a >= 0){
                susp++;
            }
            else if (a < 0 || a > 10){
                System.out.println("La nota introducida no es correcta, vuelve a introducirla:");
                cont--;
            }
        }
        System.out.println("Hay " + aprob + " alumnos aprobados");
        System.out.println("Hay " + susp + " alumnos suspensos");
    }
}
