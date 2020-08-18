package com.company;

import java.util.Scanner;

public class EjerciciosResueltos
{
    public static void main(String[] args)
    {
        // Faltan comprobaciones y error en ellas
        // Falta comprobar meses
        // Año 1990?
        // Mes float?
        // Código poco limpio
        // Falta código o no se ha enviado entero
        // Variables preferentemente input



//        int años = 1990;
//        int dias = 07;
//        float meses = 03;
//
//        if(años >= 1990) {
//            System.out.println("Eres mayor de edad.");
//        } else {
//            System.out.println("Eres menor de edad.");
//
//            if(dias >= 07){
//
//                System.out.println("Eres mayor de edad.");
//            } else {
//                System.out.println("Eres menor de edad.");
//            }
//        }


        ///////////////////////////////////////////////////////////////////////////////////////////////////


        Scanner sc = new Scanner(System.in);

        System.out.print("Día: ");
        int dia = sc.nextInt();
        System.out.print("Mes: ");
        int mes = sc.nextInt();
        System.out.print("Año: ");
        int anno = sc.nextInt();

        if (anno > 2002)
        {
            System.out.println("No eres mayor de edad");
        }
        else if (anno == 2002)
        {
            if (mes > 8)
            {
                System.out.println("No eres mayor de edad");
            }
            else if (mes == 8)
            {
                if (dia > 19)
                {
                    System.out.println("No eres mayor de edad");
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
        }
        else
        {
            System.out.println("Eres mayor de edad");
        }
    }
}