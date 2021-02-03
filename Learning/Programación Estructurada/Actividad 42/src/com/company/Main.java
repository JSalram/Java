package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n, randomN, i;

        System.out.println();
        System.out.println("Bienvenido a calculín.exe, prueba a acertar el número (entre 0 y 100) en el que estoy pensando:");
        System.out.print("¿En qué número estoy pensando?: ");
        randomN = r.nextInt(100 + 1);
        n = -1;

        for (i = 0 ; n != randomN; i++){
            n = sc.nextInt();
            if (n < randomN){
                System.out.println("Uy, el número en el que pienso es algo mayor");
                System.out.print("Prueba de nuevo: ");
            }
            else if (n > randomN){
                System.out.println("El número en el que pienso es algo menor, buena suerte jaja");
                System.out.print("Prueba de nuevo: ");
            }
        }
        if (i == 1){
            System.out.println("¡Madre mia! Has necesitado tan solo " + i + " intento");
            System.out.println("Estas hecho un monstruo, me rindo. ¡¡Enhorabuena!!");
        }
        else if (i > 1 && i <= 5){
            System.out.println("¡Congratulaciones! Has necesitado " + i + " intentos");
            System.out.println("¿A que tampoco fue tan difícil?");
        }
        else if (i > 5 && i <= 10){
            System.out.println("¡Felicidades! Has necesitado " + i + " intentos");
            System.out.println("Se ve que te ha costado, pero no pasa nada, es difícil superarme jeje");
        }
        else if (i > 10 && i < 15){
            System.out.println("¿En serio? Has necesitado " + i + " intentos");
            System.out.println("Bueno... No todo el mundo puede sobresalir , ¿no?");
        }
        else if (i >= 15){
            System.out.println("........ " + i + " intentos ........");
            System.out.println("Incluso mi perro lo podría hacer mejor, y eso que no tengo");
        }
    }
}
