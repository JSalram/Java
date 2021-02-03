package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {
        // Para ver si un fichero existe
        // Método antiguo: File

        // File nos permite obtener informacion sobre el fichero que digamos
        // El fichero no tiene siquiera que existir
        File f = new File("fichero.txt");

        if (f.exists() && f.isFile())
        {
            // .isFile = Es un archivo
            System.out.println("El fichero existe");
        }
        else
        {
            System.out.println("El fichero NO existe");
        }

        // Método moderno --> Files

        if (Files.exists(Path.of("fichero.txt")))
        {
            if (Files.isRegularFile(Path.of("fichero.txt")))
            {
                System.out.println("MN: El fichero existe");
            }
            else if (Files.isDirectory(Path.of("fichero.txt")))
            {
                System.out.println("MN: El fichero es un directorio");
            }
        }

        // Operaciones con ficheros: borrar, copiar, mover/renombrar
        // Versión antigua

        f.delete(); // eliminar
        File f2 = new File("fichero2.txt");
        f.renameTo(f2); // renombrar

        // Versión moderna

        try
        {
            Files.delete(Path.of("fichero.txt")); // eliminar
            Files.copy(Path.of("fichero.txt"), Path.of("fichero2.txt")); // copiar
            Files.move(Path.of("fichero.txt"), Path.of("fichero2.txt")); // renombrar

            Files.createDirectories(Path.of("Carpeta"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        // Obtener el listado de un directorio

        File dir = new File("."); // "." = Directorio actual
        File[] arrayFicheros = dir.listFiles();

        long tam = dir.length(); // Te dice cuantos ficheros contiene el directorio

        int i;
        for (i = 0; i < arrayFicheros.length; i++)
        {
            if (arrayFicheros[i].isFile())
            {
                if (arrayFicheros[i].getName().endsWith(".txt"))
                {
                    System.out.println(arrayFicheros[i].getName());
                  //System.out.println(arrayFicheros[i].getAbsolutePath());
                }
            }
        }

    }
}
