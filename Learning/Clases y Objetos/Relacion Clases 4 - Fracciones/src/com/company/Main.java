package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Fraccion f;

        System.out.println("¡¡ Bienvenido al operdador de fracciones !!\n");

        System.out.println("¿Cómo deseas crear tu fracción inicial?");
        System.out.print("1. Con numerador y denominador");
        System.out.println("                  2. Con un número entero");
        System.out.println("3. Con el valor de la fracción");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();
        switch (opcion)
        {
            case 1:
            {
                System.out.println("Indica un numerador y un denominador");
                System.out.print("Numerador: ");
                int numerador = sc.nextInt();
                System.out.print("Denominador: ");
                int denominador = sc.nextInt();
                f = new Fraccion(numerador, denominador);
            }
                break;
            case 2:
            {
                System.out.println("Indica un número entero");
                System.out.print("Numerador: ");
                int numerador = sc.nextInt();
                f = new Fraccion(numerador);
            }
                break;
            case 3:
            {
                System.out.println("Indica el valor de la fracción");
                System.out.print("Valor: ");
                double valor = sc.nextDouble();
                f = new Fraccion(valor);
            }
                break;
            default:
                System.out.println("------ OPCIÓN ERRÓNEA ------");
                f = new Fraccion(1,1);
        }
        System.out.println("Tu fracción es " + f.toString());

        System.out.println("\n" + "Para operar con tu fracción, elige una de las siguientes opciones");
        System.out.print("1. Convertir en negativo");
        System.out.println("                        2. Sumar fracciones");
        System.out.print("3. Restar fracciones");
        System.out.println("                            4. Multiplicar fracciones");
        System.out.print("5. Dividir fracciones");
        System.out.println("                           6. Comparar iguales");
        System.out.println("7. Comparar fracciones");
        System.out.print("Opción: ");
        opcion = sc.nextInt();
        switch (opcion)
        {
            case 1:
            {
                f.negate();
                System.out.println("Tu fracción negada queda así: " + f.toString());
            }
                break;
            case 2:
            {
                Fraccion f2;
                System.out.println("¿Cómo deseas crear la fracción a sumar?");
                System.out.print("1. Con numerador y denominador");
                System.out.println("                  2. Con un número entero");
                System.out.println("3. Con el valor de la fracción");
                System.out.print("Opción: ");
                opcion = sc.nextInt();
                switch (opcion)
                {
                    case 1:
                    {
                        System.out.println("Indica un numerador y un denominador");
                        System.out.print("Numerador: ");
                        int numerador = sc.nextInt();
                        System.out.print("Denominador: ");
                        int denominador = sc.nextInt();
                        f2 = new Fraccion(numerador, denominador);
                    }
                    break;
                    case 2:
                    {
                        System.out.println("Indica un número entero");
                        System.out.print("Numerador: ");
                        int numerador = sc.nextInt();
                        f2 = new Fraccion(numerador);
                    }
                    break;
                    case 3:
                    {
                        System.out.println("Indica el valor de la fracción");
                        System.out.print("Valor: ");
                        double valor = sc.nextDouble();
                        f2 = new Fraccion(valor);
                    }
                    break;
                    default:
                        System.out.println("------ OPCIÓN ERRÓNEA ------");
                        f2 = new Fraccion(1,1);
                }
                System.out.println("Tu segunda fracción es " + f2.toString());
                f.add(f2);
                System.out.println("La suma de ambas fracciones es " + f.toString());
            }
                break;
            case 3:
            {
                Fraccion f2;
                System.out.println("¿Cómo deseas crear la fracción a restar?");
                System.out.print("1. Con numerador y denominador");
                System.out.println("                  2. Con un número entero");
                System.out.println("3. Con el valor de la fracción");
                System.out.print("Opción: ");
                opcion = sc.nextInt();
                switch (opcion)
                {
                    case 1:
                    {
                        System.out.println("Indica un numerador y un denominador");
                        System.out.print("Numerador: ");
                        int numerador = sc.nextInt();
                        System.out.print("Denominador: ");
                        int denominador = sc.nextInt();
                        f2 = new Fraccion(numerador, denominador);
                    }
                    break;
                    case 2:
                    {
                        System.out.println("Indica un número entero");
                        System.out.print("Numerador: ");
                        int numerador = sc.nextInt();
                        f2 = new Fraccion(numerador);
                    }
                    break;
                    case 3:
                    {
                        System.out.println("Indica el valor de la fracción");
                        System.out.print("Valor: ");
                        double valor = sc.nextDouble();
                        f2 = new Fraccion(valor);
                    }
                    break;
                    default:
                        System.out.println("------ OPCIÓN ERRÓNEA ------");
                        f2 = new Fraccion(1,1);
                }
                System.out.println("Tu segunda fracción es " + f2.toString());
                f.substract(f2);
                System.out.println("La resta de ambas fracciones es " + f.toString());
            }
                break;
            case 4:
            {
                Fraccion f2;
                System.out.println("¿Cómo deseas crear la fracción a multiplicar?");
                System.out.print("1. Con numerador y denominador");
                System.out.println("                  2. Con un número entero");
                System.out.println("3. Con el valor de la fracción");
                System.out.print("Opción: ");
                opcion = sc.nextInt();
                switch (opcion)
                {
                    case 1:
                    {
                        System.out.println("Indica un numerador y un denominador");
                        System.out.print("Numerador: ");
                        int numerador = sc.nextInt();
                        System.out.print("Denominador: ");
                        int denominador = sc.nextInt();
                        f2 = new Fraccion(numerador, denominador);
                    }
                    break;
                    case 2:
                    {
                        System.out.println("Indica un número entero");
                        System.out.print("Numerador: ");
                        int numerador = sc.nextInt();
                        f2 = new Fraccion(numerador);
                    }
                    break;
                    case 3:
                    {
                        System.out.println("Indica el valor de la fracción");
                        System.out.print("Valor: ");
                        double valor = sc.nextDouble();
                        f2 = new Fraccion(valor);
                    }
                    break;
                    default:
                        System.out.println("------ OPCIÓN ERRÓNEA ------");
                        f2 = new Fraccion(1,1);
                }
                System.out.println("Tu segunda fracción es " + f2.toString());
                f.multiply(f2);
                System.out.println("La multiplicación de ambas fracciones es " + f.toString());
            }
                break;
            case 5:
            {
                Fraccion f2;
                System.out.println("¿Cómo deseas crear la fracción a dividir?");
                System.out.print("1. Con numerador y denominador");
                System.out.println("                  2. Con un número entero");
                System.out.println("3. Con el valor de la fracción");
                System.out.print("Opción: ");
                opcion = sc.nextInt();
                switch (opcion)
                {
                    case 1:
                    {
                        System.out.println("Indica un numerador y un denominador");
                        System.out.print("Numerador: ");
                        int numerador = sc.nextInt();
                        System.out.print("Denominador: ");
                        int denominador = sc.nextInt();
                        f2 = new Fraccion(numerador, denominador);
                    }
                    break;
                    case 2:
                    {
                        System.out.println("Indica un número entero");
                        System.out.print("Numerador: ");
                        int numerador = sc.nextInt();
                        f2 = new Fraccion(numerador);
                    }
                    break;
                    case 3:
                    {
                        System.out.println("Indica el valor de la fracción");
                        System.out.print("Valor: ");
                        double valor = sc.nextDouble();
                        f2 = new Fraccion(valor);
                    }
                    break;
                    default:
                        System.out.println("------ OPCIÓN ERRÓNEA ------");
                        f2 = new Fraccion(1,1);
                }
                System.out.println("Tu segunda fracción es " + f2.toString());
                f.divide(f2);
                System.out.println("La división de ambas fracciones es " + f.toString());
            }
                break;
            case 6:
            {
                Fraccion f2;
                System.out.println("¿Cómo deseas crear la fracción que quieras saber si es igual?");
                System.out.print("1. Con numerador y denominador");
                System.out.println("                  2. Con un número entero");
                System.out.println("3. Con el valor de la fracción");
                System.out.print("Opción: ");
                opcion = sc.nextInt();
                switch (opcion)
                {
                    case 1:
                    {
                        System.out.println("Indica un numerador y un denominador");
                        System.out.print("Numerador: ");
                        int numerador = sc.nextInt();
                        System.out.print("Denominador: ");
                        int denominador = sc.nextInt();
                        f2 = new Fraccion(numerador, denominador);
                    }
                    break;
                    case 2:
                    {
                        System.out.println("Indica un número entero");
                        System.out.print("Numerador: ");
                        int numerador = sc.nextInt();
                        f2 = new Fraccion(numerador);
                    }
                    break;
                    case 3:
                    {
                        System.out.println("Indica el valor de la fracción");
                        System.out.print("Valor: ");
                        double valor = sc.nextDouble();
                        f2 = new Fraccion(valor);
                    }
                    break;
                    default:
                        System.out.println("------ OPCIÓN ERRÓNEA ------");
                        f2 = new Fraccion(1,1);
                }
                System.out.println("Tu segunda fracción es " + f2.toString());
                if (f.equals(f2))
                {
                    System.out.println("Ambas fracciones son iguales");
                }
                else
                {
                    System.out.println("Las fracciones no son iguales");
                }
            }
                break;
            case 7:
            {
                Fraccion f2;
                System.out.println("¿Cómo deseas crear la fracción a comparar?");
                System.out.print("1. Con numerador y denominador");
                System.out.println("                  2. Con un número entero");
                System.out.println("3. Con el valor de la fracción");
                System.out.print("Opción: ");
                opcion = sc.nextInt();
                switch (opcion)
                {
                    case 1:
                    {
                        System.out.println("Indica un numerador y un denominador");
                        System.out.print("Numerador: ");
                        int numerador = sc.nextInt();
                        System.out.print("Denominador: ");
                        int denominador = sc.nextInt();
                        f2 = new Fraccion(numerador, denominador);
                    }
                    break;
                    case 2:
                    {
                        System.out.println("Indica un número entero");
                        System.out.print("Numerador: ");
                        int numerador = sc.nextInt();
                        f2 = new Fraccion(numerador);
                    }
                    break;
                    case 3:
                    {
                        System.out.println("Indica el valor de la fracción");
                        System.out.print("Valor: ");
                        double valor = sc.nextDouble();
                        f2 = new Fraccion(valor);
                    }
                    break;
                    default:
                        System.out.println("------ OPCIÓN ERRÓNEA ------");
                        f2 = new Fraccion(1,1);
                }
                System.out.println("Tu segunda fracción es " + f2.toString());
                if (f.compareTo(f2) == -1)
                {
                    System.out.println("La primera fracción es menor que la segunda");
                }
                else if (f.compareTo(f2) == 0)
                {
                    System.out.println("La primera fracción es igual que la segunda");
                }
                else
                {
                    System.out.println("La primera fracción es mayor que la segunda");
                }
            }
                break;
            default:
                System.out.println("------ OPCIÓN ERRÓNEA ------");
        }
    }
}
