package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, opcion;
        for (i = 1; i < 20; i+=2)
        {
            if (i < 10)
            {
                System.out.print("Ejercicio " + i + ".");
                System.out.println("                    Ejercicio " + (i + 1) + ".");
            }
            else
            {
                System.out.print("Ejercicio " + i + ".");
                System.out.println("                   Ejercicio " + (i + 1) + ".");
            }
        }
        System.out.println();
        System.out.print("Elige una opción: ");
        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion)
        {
            case 1:
            {
                System.out.println("Escribe una frase y te indico cuántos espacios tiene");
                String s = sc.nextLine();
                System.out.println("La frase tiene " + numeroEspacios(s) + " espacios");
            }
                break;
            case 2:
            {
                System.out.println("Escribe una frase y te digo cuántas vocales tiene");
                String s = sc.nextLine();
                System.out.println("La frase tiene " + numeroVocales(s) + " vocales");
            }
                break;
            case 3:
            {
                System.out.println("Escribe una palabra y te digo si es palindromo (se lee igual del revés)");
                String s = sc.nextLine();
                if (esPalindromo(s))
                {
                    System.out.println("La palabra es palíndroma");
                }
                else
                {
                    System.out.println("La palabra NO es palíndroma");
                }
            }
                break;
            case 4:
            {
                System.out.println("Escribe una frase/palabra y dime un carácter y te digo si aparece");
                System.out.print("PALABRA - ");
                String s = sc.nextLine();
                System.out.print("CARÁCTER - ");
                String s2 = sc.next();
                while (s2.length() > 1)
                {
                    System.out.println("Has escrito más de un carácter, vuelve a escribirlo: ");
                    s2 = sc.next();
                }
                char c = s2.charAt(0);
                if (contiene(s, c))
                {
                    System.out.println("La frase contiene el carácter " + c);
                }
                else
                {
                    System.out.println("La frase NO contiene el carácter " + c + " o has escrito un carácter erróneo");
                }
            }
                break;
            case 5:
            {
                System.out.println("Dime un caracter y el número de veces que quieres que se repita");
                System.out.print("CARACTER - ");
                String s2 = sc.next();
                while (s2.length() > 1)
                {
                    System.out.println("Has escrito más de un carácter, vuelve a escribirlo: ");
                    s2 = sc.next();
                }
                char c = s2.charAt(0);
                System.out.println("REPETICIONES - ");
                int n = sc.nextInt();
                System.out.println(repiteCaracter(c, n));

            }
                break;
            case 6:
            {
                System.out.println("Dime una palabra y un tamaño máx para rellenar con " +
                                   "espacios a la izquierda y a la derecha de la cadena");
                System.out.println("PALABRA - ");
                String s = sc.nextLine();
                System.out.println("TAMAÑO - ");
                int tam = sc.nextInt();
                while (tam < s.length())
                {
                    System.out.println("El tamaño máx debe ser igual o mayor que el tamaño de la cadena, " +
                                       "por favor vuelve a insertar el tamaño:");
                    tam = sc.nextInt();
                }
                System.out.println("Espacios por delante:");
                padLeft(s, tam);
                System.out.println("Espacios por detrás:");
                padRight(s, tam);

            }
                break;
            case 7:
            {
                System.out.println("Dime una frase y le borro todos los espacios:");
                String s = sc.nextLine();
                s = quitaEspacios(s);
                System.out.println("La frase sin espacios queda así:");
                System.out.println(s);
            }
                break;
            case 8:
            {
                System.out.println("Dime una frase y le borro todos los espacios de delante y detrás de la frase:");
                String s = sc.nextLine();
                s = quitaEspaciosTrim(s);
                System.out.println("La frase sin espacios delante y detrás queda así:");
                System.out.println(s);
            }
                break;
            case 9:
            {
                System.out.println("Dime una frase, un caracter que quieras sustituir y " +
                                    "el caracter por el cual quieres sustituirlo:");
                System.out.print("FRASE - ");
                String s = sc.nextLine();
                System.out.print("CARÁCTER A REEMPLAZAR - ");
                String s2 = sc.next();
                while (s2.length() > 1)
                {
                    System.out.println("Has escrito más de un carácter, vuelve a escribirlo: ");
                    s2 = sc.next();
                }
                char c = s2.charAt(0);
                System.out.print("CARÁCTER POR EL QUE REEMPLAZAR - ");
                String s3 = sc.next();
                while (s3.length() > 1)
                {
                    System.out.println("Has escrito más de un carácter, vuelve a escribirlo: ");
                    s3 = sc.next();
                }
                char c2 = s3.charAt(0);
                s = sustituyeCaracter(s, c, c2);
                System.out.println(s);
            }
                break;
            case 10:
            {
                System.out.println("Dime una frase y te digo cuántas palabras contiene:");
                String s = sc.nextLine();
                System.out.println("La frase contiene " + cuentaPalabras(s) + " palabra(s)");
            }
                break;
            case 11:
            {
                System.out.println("Dime una cadena y te digo si está compuesta entera de números:");
                String s = sc.next();
                if (esNumero(s))
                {
                    System.out.println("Está compuesta completamente por números");
                    int cifra = Integer.parseInt(s);
                    System.out.println("La cifra concreta es: " + cifra);
                }
                else
                {
                    System.out.println("NO está compuesta completamente por números");
                }
            }
                break;
            case 12:
            {
                System.out.println("Dime una cadena y un carácter que quieres que elimine de esa cadena: ");
                System.out.print("CADENA - ");
                String s = sc.nextLine();
                System.out.print("CARÁCTER - ");
                String s2 = sc.nextLine();
                while (s2.length() > 1)
                {
                    System.out.println("Has escrito más de un carácter, vuelve a escribirlo: ");
                    s2 = sc.next();
                }
                char c = s2.charAt(0);
                s = quitaCaracter(s, c);
                System.out.print("Frase sin el carácter (" + c + "): " + s);
            }
                break;
            case 13:
            {
                System.out.println("Dime una frase y le quito los acentos:");
                String s = sc.nextLine();
                s = quitaAcentos(s);
                System.out.println(s);
            }
                break;
            case 14:
            {
                System.out.println("Dime una cadena y la invierto: ");
                String s = sc.nextLine();
                s = invierteCadena(s);
                System.out.println("Cadena invertida: " + s);
            }
                break;
            case 15:
            {
                System.out.println("Dime una frase y un caracter y te digo el nº de veces que aparece:");
                System.out.print("FRASE - ");
                String s = sc.nextLine();
                System.out.print("CARÁCTER - ");
                String s2 = sc.next();
                while (s2.length() > 1)
                {
                    System.out.println("Has escrito más de un carácter, vuelve a escribirlo: ");
                    s2 = sc.next();
                }
                char c = s2.charAt(0);
                System.out.println("Nº de veces que aparece el carácter (" + c + "): " + vecesCaracter(s, c));
            }
                break;
            case 16:
            {
                System.out.println("Dime una frase y una palabra y te digo el nº de veces que aparece:");
                System.out.print("FRASE - ");
                String s = sc.nextLine();
                System.out.print("PALABRA - ");
                String s2 = sc.nextLine();
                while (numeroEspacios(s2) > 0)
                {
                    System.out.print("¿Desde cuando las palabras contienen espacios? Vuelve a escribir la palabra: ");
                    s2 = sc.nextLine();
                }
                System.out.println("Veces que se repite la palabra (" + s2 + "): " + vecesPalabra(s, s2));
            }
                break;
            case 17:
            {
                System.out.println("Dime una frase y pongo todas las palabras con la primera letra mayúscula:");
                String s = sc.nextLine();
                s = mayusculasPrimera(s);
                System.out.println(s);
            }
                break;
            case 18:
            {
                System.out.println("Dime una cadena y dos palabras, en la que cambie la primera por la segunda:");
                System.out.print("CADENA - ");
                String s = sc.nextLine();
                System.out.print("PALABRA A CAMBIAR - ");
                String p1 = sc.next();
                System.out.print("PALABRA POR LA QUE CAMBIAR - ");
                String p2 = sc.next();
                s = sustituyePalabra(s, p1, p2);
                System.out.println("La frase cambiada será: " + s);
            }
                break;
            case 19:
            {
                System.out.println("Dime una cadena e invierto el orden de las palabras:");
                String s = sc.nextLine();
                System.out.println("Cadena invertida:");
                s = inviertePalabras(s);
                System.out.println(s);
            }
                break;
            case 20:
            {
                System.out.println("Dime una cadena y te formateo los espacios:");
                String s = sc.nextLine();
                s = quitaEspaciosSobrantes(s);
                System.out.println("La cadena formateada quedaría así:");
                System.out.println(s);
            }
                break;
            default:
                System.out.println("\u001B[31m" + "----- FATAL ERROR -----");
                break;
        }
    }
    public static int numeroEspacios (String s)
    {
        int espacios = 0, i;
        for (i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == ' ')
            {
                espacios++;
            }
        }
        return espacios;
    }
    public static int numeroVocales (String s)
    {
        int vocales = 0, i;
        s = s.toLowerCase();
        for (i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == 'a'||s.charAt(i) == 'e'||s.charAt(i) == 'i'|| s.charAt(i) == 'o'||s.charAt(i) == 'u' ||
                s.charAt(i) == 'á'||s.charAt(i) == 'é'||s.charAt(i) == 'í'|| s.charAt(i) == 'ó'||s.charAt(i) == 'ú')
            {
                vocales++;
            }
        }
        return vocales;
    }
    public static boolean esPalindromo (String s)
    {
        String s2 = s;
        boolean palindromo = true;
        int i, k = s.length()-1;
        for (i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) != s2.charAt(k))
            {
                palindromo = false;
            }
            k--;
        }
        return palindromo;
    }
    public static boolean contiene (String s, char c)
    {
        s = s.toLowerCase();
        boolean contieneChar = false;
        int i;
        for (i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == c)
            {
                contieneChar = true;
                i = s.length();
            }
        }
        return contieneChar;
    }
    public static String repiteCaracter (char c, int rep)
    {
        String s2 = "";
        int i;
        for (i = 0; i < rep; i++)
        {
            s2 = s2 + c; // StringBuilder también funciona
        }
        return s2;
    }
    public static void padLeft (String s, int tam)
    {
        int i;
        for (i = 0; i < (tam - s.length()); i++)
        {
            System.out.print(" ");
        }
        System.out.println(s);
    }
    public static void padRight (String s, int tam)
    {
        int i;
        System.out.print(s);
        for (i = 0; i < (tam - s.length()); i++)
        {
            System.out.print(" ");
        }
    }
    public static String quitaEspacios (String s)
    {
        String s2 = "";
        int i;
        for (i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) != ' ')
            {
                s2 = s2 + s.charAt(i);
            }
        }
        return s2;
    }
    public static String quitaEspaciosTrim (String s)
    {
        int i, espaciosIzq = 0, espaciosDer = 0;
        for (i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == ' ')
            {
                espaciosIzq++;
            }
            else
            {

                i = s.length();
            }
        }
        for (i = s.length()-1; i > 0; i--)
        {
            if (s.charAt(i) == ' ')
            {
                espaciosDer++;
            }
            else
            {
                i = 0;
            }
        }
//        String s2 = s.substring(espaciosIzq, (s.length()-espaciosDer));
//        return s2;
        return s.substring(espaciosIzq, (s.length()-espaciosDer));
    }
    public static String sustituyeCaracter (String s, char c, char c2)
    {
        String s2 = "";
        int i;
        for (i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) != c)
            {
                s2 = s2 + s.charAt(i);
            }
            else
            {
                s2 = s2 + c2;
            }
        }
        return s2;
    }
    public static int cuentaPalabras (String s)
    {
        int palabras = 0, i;
        for (i = 0; i < s.length(); i++)
        {
            while (s.charAt(i) != ' ' && i < s.length()-1)
            {
                    i++;
            }
            if (i+1 == s.length() || (s.charAt(i) == ' ' && i != 0))
            {
            palabras++;
            }
            while (s.charAt(i) == ' ' && i != s.length()-1)
            {
                i++;
            }
        }
        return palabras;
    }
    public static boolean esNumero (String s)
    {
        boolean numeros = true;
        int i;
        for (i = 0; i < s.length(); i++)
        {
            if (!Character.isDigit(s.charAt(i)))
            {
                numeros = false;
                i = s.length();
            }
        }
        return numeros;
    }
    public static String quitaCaracter (String s, char c)
    {
        String s2 = "";
        int i;
        for (i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) != c)
            {
                s2 = s2 + s.charAt(i);
            }
        }
        return s2;
    }
    public static String quitaAcentos (String s)
    {
        String acentos = "ÁÉÍÓÚÜáéíóúü";
        String vocales = "AEIOUUaeiouu";
        String s2 = "";
        boolean acentuado;
        int i, j;
        for (i = 0; i < s.length(); i++)
        {
            acentuado = false;
            for (j = 0; j < acentos.length(); j++)
            {
                if (s.charAt(i) == acentos.charAt(j))
                {
                    acentuado = true;
                    s2 += vocales.charAt(j); // s2 = s2 + vocales.charAt(j);
                    j = acentos.length();
                }
            }
            if (!acentuado)
            {
                s2 += s.charAt(i); // s2 = s2 + s.charAt(i);
            }
        }
        return s2;
    }
    public static String invierteCadena (String s)
    {
        String s2 = "";
        int i;
        for (i = s.length()-1; i >= 0; i--)
        {
            s2 = s2 + s.charAt(i);
        }
        return s2;
    }
    public static int vecesCaracter (String s, char c)
    {
        int caracteres = 0, i;
        for (i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == c)
            {
                caracteres++;
            }
        }
        return caracteres;
    }
    public static int vecesPalabra (String s, String palabra)
    {
        int i, aparece = 0;
        String unEspacio = "";
        for (i = 0; i < s.length(); i++)
        {
            unEspacio = s.replace("  ", " ");
        }
        String[] palabras =unEspacio.split(" ");
        for (i = 0; i < palabras.length; i++)
        {
            if (palabras[i].equals(palabra))
            {
                aparece++;
            }
        }
        return aparece;
    }
    public static String mayusculasPrimera (String s)
    {
        String s2 = "";
        int i;
        for (i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) != ' ')
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
    public static String sustituyePalabra (String s, String p1, String p2)
    {
        String s2 = s;
        int i;
        for (i = 0; i < s2.length(); i++)
        {
            s2 = s2.replace("  ", " ");
        }
        String[] palabras =s2.split(" ");
        for (i = 0; i < palabras.length; i++)
        {
            if (palabras[i].equals(p1))
            {
                palabras[i] = p2;
            }
        }
        String s3 = String.join(" ", palabras);
        return s3;
    }
    public static String inviertePalabras (String s)
    {
        int i;
        String s2 = s;
        s2 = s2.toLowerCase();
        s2 = s2.trim();
        for (i = 0; i < s2.length(); i++)
        {
            s2 = s2.replace("  ", " ");
        }
        String[] palabrasInv = s2.split(" ");
        int k = palabrasInv.length-1; String temp = "";
        for (i = 0; i < palabrasInv.length/2; i++)
        {
            temp = palabrasInv[i];
            palabrasInv[i] = palabrasInv[k];
            palabrasInv[k] = temp;
            k--;
            palabrasInv[0] = mayusculasPrimera(palabrasInv[0]);
        }
        String sInv = String.join(" ", palabrasInv);
        return sInv;
    }
    public static String quitaEspaciosSobrantes (String s)
    {
        s = quitaEspaciosTrim(s);
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
}