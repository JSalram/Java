package com.company;

public class Main {

    public static void main(String[] args)
    {
        // ELSE IF (elif)

        int num = 10;
//            if (num > 0) // Si se cumple, haz esto
//            {
//                System.out.println("Mayor que 0");
//            }
//            else if (num < 20) // Si no se cumple el anterior y se cumple este, haz esto
//            {
//                System.out.println("Menor que 20");
//            }
//            else // Si no se cumple
//            {
//                System.out.println("No es menor que 20 ni mayor que 0");
//            }



        // CADENAS

        String saludo = "Hola";

            // Concatenar
        saludo = saludo + "mundo" + 34;

            // Convertir

        String b = "true";
        boolean b1 = Boolean.parseBoolean(b);

        int n = 345;
//      String n1 = Integer.toString(n);
        String n1 = String.valueOf(n); // Manera óptima

        String n2 = "22.5";
        double nDouble = Double.parseDouble(n2);
        int numeroCuenta = 342389543;

//        if (numeroCuenta > Integer.MAX_VALUE)
//        {
//            float numeroCuentaGrande = (float) numeroCuenta;
//        }

        System.out.println(numeroCuenta + 3);

            // Funciones

        String c = "Hola me llamo Javi";
        if (c.contains("Javi"))
        {
            System.out.println("Si, lo contiene");
        }
        else
        {
            System.out.println("No lo contiene");
        }


        // FOREACH (for en python)
        int[] nArray = {1,2,3,4};
//        for (int i:nArray)
//        {
//            System.out.println(i);
//        }

        // FOR (Recomendado)
        int cont;
        String cadena = "abcde";
        for (cont = 0; cont < cadena.length(); cont ++)
        {
            System.out.println(cadena.charAt(cont));
        }

/*
Ejercicio 1:
    invierteCadena: Le pasamos una cadena y nos la devuelve
    invertida (de detrás para delante) (hay que usar for).

Ejercicio 2 (opcional):
    quitaAcentos: Consiste en crear una cadena con caracteres acentuados y
    que devuelva la cadena con los acentos quitados (esto se hace para algunos
    programas que no se enteran de los acentos).
*/
    }
}
