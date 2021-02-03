package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mp = sc.nextDouble();

        resolucionCamara(mp);
    }
    public static void resolucionCamara (double mp){
        double pixel;
        int ancho, alto;

        pixel = mp * 1000000;

        ancho = (int)Math.sqrt(pixel * (16.0 / 9.0));
        alto = (int)Math.sqrt(pixel * (9.0 / 16.0));

        System.out.println(ancho + "x" + alto);
    }
}
