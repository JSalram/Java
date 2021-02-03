package com.company;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("¡Bienvenido al selector aleatorio de tribunal!");
        System.out.println("Primero elige un fichero donde se encuentren los profesores");
        System.out.print("Fichero: ");
        String fichero = sc.next();

        Tribunal t = new Tribunal(fichero);
        TimeUnit.SECONDS.sleep(1);
        System.out.println("¡Fichero cargado con éxito!");

        System.out.println("\n" + "A continuación procederemos con el sorteo:");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Eligiendo tribunal...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Eligiendo tribunal...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Eligiendo tribunal...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println();

        t.eligeTribunal();
    }
}
