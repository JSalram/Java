package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        // Invierte Cadena
        String texto = "Hola";
        int i;
        for (i = lastPos(texto); i >= 0; i--)
        {
            System.out.print(texto.charAt(i));
        }

        // Así se haría en Python:
//        i = texto.length()-1;
//        while (i >= 0)
//        {
//            i--;
//        }

        System.out.println();
        int[] array = {3, 1, 2};

        // foreach (no funciona en este caso)
        for (int num : array) // : --> in (dentro de)
        {
            int k = (array.length - 1) - num; // (array.length - 1) == 2
            System.out.println(k);
        }

        // SWITCH
        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        boolean seguir = true;
        while (seguir)
        {
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion)
            {
                case 1:             // if (opcion == 1)
                {
                    System.out.println(1);
                }
                break;
                case 2:
                {
                    System.out.println(2);
                }
                break;
                case 3:
                {
                    System.out.println(3);
                }
                break;
                case 4:
                {
                    seguir = false;
                }
                break;
                default:
                    System.out.println("Opción incorrecta");
            }
        }
    }
    
    public static int lastPos(String texto)
    {
        return texto.length()-1;
    }
}
