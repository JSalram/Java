package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, div;
        double suma, med;

        System.out.print("Indica varios números para realizar la media de todos ellos (al elegir un nº negativo cierras la cuenta): ");
        a = sc.nextInt();

        suma = 0;
        div = 0;

        while (a >= 0){
            suma = a + suma;
            div = div + 1;
            System.out.print("Has elegido el número " + a + ". Indica otro más si lo deseas: ");
            a = sc.nextInt();
            }
        med = suma / div;
        System.out.println("Media de todos los números " + "("+suma+"/"+div+")" + " = " + med);
        }
    }
