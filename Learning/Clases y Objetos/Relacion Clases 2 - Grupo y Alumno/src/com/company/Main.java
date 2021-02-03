package com.company;

import java.io.File;
import java.security.InvalidParameterException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Grupo g = new Grupo();

        String continuar = "s";

        while (continuar.equals("s"))
        {
            System.out.println("\n" + "Elige una de las siguientes opciones:");
            System.out.print("1. Insertar Alumno");
            System.out.println("           2. Mostrar Alumnos");
            System.out.print("3. Escribir Fichero");
            System.out.println("          4. Leer Fichero");
            System.out.print("\n" + "Opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (opcion)
            {
                case 1:
                {
                    System.out.print("Indica su nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Indica su edad (mín 17): ");
                    int edad = sc.nextInt();
                    System.out.print("Indica su calificación: ");
                    double calificacion = sc.nextDouble();

                    Alumno a = new Alumno(nombre, edad, calificacion);
                    g.insertaAlumnoLista(a);

                    System.out.println("¡Datos introducidos!");
                }
                    break;
                case 2:
                {
                    System.out.println(g.toString());
                }
                    break;
                case 3:
                {
                    System.out.println("Indica el nombre que deseas que tenga el fichero:");
                    String fichero = "Ficheros" + File.separator + sc.next();

                    if (fichero.endsWith(".bin"))
                    {
                        g.escribeFicheroBinario(fichero);
                    }
                    else if (fichero.endsWith(".txt"))
                    {
                        g.escribeFicheroTexto(fichero);
                    }
                    else if (fichero.endsWith(".csv"))
                    {
                        g.escribeFicheroCSV(fichero);
                    }
                    else
                    {
                        throw new InvalidParameterException("Nombre de fichero inválido");
                    }
                    System.out.println("Datos escritos con éxito");
                }
                    break;
                case 4:
                {
                    System.out.println("Ficheros existentes:");
                    g.leeDirectorio();
                    System.out.println("\n" + "Indica el nombre del fichero que quieres leer:");
                    String fichero = "Ficheros" + File.separator + sc.next();

                    if (fichero.endsWith(".bin"))
                    {
                        g.leeFicheroBinario(fichero);
                    }
                    else if (fichero.endsWith(".txt"))
                    {
                        g.leeFicheroTexto(fichero);
                    }
                    else if (fichero.endsWith(".csv"))
                    {
                        g.leeFicheroCSV(fichero);
                    }
                    else
                    {
                        throw new InvalidParameterException("Nombre de fichero inválido");
                    }
                    System.out.println("Datos recogidos con éxito");
                }
                break;
                default:
                    System.out.println("\u001B[31m" + "----------ERROR----------");
            }
            System.out.println("\n" + "¿Quieres continuar? (s/n)");
            continuar = sc.next();
            while (!continuar.equals("s") && !continuar.equals("n"))
            {
                System.out.println("Opción errónea, vuelve a introducir una opción (s/n):");
                continuar = sc.next();
            }
        }
    }
}
