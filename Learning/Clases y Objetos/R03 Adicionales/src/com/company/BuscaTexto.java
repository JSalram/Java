package com.company;

import javax.annotation.processing.Filer;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BuscaTexto
{
    private String texto;
    private int puntero;

    public BuscaTexto ()
    {
        texto = "";
        puntero = 0;
    }
    public BuscaTexto (String s)
    {
        texto = s;
        puntero = 0;
    }

    public void cargaFichero (String fichero)
    {
        try
        {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            String linea = br.readLine();
            while (linea != null)
            {
                texto += linea + "\n";
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
    public void reinicia() {puntero = 0;}
    public boolean busca (String cadena)
    {
        String textoPos = texto.substring(puntero);
        boolean encontrado = false;
        if (textoPos.contains(cadena))
        {
            encontrado = true;
            puntero += textoPos.indexOf(cadena);
        }
        return encontrado;
    }
    public boolean buscaSiguiente (String cadena)
    {
        boolean encontrado;
        int p1;
        p1 = texto.indexOf(cadena, puntero+1);
        if (p1 != -1)
        {
            puntero = p1;
            encontrado = true;
        }
        else
        {
            encontrado = false;
        }
        return encontrado;
    }
    public String extraeCadena (String delim1, String delim2)
    {
        int p1, p2;
        String cadena = null;
        p1 = texto.indexOf(delim1, puntero)+delim1.length();
        if (p1 != -1)
        {
            p2 = texto.indexOf(delim2, p1);
            if (p2 != -1)
            {
                cadena = texto.substring(p1, p2);
                puntero = p2;
            }
        }
        return cadena;
    }
    public String extraeCadenaConDelim (String delim1, String delim2)
    {
        int p1, p2;
        String cadena = null;
        p1 = texto.indexOf(delim1, puntero);
        if (p1 != -1)
        {
            p2 = texto.indexOf(delim2, p1 + 1) + delim2.length();
            if (p2 != -1)
            {
                cadena = texto.substring(p1, p2);
                puntero = p2;
            }
        }
        return cadena;
    }

    public int getPuntero () {return this.puntero;}
    public void setPuntero (int puntero) {this.puntero = puntero;}
    public String getTexto () {return this.texto;}
}
