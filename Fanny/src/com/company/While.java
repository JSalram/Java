package com.company;

import java.util.Scanner;

public class While
{
    public static void main(String[] args)
    {
        int i = 0; // i ==> Índice
        while (i < 5)
        {
            System.out.println(i);
            i++;  // Vamos incrementando la variable para que pueda salir del bucle
        }
        System.out.println("Valor de i fuera del bucle: " + i);

        // ---------------------------------------------------------------------------------------

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Deseas continuar? (si/no)");
        String respuesta = sc.next();

        while (!respuesta.equals("si") && !respuesta.equals("no"))
        {
            System.out.print("Respuesta inválida. Vuelve a intentarlo: ");
            respuesta = sc.next();  // Preguntamos de nuevo para que pueda salir del bucle
        }

        // ---------------------------------------------------------------------------------------

        String saludo = "Hola";

        i = 0;  // 'i' ya existe en nuestro proyecto, por lo que tan solo volvemos a darle el valor de 0
        System.out.println(saludo.charAt(i));
        i++;
        System.out.println(saludo.charAt(i));
        i++;
        System.out.println(saludo.charAt(i));
        i++;
        System.out.println(saludo.charAt(i));
        i++;

        saludo = "Hola";

        i = 0;  // 'i' ya existe en nuestro proyecto, por lo que tan solo volvemos a darle el valor de 0

        while (i < saludo.length())  // Todos los números menores que la longitud de la cadena
        {
            System.out.println(saludo.charAt(i));
            i++;  // Se incrementa para que salga una vez llegue al final de la cadena
        }

        // ---------------------------------------------------------------------------------------

        i = 1;  // 'i' ya existe en nuestro proyecto, por lo que tan solo volvemos a asignarle un valor

        while (i <= 10)
        {
            if (i % 2 == 0)  // Si es par, imprime i
            {
                System.out.println(i);
            }

            i++;
        }


        //// ToDo EJERCICIO: Imprimir números impares entre 1 y 10

    }
}
