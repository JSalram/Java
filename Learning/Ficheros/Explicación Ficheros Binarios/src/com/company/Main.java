package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args)
    {
        String fichero = "fichero2.bin";
        escribeBinario(fichero);
        leeBinarioDatos(fichero);
    }

    public static void escribeBinario (String s)
    {
        // Escribiendo un fichero binario
        try
        {
            FileOutputStream fos = new FileOutputStream(s);
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeInt(5);
            dos.writeInt(100);
            dos.writeInt(1000);

            dos.writeDouble(0.1);

            dos.writeUTF("patata");

            dos.close();
            fos.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void leeBinario (String s)
    {
        // Leyendo un fichero binario
        try
        {
            FileInputStream fis = new FileInputStream(s);
            DataInputStream dis = new DataInputStream(fis);

            int n1 = dis.readInt();
            int n2 = dis.readInt();
            int n3 = dis.readInt();

            System.out.println(n1 + ", " + n2 + ", " + n3);

            double d = dis.readDouble();
            System.out.println(d);

            String s1 = dis.readUTF();
            System.out.println(s1);

            dis.close();
            fis.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void leeBinarioDatos (String s)
    {
        // Leyendo un fichero binario sin saber cuantos datos hay
        // Hay que saber al menos el tipo de datos
        try
        {
            FileInputStream fis = new FileInputStream(s);
            DataInputStream dis = new DataInputStream(fis);
            int n;

            while (dis.available() > 0)
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




}
