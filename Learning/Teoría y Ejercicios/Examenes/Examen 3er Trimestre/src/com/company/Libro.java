package com.company;

import java.security.InvalidParameterException;

public class Libro
{
    private String isbn;
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean leido;

    public Libro(String isbn, String titulo, String autor, int numeroPaginas, boolean leido)
    {
        if (compruebaISBN(isbn))
        {
            this.isbn = isbn;
        }
        else
        {
            throw new InvalidParameterException("ISBN inválido");
        }
        this.titulo = titulo;
        this.autor = autor;
        if (numeroPaginas != 0)
        {
            this.numeroPaginas = numeroPaginas;
        }
        else
        {
            throw new InvalidParameterException("Número de páginas no puede ser 0");
        }
        this.leido = leido;
    }

    public String getIsbn() {return this.isbn;}
    public String getTitulo() {return this.titulo;}
    public String getAutor() {return this.autor;}
    public int getNumeroPaginas() {return this.numeroPaginas;}
    public boolean getLeido() {return this.leido;}
    public void setLeido(boolean leido) {this.leido = leido;}

    public static boolean compruebaISBN (String isbn)
    {
        boolean valido = true;
        if (isbn.length() == 17)
        {
            int i;
            for (i = 0; i < isbn.length(); i++)
            {
                if (i == 3 || i == 6 || i == 11 || i == 15)
                {
                    if (isbn.charAt(i) != '-')
                    {
                        valido = false;
                    }
                }
                else
                {
                    if (!Character.isDigit(isbn.charAt(i)))
                    {
                        valido = false;
                    }
                }
            }
        }
        else
        {
            valido = false;
        }

        return valido;
    }

    @Override
    public String toString()
    {
        return "'" + titulo + "' de " + autor;
    }
}
