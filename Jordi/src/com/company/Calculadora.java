package com.company;

import java.util.Scanner;

public class Calculadora
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        boolean salir = true;
        while (salir)
        {
            System.out.println("Calculadora simple");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5.Salir \n");

            System.out.print("Opcion:");
            String opcion = input.nextLine(); //Variable opcion almacena el input.


            if (opcion.equals("1"))
            {
                System.out.print("numero 1: ");
                int opcionNumero1 = input.nextInt();
                System.out.print("numero 2: ");
                int opcionNumero2 = input.nextInt();

                int numero3 = opcionNumero1 + opcionNumero2;

                System.out.println(numero3 + " = " + opcionNumero1 + " + " + opcionNumero2 + "\n");
                input.nextLine();
            }

            if (opcion.equals("2"))
            {
                System.out.print("numero 1: ");
                int opcionNumero3 = input.nextInt();
                System.out.print("numero 2: ");
                int opcionNumero4 = input.nextInt();

                int numero4 = opcionNumero3 - opcionNumero4;

                System.out.println(numero4 + " = " + opcionNumero3 + " - " + opcionNumero4 + "\n");
                input.nextLine();
            }

            if (opcion.equals("3"))
            {
                System.out.print("numero 1: ");
                int opcionNumero5 = input.nextInt();
                System.out.print("numero 2: ");
                int opcionNumero6 = input.nextInt();

                int numero5 = opcionNumero5 * opcionNumero6;

                System.out.println(numero5 + " = " + opcionNumero5 + " x " + opcionNumero6 + "\n");
                input.nextLine();
            }

            if (opcion.equals("4"))
            {
                System.out.print("numero 1: ");
                int opcionNumero7 = input.nextInt();
                System.out.print("numero 2: ");
                int opcionNumero8 = input.nextInt();

                int numero6 = opcionNumero7 / opcionNumero8;

                System.out.println("\n" + numero6 + " = " + opcionNumero7 + " / " + opcionNumero8 + "\n");

                //todo while and integer/0 OK
                //todo Solucionar entra de string en el input
                input.nextLine();
            }

            if (opcion.equals("5"))
            {
                salir = false;
            }
        }
    }
}