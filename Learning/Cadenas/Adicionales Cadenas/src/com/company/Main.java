package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        for (i = 1; i < 12; i+=2)
        {
            System.out.print("Ejercicio " + i + ".");
            if (i < 11)
            {
                System.out.println("                    Ejercicio " + (i + 1) + ".");
            }
        }
        System.out.println("                   Ejercicio 12. Círculo (EXTRA)");
        System.out.println();

        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion)
        {
            case 1:
            {
                System.out.println("Dime una cadena, y luego otra para saber si aparece en la primera:");
                System.out.print("CADENA 1 - ");
                String s = sc.nextLine();
                System.out.print("CADENA 2 - ");
                String s2 = sc.nextLine();
                s = marcaSubCadena(s, s2);
                System.out.println(s);
            }
                break;
            case 2:
            {
                System.out.println("Indica una cadena con tus nombres y apellidos en el siguiente formato:");
                System.out.println("'Apellido 1' 'Apellido 2' 'Nombre'");
                String s = sc.nextLine();
                System.out.println("La cadena formateada queda así:");
                escribeNombres(s);
            }
                break;
            case 3:
            {
                System.out.println("Dime una frase y te digo cuántas letras aparecen:");
                String s = sc.nextLine();
                System.out.println("[a, b, c, d, e, f, g, h, i, j, k, l, m, n, ñ, o, p, q, r, s, t, u, v, w, x, y, z]");
                System.out.println(" =  =  =  =  =  =  =  =  =  =  =  =  =  =  =  =  =  =  =  =  =  =  =  =  =  =  = ");
                System.out.println(Arrays.toString(cuentaLetras(s)));
            }
                break;
            case 4:
            {
                System.out.println("Dime una cadena: ");
                System.out.println("Pero antes, dime cuántos saltos de línea vas a dar (si no, escribe 0)");
                int j, saltos = sc.nextInt();
                System.out.print("CADENA - ");
                String s = sc.nextLine();
                for (j = 0; j <= saltos; j++)
                {
                    s = s + "\n" + sc.nextLine();
                }
                System.out.println("Elige qué hacer con la frase:");
                System.out.println("1.- Todas las letras en minúsculas.");
                System.out.println("2.- Todas las letras en mayúsculas.");
                System.out.println("3.- La primera letra de cada palabra en mayúsculas y el resto en minúsculas.");
                System.out.println("4.- La primera letra de cada frase en mayúsculas y el resto en minúsculas.");
                System.out.println();

                System.out.print("Opción: ");
                int choice = sc.nextInt();
                System.out.println();

                System.out.println("Resultado:");
                System.out.println(mayusculasMinusculas(s, choice));
            }
                break;
            case 5:
            {
                System.out.println("Escribe una cadena con tags XML:");
                String s = sc.nextLine();
                System.out.println(eliminaTags(s));
            }
                break;
            case 6:
            {
                System.out.println("Indica una cadena de palabras separadas por coma:");
                String s = sc.nextLine();
                s = ordenaPalabrasComa(s);
                System.out.println("Ordenado alfabéticamente: " + s);
            }
                break;
            case 7:
            {

            }
                break;
            case 8:
            {
                System.out.println("Indica una cadena y te digo que palabras empiezan y terminan por la misma letra:");
                String s = sc.nextLine();
                System.out.println("Palabras que empiezan y terminan por la misma letra: ");
                System.out.println(Arrays.toString(palabrasMismaLetra(s)));
            }
                break;
            case 9:
            {
                System.out.println(numeroTexto999(516));
            }
                break;
            case 10:
            {
                System.out.println("Escribe una cadena con caracteres: ");
                String s = sc.nextLine();
                s = limpiaCadena(s);
                System.out.println("Cadena limpia: " + s);
            }
                break;
            case 11:
            {
                System.out.println(compruebaEmail("@very-commonexample.com"));
            }
                break;
            case 12:
            {
                pintaCirculo();
            }
            break;
            default:
                System.out.println("\u001B[31m" + "----- FATAL ERROR -----");
                break;
        }
    }
    public static String mayusculasPrimera (String s)
    {
        String s2 = "";
        int i;
        for (i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) != ' ' && s.charAt(i) != '\n')
            {
                s2 = s2 + Character.toUpperCase(s.charAt(i));
                i++;
                while (s.charAt(i) != ' ' && i < s.length() - 1)
                {
                    s2 = s2 + s.charAt(i);
                    i++;
                }
                if (s.charAt(i) != ' ' && i == s.length()-1)
                {
                    s2 = s2 + s.charAt(i);
                }
            }
            if (s.charAt(i) == ' ')
            {
                s2 = s2 + s.charAt(i);
            }
        }
        return s2;
    }
    public static String quitaEspaciosSobrantes (String s)
    {
        s = s.trim();
        String s2 = "";
        int i;
        for (i = 0; i < s.length(); i++)
        {
            if (i > 0)
            {
                if (s.charAt(i-1) == ' ')
                {
                    s2 = s2 + ' ';
                    while (s.charAt(i) == ' ' && i < s.length() - 1)
                    {
                        i++;
                    }
                }
            }
            while (s.charAt(i) != ' ' && i < s.length()-1)
            {
                s2 = s2 + s.charAt(i);
                i++;
            }
            if (i == s.length()-1 && s.charAt(i) != ' ')
            {
                s2 = s2 + s.charAt(i);
            }
        }
        return s2;
    }
    public static String marcaSubCadena (String s, String s2)
    {
        boolean aparece = false;
        int i, k, posInic = 0, posFin = 0;
        String sCopia = quitaEspaciosSobrantes(s), s2Copia = quitaEspaciosSobrantes(s2);
        String[] p = sCopia.split(" "), p2 = s2Copia.split(" ");
        for (i = 0; i < p.length; i++)
        {
            if (p2[0].equals(p[i]))
            {
                for (k = 0; k < p2.length; k++)
                {
                    if (p2[0].equals(p[i]))
                    {
                        k = 0;
                        posInic = i;
                    }
                    if (p2[k].equals(p[i]))
                    {
                        aparece = true;
                        if (k != p2.length-1)
                        {
                            i++;
                        }
                    }
                    else
                    {
                        aparece = false;
                        k = p2.length;
                    }
                }
                if (p2[k-1].equals(p[i]))
                {
                    posFin = i;
                    i = p.length;
                }
            }
        }
        String sFinal = "";
        if (aparece)
        {
            for (i = 0; i < p.length; i++)
            {
                if (i == posInic)
                {
                    sFinal = sFinal + "\u001B[36m" + "*";
                }
                sFinal = sFinal + p[i];
                if (i != posFin)
                {
                    sFinal = sFinal + " ";
                }
                if (i == posFin)
                {
                    sFinal = sFinal + "* " + "\u001B[0m";
                }
            }
            return sFinal;
        }
        else
        {
            return "NO aparece la segunda cadena";
        }
    }
    public static void escribeNombres (String s)
    {
        int i;
        String s2 = s;
        for (i = 0; i < s.length(); i++)
        {
            s2 = s.replace("  ", " ");
        }
        String[] p = s2.split(" ");
        for (i = 0; i < p.length; i+=3)
        {
            System.out.print(p[i+2] + " ");
            System.out.print(p[i] + " ");
            System.out.print(p[i+1] + " ");
        }
    }
    public static int[] cuentaLetras (String s)
    {
        Character[] letra = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
                             'ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
        int[] contador = new int[27];
        int i, k;
        for (i = 0; i < s.length(); i++)
        {
            for (k = 0; k < letra.length; k++)
            {
                if (letra[k] == s.charAt(i))
                {
                    contador[k]++;
                }
            }
        }
        return contador;
    }
    public static String mayusculasMinusculas (String s, int choice)
    {
        String s2 = "";
        switch (choice)
        {
            case 1:
            {
                s2 = s.toUpperCase();
            }
            break;
            case 2:
            {
                s2 = s.toLowerCase();
            }
            break;
            case 3:
            {
                s2 = mayusculasPrimera(s);
            }
            break;
            case 4:
            {
                int k;
                for (k = 0; k < s.length(); k++)
                {
                    if (s.charAt(k) == '\n')
                    {
                        s2 = s2 + s.charAt(k);
                        k++;
                        s2 = s2 + Character.toUpperCase(s.charAt(k));
                    }
                    else
                    {
                        s2 = s2 + s.charAt(k);
                    }
                }
            }
                break;
            default:
                System.out.println("\u001B[31m" + "----- FATAL ERROR -----");
                break;
        }
        return s2;
    }
    public static String eliminaTags (String s)
    {
        String s2 = "";
        int i;
        for (i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '<')
            {
                while (s.charAt(i) != '>')
                {
                    i++;
                }
            }
            else
            {
                s2 = s2 + s.charAt(i);
            }
        }
        return s2;
    }
    public static String ordenaPalabrasComa (String s)
    {
        String[] palabras = s.split(",");
        int i, j = 0;
        String min, max;

        while (j < (palabras.length/2))
        {
            for (i = 0; i < (palabras.length-1); i++)
            {
                if (palabras[i].compareTo(palabras[i+1]) > 0)
                {
                    min = palabras[i+1];
                    max = palabras[i];
                }
                else
                {
                    min = palabras[i];
                    max = palabras[i+1];
                }
                palabras[i] = min;
                palabras[i+1] = max;
            }
            j++;
        }

        String s2 = String.join(",", palabras);
        return s2;

    }


    public static String[] palabrasMismaLetra (String s)
    {
        s = quitaEspaciosSobrantes(s);
        String[] palabras = s.split(" ");
        int i, cont = 0;
        for (i = 0; i < palabras.length; i++)
        {
            if (palabras[i].charAt(0) == palabras[i].charAt(palabras[i].length()-1))
            {
                cont++;
            }
        }
        String[] mismaLetra = new String[cont];
        int j = -1;
        for (i = 0; i < palabras.length; i++)
        {
            if (palabras[i].charAt(0) == palabras[i].charAt(palabras[i].length()-1))
            {
                j++;
                mismaLetra[j] = palabras[i];
            }
        }
        return mismaLetra;
    }
    public static String numeroTexto999(int n)
    {
        String texto;
        int unidDec = n % 100;
        int centenas = n / 100;
        if(n < 100)
        {
            texto = numeroTexto99(n);
        }
        else
        {
            if(n == 100)
            {
                texto = "cien";
            }
            else
            {
                String[] textoCent = {"", "ciento", "doscientos", "trescientos", "cuatrocientos",
                        "quinientos", "seiscientos", "setecientos", "ochocientos",
                        "novecientos"};

                if(unidDec == 0)
                {
                    texto = textoCent[centenas];
                }
                else
                {
                    texto = textoCent[centenas] + " " + numeroTexto99(unidDec);
                }
            }
        }
        return texto;
    }
    public static String numeroTexto99(int n)
    {
        String texto;
        String[] texto10 = {"diez", "once", "doce", "trece", "catorce", "quince", "dieciséis"};
        int unidad = n%10;
        int decena = n/10;

        if(n < 10)
        {
            texto = numeroTexto9(n);
        }
        else
        {
            if(n < 20)
            {
                if(n < 17)
                {
                    texto = texto10[n-10];
                }
                else
                {
                    texto = "dieci" + numeroTexto9(unidad);
                }
            }
            else
            {
                if(n < 30)
                {
                    if(n == 20)
                    {
                        texto = "veinte";
                    }
                    else
                    {
                        if (n == 22)
                        {
                            texto = "veintidós";
                        }
                        else
                        {
                            texto = "veinti" + numeroTexto9(unidad);
                        }
                    }
                }
                else
                {
                    String[] textoDec = {"", "", "", "treinta", "cuarenta", "cincuenta",
                            "sesenta", "setenta", "ochenta", "noventa"};
                    if(unidad == 0)
                    {
                        texto = textoDec[decena];
                    }
                    else
                    {
                        texto = textoDec[decena] + " y " + numeroTexto9(unidad);
                    }
                }
            }
        }
        return texto;
    }
    public static String numeroTexto9(int n)
    {
        String[] texto = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis",
                "siete", "ocho", "nueve"};
        return texto[n];
    }
    public static String limpiaCadena (String s)
    {
        String s2 = "";
        int i;
        for (i = 0; i < s.length(); i++)
        {
            s = s.replace("  ", " ");
        }
        for (i = 0; i < s.length(); i++)
        {
            if (Character.isLetter(s.charAt(i)) || s.charAt(i) == ' ')
            {
                s2 = s2 + s.charAt(i);
            }
        }
        return s2;
    }
    public static boolean compruebaEmail(String email)
    {
        String[] trozos = email.split("@");
        boolean res;

        if(trozos.length == 2)
        {
            if(compruebaTrozo(trozos[0]) && compruebaTrozo(trozos[1]))
            {
                res = true;
            }
            else
            {
                res = false;
            }
        }
        else
        {
            res = false;
        }

        return res;
    }
    public static boolean compruebaTrozo(String trozo)
    {
        int i;
        boolean res;
        String valido = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890-.";

        if(trozo.equals(""))
        {
            res = false;
        }
        else
        {
            res = true;
            for(i = 0; i < trozo.length(); i++)
            {
                if(valido.indexOf(trozo.charAt(i)) == -1) // si no está en "valido"
                {
                    res = false;
                    i = trozo.length(); // optimizando
                }
            }

            if(res)
            {
                if(trozo.charAt(0) == '.' || trozo.charAt(trozo.length()-1) == '.' ||
                        trozo.charAt(0) == '-' || trozo.charAt(trozo.length()-1) == '-' ||
                        trozo.contains(".."))
                {
                    res = false;
                }
            }
        }

        return res;
    }
    public static void pintaCirculo ()
    {
        int tam = 15, i, j, asp = 3;
        double h;

        for (i = -tam; i <= tam; i++)
        {
            for (j = -tam*asp; j < tam*asp; j++)
            {
                h = Math.sqrt(i*i + (j/(double)asp*j)/(double)asp);

                if (h >= tam)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
