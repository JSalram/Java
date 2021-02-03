package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i;

        for (i = 1; i <= 20; i++)
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
            case 1: // escribeArray3x3
            {
                int[][] a = {{1, 2, 3}, {4, -5, 6}, {7, 8, 9}};
                escribeArray3x3(a);
            }
                break;
            case 2: // rellena3x3
            {
                int[][] a = new int[3][3];
                rellena3x3(a);
                escribeArray3x3(a);
            }
                break;
            case 3: // rellenaAleatorio3x3
            {
                int[][] a = new int[3][3];
                rellenaAleatorio3x3(a);
                escribeArray3x3(a);
            }
                break;
            case 4: // sumaArray3x3
            {
                int[][] a = new int[3][3];
                rellenaScan(a);
                escribeArray3x3(a);
                System.out.println();
                System.out.println("Suma de los numeros de la matriz: " + sumaArray3x3(a));

            }
                break;
            case 5: // escribeArrayBi
            {
                System.out.println("Indica el tamaño del array (_x_)");
                int[][] a = new int[sc.nextInt()][sc.nextInt()];
                rellenaScan(a);
                escribeArrayBi(a);
            }
                break;
            case 6: // rellenaAleatorio
            {
                System.out.println("Indica el tamaño del array (_x_)");
                int[][] a = new int[sc.nextInt()][sc.nextInt()];
                rellenaAleatorio(a);
                escribeArrayBi(a);
            }
                break;
            case 7: // rellenaEnOrdenBi
            {
                System.out.println("Indica el tamaño del array (_x_)");
                int[][] a = new int[sc.nextInt()][sc.nextInt()];
                rellenaEnOrdenBi(a);
                escribeArrayBi(a);
            }
                break;
            case 8: // sumaArrayBi
            {
                System.out.println("Indica el tamaño del array (_x_)");
                int[][] a = new int[sc.nextInt()][sc.nextInt()];
                rellenaAleatorio(a);
                escribeArrayBi(a);
                System.out.println();
                System.out.print("Suma de los numeros de la matriz: " + sumaArrayBi(a));
            }
                break;
            case 9: // suma2ArraysBi
            {
                System.out.println("Indica el tamaño del array (_x_)");
                int tam1 = sc.nextInt(), tam2 = sc.nextInt();

                int[][] a = new int[tam1][tam2];
                rellenaAleatorio(a);
                System.out.println("Array A:");
                escribeArrayBi(a);
                int[][] b = new int[tam1][tam2];
                rellenaAleatorio(b);
                System.out.println("Array B:");
                escribeArrayBi(b);
                int[][] c = suma2ArraysBi(a, b);
                System.out.println();

                System.out.println("Suma Array A + B:");
                escribeArrayBi(c);

            }
                break;
            case 10: // copiaArrayBi
            {
                System.out.println("Indica el tamaño del array (_x_)");
                int tam1 = sc.nextInt(), tam2 = sc.nextInt();

                int[][] a = new int[tam1][tam2];
                rellenaAleatorio(a);
                System.out.println("Array A:");
                escribeArrayBi(a);
                int[][] b = new int[tam1][tam2];
                System.out.println();

                copiaArrayBi(a, b);
                System.out.println("Array B:");
                escribeArrayBi(b);
            }
                break;
            case 11: // copiaArrayBiPro
            {
                System.out.println("Indica el tamaño del array (_x_)");
                int tam1 = sc.nextInt(), tam2 = sc.nextInt();

                int[][] a = new int[tam1][tam2];
                rellenaAleatorio(a);
                System.out.println("Array A:");
                escribeArrayBi(a);
                System.out.println();

                int[][] b = copiaArrayBiPro(a);
                System.out.println("Array B:");
                escribeArrayBi(b);
            }
                break;
            case 12: // rellenaArrayAjedrez
            {
                int[][] a = new int[8][8];
                rellenaArrayAjedrez(a);
                escribeArrayBi(a);
            }
                break;
            case 13: // rellenaDiagonal
            {
                System.out.println("Indica el tamaño del array (_x_)");
                int tam = sc.nextInt();
                int[][] a = new int[tam][tam];

                rellenaDiagonal(a);
                escribeArrayBi(a);
            }
                break;
            case 14: // rellenaX
            {
                System.out.println("Indica el tamaño del array (_x_)");
                int tam = sc.nextInt();
                int[][] a = new int[tam][tam];

                rellenaX(a);
                escribeArrayBi(a);
            }
                break;
            case 15: // rellenaCuadros
            {
                System.out.println("Indica el tamaño del array (n·n)");
                int tam = sc.nextInt();
                int[][] a = new int[tam][tam];

                rellenaCuadros(a);
                escribeArrayBi(a);
            }
                break;
            case 16: // invierteBi
            {
                System.out.println("Indica el tamaño del array (n·n)");
                int tam = sc.nextInt();
                int[][] a = new int[tam][tam];
                rellenaAleatorio(a);

                System.out.println("Array:");
                escribeArrayBi(a);
                System.out.println();
                System.out.println("Array invertido");
                invierteBi(a);
                escribeArrayBi(a);
            }
                break;
            case 17: // calculaDeterminante
            {
                int[][] a = new int[3][3];
                rellenaAleatorio(a);

                System.out.println("Matriz:");
                escribeArray3x3(a);
                System.out.println();

                System.out.println("Determinante = " + calculaDeterminante(a));
            }
                break;
            case 18: // cuadradoMagico
            {
                int[][] a = new int[3][3];
                System.out.println("Indica los valores de la matriz (de izq a der) y te digo si es un cuadrado mágico:");
                rellenaScan(a);
                System.out.println();

                escribeArrayBi(a);
                System.out.println();

                if (cuadradoMagico(a))
                {
                    System.out.println("Es un cuadrado mágico");
                }
                else
                {
                    System.out.println("NO es un cuadrado mágico");
                }
            }
                break;
            case 19: // compruebaSudoku
            {
                int[][] a = {{5,3,4,6,7,8,9,1,2},
                            {6,7,2,1,9,5,3,4,8},
                            {1,9,8,3,4,2,5,6,7},
                            {8,5,9,7,6,1,4,2,3},
                            {4,2,6,8,5,3,7,9,1},
                            {7,1,3,9,2,4,8,5,6},
                            {9,6,1,5,3,7,2,8,4},
                            {2,8,7,4,1,9,6,3,5},
                            {3,4,5,2,8,6,1,7,9}};
                escribeArrayBi(a);
                System.out.println();
                if (compruebaSudoku(a))
                {
                    System.out.println("Es correcto");
                }
                else
                {
                    System.out.println("Es incorrecto");
                }
            }
                break;
            case 20: // hundirFlota
            {
                hundirFlota();
            }
                break;
            default:
                System.out.println("------------FATAL-ERROR------------");
        }
    }
    public static void rellenaScan(int[][] a) // Rellena Array 'Scanner'
    {
        Scanner sc = new Scanner(System.in);
        int i, j;

        System.out.println("Indica los valores del array");
        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a[i].length; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
    }
    public static void escribeArray3x3 (int[][] a) // Opción 1
    {
        int i, j, numCifra, cifraMax = 0;
        int[][] cifras = new int[3][3];

        for (i = 0; i < a.length; i++) // CUENTACIFRAS[][]
        {
            for (j = 0; j < a[i].length; j++)
            {
                numCifra = String.valueOf(a[i][j]).length();
                cifras[i][j] = numCifra;
                if (numCifra > cifraMax)
                {
                    cifraMax = numCifra;
                }
            }
        }

        for (i = 0; i < a.length; i++) // ESCRIBECIFRAS
        {
            if (i == 0)
            {
                System.out.print("┌");
            }
            else if (i != a.length - 1)
            {
                System.out.print("│");
            }
            else
            {
                System.out.print("└");
            }
            for (j = 0; j < a[i].length; j++)
            {
                if (j == 0)
                {
                    System.out.print(" ");
                }
                while (cifraMax > cifras[i][j])
                {
                    System.out.print(" ");
                    cifras[i][j]++;
                }
                System.out.print(a[i][j] + " ");
            }
            if (i == 0)
            {
                System.out.println("┐");
            }
            else if (i != a.length - 1)
            {
                System.out.println("│");
            }
            else
            {
                System.out.println("┘");
            }
        }
    }
    public static void rellena3x3 (int[][] a) // Opción 2
    {
        int i, j, n = 1;
        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a[i].length; j++)
            {
                a[i][j] = n;
                n++;
            }
        }
    }
    public static void rellenaAleatorio3x3 (int[][] a) // Opción 3
    {
        Random r = new Random();
        int i, j;

        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a[i].length; j++)
            {
                a[i][j] = r.nextInt(100);
            }
        }
    }
    public static int sumaArray3x3 (int[][] a) // Opción 4
    {
        int i, j, suma = 0;

        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a[i].length; j++)
            {
                suma = suma + a[i][j];
            }
        }

        return suma;
    }
    public static void escribeArrayBi (int[][] a) // Opción 5
    {
        int i, j, numCifra, cifraMax = 0;
        int[][] cifras = new int[a.length][a[0].length];

        for (i = 0; i < a.length; i++) // CUENTACIFRAS[][]
        {
            for (j = 0; j < a[i].length; j++)
            {
                numCifra = String.valueOf(a[i][j]).length();
                cifras[i][j] = numCifra;
                if (numCifra > cifraMax)
                {
                    cifraMax = numCifra;
                }
            }
        }

        for (i = 0; i < a.length; i++) // ESCRIBECIFRAS
        {
            if (i == 0)
            {
                System.out.print("┌");
            }
            else if (i != a.length - 1)
            {
                System.out.print("│");
            }
            else
            {
                System.out.print("└");
            }
            for (j = 0; j < a[i].length; j++)
            {
                if (j == 0)
                {
                    System.out.print(" ");
                }
                while (cifraMax > cifras[i][j])
                {
                    System.out.print(" ");
                    cifras[i][j]++;
                }
                System.out.print(a[i][j] + " ");
            }
            if (i == 0)
            {
                System.out.println("┐");
            }
            else if (i != a.length - 1)
            {
                System.out.println("│");
            }
            else
            {
                System.out.println("┘");
            }
        }
    }
    public static void rellenaAleatorio (int[][] a) // Opción 6
    {
        Random r = new Random();
        int i, j;

        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a[i].length; j++)
            {
                a[i][j] = r.nextInt(100);
            }
        }
    }
    public static void rellenaEnOrdenBi (int[][] a) // Opción 7
    {
        int i, j, n = 1;
        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a[i].length; j++)
            {
                a[i][j] = n;
                n++;
            }
        }
    }
    public static int sumaArrayBi (int[][] a) // Opción 8
    {
        int i, j, suma = 0;

        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a[i].length; j++)
            {
                suma = suma + a[i][j];
            }
        }

        return suma;
    }
    public static int[][] suma2ArraysBi (int[][] a, int[][] b) // Opción 9
    {
        int[][] c = new int[a.length][a[0].length];
        int i, j;

        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a[i].length; j++)
            {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        return c;
    }
    public static void copiaArrayBi (int[][] a, int[][] b) // Opción 10
    {
        int i, j;

        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a[i].length; j++)
            {
                b[i][j] = a[i][j];
            }
        }
    }
    public static int[][] copiaArrayBiPro (int[][] a) // Opción 11
    {
        int[][] copia = new int[a.length][a[0].length];
        int i, j;

        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a[i].length; j++)
            {
                copia[i][j] = a[i][j];
            }
        }

        return copia;
    }
    public static void rellenaArrayAjedrez (int[][] a) // Opción 12
    {
        int i, j;

        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a[i].length; j++)
            {
                if (i % 2 == 0)
                {
                    if (j % 2 == 0)
                    {
                        a[i][j] = 1;
                    }
                    else
                    {
                        a[i][j] = 0;
                    }
                }
                else
                {
                    if (j % 2 == 0)
                    {
                        a[i][j] = 0;
                    }
                    else
                    {
                        a[i][j] = 1;
                    }
                }
            }
        }
    }
    public static void rellenaDiagonal (int[][] a) // Opción 13
    {
        int i, j, pos1 = 0;

        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a[i].length; j++)
            {
                if (j == pos1)
                {
                    a[i][j] = 1;
                }
                else if (j < pos1)
                {
                    a[i][j] = 2;
                }
                else
                {
                    a[i][j] = 3;
                }
            }
            pos1++;
        }

    }
    public static void rellenaX (int[][] a) // Opción 14
    {
        int pos1 = 0, pos2 = a[0].length-1;
        int i, j;

        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a[i].length; j++)
            {
                if (j == pos1 || j == pos2)
                {
                    a[i][j] = 0;
                }
                else
                {
                    a[i][j] = 1;
                }
            }
            pos1++; pos2--;
        }
    }
    public static void rellenaCuadros (int[][] a) // Opción 15
    {
        int i, j;

        if (a.length % 2 == 0)
        {
            for (i = 0; i < a.length/2; i++)
            {
                for (j = 0; j < a[0].length/2; j++)
                {
                    a[i][j] = 1;
                }
                while (j < a[0].length)
                {
                    a[i][j] = 2;
                    j++;
                }
            }
            while (i < a.length)
            {
                for (j = 0; j < a[0].length/2; j++)
                {
                    a[i][j] = 3;
                }
                while (j < a[0].length)
                {
                    a[i][j] = 4;
                    j++;
                }
                i++;
            }
        }
        else
        {
            System.out.println("---ERROR---");
        }
    }
    public static void invierteBi (int[][] a) // Opción 16
    {
        int[][] b = copiaArrayBiPro(a);
        int i, j, k;

        if (a.length == a[0].length)
        {
            for (i = 0; i < a.length; i++)
            {
                for (j = 0; j < a[0].length; j++)
                {
                    a[j][i] = b[i][j];
                }
            }
        }
        else
        {
            System.out.println("---ERROR---");
        }
    }
    public static int calculaDeterminante (int[][] a) // Opción 17
    {
        int determinante;

        determinante = ((a[0][0] * a[1][1] * a[2][2]) +
                        (a[1][0] * a[2][1] * a[0][2]) +
                        (a[2][0] * a[0][1] * a[1][2])) -
                        ((a[2][0] * a[1][1] * a[0][2]) +
                        (a[1][0] * a[0][1] * a[2][2]) +
                        (a[0][0] * a[2][1] * a[1][2]));

        return determinante;
    }
    public static boolean cuadradoMagico (int[][] a) // Opción 18
    {
        boolean esMagico = false;
        int suma = a[0][0] + a[0][1] + a[0][2];

        if (    suma == (a[1][0] + a[1][1] + a[1][2]) &&
                suma == (a[2][0] + a[2][1] + a[2][2]) &&
                suma == (a[0][0] + a[1][0] + a[2][0]) &&
                suma == (a[0][1] + a[1][1] + a[2][1]) &&
                suma == (a[0][2] + a[1][2] + a[2][2]) &&
                suma == (a[0][0] + a[1][1] + a[2][2]) &&
                suma == (a[2][0] + a[1][1] + a[0][2]))
        {
            esMagico = true;
        }

        return esMagico;
    }
    public static boolean compruebaSudoku (int[][] a) // Opción 19
    {
        List<Integer> l = new LinkedList<>();
        boolean correcto = true;
        int i, j, k, p, lim;

        for (i = 0; i < a.length; i++) // Comprueba filas y columnas
        {
            lim = 9;
            for (j = 0; j < 9; j++)
            {
                for (k = j+1; k < lim; k++)
                {
                    if (a[i][j] == a[i][k])
                    {
                        correcto = false;
                    }
                }
                for (k = i+1; k < lim; k++)
                {
                    if (a[i][j] == a[k][j])
                    {
                        correcto = false;
                    }
                }
                lim--;
            }
        }

        i = 0; j = 0;
        for (k = 0; k < 3; k++) // Comprueba cada cuadrado
        {
            j = 0;
            for (p = 0; p < 3; p++)
            {
                if (!(a[i][j] != a[i][j+1] &&
                    a[i][j+1] != a[i][j+2] &&
                    a[i][j+2] != a[i+1][j] &&
                    a[i+1][j] != a[i+1][j+1] &&
                    a[i+1][j+1] != a[i+1][j+2] &&
                    a[i+1][j+2] != a[i+2][j] &&
                    a[i+2][j] != a[i+2][j+1] &&
                    a[i+2][j+1] != a[i+2][j+2]))
                {
                    correcto = false;
                }
                j += 3;
            }
            i += 3;
        }

        return correcto;
    }
    public static void hundirFlota () // Opción 20
    {
        Scanner sc = new Scanner(System.in);
        boolean finished = false;
        int i, j, fila;
        String column, AH = "ABCDEFGH";
        int[][] tablero =  {{0,0,1,0,1,1,0,0},
                            {0,0,0,0,0,0,0,0},
                            {1,0,1,0,0,0,1,1},
                            {1,0,1,0,0,0,0,0},
                            {1,0,1,0,0,0,0,0},
                            {0,0,0,0,1,1,1,1},
                            {1,1,0,0,0,0,0,0},
                            {0,0,1,1,1,0,0,0}};

        while (!finished)
        {
            System.out.println("Dime las coordenadas que quieres bombardear (_x_)");
            System.out.print("Fila (1-8): ");
            fila = sc.nextInt()-1;
            System.out.print("Columna (A-H): ");
            column = sc.next();
            System.out.println();

            while (fila > 7 || fila < 0 || !AH.contains(column))
            {
                System.out.println("Coordenadas incorrectas. Vuelve a introducirlas:");
                System.out.print("Fila (1-8): ");
                fila = sc.nextInt()-1;
                System.out.print("Columna (A-H): ");
                column = sc.next();
                System.out.println();
            }
            int columnNum = AH.indexOf(column);

            if (tablero[fila][columnNum] == 0)
            {
                System.out.println("¡AGUA!");
                tablero[fila][columnNum] += 100;
            }
            else if (tablero[fila][columnNum] == 1)
            {
                System.out.println("¡¡¡BARCO TOCADO!!!");
                tablero[fila][columnNum] += 100;
            }
            else if (tablero[fila][columnNum] == 100)
            {
                System.out.println("¡Agua ya bombardeada!");
            }
            else
            {
                System.out.println("¡Barco ya bombardeado!");
            }

            for (i = 0; i < tablero.length; i++) // Finaliza la partida
            {
                for (j = 0; j < tablero[0].length; j++)
                {
                    if (tablero[i][j] != 1)
                    {
                        finished = true;
                    }
                    else
                    {
                        finished = false;
                        i = tablero.length;
                        j = tablero[0].length;
                    }
                }
            }
        }

        System.out.println();
        System.out.println("¡ENHORABUENA! ¡Has destruido todos los barcos!");
    }
}
