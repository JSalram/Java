package com.company;

import java.security.InvalidParameterException;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        AutoVenta av = new AutoVenta();
        boolean hayCambios = false;
        String seguir = "s";

        System.out.println("Bienvenido al programa de AutoVenta");

        System.out.println("Indica el nombre de un fichero CSV del cual extraer los coches");
        System.out.print("Archivo CSV: ");
        String fichero = sc.next();
        sc.nextLine();
        av.cargar(fichero);
        System.out.println("Fichero cargado con éxito" + "\n");

        while (seguir.equals("s"))
        {
            System.out.println("\n" + "¿Qué deseas hacer?");
            System.out.println("1. Insertar un coche          2. Buscar un coche");
            System.out.println("3. Sacar listado de coches");
            System.out.print("Opción: ");
            int opcion = sc.nextInt();
            System.out.println();
            sc.nextLine();

            switch (opcion)
            {
                case 1:
                {
                    System.out.println("Solicita los datos del coche");
                    System.out.print("Matrícula: ");
                    String matricula = sc.next();
                    System.out.print("Fecha de matriculación (DD-MM-AAAA): ");
                    String fecha = sc.next();
                    int dia = Integer.parseInt(fecha.split("-")[0]);
                    int mes = Integer.parseInt(fecha.split("-")[1]);
                    int anyo = Integer.parseInt(fecha.split("-")[2]);
                    LocalDate fechaMatriculacion = LocalDate.of(anyo, mes, dia);
                    System.out.print("Marca: ");
                    String marca = sc.next();
                    System.out.print("Modelo: ");
                    String modelo = sc.next();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();

                    Coche c = new Coche(matricula, fechaMatriculacion, marca, modelo, precio);
                    av.add(c);
                    System.out.println("\n" + "¡Coche introducido!");
                    hayCambios = true;
                }
                    break;
                case 2:
                {
                    System.out.print("Matricula: ");
                    String matricula = sc.next();
                    av.buscaCoche(matricula);
                }
                    break;
                case 3:
                {
                    System.out.println(av.toString());
                }
                    break;
                default:
                    System.out.println("------ ERROR ------");
            }

            System.out.println("\n" + "¿Deseas continuar? (s/n)");
            seguir = sc.next();
            while (!seguir.equals("s") && !seguir.equals("n"))
            {
                System.out.print("Opción incorrecta. Vuelve a intentarlo: ");
                seguir = sc.next();
            }

            if (hayCambios)
            {
                av.guardar(fichero);
            }
        }
    }
}