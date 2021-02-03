package com.company;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Grupo
{
    private List<Alumno> listaAlumnos;

    public Grupo() {listaAlumnos = new LinkedList<>();}

    public void insertaAlumnoLista(Alumno a)
    {
        listaAlumnos.add(a);
    }
    public void insertaAlumnoLista(String nombre, int edad, double calificacion)
    {
        Alumno a = new Alumno(nombre, edad, calificacion);
        this.insertaAlumnoLista(a);
    }
    public void escribeFicheroBinario(String fichero)
    {
        int i;
        try
        {
            FileOutputStream fos = new FileOutputStream(fichero);
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeInt(listaAlumnos.size());
            for (i = 0; i < listaAlumnos.size(); i++)
            {
                Alumno a = listaAlumnos.get(i);
                dos.writeUTF(a.getNombre());
                dos.writeInt(a.getEdad());
                dos.writeDouble(a.getCalificacion());
            }

            dos.close();
            fos.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public void leeFicheroBinario(String fichero)
    {
        while (listaAlumnos.size() > 0)
        {
            listaAlumnos.remove(0);
        }

        try
        {
            FileInputStream fis = new FileInputStream(fichero);
            DataInputStream dis = new DataInputStream(fis);

            dis.readInt();

            while (dis.available() > 0)
            {
                insertaAlumnoLista(dis.readUTF(), dis.readInt(), dis.readDouble());
            }

            dis.close();
            fis.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public void escribeFicheroTexto (String fichero)
    {
        int i;
        try
        {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(Integer.toString(listaAlumnos.size()));
            bw.newLine();

            for (i = 0; i < listaAlumnos.size(); i++)
            {
                Alumno a = listaAlumnos.get(i);
                bw.write(a.getNombre());
                bw.newLine();
                bw.write(Integer.toString(a.getEdad()));
                bw.newLine();
                bw.write(Double.toString(a.getCalificacion()));
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
    public void leeFicheroTexto (String fichero)
    {
        while (listaAlumnos.size() > 0)
        {
            listaAlumnos.remove(0);
        }

        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            br.readLine();
            String alumno = br.readLine();

            while (alumno != null)
            {
                insertaAlumnoLista(alumno, Integer.parseInt(br.readLine()), Double.parseDouble(br.readLine()));
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
    public void escribeFicheroCSV (String fichero)
    {
        int i;
        try
        {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(String.valueOf(listaAlumnos.size()));

            for (i = 0; i < listaAlumnos.size(); i++)
            {
                Alumno a = listaAlumnos.get(i);
                bw.write(";" + a.getNombre());
                bw.write(";" + (a.getEdad()));
                bw.write(";" + (a.getCalificacion()));
            }

            bw.close();
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public void leeFicheroCSV (String fichero)
    {
        while (listaAlumnos.size() > 0)
        {
            listaAlumnos.remove(0);
        }

        String alumnos;
        int i;
        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            alumnos = br.readLine();
            String [] arrayAlumno = alumnos.split(";");

            for (i = 1; i < arrayAlumno.length; i++)
            {
                String nombre = arrayAlumno[i];
                i++;
                int edad = Integer.parseInt(arrayAlumno[i]);
                i++;
                double calificacion = Double.parseDouble(arrayAlumno[i]);
                insertaAlumnoLista(nombre, edad, calificacion);
            }

            br.close();
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public void leeDirectorio()
    {
        File dir = new File("Ficheros" + File.separator);
        File[] fich =dir.listFiles();
        int i;
        for (i = 0; i < fich.length; i++)
        {
            System.out.println("\u001B[34m" + String.valueOf(fich[i]).substring(9) + "\u001B[0m");
        }
    }

    private int cuentaCaracteres ()
    {
        int i, size, sizeMax = 0;
        for (i = 0; i < this.listaAlumnos.size(); i++)
        {
            Alumno a = this.listaAlumnos.get(i);
            size = a.getNombre().length();
            if (size > sizeMax)
            {
                sizeMax = size;
            }
        }
        return sizeMax;
    }
    private String escribeEspacios (int size)
    {
        int i;
        StringBuilder s = new StringBuilder();
        for (i = 0; i < size; i++)
        {
            s.append(" ");
        }
        return s.toString();
    }
    public String imprimeListaAlumnos ()
    {
        int i, size = cuentaCaracteres();
        String s = "";

        s += "Nombre";
        s += escribeEspacios((size - 6) + 2);
        s += "│Edad";
        s += escribeEspacios(1);
        s += "│Calificación\n";

        for (i = 0; i < size + 22; i++)
        {
            if (i == size +2 || i == size + 8)
            {
                s += "│";
            }
            else
            {
                s += "―";
            }
        }
        s += "\n";

        for (i = 0; i < listaAlumnos.size(); i++)
        {
            Alumno a = listaAlumnos.get(i);
            s += a.getNombre();
            s += escribeEspacios((size - a.getNombre().length()) + 2);
            s += "│" + a.getEdad();
            s += escribeEspacios(5 - Integer.toString(a.getEdad()).length());
            s += "│" + a.getCalificacion();
            s += "\n";
        }
        return s;
    }

    @Override
    public String toString()
    {
        return imprimeListaAlumnos();
    }
}
