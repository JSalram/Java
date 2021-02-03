package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        // Definición de variable
        List<Integer> l;

        // Creamos la lista
        l = new ArrayList<>(); // Más rápida para recorrer la lista (con un for)
        l = new LinkedList<>(); // Más rápida para añadir o insertar elementos

        // Añadir elementos a una lista

        l.add(1);
        l.add(2);
        l.add(3);

        int i;
        for (i = 4; i <= 6; i++)
        {
            l.add(i);
        }

        // Sumarle 1 a cada posición

        //int valor;
        for (i = 0; i < l.size(); i++)
        {
            // valor = l.get(i);
            // l.set(i, valor+1);
            l.set(i, l.get(i)+1); // l[i]++;
        }

        // Escribir todos los elementos de una lista e irlos borrando

        escribeBorraLista(l);
        System.out.println(l.size());

        // Más funciones de listas
//         INSERTAR
        l.add(5); // Añade un elemento al final
        //l.add(0, 5); // Añade un elemento al principio
        //l.add(3, 5); // Añade el 5 en la posición 3
                                   // Peta si la posición no existe

//         BORRAR POR POSICION
        //l.remove(0); // Borra el primer elemento
        //l.remove(l.size()-1); // Borra el último elemento

//         BORRAR POR ELEMENTO
        Integer ele = 5;
        //l.remove(ele); // Borra el elemento '5'
                       // Además, devuelve true si está y false si no
        //l.remove(Integer.valueOf(ele)); // Otra manera de hacerlo

//         CONTAINS
        //l.contains(5); // Igual que el de cadenas

//         INDEXOF
        //l.indexOf(5); // Igual que el de cadenas

//         SUBLIST
        //l.subList(0, 5); // Igual que subString

//        ADDALL -> Añade muchos datos a una lista
        List<Integer> l2 = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> l3 = new LinkedList<>(Arrays.asList(11, 12, 13));
        l2.addAll(l3); // Mete toda la lista 13 en la lista 12
        System.out.println(l2);
        // addAll(posicion, lista) -> Se introduce toda una lista en una posicion

//         CLEAR
        //l.clear(); // Deja vacía la lista

//         ISEMPTY
        //if (l.isEmpty()) // Te dice si esta vacía // Luis usa (l.size() > 0)

        // RESTO DE FUNCIONES CHULAS ESTAN EN COLLECTIONS
        System.out.println("min = " + Collections.min(l2));
        System.out.println("max = " + Collections.max(l2));
        Collections.reverse(l2);
        System.out.println("al reves = " + l2);
        Collections.sort(l2);
        System.out.println("ordenada = " + l2);
        Collections.shuffle(l2);
        System.out.println("desordenada = " + l2);

    }
    public static void escribeBorraLista (List<Integer> l)
    {
        while(l.size() > 0)
        {
            System.out.println(l.get(0));
            l.remove(0);
        }
    }
}
