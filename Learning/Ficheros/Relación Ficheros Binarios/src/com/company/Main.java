package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i;

        for (i = 1; i <= 11; i++)
        {
            if (i < 10)
            {
                System.out.print("Ejercicio " + i + ".");
                i++;
                System.out.println("                           Ejercicio " + i + ".");
            }
            else
            {
                System.out.print("Ejercicio " + i + ".");
                i++;
                if (i % 2 != 0)
                {
                    System.out.println("                          Ejercicio " + i + ".");
                }
            }
        }

        System.out.println();
        System.out.print("Elige un ejercicio: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion)
        {
            case 1: // escribeFichero1_100
            {
                System.out.println("Rellena fichero 'datos01.bin' con números del 1 al 100");
                escribeFichero1_100("Ficheros\\datos01.bin");
            }
                break;
            case 2: // leeFicheroInt100
            {
                System.out.println("Lee fichero 'datos01.bin' con números del 1 al 100");
                leeFicheroInt100("Ficheros\\datos01.bin");
            }
                break;
            case 3: // escribeFicheroIntAleatorio
            {
                System.out.println("Rellena fichero con números aleatorios del 1 al 100");
                System.out.println("Indica el nombre del fichero");
                String s = "Ficheros\\"+ sc.next() + ".bin";
                System.out.println("Indica cuántos números quieres que introduzca");
                int lim = sc.nextInt();

                escribeFicheroIntAleatorio(s, lim);
            }
                break;
            case 4: // escribeFicheroIntAleatorioPro
            {
                System.out.println("Rellena fichero con números aleatorios");
                System.out.println("Indica el nombre del fichero");
                String s = "Ficheros\\"+ sc.next() + ".bin";
                System.out.println("Indica cuántos números quieres que introduzca");
                int lim = sc.nextInt();
                System.out.println("Indica el mínimo número de la serie");
                int min = sc.nextInt();
                System.out.println("Indica el máximo número de la serie");
                int max = sc.nextInt();

                escribeFicheroIntAleatorioPro(s, lim, min, max);
            }
                break;
            case 5: // leeFicheroInt
            {
                System.out.println("Lee ficheros");
                System.out.println("Indica el nombre del fichero que desees leer");
                leeFicheroInt("Ficheros\\" + sc.next());
            }
                break;
            case 6: // sumaFicheroInt
            {
                System.out.println("Indica el nombre del fichero del que quieres sumar sus datos");
                String s = "Ficheros\\" + sc.next() + ".bin";
                System.out.print("Suma de los valores: ");
                System.out.println(sumaFicheroInt(s));
            }
                break;
            case 7: // leeFicheroIntLista
            {
                System.out.println("Indica el fichero que quieres leer y añadir sus valores en una lista");
                String s = "Ficheros\\" + sc.next() + ".bin";
                System.out.println("Lista de números");
                System.out.println(leeFicheroLista(s));
            }
                break;
            case 8: // escribeFicheroIntLista
            {
                System.out.println("Indica el fichero en el que quieres añadir valores de una lista");
                String s = "Ficheros\\" + sc.next() + ".bin";
                System.out.println("Indica los elementos de la lista (-1 para terminar):");
                List<Integer> l = new LinkedList<>();
                leeLista(l);
                escribeFicheroLista(s, l);
            }
                break;
            case 9: // ordenaFicheroInt
            {
                System.out.println("Indica el nombre del fichero que quieres ordenar");
                ordenaFicheroInt("Ficheros\\" + sc.next() + ".bin");
            }
                break;
            case 10: // separaFicheroInt
            {
                System.out.println("Indica el nombre del fichero que quieres separar");
                String s = sc.next() + ".bin";
                separaFicheroInt("Ficheros\\" + s);
                System.out.println("Ficheros " + s + "positivos y " + s + "negativos creados con éxito");
            }
                break;
            case 11: // invierteFicheroInt
            {
                System.out.println("Indica el nombre del fichero que quieres invertir");
                String s = sc.next() + ".bin";
                invierteFicheroInt("Ficheros\\" + s);
                System.out.println("Fichero " + s + "inverso creado con éxito");
            }
                break;
            default:
                System.out.println("---ERROR---");
        }
    }
    public static void leeLista (List<Integer> l)
    {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        while (n != -1)
        {
            l.add(n);
            n = sc.nextInt();
        }
    }

    public static void escribeFichero1_100 (String s) // Opción 1
    {
        int i;
        try
        {
            FileOutputStream fos = new FileOutputStream(s);
            DataOutputStream dos = new DataOutputStream(fos);

            for (i = 1; i <= 100; i++)
            {
                dos.writeInt(i);
            }

            dos.close();
            fos.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void leeFicheroInt100 (String s) // Opción 2
    {
        int i, n;
        try
        {
            FileInputStream fis = new FileInputStream(s);
            DataInputStream dis = new DataInputStream(fis);

            for (i = 1; i <= 100; i++)
            {
                n = dis.readInt();
                System.out.println(n);
            }

            dis.close();
            fis.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void escribeFicheroIntAleatorio (String s, int lim) // Opción 3
    {
        Random r = new Random();
        int i, n;
        try
        {
            FileOutputStream fos = new FileOutputStream(s);
            DataOutputStream dos = new DataOutputStream(fos);

            for (i = 1; i <= lim; i++)
            {
                n = r.nextInt(100)+1;
                dos.writeInt(n);
            }

            dos.close();
            fos.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void escribeFicheroIntAleatorioPro (String s, int lim, int min, int max) // Opción 4
    {
        Random r = new Random();
        int i, n;
        try
        {
            FileOutputStream fos = new FileOutputStream(s);
            DataOutputStream dos = new DataOutputStream(fos);
            int realMax = max - min;

            for (i = 1; i <= lim; i++)
            {
                n = r.nextInt(realMax+1) + min;
                dos.writeInt(n);
            }

            dos.close();
            fos.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void leeFicheroInt (String s) // Opción 5
    {
        try
        {
            FileInputStream fis = new FileInputStream(s);
            DataInputStream dis = new DataInputStream(fis);

            while (dis.available() > 0)
            {
                System.out.println(dis.readInt());
            }

            dis.close();
            fis.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static int sumaFicheroInt (String s) // Opción 6
    {
        int suma = 0;
        try
        {
            FileInputStream fis = new FileInputStream(s);
            DataInputStream dis = new DataInputStream(fis);

            while (dis.available() > 0)
            {
                suma = suma + dis.readInt();
            }

            dis.close();
            fis.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return suma;
    }
    public static List<Integer> leeFicheroLista (String s) // Opción 7
    {
        List<Integer> valores = new LinkedList<>();
        try
        {
            FileInputStream fis = new FileInputStream(s);
            DataInputStream dis = new DataInputStream(fis);

            while (dis.available() > 0)
            {
                valores.add(dis.readInt());
            }

            dis.close();
            fis.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return valores;
    }
    public static void escribeFicheroLista (String s, List<Integer> l) // Opción 8
    {
        int i;
        try
        {
            FileOutputStream fos = new FileOutputStream(s);
            DataOutputStream dos = new DataOutputStream(fos);

            for (i = 0; i < l.size(); i++)
            {
                dos.writeInt(l.get(i));
            }

            dos.close();
            fos.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void ordenaFicheroInt (String s) // Opción 9
    {
        List<Integer> l = new LinkedList<>();
        int i;
        try
        {
            FileInputStream fis = new FileInputStream(s);
            DataInputStream dis = new DataInputStream(fis);

            while (dis.available() > 0)
            {
                l.add(dis.readInt());
            }

            dis.close();
            fis.close();

            Collections.sort(l);

            FileOutputStream fos = new FileOutputStream(s);
            DataOutputStream dos = new DataOutputStream(fos);

            for (i = 0; i < l.size(); i++)
            {
                dos.writeInt(l.get(i));
            }

            dos.close();
            fos.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void separaFicheroInt (String s) // Opción 10
    {
        List<Integer> l = new LinkedList<>();
        int i;
        try
        {
            FileInputStream fis = new FileInputStream(s);
            DataInputStream dis = new DataInputStream(fis);
            FileOutputStream fosp = new FileOutputStream(s + "positivos");
            DataOutputStream dosp = new DataOutputStream(fosp);

            while (dis.available() > 0)
            {
                l.add(dis.readInt());
            }

            for (i = 0; i < l.size(); i++)
            {
                if (l.get(i) >= 0)
                {
                    dosp.writeInt(l.get(i));
                    l.remove(i);
                    i--;
                }
            }

            dosp.close();
            fosp.close();
            dis.close();
            fis.close();

            escribeFicheroLista(s + "negativos", l);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void invierteFicheroInt (String s) // Opción 11
    {
        List<Integer> l = new LinkedList<>();
        int i;
        try
        {
            FileInputStream fis = new FileInputStream(s);
            DataInputStream dis = new DataInputStream(fis);

            while (dis.available() > 0)
            {
                l.add(dis.readInt());
            }

            dis.close();
            fis.close();

            FileOutputStream fos = new FileOutputStream(s + "inverso");
            DataOutputStream dos = new DataOutputStream(fos);

            for (i = l.size()-1; i >= 0; i--)
            {
                dos.writeInt(l.get(i));
            }

            dos.close();
            fos.close();


        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
