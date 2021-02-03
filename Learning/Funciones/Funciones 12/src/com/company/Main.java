package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pulgadas, centimetros;

        System.out.print("Indica las pulgadas que quieres pasar a centímetros: ");
        pulgadas = sc.nextDouble();
        System.out.println(pulgadas + " pulgadas son " + pulgadasACentimetros(pulgadas) + "cm");
        System.out.println();
        System.out.print("Indica los centímetros que quieres pasar a pulgadas: ");
        centimetros = sc.nextDouble();
        System.out.println(centimetros + "cm son " + centimetrosAPulgadas(centimetros) + " pulgadas");

    }
    public static double pulgadasACentimetros (double pulgadas){
        double centimetros = pulgadas * 2.54;
        return centimetros;
    }
    public static double centimetrosAPulgadas (double centimetros){
        double pulgadas = centimetros / 2.54;
        return pulgadas;
    }
}
