package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        List<FichaAlumno> listaAlumno = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int i, opcion = -1;

        while (opcion != 0)
        {
            System.out.println();
            for (i = 1; i <= 8; i++)
            {
                System.out.print("Ejercicio " + i + ".");
                i++;
                System.out.println("                           Ejercicio " + i + ".");
            }

            System.out.println();
            System.out.print("Elige un ejercicio: ");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (opcion)
            {
                case 1: // leeAlumnoLista
                {
                    leeAlumnoLista(listaAlumno);
                }
                    break;
                case 2: // imprimeListaAlumnos
                {
                    imprimeListaAlumnos(listaAlumno);
                }
                    break;
                case 3: // escribeFicheroAlumnosBinario
                {
                    System.out.println("Indica el nombre del fichero donde quieres guardar los datos");
                    String s = "Ficheros\\" + sc.next() + ".bin";
                    escribeFicheroAlumnosBinario(listaAlumno, s);
                    System.out.println("Fichero creado con éxito");
                }
                    break;
                case 4: // leeFicheroAlumnosBinario
                {
                    System.out.println("Indica el nombre del fichero del que extraer los datos");
                    String s = "Ficheros\\" + sc.next() + ".bin";
                    leeFicheroAlumnosBinario(listaAlumno, s);
                    System.out.println("Lista creada con éxito");
                }
                    break;
                case 5: // escribeFicheroAlumnosTexto
                {
                    System.out.println("Indica el nombre del fichero donde quieres guardar los datos");
                    String s = "Ficheros\\" + sc.next() + ".txt";
                    escribeFicheroAlumnosTexto(listaAlumno, s);
                    System.out.println("Fichero creado con éxito");
                }
                    break;
                case 6: // leeFicheroAlumnosTexto
                {
                    System.out.println("Indica el nombre del fichero del que extraer los datos");
                    String s = "Ficheros\\" + sc.next() + ".txt";
                    leeFicheroAlumnosTexto(listaAlumno, s);
                    System.out.println("Lista creada con éxito");
                }
                    break;
                case 7: // escribeFicheroAlumnosCSV
                {
                    System.out.println("Indica el nombre del fichero donde quieres guardar los datos");
                    String s = "Ficheros\\" + sc.next() + ".csv";
                    escribeFicheroAlumnosCSV(listaAlumno, s);
                    System.out.println("Fichero creado con éxito");
                }
                    break;
                case 8: // leeFicheroAlumnosCSV
                {
                    System.out.println("Indica el nombre del fichero donde quieres extraer los datos");
                    String s = "Ficheros\\" + sc.next() + ".csv";
                    leeFicheroAlumnosCSV(listaAlumno, s);
                    System.out.println("Fichero creado con éxito");
                }
                    break;
                default:
                    System.out.println("---ERROR---");
            }
            System.out.println();
            System.out.println("¿Quieres continuar el programa? (1 = Sí, 0 = No)");
            opcion = sc.nextInt();
        }
    }
    public static int cuentaCaracteres (List<FichaAlumno> listaAlumno)
    {
        int i, size, sizeMax = 0;
        for (i = 0; i < listaAlumno.size(); i++)
        {
            FichaAlumno fa = listaAlumno.get(i);
            size = fa.nombre.length();
            if (size > sizeMax)
            {
                sizeMax = size;
            }
        }
        return sizeMax;
    }
    public static void escribeEspacios (int size)
    {
        int i;
        for (i = 0; i < size; i++)
        {
            System.out.print(" ");
        }
    }

    public static void leeAlumnoLista (List<FichaAlumno> listaAlumno) // Opción 1
    {
        FichaAlumno fa = new FichaAlumno();
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica los datos del alumno");
        System.out.print("Nombre: ");
        fa.nombre = sc.nextLine();

        System.out.print("Edad: ");
        fa.edad = sc.nextInt();
        while (fa.edad < 0 || fa.edad > 150)
        {
            System.out.print("Edad incorrecta, vuelve a introducirla: ");
            fa.edad = sc.nextInt();
        }

        System.out.print("Calificación: ");
        fa.calificacion = sc.nextDouble();
        while (fa.calificacion < 0.0 || fa.calificacion > 10.0)
        {
            System.out.print("Calificación incorrecta, vuelve a introducirla: ");
            fa.calificacion = sc.nextDouble();
        }

        listaAlumno.add(fa);
    }
    public static void imprimeListaAlumnos (List<FichaAlumno> listaAlumno) // Opción 2
    {
        int i, size = cuentaCaracteres(listaAlumno);

        System.out.print("Nombre");
        escribeEspacios((size - 6) + 2);
        System.out.print("│Edad");
        escribeEspacios(1);
        System.out.println("│Calificación");

        for (i = 0; i < size + 22; i++)
        {
            if (i == size +2 || i == size + 8)
            {
                System.out.print("│");
            }
            else
            {
                System.out.print("―");
            }
        }
        System.out.println();

        for (i = 0; i < listaAlumno.size(); i++)
        {
            FichaAlumno fa = listaAlumno.get(i);
            System.out.print(fa.nombre);
            escribeEspacios((size - fa.nombre.length()) + 2);
            System.out.print("│" + fa.edad);
            escribeEspacios(5 - Integer.toString(fa.edad).length());
            System.out.print("│" + fa.calificacion);
            System.out.println();
        }
    }
    public static void escribeFicheroAlumnosBinario(List<FichaAlumno> listaAlumno, String s) // Opción 3
    {
        int i;
        try
        {
            FileOutputStream fos = new FileOutputStream(s);
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeInt(listaAlumno.size());
            for (i = 0; i < listaAlumno.size(); i++)
            {
                FichaAlumno fa = listaAlumno.get(i);
                dos.writeUTF(fa.nombre);
                dos.writeInt(fa.edad);
                dos.writeDouble(fa.calificacion);
            }

            dos.close();
            fos.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void leeFicheroAlumnosBinario(List<FichaAlumno> listaAlumno, String s) // Opción 4
    {
        while (listaAlumno.size() > 0)
        {
            listaAlumno.remove(0);
        }

        try
        {
            FileInputStream fis = new FileInputStream(s);
            DataInputStream dis = new DataInputStream(fis);

            int numAlumnos = dis.readInt();

            while (dis.available() > 0)
            {
                FichaAlumno fa = new FichaAlumno();
                fa.nombre = dis.readUTF();
                fa.edad = dis.readInt();
                fa.calificacion = dis.readDouble();
                listaAlumno.add(fa);
            }

            dis.close();
            fis.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void escribeFicheroAlumnosTexto (List<FichaAlumno> listaAlumno, String s) // Opción 5
    {
        int i;
        try
        {
            FileWriter fw = new FileWriter(s);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(Integer.toString(listaAlumno.size()));
            bw.newLine();
            
            for (i = 0; i < listaAlumno.size(); i++)
            {
                FichaAlumno fa = listaAlumno.get(i);
                bw.write(fa.nombre);
                bw.newLine();
                bw.write(Integer.toString(fa.edad));
                bw.newLine();
                bw.write(Double.toString(fa.calificacion));
                bw.newLine();
            }

            bw.close();
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void leeFicheroAlumnosTexto (List<FichaAlumno> listaAlumno, String s) // Opción 6
    {
        while (listaAlumno.size() > 0)
        {
            listaAlumno.remove(0);
        }

        try
        {
            FileReader fr = new FileReader(s);
            BufferedReader br = new BufferedReader(fr);

            br.readLine();
            String alumno = br.readLine();

            while (alumno != null)
            {
                FichaAlumno fa = new FichaAlumno();
                fa.nombre = alumno;
                fa.edad = Integer.parseInt(br.readLine());
                fa.calificacion = Double.parseDouble(br.readLine());
                listaAlumno.add(fa);
                alumno = br.readLine();
            }

            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void escribeFicheroAlumnosCSV (List<FichaAlumno> listaAlumno, String s) // Opción 7
    {
        int i;
        try
        {
            FileWriter fw = new FileWriter(s);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(String.valueOf(listaAlumno.size()));

            for (i = 0; i < listaAlumno.size(); i++)
            {
                FichaAlumno fa = listaAlumno.get(i);
                bw.write(";" + fa.nombre);
                bw.write(";" + Integer.toString(fa.edad));
                bw.write(";" + Double.toString(fa.calificacion));
            }

            bw.close();
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void leeFicheroAlumnosCSV (List<FichaAlumno> listaAlumno, String s) // Opción 8
    {
        while (listaAlumno.size() > 0)
        {
            listaAlumno.remove(0);
        }

        String alumnos;
        int i;
        try
        {
            FileReader fr = new FileReader(s);
            BufferedReader br = new BufferedReader(fr);

            alumnos = br.readLine();
            String [] arrayAlumno = alumnos.split(";");

            for (i = 1; i < arrayAlumno.length; i++)
            {
                FichaAlumno fa = new FichaAlumno();
                fa.nombre = arrayAlumno[i];
                i++;
                fa.edad = Integer.parseInt(arrayAlumno[i]);
                i++;
                fa.calificacion = Double.parseDouble(arrayAlumno[i]);
                listaAlumno.add(fa);
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
