package com.company;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Quieres jugar sólo(1) o contra la máquina(2)?");
        int opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
                solo();
                break;
            case 2:
                cpu();
                break;
            default:
                System.out.println("\u001B[31m" + "----------ERROR----------");
        }
    }

    public static void solo()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime qué tipo de baraja quieres (1 = 40 cartas, 2 = 80 cartas)");
        int tipoBaraja = sc.nextInt();
        Baraja b1 = new Baraja(tipoBaraja);
        b1.barajar();

        System.out.println("Roba la primera carta (1 = Robar, 2 = Plantarte)");
        int robar = sc.nextInt();
        List<Carta> cartasRobadas = new ArrayList<>();
        double suma = 0;

        while (robar == 1)
        {
            Carta robo = b1.robar();
            suma = suma + robo.valor7ymedia();
            System.out.println("¡Carta robada!");
            System.out.print(robo.nombreCarta());
            System.out.println("  ---  (" + robo.valor7ymedia() + ")");
            System.out.println("El valor actual de tus cartas es de " + suma);
            System.out.println();
            System.out.println("¿Quieres seguir robando? (1 = Robar, 2 = Plantarte)");
            robar = sc.nextInt();
        }

        System.out.println("El valor de tus cartas es de " + suma);
        System.out.println();
        if (suma > 7.5 && suma <= 10 || suma >= 5 && suma < 7.5)
        {
            System.out.println("¡Ha estado cerca!");
        }
        else if (suma > 10)
        {
            System.out.println("Te has pasado");
        }
        else if (suma < 5)
        {
            System.out.println("Te has quedado corto");
        }
        else
        {
            System.out.println("¡¡ Has ganado el juego !!");
        }
    }
    public static void cpu()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime qué tipo de baraja quieres (1 = 40 cartas, 2 = 80 cartas)");
        int tipoBaraja = sc.nextInt();
        Baraja b1 = new Baraja(tipoBaraja);
        b1.barajar();

        System.out.println();
        System.out.println("Tu turno");
        System.out.println("Roba la primera carta (1 = Robar, 2 = Plantarte)");
        int robar = sc.nextInt();
        double suma = 0;

        while (robar == 1)
        {
            Carta robo = b1.robar();
            System.out.println("¡Carta robada!");
            System.out.print(robo.nombreCarta());
            System.out.println("  ---  (" + robo.valor7ymedia() + ")");
            suma = suma + robo.valor7ymedia();
            System.out.println("El valor de tus cartas actual es de " + suma);
            System.out.println();
            System.out.println("¿Quieres seguir robando? (1 = Robar, 2 = Plantarte)");
            robar = sc.nextInt();
        }

        if (suma <= 7.5)
        {
            System.out.println();
            System.out.println("Turno de la máquina");
            robar = 1;
            double sumacpu = 0;

            while (robar == 1)
            {
                Carta robo = b1.robar();
                if (robo.valor7ymedia() + sumacpu <= 7.5)
                {
                    System.out.println("CPU robó una carta");
                    System.out.print(robo.nombreCarta());
                    System.out.println("  ---  (" + robo.valor7ymedia() + ")");
                    sumacpu = sumacpu + robo.valor7ymedia();
                }
                else
                {
                    robar = 2;
                }
            }

            System.out.println("CPU terminó");
            System.out.println();
            System.out.println("El valor de tus cartas es de " + suma);
            System.out.println("El valor de las cartas de la CPU es de " + sumacpu);

            ganador(suma, sumacpu, 7.5);
        }
        else
        {
            System.out.println("El valor de tus cartas es de " + suma);
            System.out.println("Te has pasado de largo, asi que gana la CPU");
        }
    }
    public static void ganador (double p1, double p2, double obj)
    {
        if (p1 != obj && p2 != obj)
        {
            if (p1 < obj && p2 < obj)
            {
                if (p1 > p2)
                {
                    System.out.println("¡¡ GANA EL JUGADOR !!");
                }
                else if (p2 > p1)
                {
                    System.out.println("¡¡ GANA LA CPU !!");
                }
                else
                {
                    System.out.println("¡ EMPATE !");
                }
            }
            else
            {
                System.out.println("¡¡ AMBOS GANAN !!");
            }
        }
        else if (p1 == obj && p2 != obj)
        {
            System.out.println("¡¡ GANA EL JUGADOR !!");
        }
        else
        {
            System.out.println("¡¡ GANA LA CPU !!");
        }
    }
}
