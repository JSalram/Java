package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gradosCentigrados, gradosFahrenheit;

        System.out.println("Dime unos grados Centígrados y te los paso a grados Fahrenheit:");
        System.out.print("Grados Centígrados: ");
        gradosCentigrados = sc.nextDouble();

        System.out.println(gradosCentigrados + " grados Centígrados son " + centigradosAFahrenheit(gradosCentigrados) + " grados Fahrenheit");

        System.out.println("Dime unos grados Fahrenheit y te los paso a grados Centígrados:");
        System.out.print("Grados Fahrenheit: ");
        gradosFahrenheit = sc.nextDouble();

        System.out.println(gradosFahrenheit + " grados Fahrenheit son " + fahrenheitACentigrados(gradosFahrenheit) + " grados Centígrados");

    }
    public static double centigradosAFahrenheit (double gradosCentigrados){
        double gradosFahrenheit;
        gradosFahrenheit = (1.8 * gradosCentigrados) + 32;
        return gradosFahrenheit;
    }
    public static double fahrenheitACentigrados (double gradosFahrenheit){
        double gradosCentigrados;
        gradosCentigrados = (gradosFahrenheit - 32) / 1.8;
        return  gradosCentigrados;
    }
}
