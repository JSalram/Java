package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Main {

    public static void main(String[] args) throws InterruptedException
    {
        Scanner sc = new Scanner(System.in);
        PokerDeck pd = new PokerDeck();

        System.out.println("¡Bienvenido al VideoPóker!");
        System.out.println("Instrucciones:");
        System.out.println("1. Empezarás con 100€");
        System.out.println("2. Primera partida gratis, siguientes 5€");
        System.out.println("3. Cada mano de cartas tiene un precio");
        System.out.println("4. Para descartar más de una carta: Separar posición por comas (1,2,3)");
        System.out.println("5. Cuando llegues a 0€ termina la partida");

        String s = "s";
        int eur = 100;
        while (eur > 5 && s.equals("s"))
        {
            System.out.println("\n" + "Saldo: " + eur + "€");
            PokerHand ph = new PokerHand(pd.drawCard(), pd.drawCard(), pd.drawCard(), pd.drawCard(), pd.drawCard());
            System.out.println("\n" + "Mano: " + ph.toString());
            System.out.println("¿Deseas descartar alguna carta? (s/n)");
            String aceptar = sc.next();

            while (!aceptar.equals("s") && !aceptar.equals("n"))
            {
                System.out.print("Opción inválida. Vuelva a intentarlo: ");
                aceptar = sc.next();
            }

            if (aceptar.equals("s"))
            {
                System.out.print("Carta(s) a descartar: ");
                String desc = sc.next();

                int i;
                for (i = 0; i < desc.length(); i++)
                {
                    if (desc.charAt(i) != ',')
                    {
                        ph.descartar(Character.getNumericValue(desc.charAt(i))-1, pd.drawCard());
                    }
                }
                ph.sortHand();
                System.out.println("\n" + "Mano: " + ph.toString());
            }
            TimeUnit.SECONDS.sleep(1);
            System.out.println();

            if (ph.isRoyalFlush())
            {
                eur += 800;
                System.out.println("Escalera real, ganas 800€ y ahora tienes un saldo de " + eur + "€");
            }
            else if (ph.isStraightFlush())
            {
                eur += 50;
                System.out.println("Escalera de color, ganas 50€ y ahora tienes un saldo de " + eur + "€");
            }
            else if (ph.isPoker())
            {
                eur += 25;
                System.out.println("Póker, ganas 25€ y ahora tienes un saldo de " + eur + "€");
            }
            else if (ph.isFull())
            {
                eur += 9;
                System.out.println("Full, ganas 9€ y ahora tienes un saldo de " + eur + "€");
            }
            else if (ph.isFlush())
            {
                eur += 6;
                System.out.println("Color, ganas 6€ y ahora tienes un saldo de " + eur + "€");
            }
            else if (ph.isStraight())
            {
                eur += 4;
                System.out.println("Escalera, ganas 4€ y ahora tienes un saldo de " + eur + "€");
            }
            else if (ph.isThree())
            {
                eur += 3;
                System.out.println("Trío, ganas 3€ y ahora tienes un saldo de " + eur + "€");
            }
            else if (ph.isTwoPairs())
            {
                eur += 2;
                System.out.println("Doble pareja, ganas 2€ y ahora tienes un saldo de " + eur + "€");
            }
            else if (ph.isPair())
            {
                eur += 1;
                System.out.println("Pareja, ganas 1€ y ahora tienes un saldo de " + eur + "€");
            }
            else
            {
                System.out.println("Nada, te mantienes con el mismo saldo");
            }

            if (pd.getDeck().size() < 10)
            {
                pd = new PokerDeck();
                System.out.println("\n" + "¡NUEVA BARAJA!" + "\n");
            }

            System.out.println("¿Deseas continuar? (s/n)");
            s = sc.next();
            while (!s.equals("s") && !s.equals("n"))
            {
                System.out.print("Opción inválida. Vuelva a intentarlo: ");
                s = sc.next();
            }

            if (s.equals("s"))
            {
                eur -= 5;
                System.out.println("\n" + "-5€");
            }
        }
    }
}
