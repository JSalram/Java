package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b, h;

        System.out.println("Indica la base y el área de un triángulo y te digo su área");
        System.out.print("Base del triángulo: ");
        b = sc.nextInt();
        System.out.print("Altura del triángulo: ");
        h = sc.nextInt();

        System.out.println("Área del triangulo: " + areaTriangulo(b,h));

    }
    public static int areaTriangulo (int b, int h){
        int area = (b * h) / 2;
        return area;
    }
}
