package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        CineDB cine = new CineDB("jdbc:sqlite:J:\\DAW\\PROG. Programacion" +
                                "\\Clases\\Relacion Clases 7 - Base de Datos\\cine.db");

        System.out.println("Base de datos del cine");
        System.out.println("Indica qué deseas hacer:");
        System.out.print("1. Insertar una película");
        System.out.println("                     2. Listado de todas las películas");
        System.out.print("3. Listado de todos los actores");
        System.out.println("              4. Listado de todas las películas en las que aparece un actor");
        System.out.println("5. Información de una película");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();
        System.out.println();
        sc.nextLine();

        switch (opcion)
        {
            case 1:
            {
                System.out.print("Título: ");
                String titulo = sc.nextLine();
                System.out.print("Año de rodaje: ");
                int anno = sc.nextInt();
                System.out.print("Tiene Óscar (s/n): ");
                String oscarstr = sc.next();
                oscarstr = oscarstr.toLowerCase();
                while (!oscarstr.equals("s") && !oscarstr.equals("n"))
                {
                    System.out.print("Opción incorrecta. Vuelve a intentarlo: ");
                    oscarstr = sc.next();
                    oscarstr = oscarstr.toLowerCase();
                }
                boolean tieneOscar = false;
                if (oscarstr.equals("s"))
                {
                    tieneOscar = true;
                }
                System.out.print("Valoración: ");
                double valoracion = sc.nextDouble();
                while (valoracion < 0.0 || valoracion > 10.0)
                {
                    System.out.print("Valoración errónea. Vuelve a intentarlo: ");
                    valoracion = sc.nextDouble();
                }

                int idPeli = cine.insertaPelicula(titulo, anno, tieneOscar, valoracion);
                System.out.println("¡Pelicula insertada!");
                System.out.println("\n" + "Introducir actores:");
                String seguir = "s";

                if (cine.listadoActores().size() > 0)
                {
                    int i;
                    String seguirLista = "s";
                    for (i = 0; i < cine.listadoActores().size(); i++)
                    {
                        System.out.println(cine.listadoActores().get(i));
                    }
                    System.out.println("¿Algún actor que quieras introducir se encuentra en ésta lista? (s/n)");
                    String actorstr = sc.next();
                    actorstr = actorstr.toLowerCase();
                    while (!actorstr.equals("s") && !actorstr.equals("n"))
                    {
                        System.out.print("Opción incorrecta. Vuelve a intentarlo: ");
                        actorstr = sc.next();
                        actorstr = actorstr.toLowerCase();
                    }
                    while (seguirLista.equals("s"))
                    {
                        System.out.print("Dime su ID: ");
                        int idActor = sc.nextInt();
                        System.out.println("¿Es un personaje principal? (s/n)");
                        String princstr = sc.next();
                        princstr = princstr.toLowerCase();
                        while (!princstr.equals("s") && !princstr.equals("n"))
                        {
                            System.out.print("Opción incorrecta. Vuelve a intentarlo: ");
                            princstr = sc.next();
                            princstr = princstr.toLowerCase();
                        }
                        boolean principal = false;
                        if (princstr.equals("s"))
                        {
                            principal = true;
                        }
                        cine.asociaActorPelicula(idActor, idPeli, principal);
                        System.out.println("¡Actor asociado!");
                        System.out.println("¿Hay más actores en la lista que desees introducir? (s/n)");
                        seguirLista = sc.next();
                        seguirLista = seguirLista.toLowerCase();
                        while (!seguirLista.equals("s") && !seguirLista.equals("n"))
                        {
                            System.out.print("Opción incorrecta. Vuelve a intentarlo: ");
                            seguirLista = sc.next();
                            seguirLista = seguirLista.toLowerCase();
                        }
                    }
                    System.out.println("¿Continuar introduciendo actores? (s/n)");
                    seguir = sc.next();
                    sc.nextLine();
                }

                while (seguir.equals("s"))
                {
                    System.out.println("\n" + "Actor");
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.println("Fecha de nacimiento");
                    System.out.print("Día: ");
                    int dia = sc.nextInt();
                    System.out.print("Mes: ");
                    int mes = sc.nextInt();
                    System.out.print("Año: ");
                    int anyo = sc.nextInt();
                    System.out.println("¿Es un personaje principal? (s/n)");
                    String princstr = sc.next();
                    princstr = princstr.toLowerCase();
                    while (!princstr.equals("s") && !princstr.equals("n"))
                    {
                        System.out.print("Opción incorrecta. Vuelve a intentarlo: ");
                        princstr = sc.next();
                        princstr = princstr.toLowerCase();
                    }
                    boolean principal = false;
                    if (princstr.equals("s"))
                    {
                        principal = true;
                    }
                    int idActor = cine.insertaActor(nombre, LocalDate.of(anyo, mes, dia));
                    cine.asociaActorPelicula(idActor, idPeli, principal);
                    System.out.println("¡Actor introducido y asociado!");
                    System.out.println("¿Continúar introduciendo actores? (s/n)");
                    seguir = sc.next();
                    seguir = seguir.toLowerCase();
                    while (!seguir.equals("s") && !seguir.equals("n"))
                    {
                        System.out.print("Opción incorrecta. Vuelve a intentarlo: ");
                        seguir = sc.next();
                        seguir = seguir.toLowerCase();
                    }
                    sc.nextLine();
                }
            }
                break;
            case 2:
            {
                int i;
                for (i = 0; i < cine.listadoPeliculas().size(); i++)
                {
                    System.out.println(cine.listadoPeliculas().get(i));
                }
            }
                break;
            case 3:
            {
                int i;
                for (i = 0; i < cine.listadoActores().size(); i++)
                {
                    System.out.println(cine.listadoActores().get(i));
                }
            }
                break;
            case 4:
            {
                System.out.print("Nombre del actor: ");
                String nombre = sc.nextLine();
                if (cine.listadoActores().toString().contains(nombre))
                {
                    int id = cine.buscaActor(nombre);
                    int i;
                    for (i = 0; i < cine.listadoPeliculaPorActores(id).size(); i++)
                    {
                        System.out.println(cine.listadoPeliculaPorActores(id).get(i));
                    }
                }
                else
                {
                    System.out.println("No existe ningún actor con el nombre de " + nombre);
                }
            }
                break;
            case 5:
            {
                System.out.print("Título de la película: ");
                String titulo = sc.nextLine();
                if (cine.listadoPeliculas().toString().contains(titulo))
                {
                    int id = cine.buscaPelicula(titulo);
                    System.out.println("Datos de la película:");
                    System.out.println(cine.datosPelicula(id).toString());

                    int i;
                    System.out.println("Actores:");

                    for (i = 0; i < cine.listadoActoresPorPelicula(id).size(); i++)
                    {
                        System.out.println(cine.listadoActoresPorPelicula(id).get(i));
                    }
                }
                else
                {
                    System.out.println("No existe ninguna película con el título de " + titulo);
                }
            }
                break;
            default:
                System.out.println("------ERROR------");
        }
    }
}