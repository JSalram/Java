package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args)
    {
        //FileWriter y BufferedWriter           // BUFFER = Memoria intermedia
        //FileReader y BufferedReader           // FILE = Fichero

        //Escribir en un fichero de textov (FileWriter y BufferedWriter)

        try { // Prueba a hacer esto
            FileWriter fw = new FileWriter("Ficheros/fichero.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Hola mundo" + System.lineSeparator());
//            bw.write("Hola mundo\r\n") para WINDOWS
//            bw.write("Hola mundo\r\n") para LINUX
//            bw.write("Hola mundo\r") para MACINTOSH
            bw.write("Adiós mundo");
            // System.lineSeparator() == Salto de línea

            bw.close();
            fw.close();
        }
        catch (IOException e) // Si no se puede hacer (debido a una excepción), haz lo siguiente ...
        {
            e.printStackTrace(); // Imprime el error
//          System.out.println(e.getMessage()); // Otra opción
        }

        // Leer de un fichero (FileReader y BufferedReader)

        try
        {
            FileReader fr = new FileReader("fichero.txt");
            BufferedReader br = new BufferedReader(fr);

            String linea = br.readLine();
//            System.out.println(linea);
//            System.out.println(br.readLine());

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
}
