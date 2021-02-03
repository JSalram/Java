package com.company;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Tribunal
{
    private List<Profesor> profesores;

    public Tribunal (String fichero)
    {
        profesores = new ArrayList<>();
        try
        {
            FileInputStream fis = new FileInputStream(fichero);
            DataInputStream dis = new DataInputStream(fis);

            while (dis.available() > 0)
            {
                String nombre = dis.readUTF();
                String dni = dis.readUTF();
                int generoNum = dis.readInt();
                TipoGenero genero;
                if (generoNum == 0)
                {
                    genero = TipoGenero.Hombre;
                }
                else
                {
                    genero = TipoGenero.Mujer;
                }
                Profesor p = new Profesor(nombre, dni, genero);
                profesores.add(p);
            }

            dis.close();
            fis.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void eligeTribunal()
    {
        Random r = new Random();
        int i;
        System.out.println("Listado de profesores:");
        for (i = 0; i < profesores.size(); i++)
        {
            System.out.println((i+1) + ". " + profesores.get(i).toString());
        }

        List<Profesor> sorteo = new ArrayList<>();
        int pos, h = 0, m = 0;
        System.out.println("\n" + "Vocales elegidos en el sorteo:");
        for (i = 0; i < 4; i++)
        {
            pos = r.nextInt(profesores.size());
            while (sorteo.contains(profesores.get(pos)))
            {
                pos = r.nextInt(profesores.size());
            }
            if (profesores.get(pos).getGenero() == TipoGenero.Hombre)
            {
                if (h == 2)
                {
                    while (profesores.get(pos).getGenero() == TipoGenero.Hombre)
                    {
                        pos = r.nextInt(profesores.size());
                    }
                }
                else
                {
                    h++;
                }
            }
            else
            {
                if (m == 2)
                {
                    while (profesores.get(pos).getGenero() == TipoGenero.Mujer)
                    {
                        pos = r.nextInt(profesores.size());
                    }
                }
                else
                {
                    m++;
                }
            }

            sorteo.add(profesores.get(pos));
        }
        for (i = 0; i < sorteo.size(); i++)
        {
            System.out.println(sorteo.get(i).toString());
        }
    }
}
