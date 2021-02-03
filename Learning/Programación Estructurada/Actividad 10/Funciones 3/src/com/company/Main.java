package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Indica un número para escribir su tabla de multiplicar: ");
        int numero = sc.nextInt();
        tablaMultiplicar(numero);
    }
    public static int tablaMultiplicar(int numero){
        int multiplo = 0;
        int resultado = numero;

        while (multiplo < 10){
            multiplo++;
            resultado = numero * multiplo;
            System.out.println(numero + "x" + multiplo + "= " + resultado);
        }
        return resultado;
    }

}
