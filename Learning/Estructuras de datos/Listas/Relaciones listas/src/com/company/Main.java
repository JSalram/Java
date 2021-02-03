package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i;

        for (i = 1; i <= 24; i++)
        {
            if (i < 10)
            {
                System.out.print("Ejercicio " + i + ".");
                i++;
                System.out.println("                           Ejercicio " + i + ".");
            }
            else
            {
                System.out.print("Ejercicio " + i + ".");
                i++;
                System.out.println("                          Ejercicio " + i + ".");
            }
        }

        System.out.println();
        System.out.print("Elige un ejercicio: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion)
        {
            case 1: // leelista
            {
                List<Integer> l = new LinkedList<>();
                System.out.println("Indica los valores de la lista (-1 para terminar):");
                leeLista(l);
                System.out.println(l);
            }
                break;
            case 2: // leeListaN
            {
                List<Integer> l = new LinkedList<>();
                System.out.print("Tamaño de la lista: ");
                int size = sc.nextInt();
                System.out.println("Indica los valores de la lista:");
                leeListaN(l, size);
                System.out.println();
                System.out.println(l);
            }
                break;
            case 3: // escribeLista
            {
                List<Integer> l = new LinkedList<>();
                System.out.println("Indica los valores de la lista (-1 para terminar):");
                leeLista(l);
                System.out.println();
                escribeLista(l);
            }
                break;
            case 4: // eliminaNegativos
            {
                List<Integer> l = new LinkedList<>();
                System.out.print("Dime el tamaño de la lista: ");
                int size = sc.nextInt();
                System.out.println("Indica los valores de la lista:");
                leeListaN(l, size);
                eliminaNegativos(l);
                System.out.println("La lista sin números negativos quedaría así:");
                System.out.println(l);

            }
                break;
            case 5: // clasificaNumeros
            {
                List<Integer> l = new LinkedList<>();
                List<Integer> l2 = new LinkedList<>();
                List<Integer> l3 = new LinkedList<>();

                System.out.print("Dime el tamaño de la lista: ");
                int size = sc.nextInt();
                System.out.println("Indica los valores de la lista:");
                leeListaN(l, size);
                clasificaNumeros(l, l2, l3);
                System.out.println();

                System.out.println("Lista de positivos:");
                System.out.println(l2);
                System.out.println();

                System.out.println("Lista de negativos:");
                System.out.println(l3);
            }
                break;
            case 6: // eliminaRepetidos
            {
                List<Integer> l = new LinkedList<>();
                System.out.print("Dime el tamaño de la lista: ");
                int size = sc.nextInt();
                System.out.println("Indica los valores de la lista:");
                leeListaN(l, size);
                System.out.println();

                System.out.println("La lista sin elementos repetidos:");
                System.out.println(eliminaRepetidos(l));
            }
                break;
            case 7: // ordenaListaSeleccion
            {
                List<Integer> l = new LinkedList<>();
                System.out.print("Dime el tamaño de la lista: ");
                int size = sc.nextInt();
                System.out.println("Indica los valores de la lista:");
                leeListaN(l, size);
                System.out.println();

                System.out.println("Lista ordenada:");
                System.out.println(ordenaListaSeleccion(l));
            }
                break;
            case 8: // ordenaListaInsercion
            {
                List<Integer> l = new LinkedList<>();
                System.out.print("Dime el tamaño de la lista: ");
                int size = sc.nextInt();
                System.out.println("Indica los valores de la lista:");
                leeListaN(l, size);
                System.out.println();

                System.out.println("Lista ordenada:");
                System.out.println(ordenaListaInsercion(l));
            }
                break;
            case 9: // ordenaListaPalabras
            {
                List<String> l = new LinkedList<>();
                System.out.print("Tamaño: ");
                int size = sc.nextInt();
                System.out.println("Lista: ");
                leeListaString(l, size);
                System.out.println();

                System.out.println("Lista ordenada:");
                ordenaListaPalabras(l);
                System.out.println(l);
            }
                break;
            case 10: // ordenaListaPalabras2
            {
                List<String> l = new LinkedList<>();
                System.out.print("Tamaño: ");
                int size = sc.nextInt();
                System.out.println("Lista: ");
                leeListaString(l, size);
                System.out.println();

                System.out.println("Lista ordenada:");
                ordenaListaPalabras2(l);
                System.out.println(l);
            }
                break;
            case 11: // insertaArrayenArrayPro
            {
                System.out.println("Escribe el primer array:");
                System.out.print("Tamaño: ");
                int[] a = new int[sc.nextInt()];
                leeArray(a);
                System.out.println("Escribe el segundo array:");
                System.out.print("Tamaño: ");
                int[] b = new int[sc.nextInt()];
                leeArray(b);
                System.out.print("Posición en la que quieres introducir el 2º array: ");
                int pos = sc.nextInt();
                System.out.println();

                System.out.println("Array completo:");
                System.out.println(Arrays.toString(insertaArrayenArrayPro(a, pos, b)));
            }
                break;
            case 12: // sorteoBonoLoto
            {
                System.out.println("Número ganador:\n" + sorteoBonoLoto());
            }
                break;
            case 13: // eliminaRepetidos2
            {
                System.out.println("Escribe el array:");
                System.out.print("Tamaño: ");
                Integer[] a = new Integer[sc.nextInt()];
                leeArrayInteger(a);
                System.out.println();

                System.out.println("Array sin elementos repetidos:");
                System.out.println(Arrays.toString(eliminaRepetidos2(a)));
            }
                break;
            case 14: // unionListas
            {
                List<Integer> l = new LinkedList<>();
                List<Integer> l2 = new LinkedList<>();

                System.out.print("Dime el tamaño de la primera lista: ");
                int size = sc.nextInt();
                System.out.println("Indica los valores de la lista:");
                leeListaN(l, size);
                System.out.print("Dime el tamaño de la segunda lista: ");
                int size2 = sc.nextInt();
                System.out.println("Indica los valores de la lista:");
                leeListaN(l2, size2);
                System.out.println();

                System.out.println("Unión de las listas:");
                System.out.println(unionListas(l, l2));
            }
                break;
            case 15: // interseccionListas
            {
                List<Integer> l = new LinkedList<>();
                List<Integer> l2 = new LinkedList<>();

                System.out.print("Dime el tamaño de la primera lista: ");
                int size = sc.nextInt();
                System.out.println("Indica los valores de la lista:");
                leeListaN(l, size);
                System.out.print("Dime el tamaño de la segunda lista: ");
                int size2 = sc.nextInt();
                System.out.println("Indica los valores de la lista:");
                leeListaN(l2, size2);
                System.out.println();

                System.out.println("Inserción de las listas:");
                System.out.println(interseccionListas(l, l2));
            }
                break;
            case 16: // desordenaLista
            {
                List<Integer> l = new LinkedList<>();

                System.out.print("Dime el tamaño de la lista: ");
                int size = sc.nextInt();
                System.out.println("Indica los valores de la lista:");
                leeListaN(l, size);
                System.out.println();

                System.out.println("Lista desordenada");
                System.out.println(desordenaLista(l));
            }
                break;
            case 17: // modaLista
            {
                List<Integer> l = new LinkedList<>();

                System.out.print("Dime el tamaño de la lista: ");
                int size = sc.nextInt();
                System.out.println("Indica los valores de la lista:");
                leeListaN(l, size);
                System.out.println();

                System.out.print("Moda de la serie: " + modaLista(l));
            }
                break;
            case 18: // puntuacionesTrampolin
            {
                List<Integer> l = new LinkedList<>();

                System.out.println("Indica las calificaciones del saltador:");
                leeListaN(l, 7);
                System.out.println();

                System.out.println("Nota final del saltador: " + puntuacionesTrampolin(l));
            }
                break;
            case 19: // ordenaRepetidos
            {
                List<Integer> l = new LinkedList<>();

                System.out.print("Dime el tamaño de la lista: ");
                int size = sc.nextInt();
                System.out.println("Indica los valores de la lista:");
                leeListaN(l, size);
                System.out.println();

                System.out.println("Lista ordenada por nº repetidos:");
                System.out.println(ordenaRepetidos(l));
            }
                break;
            case 20: // elementosUnicos y elementosRepetidos
            {
                List<Integer> l = new LinkedList<>();

                System.out.print("Dime el tamaño de la lista: ");
                int size = sc.nextInt();
                System.out.println("Indica los valores de la lista:");
                leeListaN(l, size);
                System.out.println();

                System.out.println("Lista con elementos NO repetidos:");
                System.out.println(elementosUnicos(l));
                System.out.println();
                System.out.println("Lista con elementos repetidos:");
                System.out.println(elementosRepetidos(l));
            }
                break;
            case 21: // listaDominosDobles
            {
                List<Integer> l = new LinkedList<>();

                System.out.print("Dime cuántas fichas tienes: ");
                int size = sc.nextInt()*2;
                System.out.println("Indica los números de las fichas:");
                leeListaN(l, size);
                System.out.println();

                System.out.println("Lista de dobles: ");
                System.out.println(listaDominosDobles(l));
            }
                break;
            case 22: // palabrasMismaLetra
            {
                System.out.println("Escribe un cadena:");
                String s = sc.nextLine();
                System.out.println("Palabras que empiezan y terminan por la misma letra:");
                System.out.println(palabrasMismaLetra(s));

            }
                break;
            case 23: // listaPalabrasLargas
            {
                System.out.println("Escribe un cadena:");
                String s = sc.nextLine();
                System.out.print("Indica el tamaño mínimo de letras por palabra: ");
                int longMin = sc.nextInt();
                System.out.println();

                System.out.println("Palabras largas:");
                System.out.println(listaPalabrasLargas(s, longMin));
            }
                break;
            case 24: // haceCalor
            {
                List<String> locals = new LinkedList<>();
                List<Double> temps = new LinkedList<>();

                System.out.print("Indica cuántas localidades vas a introducir: ");
                int size = sc.nextInt();
                System.out.println("Localidades:");
                leeListaS(locals, size);
                System.out.println("Temperaturas:");
                leeListaD(temps, size);
                System.out.println();

                haceCalor(locals, temps);
                System.out.println(locals);
                System.out.println(temps);
            }
                break;
            default:
                System.out.println("------------FATAL-ERROR------------");
        }
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
    public static String quitaAcentos (String s)
    {
        String conAcentos = "ÁÉÍÓÚÜáéíóúü", sinAcentos = "AEIOUUaeiouu", s2 = "";
        boolean acentuado;
        int i, k;
        for (i = 0; i < s.length(); i++)
        {
            acentuado = false;
            for (k = 0; k < conAcentos.length(); k++)
            {
                if (s.charAt(i) == conAcentos.charAt(k))
                {
                    acentuado = true;
                    s2 = s2 + sinAcentos.charAt(k);
                    k = conAcentos.length();
                }
            }
            if (!acentuado)
            {
                s2 = s2 + s.charAt(i);
            }
        }
        return s2;
    }
    public static String quitaCaracteres(String s)
    {
        String s2 = "";
        int i;
        for (i = 0; i < s.length(); i++)
        {
            if (Character.isLetter(s.charAt(i)) || s.charAt(i) == ' ')
            {
                s2 = s2 + s.charAt(i);
            }
        }
        return s2;
    }
    public static void leeArray(int[] a)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Indica los valores del array:");
        for (i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }
    }
    public static void leeArrayInteger(Integer[] a)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Indica los valores del array:");
        for (i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }
    }
    public static void leeLista (List<Integer> l) // Opcion 1
    {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        while (n != -1)
        {
            l.add(n);
            n = sc.nextInt();
        }
    }
    public static void leeListaN (List<Integer> l, int size) // Opcion 2
    {
        Scanner sc = new Scanner(System.in);
        int i;
        Integer n;
        for (i = 0; i < size; i++)
        {
            n = sc.nextInt();
            l.add(n);
        }
    }
    public static void leeListaS (List<String> l, int size) // Opcion 2
    {
        Scanner sc = new Scanner(System.in);
        int i;
        String n;
        for (i = 0; i < size; i++)
        {
            n = sc.nextLine();
            l.add(n);
        }
    }
    public static void leeListaD (List<Double> l, int size) // Opcion 2
    {
        Scanner sc = new Scanner(System.in);
        int i;
        Double n;
        for (i = 0; i < size; i++)
        {
            n = sc.nextDouble();
            l.add(n);
        }
    }
    public static void leeListaString (List<String> l, int size)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        String s;
        for (i = 0; i < size; i++)
        {
            s = sc.next();
            l.add(s);
        }
    }
    public static void escribeLista (List<Integer> l) // Opcion 3
    {
        int i;
        if (l.size() > 0)
        {
            System.out.print("<");
            for (i = 0; i < l.size()-1; i++)
            {
                System.out.print(l.get(i) + ", ");
            }
            System.out.print(l.get(i) + ">");
        }
        else
        {
            System.out.println("TAMAÑO ERRÓNEO");
        }
    }
    public static void eliminaNegativos (List<Integer> l) // Opcion 4
    {
        int i;
        for (i = 0; i < l.size(); i++)
        {
            if (l.get(i) < 0)
            {
                l.remove(i);
                i--;
            }
        }
    }
    public static void clasificaNumeros (List<Integer> l, List<Integer> l2, List<Integer> l3) // Opcion 5
    {
        int i, k, j, min, max;
        for (i = 0; i < l.size(); i++)
        {
            if (l.get(i) > 0)
            {
                l2.add(l.get(i));
            }
            else
            {
                l3.add(l.get(i));
            }
        }
        // Ordenar l2 y l3 de menor a mayor
        if (l2.size() > 1)
        {
            j = 0;
            while (j < l2.size())
            {
                k = 1;
                for (i = 0; i < l2.size()-1; i++)
                {
                    if (l2.get(i) > l2.get(k))
                    {
                        min = l2.get(k);
                        max = l2.get(i);
                    }
                    else
                    {
                        min = l2.get(i);
                        max = l2.get(k);
                    }
                    l2.set(i, min);
                    l2.set(k, max);
                    k++;
                }
                j++;
            }
        }
        if (l3.size() > 1)
        {
            j = 0;
            while (j < l3.size())
            {
                k = 1;
                for (i = 0; i < l3.size()-1; i++)
                {
                    if (l3.get(i) > l3.get(k))
                    {
                        min = l3.get(k);
                        max = l3.get(i);
                    }
                    else
                    {
                        min = l3.get(i);
                        max = l3.get(k);
                    }
                    l3.set(i, min);
                    l3.set(k, max);
                    k++;
                }
                j++;
            }

        }
    }
    public static List<Integer> eliminaRepetidos (List<Integer> l) // Opcion 6
    {
        List<Integer> l2 = new LinkedList<>();
        int i;
        for (i = 0; i < l.size(); i++)
        {
            if (!l2.contains(l.get(i)))
            {
                l2.add(l.get(i));
            }
        }
        return l2;
    }
    public static List<Integer> ordenaListaSeleccion(List<Integer> l) // Opcion 7
    {
        List<Integer> resultado = new LinkedList<>();
        int i, j, size = l.size();
        if (l.size() > 0)
        {
            for (j = 0; j < size; j++)
            {
                Integer min = l.get(0);
                for (i = 1; i < l.size(); i++)
                {
                    if (l.get(i) < min)
                    {
                        min = l.get(i);
                    }
                }
                resultado.add(min);
                l.remove(min);
            }
        }
        return resultado;
    }
    public static List<Integer> ordenaListaInsercion (List<Integer> l) // Opcion 8
    {
        List<Integer> resultado = new LinkedList<>();
        int i, j, size = l.size();
        if (l.size() > 0)
        {
            for (j = 0; j < size; j++)
            {
                Integer max = l.get(0);
                for (i = 1; i < l.size(); i++)
                {
                    if (l.get(i) > max)
                    {
                        max = l.get(i);
                    }
                }
                resultado.add(0, max);
                l.remove(max);
            }
        }
        return resultado;
    }
    public static void ordenaListaPalabras (List<String> l) // Opcion 9
    {
        int j, i, size = l.size();
        String temp;
        if (l.size() > 0)
        {
            for (i = 0; i < size; i++)
            {
                for (j = i+1; j < l.size(); j++)
                {
                    if (l.get(j).compareTo(l.get(i)) < 0)
                    {
                        temp = l.get(j);
                        l.set(j, l.get(i));
                        l.set(i, temp);
                    }
                }
            }
        }
    }
    public static void ordenaListaPalabras2 (List<String> l) // Opcion 10
    {
        int i, j, size = l.size();
        String temp;
        if (l.size() > 0)
        {
            for (i = 0; i < size; i++)
            {
                for (j = i+1; j < size; j++)
                {
                    if (l.get(j).length() < l.get(i).length())
                    {
                        temp = l.get(i);
                        l.set(i, l.get(j));
                        l.set(j, temp);
                    }
                }
            }
        }
    }
    public static Integer[] insertaArrayenArrayPro (int[] a, int pos, int[] b) // Opcion 11
    {
        List<Integer> l = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> l2 = Arrays.stream(b).boxed().collect(Collectors.toList());
        l.addAll(pos, l2);
        Integer[] c = new Integer[l.size()];
        c = l.toArray(c);
        return c;
    }
    public static List<Integer> sorteoBonoLoto () // Opcion 12
    {
        Random r = new Random();
        List<Integer> numeros = new LinkedList<>();
        int i, j;
        for (i = 1; i < 50; i++)
        {
            numeros.add(i);
        }
        List<Integer> resultado = new LinkedList<>();
        for (j = 0; j < 6; j++)
        {
            Integer numRandom = numeros.get(r.nextInt(numeros.size())); // Coge un número aleatorio de la lista
            resultado.add(numRandom);
            numeros.remove(numRandom);
        }
        return resultado;
    }
    public static Integer[] eliminaRepetidos2 (Integer[] a) // Opcion 13
    {
        // List<Integer> l = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> l = new LinkedList<>();
        int i = 0, j;
        while (l.size() < a.length)
        {
            l.add(a[i]);
            i++;
        }
        for (i = 0; i < l.size(); i++)
        {
            if (l.size() > 0)
            {
                j = i+1;
                while (j < l.size())
                {
                    if (l.get(j).equals(l.get(i)))
                    {
                        l.remove(j);
                    }
                    else
                    {
                        j++;
                    }
                }
            }
        }
        Integer[] b = new Integer[l.size()];
        b = l.toArray(b);
        return b;
    }
    public static List<Integer> unionListas (List<Integer> l, List<Integer> l2) // Opcion 14
    {
        List<Integer> union = new LinkedList<>();
        int i, j;
        for (i = 0; i < l.size(); i++)
        {
            for (j = 0; j < l2.size(); j++)
            {
                if (l2.get(j).equals(l.get(i)))
                {
                    l2.remove(j);
                }
            }
        }
        union.addAll(l); union.addAll(l2);
        return union;
    }
    public static List<Integer> interseccionListas(List<Integer> l, List<Integer> l2) // Opcion 15
    {
        List<Integer> interseccion = new LinkedList<>();
        int i, j, pos = 0;
        boolean aparece;

        for (i = 0; i < l.size(); i++)
        {
            aparece = false;
            for (j = 0; j < l2.size(); j++)
            {
                if (l.get(i).equals(l2.get(j)))
                {
                    aparece = true;
                    pos = j;
                }
            }
            if (aparece)
            {
                interseccion.add(l.get(i));
                l2.remove(pos);
            }
        }
        return interseccion;
    }
    public static List<Integer> desordenaLista (List<Integer> l) // Opción 16
    {
        Random r = new Random();
        List<Integer> desord = new LinkedList<>();
        int i = 0;

        while (i < l.size())
        {
            Integer numRandom = l.get(r.nextInt(l.size()));
            desord.add(numRandom);
            l.remove(numRandom);
        }

        return desord;
    }
    public static Integer modaLista (List<Integer> l) // Opción 17 //
    {
        int i, j, rep, maxRep = 0, pos = 0;
        boolean repMax = false;

        for (i = 0; i < l.size(); i++)
        {
            rep = 0;
            for (j = i; j < l.size(); j++)
            {
                if (l.get(i).equals(l.get(j)))
                {
                    rep++;
                }
            }
            if (maxRep < rep)
            {
                maxRep = rep;
                pos = i;
                repMax = false;
            }
            else if (rep == maxRep)
            {
                repMax = true;
            }
        }

        if (maxRep == 1 || repMax)
        {
            return null;
        }
        else
        {
            return l.get(pos);
        }
    }
    public static int puntuacionesTrampolin (List<Integer> l) // Opción 18
    {
            int i, j, nota;
            Integer max, min;
            for (i = 0; i < 2; i++)
            {
                max = l.get(0);
                min = l.get(0);
                for (j = 0; j < l.size(); j++)
                {
                    if (l.get(j) < min)
                    {
                        min = l.get(j);
                    }
                    if (l.get(j) > max)
                    {
                        max = l.get(j);
                    }
                }
                l.remove(max);
                l.remove(min);
            }
            nota = l.get(0) + l.get(1) + l.get(2);
            return nota;
    }
    public static List<Integer> ordenaRepetidos (List<Integer> l) // Opción 19
    {
        List<Integer> rep = new LinkedList<>();
        int i, j, k, numRep;
        Integer moda;
        for (i = 0; i < l.size(); i++)
        {
            moda = modaLista(l);
            numRep = 0;
            for (j = 0; j < l.size(); j++)
            {
                if (l.get(j).equals(moda))
                {
                    numRep++;
                }
            }
            for (k = 0; k < numRep; k++)
            {
                rep.add(moda);
                l.remove(moda);
            }
        }
        for (i = 0; i < l.size(); i++)
        {
            rep.add(l.get(i));
        }
        return rep;
    }
    public static List<Integer> elementosUnicos (List<Integer> l) // Opción 20
    {
        List<Integer> noRep = new LinkedList<>();
        int i, j, rep;

        for (i = 0; i < l.size(); i++) {
            rep = 0;
            for (j = 0; j < l.size(); j++) {
                if (l.get(i).equals(l.get(j))) {
                    rep++;
                }
            }
            if (rep == 1) {
                noRep.add(l.get(i));
            }
        }

        return noRep;
    }
    public static List<Integer> elementosRepetidos (List<Integer> l) // Opción 20
    {
        List<Integer> copia = new LinkedList<>(l);
        List<Integer> rep = new LinkedList<>();
        int i, j, numRep;
        Integer num;

        for (i = 0; i < copia.size(); i++) {
            numRep = 0;
            num = copia.get(i);
            for (j = 0; j < copia.size(); j++) {
                if (copia.get(i).equals(copia.get(j))) {
                    numRep++;
                }
            }
            if (numRep > 1) {
                rep.add(copia.get(i));
            }
            for (j = 0; j < numRep; j++)
            {
                copia.remove(num);
            }
        }

        return rep;
    }
    public static List<Integer> listaDominosDobles (List<Integer> l) // Opción 21
    {
        List<Integer> dobles = new LinkedList<>();
        int i, j;
        boolean invalido = false;

        if (l.size() < 2 || l.size() % 2 != 0) // Comprobación
        {
            invalido = true;
        }
        else
        {
            for (i = 0; i < l.size(); i++)
            {
                if (l.get(i) > 6 || l.get(i) < 0)
                {
                    invalido = true;
                    i = l.size();
                }
            }
        }

        if (!invalido)
        {
            j = 1;
            for (i = 0; i < l.size(); i += 2)
            {
                if (l.get(i).equals(l.get(j)))
                {
                    dobles.add(1);
                }
                else
                {
                    dobles.add(0);
                }
                j += 2;
            }
            dobles.sort(Collections.reverseOrder());
        }

        if (invalido)
        {
            return null;
        }
        else
        {
            return dobles;
        }
    }
    public static List<String> palabrasMismaLetra (String s) // Opción 22
    {
        s = quitaEspaciosSobrantes(s);
        s = quitaAcentos(s);
        s = quitaCaracteres(s);
        s = s.toLowerCase();

        List<String> palabras = new LinkedList<>();
        String[] plb = s.split(" ");
        String p;
        int i;

        for (i = 0; i < plb.length; i++)
        {
            p = plb[i];

            if ((p.charAt(0) == p.charAt(p.length()-1)))
            {
                palabras.add(plb[i]);
            }
        }

        return palabras;
    }
    public static List<String> listaPalabrasLargas (String s, int longMin) // Opción 23
    {
        List<String> palabras = new LinkedList<>();
        String[] plb = s.split(" ");
        int i;

        for (i = 0; i < plb.length; i++)
        {
            if (plb[i].length() >= longMin)
            {
                palabras.add(plb[i]);
            }
        }

        return palabras;
    }
    public static void haceCalor (List<String> locals, List<Double> temps) // Opción 24
    {
        int i;
        double sumaTemps = 0, mediaTemps;

        for (i = 0; i < temps.size(); i++)
        {
            sumaTemps = sumaTemps + temps.get(i);
        }
        mediaTemps = sumaTemps / temps.size();

        for (i = 0; i < locals.size(); i++)
        {
            if (temps.get(i) < mediaTemps)
            {
                locals.remove(i);
                temps.remove(i);
                i--;
            }
        }
    }
}
