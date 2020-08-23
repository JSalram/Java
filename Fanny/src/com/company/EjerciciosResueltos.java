package com.company;

import java.util.Scanner;

public class EjerciciosResueltos
{
    public static void main(String[] args)
    {
        // Faltan comprobaciones y hay errores en ellas
        // Código poco limpio

        // Variables preferentemente input
//        int años = 1990;
//        int dias = 07;
//        int mes = 03; // ¿float mes?
//
//        if(años >= 1990)
//        {
//            System.out.println("Eres mayor de edad.");
//        }
//        else
//        {
//            System.out.println("Eres menor de edad.");
//
//            if (dias >= 07)
//            {
//                System.out.println("Eres mayor de edad.");
//            }
//            else
//            {
//                System.out.println("Eres menor de edad.");
//            }
//        }
        // Falta código o no se ha enviado entero



        // SOLUCIÓN

        Scanner sc = new Scanner(System.in);

        System.out.println("Fecha de nacimiento:");
        System.out.print("Día: ");
        int dia = sc.nextInt();
        System.out.print("Mes: ");
        int mes = sc.nextInt();
        System.out.print("Año: ");
        int anno = sc.nextInt();

        System.out.println();

        System.out.println("Fecha actual:");
        System.out.print("Día actual: ");
        int diaActual = sc.nextInt();
        System.out.print("Mes actual: ");
        int mesActual = sc.nextInt();
        System.out.print("Año actual: ");
        int annoMayorEdad = sc.nextInt();
        annoMayorEdad -= 18;
        // Restamos 18 años al año actual porque es el año en el que la gente comienza a hacerse mayor de edad
        // Una persona es mayor de edad si nació antes del diaActual/mesActual/annoMayorEdad

        System.out.println();

        if (anno > annoMayorEdad)
        {
            System.out.println("No eres mayor de edad");
        }
        else if (anno == annoMayorEdad)
        {
            if (mes > mesActual)
            {
                System.out.println("No eres mayor de edad");
            }
            else if (mes == mesActual)
            {
                if (dia > diaActual)
                {
                    System.out.println("No eres mayor de edad");
                }
                else // ==> (dia <= 19)
                {
                    System.out.println("Eres mayor de edad");
                }
            }
            else
            {
                System.out.println("Eres mayor de edad");
            }
        }
        else
        {
            System.out.println("Eres mayor de edad");
        }


// ========================================================================================


/*
        // Ejercicio: Calcular año bisiesto

        Scanner sc = new Scanner(System.in);

        System.out.print("Año: ");
        int anno = sc.nextInt();

        int resto4 = anno % 4;
        int resto100 = anno % 100;
        int resto400 = anno % 400;

        if (resto4 == 0 && resto100 != 0 && resto400 == 0)
        {
            System.out.println("Es bisiesto");
        }
        else
        {
            System.out.println("No es bisiesto");
        }
 */
    }
}