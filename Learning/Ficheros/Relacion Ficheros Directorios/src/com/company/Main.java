package com.company;

import javax.management.MBeanRegistration;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, opcion;

        System.out.println();
        for (i = 1; i <= 7; i++)
        {
            if (i % 2 != 0)
            {
                System.out.print("Ejercicio " + i + ".");
            }
            else
            {
                System.out.println("                           Ejercicio " + i + ".");
            }
        }

        System.out.println();
        System.out.print("Elige un ejercicio: ");
        opcion = sc.nextInt();
        sc.nextLine();
        System.out.println();

        switch (opcion)
        {
            case 1:
            {
                System.out.println("Indica la extensión de la cual quieres conocer cuántos ficheros existen:");
                String s = sc.next();

                if (cuantosFicheros(s) > 0)
                {
                    if (cuantosFicheros(s) == 1)
                    {
                        System.out.println("Hay 1 fichero con la extensión " + s);
                    }
                    else
                    {
                        System.out.println("Hay " + cuantosFicheros(s) + " ficheros con la extensión " + s);
                    }
                }
                else
                {
                    System.out.println("No aparecen ficheros con la extensión " + s);
                }
            }
                break;
            case 2:
            {
                System.out.println("Indica la extensión de la cual quieres conocer cuántos ficheros existen:");
                String s = sc.next();
                System.out.println("Indica la ruta del directorio:");
                String ruta = sc.next();

                if (cuantosFicherosPro(ruta, s) > 0)
                {
                    if (cuantosFicherosPro(ruta, s) == 1)
                    {
                        System.out.println("Hay 1 fichero con la extensión " + s);
                    }
                    else
                    {
                        System.out.println("Hay " + cuantosFicherosPro(ruta, s) + " ficheros con la extensión " + s);
                    }
                }
                else
                {
                    System.out.println("No aparecen ficheros con la extensión " + s);
                }
            }
                break;
            case 3:
            {
                System.out.print("Fichero: ");
                String s = sc.next();

                creaBackup(s);
                System.out.println("Copia creada");
            }
                break;
            case 4:
            {
                System.out.print("Extensión de fichero a sustituir: ");
                String s = sc.next();
                System.out.print("Nueva extensión de fichero: ");
                String s2 = sc.next();

                renombraMasivo(s, s2);
                System.out.println("Renombrado terminado");
            }
                break;
            case 5:
            {
                String s = ".txt";

                if (cuentaLineasFichero(s) > 0)
                {
                    if (cuentaLineasFichero(s) == 1)
                    {
                        System.out.println("Entre todos los ficheros " + s + " suman 1 línea");
                    }
                    else
                    {
                        System.out.println("Entre todos los ficheros " + s + " suman " + cuentaLineasFichero(s) + " líneas");
                    }
                }
                else
                {
                    System.out.println("No aparecen ficheros con la extensión " + s + " o no contienen información");
                }
            }
                break;
            case 6:
            {
                System.out.print("El fichero con el nombre más largo del directorio es: " + ficheroMasGrande());
            }
                break;
            case 7:
            {
                clasificaFicheros();
            }
                break;
            default:
                System.out.println("---ERROR---");
        }
    }
    public static int cuantosFicheros (String s) // Opción 1
    {
        File dir = new File(".");
        File[] ficheros = dir.listFiles();
        int i, cont = 0;

        for (i = 0; i < ficheros.length; i++)
        {
            if (ficheros[i].isFile() && ficheros[i].getName().endsWith(s))
            {
                cont++;
            }
        }

        return cont;
    }
    public static int cuantosFicherosPro (String ruta, String s) // Opción 2
    {
        File dir = new File(ruta);
        File[] ficheros = dir.listFiles();
        int i, cont = 0;

        for (i = 0; i < ficheros.length; i++)
        {
            if (ficheros[i].isFile() && ficheros[i].getName().endsWith(s))
            {
                cont++;
            }
        }

        return cont;
    }
    public static void creaBackup (String s) // Opción 3
    {
        String sCopia = s;
        while (Files.exists(Path.of(sCopia)))
        {
            sCopia = sCopia + ".bak";
        }
        try
        {
            Files.copy(Path.of(s), Path.of(sCopia));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void renombraMasivo (String s, String s2) // Opción 4
    {
        File dir = new File(".");
        File[] ficheros = dir.listFiles();

        int i;
        String nombre;
        for (i = 0; i < ficheros.length; i++)
        {
            if (ficheros[i].getName().endsWith(s))
            {
                String[] separador = ficheros[i].getName().split(s);
                nombre = separador[0] + s2;
                File f = new File(nombre);
                ficheros[i].renameTo(f);
            }
        }
    }
    public static int cuentaLineasFichero(String s) // Opción 5
    {
        File dir = new File(".");
        File[] fich = dir.listFiles();

        int i, cont = 0;
        for (i = 0; i < fich.length; i++)
        {
            if (fich[i].isFile() && fich[i].getName().endsWith(s))
            {
                try
                {
                    FileReader fr = new FileReader(fich[i].getName());
                    BufferedReader br = new BufferedReader(fr);

                    String linea = br.readLine();
                    while (linea != null)
                    {
                        cont++;
                        linea = br.readLine();
                    }

                    br.close();
                    fr.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
        return cont;
    }
    public static String ficheroMasGrande () // Opción 6
    {
        File dir = new File(".");
        File[] fich = dir.listFiles();

        int i, tam, tamMax = 0;
        String palMax = "";
        for (i = 0; i < fich.length; i++)
        {
            tam = fich[i].getName().length();
            if (tam > tamMax)
            {
                tamMax = tam;
                palMax = fich[i].getName();
            }
        }
        return palMax;
    }
    public static void clasificaFicheros () // Opción 7
    {
        List<String> extList = new ArrayList<>();
        List<Integer> index = new ArrayList<>();

        File dir = new File(".");
        File[] fichArray = dir.listFiles();

        int i;
        for (i = 0; i < fichArray.length; i++) // Introduce extensiones
        {
            String extension = "";
            String nombreFich = fichArray[i].getName();

            if(fichArray[i].isFile())
            {
                String[] separaPal = nombreFich.split("\\.");
                if (separaPal.length > 0)
                {
                    extension = separaPal[separaPal.length - 1];
                }
                else
                {
                    extension = "Directory";
                }

                if (extList.contains(extension))
                {
                    int indiceExt = extList.indexOf(extension);
                    int num = index.get(indiceExt);
                    index.set(indiceExt, num + 1);
                }
                else
                {
                    extList.add(extension);
                    index.add(1);
                }
            }
        }

        for (i = 0; i < index.size(); i++)
        {
            System.out.println(extList.get(i) + ": " + index.get(i));
        }
    }
}
