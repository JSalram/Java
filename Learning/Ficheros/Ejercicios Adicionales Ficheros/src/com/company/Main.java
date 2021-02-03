package com.company;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, opcion;

        System.out.println();
        for (i = 1; i <= 2; i++)
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
            case 1: // identificator
            {
                System.out.print("Indica el nombre del fichero: ");
                String s = "C:\\Users\\Javi\\Documents\\PROGRAMAS\\" + sc.next();

                System.out.println("El fichero es de tipo " + identificator(s));
            }
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("---ERROR---");
        }
    }

    public static String identificator (String s) // Opción 1
    {
        String[] extArr = {".EXE", ".MP3", ".DAT" , ".ZIP", ".ICO", ".JPG", ".7Z", ".PNG"};
        int[][] byteArr = { {0x4D, 0x5A}, {0x49, 0x44, 0x33}, {0x52, 0x49, 0x46, 0x46},
                            {0x50, 0x4B, 0x03, 0x04}, {0x00, 0x00, 0x01, 0x00},
                            {0xFF, 0xD8, 0xFF, 0xE0}, {0x37, 0x7A, 0xBC, 0xAF, 0x27, 0x1C},
                            {0x89, 0x50, 0x4E, 0x47, 0x0D, 0x0A, 0x1A, 0x0A}};
        List<Integer> byteList = new ArrayList<>();
        int i, j, numExt = 0, byteMax = 0;
        boolean correcto = false;

        for (i = 0; i < byteArr.length; i++)
        {
            if (byteArr[i].length > byteMax)
            {
                byteMax = byteArr[i].length;
            }
        }

        try
        {
            FileInputStream fis = new FileInputStream(s);
            DataInputStream dis = new DataInputStream(fis);

            for (i = 0; i < byteMax; i++)
            {
                byteList.add(dis.read());
            }

            for (i = 0; i < byteArr.length; i++)
            {
                correcto = true;
                for (j = 0; j < byteArr[i].length; j++)
                {
                    if (byteList.get(j) != byteArr[i][j])
                    {
                        correcto = false;
                    }
                }
                if (correcto)
                {
                    numExt = i;
                    i = byteArr.length;
                }
            }

            dis.close();
            fis.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return extArr[numExt];
    }
    public static void creaBMP (int R, int G, int B) // Opción 2
    {

    }
    public static void identificaBMP ()
    {

    }

}
