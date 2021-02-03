package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println();
        System.out.println("Menú:");
        System.out.print("1. intercambiaParImpar");
        System.out.println("                                       " + "2. compruebaTarjeta");
        System.out.print("3. tailArray");
        System.out.println("                                                 " + "4. detecta5");
        System.out.print("5. calculaNPrimos");
        System.out.println("                                            " + "6. EscribeArrayNotas");
        System.out.print("7. tachaElementosNoComunes");
        System.out.println("                                   " + "8. eliminaRepetidos");
        System.out.print("9. redondeaArray y decimalesArray");
        System.out.println("                            " + "10. desordenaArray");
        System.out.print("11. minMaxArray");
        System.out.println("                                              " + "12. graficaBarras");
        System.out.print("13. mejorRacha");
        System.out.println("                                               " + "14. numerosPrimosPro");
        System.out.print("15. sucesionFibonacci");
        System.out.println("                                        " + "16. seriesMundiales");
        System.out.println();
        System.out.print("Elige una opción: ");
        opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                System.out.print("Indica el tamaño del array (debe ser par): ");
                int[] a = new int[sc.nextInt()];
                leeArray(a);
                System.out.print("El array sin ejecutar es: ");
                escribeArray(a);
                intercambiaParImpar(a);
                System.out.print("El array ejecutado es: ");
                escribeArray(a);
            }
                break;
            case 2:
            {
                int[] a = new int[16];
                System.out.print("Tarjeta Bancaria - ");
                leeArray(a);
                if (compruebaTarjeta(a))
                {
                    System.out.print("La tarjeta es válida");
                }
                else
                {
                    System.out.print("La tarjeta NO es válida");
                }
            }
                break;
            case 3:
            {
                System.out.print("Indica el tamaño del array: ");
                int[] a = new int[sc.nextInt()];
                leeArray(a);
                System.out.print("Indica los últimos dígitos que quieras conocer: ");
                int n = sc.nextInt();
                System.out.print("Los últimos dígitos son: ");
                escribeArray(tailArray(a, n));
            }
                break;
            case 4:
            {
                System.out.print("Indica el tamaño del array: ");
                int[] a = new int[sc.nextInt()];
                leeArray(a);
                System.out.print("Se repite un número al menos 5 veces: " + detecta5(a));
            }
                break;
            case 5:
            {
                System.out.print("Indica el número máximo hasta el cual quieres saber cuántos primos hay: ");
                int num = sc.nextInt();
                System.out.println("El array de nºs primos quedará así:");
                escribeArrayBoolean(calculaNPrimos(num));
            }
                break;
            case 6:
            {
                System.out.print("Indica el tamaño del array de notas: ");
                double[] a = new double[sc.nextInt()];
                System.out.print("NOTAS - ");
                leeArrayDouble(a);
                System.out.println("Las notas coloreadas quedarían así:");
                escribeArrayNotas(a);
            }
                break;
            case 7:
            {
                System.out.print("Indica el tamaño del primer array: ");
                int[] a = new int[sc.nextInt()];
                System.out.print("Indica el tamaño del segundo array: ");
                int[] b = new int[sc.nextInt()];
                System.out.print("Array A - ");
                leeArray(a);
                System.out.print("Array B - ");
                leeArray(b);
                tachaElementosNoComunes(a, b);
                System.out.println("El primer array quedaría así:");
                escribeArray(a);
                System.out.println("El segundo array quedaría así:");
                escribeArray(b);
            }
                break;
            case 8:
            {
                System.out.print("Indica el tamaño del array al que le quieres eliminar los nºs repetidos: ");
                int[] a = new int[sc.nextInt()];
                leeArray(a);
                System.out.println("El array con los repetidos eliminados queda así:");
                escribeArray(eliminaRepetidos(a));
            }
                break;
            case 9:
            {
                System.out.println("Indica el tamaño del array");
                double[] a = new double[sc.nextInt()];
                leeArrayDouble(a);
                System.out.println("Al quitarle los decimales quedaría así:");
                escribeArrayDouble(redondeaArray(a));
                System.out.println("Al quitarle la parte entera quedaría así:");
                escribeArrayDouble(decimalesArray(a));
            }
                break;
            case 10:
            {
                System.out.println("Indica el tamaño del array");
                int[] a = new int[sc.nextInt()];
                leeArray(a);
                System.out.println("El array desordenado quedaría así:");
                escribeArray(desordenaArray(a));
            }
                break;
            case 11:
            {
                System.out.println("Indica el tamaño del array");
                int[] a = new int[sc.nextInt()];
                leeArray(a);
                System.out.println("Conociendo los números máximo y mínimo, el array del rango entre ellos es:");
                escribeArray(minMaxArray(a));
            }
                break;
            case 12:
            {
                System.out.println("Indica el tamaño del array");
                int[] a = new int[sc.nextInt()];
                leeArray(a);
                System.out.println();
                System.out.println("   GRÁFICA");
                System.out.println("\u001B[31m" + "=============");
                graficaBarras(a);
            }
                break;
            case 13:
            {
                System.out.println("Dime un array que contenga los resultados de los partidos:");
                System.out.print("Tamaño del array: ");
                int[] arrayPartidos = new int[sc.nextInt()];
                System.out.println("Resultados: ");
                leeArray(arrayPartidos);
                int mejor = mejorRacha(arrayPartidos);
                if (mejor == -1)
                {
                    System.out.println("Tamaño erróneo");
                }
                else
                {
                    System.out.println("Mejor racha de victorias: " + mejor);
                }
            }
                break;
            case 14:
            {
                numerosPrimosPro(1000);
            }
                break;
            case 15:
            {
                System.out.println("Indica el tamaño del array: ");
                int[] a = new int[sc.nextInt()];
                escribeArray(sucesionFibonacci(a));
            }
                break;
            case 16:
            {
                int[] series = {2, 8, 3, 2, 16, 9, 11, 5};
                String ganador = seriesMundiales("Boston Red Sox", "Los Angeles Dodgers", series);
                System.out.println(ganador);
            }
                break;
            default:
                System.out.println("-----OPCIÓN INVÁLIDA-----");
        }
    }
    public static int[] borraDeArray (int[] a, int pos)
    {
        int[] b = new int[a.length-1];
        int i, j = 0;
        for (i = 0; j < b.length; i++)
        {
            if (i == pos)
            {
                i++;
            }
            b[j] = a[i];
            j++;
        }

        return b;
    }
    public static int[] copiaArrayPro (int[] a)
    {
        int[] b = new int[a.length];
        int i;
        for (i = 0; i < a.length; i++)
        {
            b[i] = a[i];
        }
        return b;
    }
    public static double[] copiaArrayProDouble (double[] a)
    {
        double[] b = new double[a.length];
        int i;
        for (i = 0; i < a.length; i++)
        {
            b[i] = a[i];
        }
        return b;
    }
    public static void escribeArrayBoolean(boolean[] a)
    {
        int i;
        System.out.print("[");
        for (i = 1; i < a.length; i++) {
            System.out.print(a[i - 1] + ", ");
        }
        System.out.println(a[i - 1] + "]");
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
    public static void leeArrayDouble(double[] a)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Indica los valores del array:");
        for (i = 0; i < a.length; i++)
        {
            a[i] = sc.nextDouble();
        }
    }
    public static void escribeArray(int[] a)
    {
        int i;
        System.out.print("[");
        for (i = 1; i < a.length; i++) {
            System.out.print(a[i - 1] + ", ");
        }
        System.out.println(a[i - 1] + "]");
    }
    public static void escribeArrayDouble(double[] a)
    {
        int i;
        System.out.print("[");
        for (i = 1; i < a.length; i++) {
            System.out.print(a[i - 1] + ", ");
        }
        System.out.println(a[i - 1] + "]");
    }
    public static void intercambiaParImpar (int[] a)
    {
        int i, j = 1, temp;
        if (a.length % 2 == 0)
        {
            for (i = 0; i < a.length; i += 2)
            {
                if ((a[i] % 2 == 1 && a[j] % 2 == 0) || (a[i] % 2 == 0 && a[j] % 2 == 0) || (a[i] % 2 == 1 && a[j] % 2 == 1))
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                j += 2;
            }
        }
        else
        {
            System.out.println("El tamaño del array no es par, por tanto:");
        }
    }
    public static boolean compruebaTarjeta (int[] a)
    {
        boolean tarjeta = true;
        int i, mult, suma = 0;
        for (i = 0; i < a.length; i+=2)
        {
            mult = a[i] * 2;
            if (mult >= 10)
            {
                mult -= 9;
            }
            a[i] = mult;
        }
        for (i = 0; i < a.length; i++)
        {
            suma = suma + a[i];
        }
        if (suma % 10 != 0)
        {
            tarjeta = false;
        }
        return tarjeta;
    }
    public static int[] tailArray (int[] a, int n)
    {
        int[] b = new int[n];
        int i, j = 0, inic = a.length - n;
        for (i = 0; i < a.length; i++)
        {
            if (i >= inic)
            {
                b[j] = a[i];
                j++;
            }
        }
        return b;
    }
    public static boolean detecta5 (int[] a)
    {
        boolean rep5 = false;
        int i, j, num, rep = 0;
        for (i = 0; i < a.length; i++)
        {
            num = a[i];
            for (j = i; j < a.length; j++)
            {
                if (a[j] == num)
                {
                    rep++;
                }
            }
            if (rep++ == 5)
            {
                rep5 = true;
                i = a.length;
            }
        }
        return rep5;
    }
    public static boolean primo(int num)
    {
        int div = 0, i;
        boolean p = false;

        for (i = num; i >= 1; i--) {
            if (num % i == 0) {
                div++;
            }
        }
        if (div == 2) {
            p = true;
        }
        return p;
    }
    public static boolean[] calculaNPrimos (int num)
    {
        boolean[] a = new boolean[num+1];
        int i;
        for (i = 0; i <= num; i++)
        {
            if (primo(i))
            {
                a[i] = true;
            }
        }
        return a;
    }
    public static void escribeArrayNotas (double[] a)
    {
        String  ANSI_RESET = "\u001B[0m", ANSI_RED = "\u001B[31m",
                ANSI_GREEN = "\u001B[32m", ANSI_YELLOW = "\u001B[33m";

        int i;
        System.out.print("[");
        for (i = 0; i < a.length-1; i++)
        {
            if (a[i] <= 10.0 && a[i] >= 5.0)
            {
                System.out.print(ANSI_GREEN + a[i] + ANSI_RESET + ", ");
            }
            if (a[i] < 5.0 && a[i] >= 0.0)
            {
                System.out.print(ANSI_RED + a[i] + ANSI_RESET + ", ");
            }
            if (a[i] < 0.0 || a[i] > 10.0)
            {
                System.out.print(ANSI_YELLOW + "ERROR" + ANSI_RESET + ", ");
            }
        }
        if (i == a.length-1)
        {
            if (a[i] <= 10.0 && a[i] >= 5.0)
            {
                System.out.print(ANSI_GREEN + a[i] + ANSI_RESET + "]");
            }
            if (a[i] < 5.0 && a[i] >= 0.0)
            {
                System.out.print(ANSI_RED + a[i] + ANSI_RESET + "]");
            }
            if (a[i] < 0.0 || a[i] > 10.0)
            {
                System.out.print(ANSI_YELLOW + "ERROR" + ANSI_RESET + "]");
            }
        }
    }
    public static void tachaElementosNoComunes (int[] a, int[] b)
    {
        int i, k;
        boolean encontrado;
        int[] c = copiaArrayPro(a);
        for (i = 0; i < a.length; i++)
        {
            encontrado = false;
            for (k = 0; k < b.length; k++)
            {
                if (a[i] == b[k])
                {
                    encontrado = true;
                }
            }
            //if(contiene(b, a[i]))
            if(!encontrado)
            {
                a[i] = 0;
            }
        }
        for (i = 0; i < b.length; i++)
        {
            encontrado = false;
            for (k = 0; k < c.length; k++)
            {
                if (b[i] == a[k])
                {
                    encontrado = true;
                }
            }
            if (!encontrado)
            {
            b[i] = 0;
            }
        }
    }
    public static int[] eliminaRepetidos (int[] a)
    {
        int[] b = copiaArrayPro(a);
        int i, k, rep = 0;
        for (i = 0; i < b.length; i++)
        {
            for (k = (i+1); k < b.length; k++)
            {
                if (b[i] == b[k])
                {
                    rep++;
                    b = borraDeArray(b, k);
                }
            }
        }
        return b;
    }
    public static double[] redondeaArray (double[] a)
    {
        double[] b = copiaArrayProDouble(a);
        int i;
        for (i = 0; i < a.length; i++)
        {
            b[i] = (int) b[i];
        }
        return b;
    }
    public static double[] decimalesArray (double[] a)
    {
        int i;
        for (i = 0; i < a.length; i++)
        {
            a[i] = a[i] - ((int) a[i]);
        }
        return a;
    }
    public static int[] desordenaArray (int[] a)
    {
        Random r = new Random();
        int[] b = new int[a.length];
        int i, posRandom;
        for (i = 0; i < a.length; i++)
        {
            posRandom = r.nextInt(a.length);
            while (b[posRandom] != 0)
            {
                posRandom = r.nextInt(a.length);
            }
            b[posRandom] = a[i];
        }
        return b;
    }
    public static int[] minMaxArray (int[] a)
    {
        int i, max = a[0], min = a[0], sizeB = 0;
        for (i = 1; i < a.length; i++)
        {
            if (a[i] > max)
            {
                max = a[i];
            }
            if (a[i] < min)
            {
                min = a[i];
            }
        }
        for (i = min; i <= max; i++)
        {
            sizeB++;
        }
        int[] b = new int[sizeB];
        for (i = 0; i < b.length; i++)
        {
            b[i] = min;
            min++;
        }
        return b;
    }
    public static void graficaBarras (int[] a)
    {
        char c = '\u2588';
        String ANSI_BLUE = "\u001B[34m", ANSI_YELLOW = "\u001B[33m";
        int i, k, j;
        boolean pinta = true;
        for (j = 0; j < a.length; j++)
        {
            if (a[j] > 10)
            {
                pinta = false;
            }
        }
        if (pinta)
        {
            for (i = 0; i < a.length; i++)
            {
                for (k = 0; k < a[i]; k++)
                {
                    System.out.print(ANSI_BLUE + c + " ");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println( ANSI_YELLOW + "----- FATAL ERROR -----");
        }
    }
    public static int mejorRacha(int[] arrayPartidos)
    {
        int i, racha = 0, mejor = 0;

        if (arrayPartidos.length % 2 == 0)
        {
            for(i=0; i < arrayPartidos.length; i = i + 2)
            {
                if(arrayPartidos[i] > arrayPartidos[i+1])
                {
                    racha++;
                }
                else
                {
                    if(racha > mejor)
                    {
                        mejor = racha;
                    }
                    racha = 0;
                }
            }
            if(racha > mejor)
            {
                mejor = racha;
            }
        }
        else
        {
            mejor = -1;
        }

        return mejor;
    }
    public static void numerosPrimosPro(int tam)
    {
        int[] numeros = new int[tam+1];
        int i, j;

        for (i = 2; i < numeros.length; i++)
        {
            if (numeros[i] == 0)
            {
                System.out.println(i);

                for (j = i; j < numeros.length; j+=i)
                {
                    numeros[j] = -1; // NO es primo pq es múltiplo
                }
            }
        }
    }
    public static int[] sucesionFibonacci (int [] a)
    {
            if (a.length > 0)
            {
                int[] fibonacci = new int[a.length];
                int i;

                for (i = 0; i < fibonacci.length; i++)
                {
                    if (i == 0)
                    {
                        fibonacci[i] = 0;
                    }
                    else if (i == 1)
                    {
                        fibonacci[i] = 1;
                    }
                    else if (i > 1)
                    {
                        fibonacci[i] = fibonacci[i-2] + fibonacci[i-1];
                    }
                }
                return fibonacci;
            }
            else
            {
                int[] error = {0};
                System.out.println("----- ERROR -----");
                return error;
            }
    }
    public static String seriesMundiales(String local, String visitante, int[] series)
    {
        int i, victlocal = 0, victvisit = 0;
        String mensaje;
        boolean error = false;

        if(series.length % 2 == 0)
        {
            for(i = 0; i < series.length; i = i + 2)
            {
                if(series[i+1] > series[i])
                {
                    victlocal++;
                }
                else
                {
                    if(series[i] > series[i+1])
                    {
                        victvisit++;
                    }
                    else
                    {
                        error = true;
                        i = series.length; // opcional
                    }
                }
            }

            if(!error)
            {
                if(victlocal > victvisit)
                {
                    mensaje = local;
                }
                else
                {
                    if (victvisit > victlocal)
                    {
                        mensaje = visitante;
                    }
                    else
                    {
                        mensaje = "Las series mundiales no pueden terminar empatadas.";
                    }
                }
            }
            else
            {
                mensaje = "Un partido no puede acabar en empate.";
            }
        }
        else
        {
            mensaje = "El array de resultados tiene un número impar de elementos.";
        }

        return mensaje;
    }
}
