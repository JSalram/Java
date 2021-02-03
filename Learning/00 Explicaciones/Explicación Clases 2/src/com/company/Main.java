package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        Coche c = new Coche();

        c.matricula = "6578KBS";
        c.marca = "Seat";
        c.modelo = "Panda";
        //c.cilindrada = 999;
        c.setCilindrada(999);
        //c.precio = 1000;
        c.setPrecio(1000);
        c.nuevo = false;

        Coche c2 = new Coche("8457CCC", "Audi", "A4",
                             2499, 7500, false);

        //c2.precio = -1000;
        c2.setPrecio(1000);

        System.out.println(c2.matricula);
        System.out.println(c2.getCilindrada());
        System.out.println("Precio original = " + c2.getPrecio());
        System.out.println("Rebajado(-20%) = " + c2.rebaja(20));

        System.out.println(c);

        // Uso de clases

        List<Coche> lista = new ArrayList<>();

    }
}
