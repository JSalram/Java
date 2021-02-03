package com.company;

public class Main {

    public static void main(String[] args) {
        int[] a; // Definición de la variable del array
        a = new int[5]; // Inicialización del array

        int[] b = new int[5]; // Definición e inicialización

        a[0] = 12; // Guardamos el 1 en la posición 0 del array
        a[1] = 5;
        a[2] = 9;
        a[3] = 2;
        a[4] = 7;

        int[] c = {2, 5, 7, 1, 3, 9};

//        System.out.print(a[0]); // Escribimos por pantalla lo que haya en la posición 0 del array
//        System.out.print(a[1]);
//        System.out.print(a[2]);
//        System.out.print(a[3]);
//        System.out.print(a[4]);

//        int i;

//        for (i = 0; i < 5; i++)
//        {
//            System.out.println("Array nº" + (i+1) + ": " + a[i]);

        leeArray(a);
        escribeArray(a);
        System.out.println("----------------");
        escribeArray(c);
    }
    public static void escribeArray(int[] a)
    {
        int i;

        for (i = 0; i < a.length; i++) // a.lenght = Hasta la longitud del array
        {
            System.out.println("Array nº" + (i+1) + ": " + a[i]);
        }

    }
    public static void leeArray(int[] a)
    {
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
    }
}
