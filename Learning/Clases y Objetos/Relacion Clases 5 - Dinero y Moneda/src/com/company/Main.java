package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<String> monedas = new ArrayList<>(List.of("eur", "usd", "jpy", "gbp", "btc"));

        System.out.println("¡¡¡Bienvenido al operador de dinero!!!" + "\n");

        System.out.println("Indica el dinero inicial con la que operar");
        System.out.print("Cantidad: ");
        double cantidad = sc.nextDouble();
        sc.nextLine();
        System.out.print("Tipo de moneda (eur, usd, jpy, gbp, btc): ");
        String tipo = sc.nextLine();
        while (!monedas.contains(tipo))
        {
            System.out.print("Moneda errónea, vuelve a intentarlo: ");
            tipo = sc.nextLine();
        }
        TipoMoneda tmoneda = TipoMoneda.values()[monedas.indexOf(tipo)];
        Dinero d = new Dinero(cantidad, tmoneda);
        if (tmoneda.ordinal() != 0)
        {
            System.out.println("Equivale a " + d.convierteEn(TipoMoneda.euro).toString());
        }
        System.out.println();

        System.out.println("Indica el segundo dinero con la que operar");
        System.out.print("Cantidad: ");
        cantidad = sc.nextDouble();
        sc.nextLine();
        System.out.print("Tipo de moneda (eur, usd, jpy, gbp, btc): ");
        tipo = sc.nextLine();
        while (!monedas.contains(tipo))
        {
            System.out.print("Moneda errónea, vuelve a intentarlo: ");
            tipo = sc.nextLine();
        }
        tmoneda = TipoMoneda.values()[monedas.indexOf(tipo)];
        Dinero d2 = new Dinero(cantidad, tmoneda);
        if (tmoneda.ordinal() != 0)
        {
            System.out.println("Equivale a " + d2.convierteEn(TipoMoneda.euro).toString());
        }
        System.out.println();

        System.out.println("¿Qué deseas hacer con las moneda?");
        System.out.print("1. Convertir");
        System.out.println("             2. Sumar");
        System.out.print("3. Restar");
        System.out.println("                4. Multiplicar");
        System.out.print("5. Dividir");
        System.out.println("               6. Invertir");
        System.out.print("7. Igual");
        System.out.println("                 8. Comparar");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();
        sc.nextLine();
        System.out.println();

        switch (opcion)
        {
            case 1:
            {
                System.out.print("Tipo de moneda a convertir (eur, usd, jpy, gbp, btc): ");
                tipo = sc.nextLine();
                while (!monedas.contains(tipo))
                {
                    System.out.print("Moneda errónea, vuelve a intentarlo: ");
                    tipo = sc.nextLine();
                }
                tmoneda = TipoMoneda.values()[monedas.indexOf(tipo)];
                System.out.println("1ª Moneda. Equivale a " + d.convierteEn(tmoneda).toString());
                System.out.println("2ª Moneda. Equivale a " + d2.convierteEn(tmoneda).toString());
            }
                break;
            case 2:
            {
                System.out.println("La suma de las dos cantidades de dinero es de:");
                Dinero result = d.add(d2);
                System.out.println(result.toString());
                if (tmoneda.ordinal() != 0)
                {
                    System.out.println("Equivale a " + result.convierteEn(TipoMoneda.euro).toString());
                }
            }
                break;
            case 3:
            {
                System.out.println("La resta de las dos cantidades de dinero es de:");
                Dinero result = d.substract(d2);
                System.out.println(result.toString());
                if (tmoneda.ordinal() != 0)
                {
                    System.out.println("Equivale a " + result.convierteEn(TipoMoneda.euro).toString());
                }
            }
                break;
            case 4:
            {
                System.out.println("El producto de las dos cantidades de dinero es de:");
                Dinero result = d.multiply(d2);
                System.out.println(result.toString());
                if (tmoneda.ordinal() != 0)
                {
                    System.out.println("Equivale a " + result.convierteEn(TipoMoneda.euro).toString());
                }
            }
                break;
            case 5:
            {
                System.out.println("El cociente de las dos cantidades de dinero es de:");
                Dinero result = d.divide(d2);
                System.out.println(result.toString());
                if (tmoneda.ordinal() != 0)
                {
                    System.out.println("Equivale a " + result.convierteEn(TipoMoneda.euro).toString());
                }
            }
                break;
            case 6:
            {
                System.out.println("La inversion de la primera cantidad de dinero es de:");
                System.out.println(d.negate().toString());
                System.out.println("La inversion de la segunda cantidad de dinero es de:");
                System.out.println(d2.negate().toString());
            }
                break;
            case 7:
            {
                if (d.equals(d2))
                {
                    System.out.println("Ambas cantidades de dinero son IGUALES");
                }
                else
                {
                    System.out.println("Las cantidades de dinero son DIFERENTES");
                }
            }
                break;
            case 8:
            {
                if (d.compareTo(d2) == -1)
                {
                    System.out.println("La primera cantidad de dinero es MENOR que la segunda");
                }
                else if (d.compareTo(d2) == 0)
                {
                    System.out.println("Ambas cantidades de dinero son IGUALES");
                }
                else
                {
                    System.out.println("La primera cantidad de dinero es MAYOR que la segunda");
                }
            }
                break;
            default:
                System.out.println("\u001B[31m" + "----------ERROR----------");
        }
    }
}
