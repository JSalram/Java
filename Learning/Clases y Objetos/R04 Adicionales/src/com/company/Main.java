package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Pokedex pokedex = new Pokedex("pokemon.csv");
        Scanner sc = new Scanner(System.in);

        System.out.println("¡Bienvenido a la Pokédex de Kanto!" + "\n");

        boolean seguir = true;
        while (seguir)
        {
            System.out.println("Selecciona lo que desees hacer:");
            System.out.println("1. Añadir una generación de Pokémon                    2. Cargar la Pokédex en un fichero");
            System.out.println("3. Capturar un Pokémon                                 4. Mostrar porcentaje de Pokémon capturados");
            System.out.println("5. Buscar un Pokémon                                   6. Mostrar todos los Pokémon");
            System.out.print("Opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (opcion)
            {
                case 1:
                {
                    System.out.println("Indica el nombre del fichero donde se encuentran los Pokémon:");
                    System.out.print("Fichero: ");
                    String fichero = sc.next();
                    pokedex.leeCSV(fichero);
                    System.out.println("Generación añadida con éxito");
                }
                break;
                case 2:
                {
                    System.out.println("Indica el nombre del fichero donde quieres guardar los Pokémon:");
                    System.out.print("Fichero: ");
                    String fichero = sc.next();
                    pokedex.cargaCSV(fichero);
                    System.out.println("Pokédex guardada con éxito");
                }
                    break;
                case 3:
                {
                    System.out.println("Indica el nombre del Pokémon que quieras capturar:");
                    System.out.print("Pokémon: ");
                    String s = sc.next();
                    pokedex.capturaPokemon(s);
                    System.out.println("Pokémon capturado con éxito");
                }
                    break;
                case 4:
                {
                    System.out.println("El porcentaje de Pokémon capturados es del " + pokedex.porcentajeCapturas());
                }
                    break;
                case 5:
                {
                    System.out.println("¿Cómo deseas buscar al Pokémon?");
                    System.out.println("1. Por su ID                               2. Por su nombre");
                    System.out.print("Opción: ");
                    opcion = sc.nextInt();
                    sc.nextLine();
                    System.out.println();

                    switch (opcion)
                    {
                        case 1:
                        {
                            System.out.print("ID: ");
                            int id = sc.nextInt();
                            System.out.println("El pokemon es el siguiente:");
                            System.out.println(pokedex.buscaPokemon(id));
                        }
                            break;
                        case 2:
                        {
                            System.out.print("Nombre: ");
                            String nombre = sc.next();
                            System.out.println("El pokemon es el siguiente:");
                            System.out.println(pokedex.buscaPokemon(nombre));
                        }
                            break;
                        default:
                            System.out.println("------ ERROR ------");
                    }
                }
                    break;
                case 6:
                {
                    System.out.println("Indica el método en el que quieres mostrar los Pokémon");
                    System.out.println("1. Todos los Pokémon                       2. Todos los Pokémon capturados");
                    System.out.println("3. Todos los Pokémon de un mismo tipo      4. Todos los Pokémon de un mismo tipo capturados");
                    System.out.print("Opción: ");
                    opcion = sc.nextInt();
                    sc.nextLine();
                    System.out.println();

                    switch (opcion)
                    {
                        case 1:
                        {
                            System.out.println("Listado de Pokémon:");
                            System.out.println(pokedex.listadoPokemon());
                        }
                            break;
                        case 2:
                        {
                            System.out.println("Listado de Pokémon capturados:");
                            System.out.println(pokedex.listadoPokemonCapturados());
                        }
                            break;
                        case 3:
                        {
                            System.out.print("Tipo Pokémon: ");
                            String tipo = sc.next();
                            System.out.println("Listado de Pokémon de un mismo tipo:");
                            System.out.println(pokedex.listadoPokemonTipo(tipo));
                        }
                            break;
                        case 4:
                        {
                            System.out.print("Tipo Pokémon: ");
                            String tipo = sc.next();
                            System.out.println("Listado de Pokémon capturados de un mismo tipo:");
                            System.out.println(pokedex.listadoPokemonCapturadosTipo(tipo));
                        }
                            break;
                        default:
                            System.out.println("------ ERROR ------");
                    }
                }
                    break;
                default:
                    System.out.println("------ ERROR ------");
            }

            System.out.println("\n" + "¿Deseas continuar? (s/n)");
            String s = sc.next();
            while (!s.equals("s") && !s.equals("n"))
            {
                System.out.print("Opción incorrecta. Vuelve a intentarlo: ");
                s = sc.next();
            }
            if (s.equals("n"))
            {
                seguir = false;
            }
        }
    }
}
