package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Hora h;

        System.out.println("¡Bienvenido al operador de horas!" + "\n");
        System.out.println("¿Cómo deseas introducir la hora?");
        System.out.print("1. Segundos totales");
        System.out.println("       2. Horas, minutos y segundos");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();
        while (opcion != 1 && opcion != 2)
        {
            System.out.print("Opción inválida. Vuelve a intentarlo: ");
            opcion = sc.nextInt();
        }

        switch (opcion)
        {
            case 1:
            {
                System.out.print("Segundos: ");
                int seg = sc.nextInt();
                h = new Hora(seg);
            }
                break;
            case 2:
            {
                System.out.print("Hora: ");
                int hora = sc.nextInt();
                System.out.print("Minutos: ");
                int min = sc.nextInt();
                System.out.print("Segundos: ");
                int seg = sc.nextInt();
                h = new Hora(hora, min, seg);
            }
                break;
            default:
                h = new Hora(0);
        }
        System.out.println("La hora que has introducido es " + h.toString() + "\n");

        System.out.println("¿Qué deseas hacer ahora con la hora?");
        System.out.print("1. Sumar");
        System.out.println("                  2. Restar");
        System.out.print("Opción: ");
        opcion = sc.nextInt();
        while (opcion != 1 && opcion != 2)
        {
            System.out.print("Opción inválida. Vuelve a intentarlo: ");
            opcion = sc.nextInt();
        }

        switch (opcion)
        {
            case 1:
            {
                Hora h2;
                System.out.println("Debes indicar una segunda hora, ¿cómo deseas hacerlo?");
                System.out.print("1. Segundos totales");
                System.out.println("       2. Horas, minutos y segundos");
                System.out.print("Opción: ");
                opcion = sc.nextInt();
                while (opcion != 1 && opcion != 2)
                {
                    System.out.print("Opción inválida. Vuelve a intentarlo: ");
                    opcion = sc.nextInt();
                }

                switch (opcion)
                {
                    case 1:
                    {
                        System.out.print("Segundos: ");
                        int seg = sc.nextInt();
                        h2 = new Hora(seg);
                    }
                    break;
                    case 2:
                    {
                        System.out.print("Hora: ");
                        int hora = sc.nextInt();
                        System.out.print("Minutos: ");
                        int min = sc.nextInt();
                        System.out.print("Segundos: ");
                        int seg = sc.nextInt();
                        h2 = new Hora(hora, min, seg);
                    }
                    break;
                    default:
                        h2 = new Hora(0);
                }
                System.out.println("La hora que has introducido es " + h.toString());
                h.add(h2);
                System.out.println("La suma de las dos horas es " + h.toString());
            }
                break;
            case 2:
            {
                Hora h2;
                System.out.println("Debes indicar una segunda hora, ¿cómo deseas hacerlo?");
                System.out.print("1. Segundos totales");
                System.out.println("       2. Horas, minutos y segundos");
                System.out.print("Opción: ");
                opcion = sc.nextInt();
                while (opcion != 1 && opcion != 2)
                {
                    System.out.print("Opción inválida. Vuelve a intentarlo: ");
                    opcion = sc.nextInt();
                }

                switch (opcion)
                {
                    case 1:
                    {
                        System.out.print("Segundos: ");
                        int seg = sc.nextInt();
                        h2 = new Hora(seg);
                    }
                    break;
                    case 2:
                    {
                        System.out.print("Hora: ");
                        int hora = sc.nextInt();
                        System.out.print("Minutos: ");
                        int min = sc.nextInt();
                        System.out.print("Segundos: ");
                        int seg = sc.nextInt();
                        h2 = new Hora(hora, min, seg);
                    }
                    break;
                    default:
                        h2 = new Hora(0);
                }
                System.out.println("La hora que has introducido es " + h.toString());
                h.substract(h2);
                System.out.println("La resta de las dos horas es " + h.toString());
            }
                break;
            default:
                System.out.println("------ERROR------");
        }
    }
}
