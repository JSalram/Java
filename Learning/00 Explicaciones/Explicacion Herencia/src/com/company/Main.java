package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
//        Clase padre = list
//        Clases hijos = ArrayList y LinkedList
             // List<String> l = new ArrayList<>();
             // List<String> l2 = new LinkedList<>();

        Vehiculo v = new Coche();
        v.matricula = "1234";
        Moto m = new Moto();
        m.matricula = "5678";
        m.sidecar = true;
        Vehiculo c = new Coche();
        c.matricula = "9999";

        List<Vehiculo> lista = new ArrayList<>();
        lista.add(v);
        lista.add(m);
        lista.add(c);

        int i;
        for (i = 0; i < lista.size(); i++)
        {
            System.out.println(lista.get(i).toString());

            if (lista.get(i) instanceof Moto)
            // if (lista.get(i) == Moto.class)
            {
                Moto m2 = (Moto)lista.get(i);
                System.out.println("Tiene sidecar = " + m2.sidecar);
            }
        }

        // FECHAS

//        LocalDate d = new LocalDate(2020, 3, 10);
        LocalDate d = LocalDate.of(2020, 3, 10);
        d = d.plusDays(5);
        System.out.println(d);
//        System.out.println(d.toString());
        String fechaBonita = d.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(fechaBonita);
//
        LocalDate hoy = LocalDate.now();
        System.out.println(hoy.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
    }
}
