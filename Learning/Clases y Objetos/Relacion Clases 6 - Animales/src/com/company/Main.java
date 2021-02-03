package com.company;

import java.text.Normalizer;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        ClinicaVeterinaria vet = new ClinicaVeterinaria();
        Scanner sc = new Scanner(System.in);
        List<String> tipoAnimal = new ArrayList<>(Arrays.asList("perro", "gato", "pajaro", "reptil"));
        String seguir = "s";

        System.out.println("\n" + "¡Bienvenido a la Clinica Veterinaria 'Orejitas Felices'!");
        while (seguir.equals("s"))
        {
            System.out.println("\n" + "Introduce un animal (Perro / Gato / Pájaro / Reptil)");
            String animal = eliminaAcentos(sc.next().toLowerCase());
            while (!tipoAnimal.contains(animal))
            {
                System.out.print("Animal no existente. Vuelve a intentarlo: ");
                animal = sc.next();
            }
            sc.nextLine();

            switch (tipoAnimal.indexOf(animal))
            {
                case 0:
                {
                    List<String> perros = new ArrayList<>(Arrays.asList("pastor aleman",
                            "husky", "fox terrier", "dalmata", "san bernardo"));
                    System.out.print("Nombre del perro: ");
                    String nombre = mayusPrimera(sc.nextLine());
                    System.out.println("Raza (Pastor Alemán / Husky / Fox Terrier / Dálmata / San Bernardo)");
                    String raza = eliminaAcentos(sc.nextLine().toLowerCase());
                    while (!perros.contains(raza))
                    {
                        System.out.print("Raza inexistente. Vuelve a intentarlo: ");
                        raza = sc.nextLine();
                    }
                    RazaPerro razaPerro = RazaPerro.values()[perros.indexOf(raza)];
                    System.out.println("Fecha de nacimiento");
                    System.out.print("Día: ");
                    int dia = sc.nextInt();
                    System.out.print("Mes: ");
                    int mes = sc.nextInt();
                    System.out.print("Año: ");
                    int anyo = sc.nextInt();
                    System.out.print("Peso: ");
                    double peso = sc.nextDouble();
                    System.out.print("Microchip: ");
                    String microchip = sc.next();

                    Animal perro = new Perro(nombre, razaPerro, LocalDate.of(anyo, mes, dia), peso, microchip);

                    System.out.println("¿Quieres introducir un comentario sobre el perro? (s/n)");
                    seguir = sc.next();
                    sc.nextLine();
                    while (!seguir.equals("s") && !seguir.equals("n"))
                    {
                        System.out.print("Opción incorrecta. Vuelve a intentarlo: ");
                        seguir = sc.next();
                        sc.nextLine();
                    }
                    if (seguir.equals("s"))
                    {
                        System.out.print("Comentario: ");
                        perro.setComentarios(mayusPrimera(sc.nextLine()));
                    }
                    else
                    {
                        perro.setComentarios("---");
                    }
                    vet.insertaAnimal(perro);
                }
                    break;
                case 1:
                {
                    List<String> gatos = new ArrayList<>(Arrays.asList("comun",
                            "siames", "persa", "angora", "scottish fold"));
                    System.out.print("Nombre del gato: ");
                    String nombre = mayusPrimera(sc.nextLine());
                    System.out.println("Raza (Común / Siamés / Persa / Angora / Scottish Fold)");
                    String raza = eliminaAcentos(sc.nextLine().toLowerCase());
                    while (!gatos.contains(raza))
                    {
                        System.out.print("Raza inexistente. Vuelve a intentarlo: ");
                        raza = sc.nextLine();
                    }
                    RazaGato razaGato = RazaGato.values()[gatos.indexOf(raza)];
                    System.out.println("Fecha de nacimiento");
                    System.out.print("Día: ");
                    int dia = sc.nextInt();
                    System.out.print("Mes: ");
                    int mes = sc.nextInt();
                    System.out.print("Año: ");
                    int anyo = sc.nextInt();
                    System.out.print("Peso: ");
                    double peso = sc.nextDouble();
                    System.out.print("Microchip: ");
                    String microchip = sc.next();

                    Animal gato = new Gato(nombre, razaGato, LocalDate.of(anyo, mes, dia), peso, microchip);

                    System.out.println("¿Quieres introducir un comentario sobre el gato? (s/n)");
                    seguir = sc.next();
                    sc.nextLine();
                    while (!seguir.equals("s") && !seguir.equals("n"))
                    {
                        System.out.print("Opción incorrecta. Vuelve a intentarlo: ");
                        seguir = sc.next();
                        sc.nextLine();
                    }
                    if (seguir.equals("s"))
                    {
                        System.out.print("Comentario: ");
                        gato.setComentarios(mayusPrimera(sc.nextLine()));
                    }
                    else
                    {
                        gato.setComentarios("---");
                    }
                    vet.insertaAnimal(gato);
                }
                    break;
                case 2:
                {
                    List<String> pajaros = new ArrayList<>(Arrays.asList("canario", "periquito", "agapornis"));
                    System.out.print("Nombre del pájaro: ");
                    String nombre = mayusPrimera(sc.nextLine());
                    System.out.println("Especie (Canario / Periquito / Agapornis)");
                    String especie = sc.nextLine().toLowerCase();
                    while (!pajaros.contains(especie))
                    {
                        System.out.print("Especie inexistente. Vuelve a intentarlo: ");
                        especie = sc.nextLine();
                    }
                    EspeciePajaro especiePajaro = EspeciePajaro.values()[pajaros.indexOf(especie)];
                    System.out.println("Fecha de nacimiento");
                    System.out.print("Día: ");
                    int dia = sc.nextInt();
                    System.out.print("Mes: ");
                    int mes = sc.nextInt();
                    System.out.print("Año: ");
                    int anyo = sc.nextInt();
                    System.out.print("Peso: ");
                    double peso = sc.nextDouble();
                    System.out.print("Canta (s/n): ");
                    String canta = sc.next();
                    boolean cantor = false;
                    while (!canta.equals("s") && !canta.equals("n"))
                    {
                        System.out.print("Opción incorrecta. Vuelve a intentarlo: ");
                        canta = sc.next();
                        sc.nextLine();
                    }
                    if (canta.equals("s"))
                    {
                        cantor = true;
                    }

                    Animal pajaro = new Pajaro(nombre, especiePajaro, LocalDate.of(anyo, mes, dia), peso, cantor);

                    System.out.println("¿Quieres introducir un comentario sobre el pájaro? (s/n)");
                    seguir = sc.next();
                    sc.nextLine();
                    while (!seguir.equals("s") && !seguir.equals("n"))
                    {
                        System.out.print("Opción incorrecta. Vuelve a intentarlo: ");
                        seguir = sc.next();
                        sc.nextLine();
                    }
                    if (seguir.equals("s"))
                    {
                        System.out.print("Comentario: ");
                        pajaro.setComentarios(mayusPrimera(sc.nextLine()));
                    }
                    else
                    {
                        pajaro.setComentarios("---");
                    }
                    vet.insertaAnimal(pajaro);
                }
                    break;
                case 3:
                {
                    List<String> reptiles = new ArrayList<>(Arrays.asList("tortuga", "iguana", "dragon de comodo"));
                    System.out.print("Nombre del reptil: ");
                    String nombre = mayusPrimera(sc.nextLine());
                    System.out.println("Especie (Tortuga / Iguana / Dragón de Comodo)");
                    String especie = eliminaAcentos(sc.nextLine().toLowerCase());
                    while (!reptiles.contains(especie))
                    {
                        System.out.print("Especie inexistente. Vuelve a intentarlo: ");
                        especie = sc.nextLine();
                    }
                    EspecieReptil especieReptil = EspecieReptil.values()[reptiles.indexOf(especie)];
                    System.out.println("Fecha de nacimiento");
                    System.out.print("Día: ");
                    int dia = sc.nextInt();
                    System.out.print("Mes: ");
                    int mes = sc.nextInt();
                    System.out.print("Año: ");
                    int anyo = sc.nextInt();
                    System.out.print("Peso: ");
                    double peso = sc.nextDouble();
                    System.out.print("Venenoso (s/n): ");
                    String envenena = sc.next();
                    boolean venenoso = false;
                    while (!envenena.equals("s") && !envenena.equals("n"))
                    {
                        System.out.print("Opción incorrecta. Vuelve a intentarlo: ");
                        envenena = sc.next();
                        sc.nextLine();
                    }
                    if (envenena.equals("s"))
                    {
                        venenoso = true;
                    }

                    Animal reptil = new Reptil(nombre, especieReptil, LocalDate.of(anyo, mes, dia), peso, venenoso);

                    System.out.println("¿Quieres introducir un comentario sobre el reptil? (s/n)");
                    seguir = sc.next();
                    sc.nextLine();
                    while (!seguir.equals("s") && !seguir.equals("n"))
                    {
                        System.out.print("Opción incorrecta. Vuelve a intentarlo: ");
                        seguir = sc.next();
                        sc.nextLine();
                    }
                    if (seguir.equals("s"))
                    {
                        System.out.print("Comentario: ");
                        reptil.setComentarios(mayusPrimera(sc.nextLine()));
                    }
                    else
                    {
                        reptil.setComentarios("---");
                    }
                    vet.insertaAnimal(reptil);
                }
                    break;
                default:
                    System.out.println("ERROR");
            }
            System.out.println("¡Animal introducido!");

            System.out.println("\n" + "¿Quieres seguir introduciendo animales? (s/n)");
            seguir = sc.next();
            while (!seguir.equals("s") && !seguir.equals("n"))
            {
                System.out.print("Opción incorrecta. Vuelve a intentarlo: ");
                seguir = sc.next();
            }
        }

        System.out.println("\n" + "¿Quieres ver la ficha de los animales que hay en la clínica? (s/n)");
        seguir = sc.next();
        while (!seguir.equals("s") && !seguir.equals("n"))
        {
            System.out.print("Opción incorrecta. Vuelve a intentarlo: ");
            seguir = sc.next();
        }
        if (seguir.equals("s"))
        {
            vet.ordenaLista();
            System.out.println(vet.toString());
        }
    }

    public static String eliminaAcentos(String s)
    {
        s = Normalizer.normalize(s, Normalizer.Form.NFD);
        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return s;
}
    public static String mayusPrimera(String s)
    {
        char prim = Character.toUpperCase(s.charAt(0));
        return prim + s.substring(1);
    }
}
