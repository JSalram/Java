package com.company;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Biblioteca
{
    private List<Libro> listaLibros;

    public Biblioteca() {listaLibros = new LinkedList<>();}

    public boolean insertaLibro (Libro l)
    {
        boolean nuevo = true;
        int i;
        for (i = 0; i < listaLibros.size(); i++)
        {
            if (l.getIsbn().equals(listaLibros.get(i).getIsbn()))
            {
                nuevo = false;
            }
        }

        if (nuevo)
        {
            listaLibros.add(l);
        }

        return nuevo;
    }
    public void leeFicheroLibros (String fichero)
    {
        try
        {
            FileInputStream fis = new FileInputStream(fichero);
            DataInputStream dis = new DataInputStream(fis);

            dis.readInt();

            while (dis.available() > 0)
            {
                String isbn = dis.readUTF();
                String titulo = dis.readUTF();
                String autor = dis.readUTF();
                int numeroPaginas = dis.readInt();
                boolean leido = dis.readBoolean();
                Libro l = new Libro(isbn, titulo, autor, numeroPaginas, leido);
                listaLibros.add(l);
            }

            dis.close();
            fis.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public void ordenaPorPaginasDesc()
    {
        int i, j;
        for (i = 0; i < listaLibros.size()-1; i++)
        {
            for (j = i+1; j < listaLibros.size(); j++)
            {
                if (listaLibros.get(j).getNumeroPaginas() > listaLibros.get(i).getNumeroPaginas())
                {
                    Libro temp = listaLibros.get(i);
                    listaLibros.set(i, listaLibros.get(j));
                    listaLibros.set(j, temp);
                }
            }
        }
    }

    @Override
    public String toString()
    {
        int i;
        StringBuilder s = new StringBuilder();

        s.append("Listado de libros:").append(System.lineSeparator());

        for (i = 0; i < listaLibros.size(); i++)
        {
            s.append(listaLibros.get(i).toString()).append(System.lineSeparator());
        }

        return s.toString();
    }
}
