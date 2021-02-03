package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        // 1er Ejercicio: cuentaNumeros

        System.out.println();
        Scanner sc = new Scanner(System.in);
        int n, numPos, numNeg, numPar, numImpar, i = 0;
        n = 1;
        numPos = 0;
        numNeg = 0;
        numPar = 0;
        numImpar = 0;

        System.out.println("Indica varios números y te digo cuántos son positivos, negativos, pares e impares");
        System.out.println("(Escribe 0 para terminar de escribir números)");
        while (n != 0){
            i++;
            System.out.print("Solicito nº" + i + ": ");
            n = sc.nextInt();
            if (n > 0)
            {
                numPos++;
            }
            if (n < 0)
            {
                numNeg--;
            }
            if (n % 2 == 0 && n != 0)
            {
                numPar++;
            }
            if (n % 2 != 0)
            {
                numImpar++;
            }
        }
        System.out.println();
        System.out.println("Números positivos: " + numPos);
        System.out.println("Números negativos: " + numNeg);
        System.out.println("Números pares: " + numPar);
        System.out.println("Números impares: " + numImpar);

        System.out.println();

        // 2º Ejercicio: descuento y precioFinal
        double compra;
        System.out.println("Dime el precio del producto que vas a comprar y te digo el descuento que tiene");
        System.out.print("Precio: ");
        compra = sc.nextDouble();
        if (compra > 0) {
            System.out.println("El descuento es del " + descuento(compra) + "%");
            System.out.println("Por lo que el precio final será de: " + precioFinal(compra) + "€");
        }
        else
        {
            System.out.println("Precio erróneo");
        }

        System.out.println();

        //  3er Ejercicio: seriesParesImpares
        int a, b;
        System.out.println("Dime dos números y te digo los pares/impares entre ellos");
        System.out.print("Número A: ");
        a = sc.nextInt();
        System.out.print("Número B: ");
        b = sc.nextInt();
        seriesParesImpares(a, b);

        System.out.println();

        // 4º Ejercicio: trapecioAsteriscos
        int long1, long2;
        System.out.println("Dime un número para la base superior y otro para la inferior y te dibujo un rombo");
        System.out.print("Base superior: ");
        long1 = sc.nextInt();
        System.out.print("Base inferior: ");
        long2 = sc.nextInt();

        if (long1 > 0 && long2 > 0 && long2 > long1)
        {
            trapecioAsteriscos(long1, long2);
        }
        else
        {
            System.out.println("------   ERROR   ------");
        }

        System.out.println();

        // Ejercicio Extra: arbolNavidad
        int ancho;
        System.out.print("Dime el ancho que quieres que tengan las hojas de tu arbol de navidad: ");
        ancho = sc.nextInt();
        arbolNavidad(ancho);
    }

    // 2º Ejercicio: descuento y precioFinal
    public static double descuento (double compra)
    {
        double desc = 0;
        if (compra < 100 && compra >= 0)
        {
            desc = 7.5;
        }
        else if (compra >= 100 && compra < 300)
        {
            desc = 10.0;
        }
        else if (compra >= 300 && compra < 500)
        {
            desc = 12.5;
        }
        else if (compra >= 500)
        {
            desc = 15.0;
        }
        return desc;
    }
    public static double precioFinal (double compra)
    {
        double descuento = compra * (descuento(compra)/100);
        double precio = compra - descuento;
        return precio;
    }

    // 3er Ejercicio: seriesParesImpares
    public static void seriesParesImpares (int a, int b)
    {
        int i;
        if (a > b) {
            for (i = a; i >= b; i -= 2) {
                System.out.println(i);
            }
        }
        else
        {
            for (i = a; i <= b; i+=2)
            {
                System.out.println(i);
            }
        }
    }

    // 4º Ejercicio: trapecioAsteriscos
    public static void trapecioAsteriscos (int long1, int long2)
    {
        int nivel, ancho = long1, a, altura = 1;
        if ((long1 % 2 == 0 && long2 % 2 == 0) || (long1 % 2 != 0 && long2 % 2 != 0))
        {
            for (a = long1; a <= long2; a +=2)
            {
                altura++;
            }
            for (nivel = 1; nivel < altura; nivel++)
            {
                    repiteEspacios(long2 - nivel);
                        repiteEstrellas(ancho);
                        System.out.println();
                    ancho+=2;
            }
        }
        else
        {
            System.out.println("ERROR. Ambos números tienen que ser pares/impares");
        }
    }
    public static void trapecioAsteriscos2 (int long1, int long2)
    {
        int nivel, ancho = long1, a, altura = 1;
        for (a = long1; a <= long2; a +=2)
        {
            altura++;
        }
            for (nivel = 1; nivel < altura; nivel++)
            {
                repiteEspacios(long2 - nivel);
                repiteEstrellas(ancho);
                System.out.println();
                ancho += 2;
            }
        }
    public static void repiteEstrellas (int n)
    {
        int i;
        for (i = 0; i < n; i++)
        {
            System.out.print("*");
        }
    }
    public static void repiteEspacios (int n)
    {
        int i;
        for (i = 0; i < n; i++)
        {
            System.out.print(" ");
        }
    }

    // Ejercicio Extra: arbolNavidad
    public static void arbolNavidad (int ancho)
    {
        trapecioAsteriscos2(1, ancho);

    }
}
