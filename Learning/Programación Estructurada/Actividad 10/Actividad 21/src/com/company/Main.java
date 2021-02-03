package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indica 10 números y te digo cuál es mayor:");
        int n, max, min, num;
        double suma, cont, resultado;

        cont = 1;
        num = 1;
        System.out.print("Número " + num + ": ");
        n = sc.nextInt();
        max = n;
        min = n;
        suma = n;

        while (cont < 10){
            num++;
            cont++;
            System.out.print("Número " + num + ": ");
            if (n >= max){
                max = n;
            }
            else if (n <= min){
                min = n;
            }
            n = sc.nextInt();
            suma = n + suma;
        }
        System.out.println("El valor máximo es: " + max);
        System.out.println("El valor mínimo es: " + min);
        resultado = suma / cont;
        System.out.println("Media" + "("+suma+"/"+cont+")" + "= " + resultado);
    }
}
