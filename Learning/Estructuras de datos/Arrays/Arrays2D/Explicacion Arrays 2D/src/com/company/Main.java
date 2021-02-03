package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Definición de Array 2D

        int[][] array = new int[2][3];

        array[0][0] = 5;
        array[0][1] = 7;
        array[0][2] = 9;
        array[1][0] = -5;
        array[1][1] = -7;
        array[1][2] = -9;

        System.out.println(Arrays.toString(array[0]));
        System.out.println(Arrays.toString(array[1]));
        System.out.println();

        // Recorriendo un array bidimensional

        int i, j;

        for (i = 0; i < 2; i++) // Recorremos las filas
        {
            for (j = 0; j < 3; j++) // Recorremos las columnas
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Positivos: " + cuentaPositivos(array));

        // Inicializando el array con valores

        int[][] b = {{1, 2, 3}, {4, 5, 6}}; // Dos filas y tres columnas //TODO: MEJOR
        int[][] c = {{1, 2}, {3, 4}, {5, 6}}; // Tres filas y dos columnas

        int[][] d = {{1, 2, 3}, {4, 5}}; // TODO:NO!!!!!!

        String[][] s = {{"tomate", "pepino"}, {"hola", "mundo"}}; // Array de Strings

        // EscribeArray
        // [  5,  7,  9 ]
        // [ -5, -7, -9 ]
    }

    public static int cuentaPositivos (int[][] a)
    {
        int cont = 0, i, j;

        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a[i].length; j++)
            {
                if (a[i][j] > 0)
                {
                    cont++;
                }
            }
        }
        return cont;
    }

}
