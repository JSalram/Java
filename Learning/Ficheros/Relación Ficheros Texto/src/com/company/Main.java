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
            case 1:
            {
                System.out.println("Dime el nombre del fichero y te lo relleno de números aleatorios");
                String s = sc.nextLine();

                escribeFicheroNumRandom10("Ficheros\\" + s + ".txt");
            }
                break;
            case 2:
            {
                System.out.println("Dime el nombre del fichero y te sumo los numeros");
                String s = sc.nextLine();

                System.out.println(sumaFicheroInt10("Ficheros\\" + s + ".txt"));
            }
                break;
            case 3:
            {
                System.out.println("Dime el nombre del fichero y te lo relleno de números aleatorios");
                String s = sc.nextLine();
                System.out.println("Dime el tamaño que quieres que tenga el fichero");
                int tam = sc.nextInt();

                escribeFicheroNumRandom("Ficheros\\" + s + ".txt", tam);
            }
                break;
            case 4:
            {
                System.out.println("Dime el nombre del fichero y te sumo los numeros");
                String s = sc.nextLine();

                System.out.println(sumaFicheroInt("Ficheros\\" + s + ".txt"));
            }
                break;
            case 5:
            {
                System.out.println("Dime el nombre del fichero y con lo que quieres rellenarlo");
                String s = sc.nextLine();

                escribeFicheroTexto("Ficheros\\" + s + ".txt");
            }
                break;
            case 6:
            {
                System.out.println("Dime el nombre del fichero que quieras leer y lo escribo");
                String s = sc.nextLine();

                leeFicheroTexto("Ficheros\\" + s + ".txt");
            }
                break;
            case 7:
            {
                System.out.println("Dime el nombre del fichero que quieras copiar");
                String s = sc.nextLine();
                System.out.println("Dime el nombre del fichero copiado");
                String s2 = sc.nextLine();

                copiaFicheroTexto("Ficheros\\" + s + ".txt","Ficheros\\" + s2 + ".txt");
            }
                break;
            case 8:
            {
                System.out.println("Dime el nombre del fichero que quieras copiar al revés");
                String s = sc.nextLine();
                System.out.println("Dime el nombre del fichero copiado al revés");
                String s2 = sc.nextLine();

                invierteLineasFichero("Ficheros\\" + s + ".txt","Ficheros\\" + s2 + ".txt");
            }
                break;
            case 9:
            {
                System.out.println("Dime el nombre del fichero que quieras invertir");
                String s = sc.nextLine();

                invierteFicheroTexto("Ficheros\\" + s + ".txt");
            }
                break;
            case 10:
            {
                System.out.println("Dime el nombre del fichero del que quieres coger las palabras");
                String s = sc.nextLine();
                System.out.println("Dime el nombre del fichero al que copiar las palabras");
                String s2 = sc.nextLine();

                separaPalabrasFichero("Ficheros\\" + s + ".txt","Ficheros\\" + s2 + ".txt");
            }
                break;
            case 11:
            {
                separaPalabrasFichero("Ficheros\\el_quijote.txt", "Ficheros\\quijotepalabras.txt");
                System.out.println(palabraQuijote("Ficheros\\quijotepalabras.txt"));
            }
                break;
            default:
                System.out.println("---ERROR---");
        }
    }

    public static String invierteCadena (String s)
    {
        String s2 = "";
        int i;
        for (i = s.length()-1; i >= 0; i--)
        {
            s2 = s2 + s.charAt(i);
        }
        return s2;
    }
    public static String quitaEspaciosSobrantes (String s)
    {
        s = s.trim();
        String s2 = "";
        int i;
        for (i = 0; i < s.length(); i++)
        {
            if (i > 0)
            {
                if (s.charAt(i-1) == ' ')
                {
                    s2 = s2 + ' ';
                    while (s.charAt(i) == ' ' && i < s.length() - 1)
                    {
                        i++;
                    }
                }
            }
            while (s.charAt(i) != ' ' && i < s.length()-1)
            {
                s2 = s2 + s.charAt(i);
                i++;
            }
            if (i == s.length()-1 && s.charAt(i) != ' ')
            {
                s2 = s2 + s.charAt(i);
            }
        }
        return s2;
    }

    public static void escribeFicheroNumRandom10 (String s) // Opción 1
    {
        Random r = new Random();

        try
        {
            int i;
            FileWriter fw = new FileWriter(s);
            BufferedWriter bw = new BufferedWriter(fw);

            for (i = 0; i < 10; i++)
            {
                bw.write(Integer.toString(r.nextInt(10)+1) + System.lineSeparator());
            }

            bw.close();
            fw.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static int sumaFicheroInt10(String s) // Opción 2
    {
        int suma = 0, i;
        String linea;
        try
        {
            FileReader fr = new FileReader(s);
            BufferedReader br = new BufferedReader(fr);
            linea = br.readLine();

            while (linea != null)
            {
                suma = suma + Integer.parseInt(linea);
                linea = br.readLine();
            }

            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return suma;
    }
    public static void escribeFicheroNumRandom (String s, int tam) // Opción 3
    {
        Random r = new Random();

        try
        {
            int i;
            FileWriter fw = new FileWriter(s);
            BufferedWriter bw = new BufferedWriter(fw);

            for (i = 0; i < tam; i++)
            {
                bw.write(Integer.toString(r.nextInt(10)+1) + System.lineSeparator());
            }

            bw.close();
            fw.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static int sumaFicheroInt(String s) // Opción 4
    {
        int suma = 0, i;
        String linea;
        try
        {
            FileReader fr = new FileReader(s);
            BufferedReader br = new BufferedReader(fr);
            linea = br.readLine();

            while (linea != null)
            {
                suma = suma + Integer.parseInt(linea);
                linea = br.readLine();
            }

            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return suma;
    }
    public static void escribeFicheroTexto (String s) // Opción 5
    {
        Scanner sc = new Scanner(System.in);
        String linea;

        try
        {
            FileWriter fw = new FileWriter(s);
            BufferedWriter bw = new BufferedWriter(fw);

            linea = sc.nextLine();
            while (!linea.equals(""))
            {
                bw.write(linea + System.lineSeparator());
                linea = sc.nextLine();
            }

            bw.close();
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void leeFicheroTexto (String s) // Opción 6
    {
        String linea;
        try
        {
            FileReader fr = new FileReader(s);
            BufferedReader br = new BufferedReader(fr);
            linea = br.readLine();

            while (linea != null)
            {
                System.out.println(linea);
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
    public static void copiaFicheroTexto (String s, String s2) // Opción 7
    {
        String linea;
        try
        {
            FileReader fr = new FileReader(s);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(s2);
            BufferedWriter bw = new BufferedWriter(fw);

            linea = br.readLine();
            while (linea != null)
            {
                bw.write(linea + System.lineSeparator());
                linea = br.readLine();
            }

            bw.close();
            fw.close();
            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void invierteLineasFichero (String s, String s2) // Opción 8
    {
        String linea;
        try
        {
            FileReader fr = new FileReader(s);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(s2);
            BufferedWriter bw = new BufferedWriter(fw);

            linea = br.readLine();
            while (linea != null)
            {
                bw.write(invierteCadena(linea) + System.lineSeparator());
                linea = br.readLine();
            }

            bw.close();
            fw.close();
            br.close();
            fr.close();
        }
        catch (IOException e)
        {

        }
    }
    public static void invierteFicheroTexto (String s) // Opción 9
    {
        List<String> l = new LinkedList<>();
        String linea;
        int i;
        try
        {
            FileReader fr = new FileReader(s);
            BufferedReader br = new BufferedReader(fr);

            linea = br.readLine();
            while (linea != null)
            {
                l.add(linea);
                linea = br.readLine();
            }

            br.close();
            fr.close();


            FileWriter fw = new FileWriter(s);
            BufferedWriter bw = new BufferedWriter(fw);

            for (i = l.size()-1; i >= 0; i--)
            {
                bw.write(l.get(i) + System.lineSeparator());
            }

            bw.close();
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void separaPalabrasFichero (String s, String s2) // Opción 10
    {
        String texto = "", linea;
        int i;
        try
        {
            FileReader fr = new FileReader(s);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(s2);
            BufferedWriter bw = new BufferedWriter(fw);

            linea = br.readLine();
            while (linea != null)
            {
                texto = texto + linea + " ";
                linea = br.readLine();
            }

            System.out.println("Leído");

            //texto = quitaEspaciosSobrantes(texto);
            String[] palabras = texto.split(" ");

            System.out.println("Separado");
            for (i = 0; i < palabras.length; i++)
            {
                if(!palabras[i].isEmpty()) {
                    bw.write(palabras[i] + System.lineSeparator());
                }
            }

            bw.close();
            fw.close();
            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static String palabraQuijote (String s) //TODO: OPTIMIZAR
    {
        List<String> palabras = new LinkedList<>();
        List<Integer> numPalabras = new LinkedList<>();
        String linea, palabra = "";
        int index;
        try
        {
            FileReader fr = new FileReader(s);
            BufferedReader br = new BufferedReader(fr);

            linea = br.readLine();
            while (linea != null)
            {
                linea = linea.toLowerCase();
                if (!palabras.contains(linea))
                {
                    palabras.add(linea);
                    numPalabras.add(1);
                }
                else
                {
                    index = palabras.indexOf(linea);
                    numPalabras.set(index, numPalabras.get(index)+1);
                }
                linea = br.readLine();
            }

            index = Collections.max(numPalabras);
            palabra = palabras.get(index);

            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return palabra;
    }
}
