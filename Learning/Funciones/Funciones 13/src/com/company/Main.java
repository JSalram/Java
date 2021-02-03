package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;

        System.out.print("Indica la nota del alumno: ");
        nota = sc.nextDouble();

        System.out.println(notaEnTexto(nota));
    }
    public static String notaEnTexto (double nota){
        String texto = " ";
        if (nota >= 9 && nota <= 10){
            texto = "Sobresaliente";
        }
        else if (nota >= 7 && nota < 9){
            texto = "Notable";
        }
        else if (nota >= 5 && nota < 7){
            texto = "Suficiente";
        }
        else if (nota >= 0 && nota < 5){
            texto = "Suspenso";
        }
        else {
            texto = "Nota inválida, vuelve a introducirla";
        }
        return texto;
    }
}
