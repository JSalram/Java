package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        BuscaTexto bt = new BuscaTexto();

        System.out.println("¡Bienvenido al buscador de texto!");
        System.out.println("Indica el nombre del fichero donde quieres buscar:");
        String fichero = sc.next();
        bt.cargaFichero(fichero);
        System.out.println("Fichero cargado con éxito." + "\n");

        boolean seguir = true;
        while (seguir)
        {
            System.out.println("Elige entre las siguientes opciones:");
            System.out.println("1. Buscar cadena                    2. Extraer cadena");
            System.out.println("3. Reiniciar búsqueda");
            System.out.print("Opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (opcion)
            {
                case 1:
                {
                    System.out.println("Indica la cadena que deseas encontrar:");
                    String s = sc.nextLine();
                    if (bt.buscaSiguiente(s))
                    {
                        System.out.println("Cadena encontrada.");
                    }
                    else
                    {
                        System.out.println("Cadena no encontrada. Prueba con otra.");
                    }
                }
                    break;
                case 2:
                {
                    System.out.println("Indica cómo deseas extraer la cadena:");
                    System.out.println("1. Sin delimitador          2. Con delimitadores");
                    System.out.print("Opción: ");
                    opcion = sc.nextInt();
                    sc.nextLine();

                    switch (opcion)
                    {
                        case 1:
                        {
                            System.out.print("Delimitador inicial: ");
                            String d1 = sc.next();
                            System.out.print("Delimitador final: ");
                            String d2 = sc.next();
                            System.out.println(bt.extraeCadena(d1, d2));
                        }
                            break;
                        case 2:
                        {
                            System.out.print("Delimitador inicial: ");
                            String d1 = sc.next();
                            System.out.print("Delimitador final: ");
                            String d2 = sc.next();
                            System.out.println(bt.extraeCadenaConDelim(d1, d2));
                        }
                            break;
                        default:
                            System.out.println("------ ERROR ------");
                    }
                }
                    break;
                case 3:
                {
                    bt.reinicia();
                    bt.setPuntero(0);
                    System.out.println("Búsqueda reiniciada con éxito.");
                }
                    break;
                default:
                    System.out.println("------ ERROR ------");
            }

            System.out.println("\n" + "¿Quieres seguir buscando? (s/n)");
            String sn = sc.next();
            while (!sn.equals("s") && !sn.equals("n"))
            {
                System.out.print("Opción incorrecta. Vuelve a intentarlo: ");
                sn = sc.next();
            }
            if (sn.equals("n"))
            {
                seguir = false;
            }
        }
    }
}
