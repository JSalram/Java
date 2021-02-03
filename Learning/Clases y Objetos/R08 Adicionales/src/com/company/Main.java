package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<String> unidades = Arrays.asList("m", "in", "ft", "yd");
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al operador de longitudes" + "\n");
        System.out.println("Escoge una primera longitud con la que operar");
        System.out.print("Cantidad: ");
        double cantidad = sc.nextDouble();
        System.out.print("Unidad (m, in, ft, yd): ");
        String u = sc.next();
        while (!unidades.contains(u))
        {
            System.out.print("Unidad incorrecta. Vuelva a intentarlo: ");
            u = sc.next();
        }
        Longitud l = new Longitud(cantidad, UnidadLongitud.values()[unidades.indexOf(u)]);
        System.out.println("Tu 1ª cantidad es de " + l.toString());
        if (l.getUnidad() != UnidadLongitud.metros)
        {
            System.out.println("Equivale a " + l.valorEnMetros() + "m");
        }

        TimeUnit.SECONDS.sleep(1);

        System.out.println("\n" + "Escoge una segunda longitud con la que operar");
        System.out.print("Cantidad: ");
        cantidad = sc.nextDouble();
        System.out.print("Unidad (m, in, ft, yd): ");
        u = sc.next();
        while (!unidades.contains(u))
        {
            System.out.print("Unidad incorrecta. Vuelva a intentarlo: ");
            u = sc.next();
        }
        Longitud l2 = new Longitud(cantidad, UnidadLongitud.values()[unidades.indexOf(u)]);
        System.out.println("Tu 2ª cantidad es de " + l2.toString());
        if (l2.getUnidad() != UnidadLongitud.metros)
        {
            System.out.println("Equivale a " + l2.valorEnMetros() + "m");
        }

        System.out.println("\n" + "Elige una operación a realizar");
        System.out.println("1. Sumar                2. Restar");
        System.out.println("3. Multiplicar          4. Dividir");
        System.out.println("5. Igualar              6. Comparar");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion)
        {
            case 1:
            {
                System.out.print(l.toString() + " + " + l2.toString() + " = ");
                l.add(l2);
                System.out.println(l.toString());
            }
                break;
            case 2:
            {
                System.out.print(l.toString() + " - " + l2.toString() + " = ");
                l.substract(l2);
                System.out.println(l.toString());
            }
                break;
            case 3:
            {
                System.out.print(l.toString() + " x " + l2.toString() + " = ");
                l.multiply(l2);
                System.out.println(l.toString());
            }
                break;
            case 4:
            {
                System.out.print(l.toString() + " / " + l2.toString() + " = ");
                l.divide(l2);
                System.out.println(l.toString());
            }
                break;
            case 5:
            {
                if (l.equals(l2))
                {
                    System.out.println(l.toString() + " y " + l2.toString() + " son iguales");
                }
                else
                {
                    System.out.println(l.toString() + " y " + l2.toString() + " son distintos");
                }
            }
                break;
            case 6:
            {
                if (l.compareTo(l2) < 0)
                {
                    System.out.println(l.toString() + " es menor que " + l2.toString());
                }
                else if (l.compareTo(l2) > 0)
                {
                    System.out.println(l.toString() + " es mayor que " + l2.toString());
                }
                else
                {
                    System.out.println(l.toString() + " y " + l2.toString() + " son iguales");
                }
            }
                break;
            default:
                System.out.println("------ ERROR ------");
        }
    }
}