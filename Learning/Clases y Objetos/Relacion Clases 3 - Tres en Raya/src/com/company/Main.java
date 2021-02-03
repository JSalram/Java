package com.company;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException
    {
        Scanner sc = new Scanner(System.in);
        TresEnRaya ter = new TresEnRaya();

        System.out.println("¡Bienvenido al juego del tres en raya!\n");
        System.out.println("(Se recomienda jugar con el pad numérico)\n");
        System.out.println("Elige el modo de juego que prefieras:\n");
        System.out.print("1. Jugador VS Jugador");
        System.out.println("          2. Jugador VS CPU");
        System.out.print("3. CPU VS Jugador");
        System.out.println("              4. CPU VS CPU");
        System.out.print("Modo de juego: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion)
        {
            case 1:
            {
                boolean seguir = ter.quedanMovimientos();
                System.out.println("\nEste será vuestro tablero:");
                ter.dibujaTablero();

                while (seguir)
                {
                    System.out.print("\nJ1 - Elige una posición: ");
                    int pos = sc.nextInt();
                    while (ter.movimientoInvalidoPlayer(pos))
                    {
                        System.out.print("Posición ocupada, prueba de nuevo: ");
                        pos = sc.nextInt();
                    }
                    ter.mueveJugador1(pos);

                    ter.dibujaTablero();
                    if (ter.ganaJugador1())
                    {
                        System.out.println("\n¡¡¡ GANA P1 !!!");
                        seguir = false;
                    }
                    else if (ter.ganaJugador2())
                    {
                        System.out.println("\n¡¡¡ GANA P2 !!!");
                        seguir = false;
                    }
                    else
                    {
                        if (ter.quedanMovimientos())
                        {
                            System.out.print("\nJ2 - Elige una posición: ");
                            pos = sc.nextInt();
                            while (ter.movimientoInvalidoPlayer(pos))
                            {
                                System.out.print("Posición ocupada, prueba de nuevo: ");
                                pos = sc.nextInt();
                            }
                            ter.mueveJugador2(pos);

                            ter.dibujaTablero();
                            if (ter.ganaJugador1())
                            {
                                System.out.println("\n¡¡¡ GANA P1 !!!");
                                seguir = false;
                            }
                            else if (ter.ganaJugador2())
                            {
                                System.out.println("\n¡¡¡ GANA P2 !!!");
                                seguir = false;
                            }
                            else
                            {
                                seguir = ter.quedanMovimientos();
                                if (!seguir)
                                {
                                    System.out.println("\n¡¡¡ EMPATE !!!");
                                }
                            }
                        }
                        else
                        {
                            seguir = ter.quedanMovimientos();
                            System.out.println("\n¡¡¡ EMPATE !!!");
                        }
                    }
                }
            }
                break;
            case 2:
            {
                System.out.println("\nElige el nivel de dificultad:");
                System.out.print("1. Fácil");
                System.out.println("                       2. Intermedio");
                System.out.println("3. Difícil");
                System.out.print("Dificultad: ");
                opcion = sc.nextInt();

                switch (opcion)
                {
                    case 1:
                    {
                        boolean seguir = ter.quedanMovimientos();
                        System.out.println("\nEste será vuestro tablero:");
                        ter.dibujaTablero();

                        while (seguir)
                        {
                            System.out.print("\nJ1 - Elige una posición: ");
                            int pos = sc.nextInt();
                            while (ter.movimientoInvalidoPlayer(pos))
                            {
                                System.out.print("Posición ocupada, prueba de nuevo: ");
                                pos = sc.nextInt();
                            }
                            ter.mueveJugador1(pos);

                            ter.dibujaTablero();
                            if (ter.ganaJugador1())
                            {
                                System.out.println("\n¡¡¡ GANA JUGADOR !!!");
                                seguir = false;
                            }
                            else if (ter.ganaJugador2())
                            {
                                System.out.println("\n¡¡¡ GANA CPU !!!");
                                seguir = false;
                            }
                            else
                            {
                                if (ter.quedanMovimientos())
                                {
                                    TimeUnit.SECONDS.sleep(1);
                                    System.out.print("\nCPU mueve:\n");
                                    ter.mueveOrdenador2();

                                    ter.dibujaTablero();
                                    if (ter.ganaJugador1())
                                    {
                                        System.out.println("\n¡¡¡ GANA JUGADOR !!!");
                                        seguir = false;
                                    }
                                    else if (ter.ganaJugador2())
                                    {
                                        System.out.println("\n¡¡¡ GANA CPU !!!");
                                        seguir = false;
                                    }
                                    else
                                    {
                                        seguir = ter.quedanMovimientos();
                                        if (!seguir)
                                        {
                                            System.out.println("\n¡¡¡ EMPATE !!!");
                                        }
                                    }
                                }
                                else
                                {
                                    seguir = ter.quedanMovimientos();
                                    System.out.println("\n¡¡¡ EMPATE !!!");
                                }
                            }
                        }
                    }
                        break;
                    case 2:
                    {
                        boolean seguir = ter.quedanMovimientos();
                        System.out.println("\nEste será vuestro tablero:");
                        ter.dibujaTablero();
                        int turno = 0;

                        while (seguir)
                        {
                            turno++;
                            System.out.print("\nJ1 - Elige una posición: ");
                            int pos = sc.nextInt();
                            while (ter.movimientoInvalidoPlayer(pos))
                            {
                                System.out.print("Posición ocupada, prueba de nuevo: ");
                                pos = sc.nextInt();
                            }
                            ter.mueveJugador1(pos);

                            ter.dibujaTablero();
                            if (ter.ganaJugador1())
                            {
                                System.out.println("\n¡¡¡ GANA JUGADOR !!!");
                                seguir = false;
                            }
                            else if (ter.ganaJugador2())
                            {
                                System.out.println("\n¡¡¡ GANA CPU !!!");
                                seguir = false;
                            }
                            else
                            {
                                if (ter.quedanMovimientos())
                                {
                                    TimeUnit.SECONDS.sleep(1);
                                    System.out.print("\nCPU mueve:\n");
                                    ter.mueveOrdenador2Pro(turno);

                                    ter.dibujaTablero();
                                    if (ter.ganaJugador1())
                                    {
                                        System.out.println("\n¡¡¡ GANA JUGADOR !!!");
                                        seguir = false;
                                    }
                                    else if (ter.ganaJugador2())
                                    {
                                        System.out.println("\n¡¡¡ GANA CPU !!!");
                                        seguir = false;
                                    }
                                    else
                                    {
                                        seguir = ter.quedanMovimientos();
                                        if (!seguir)
                                        {
                                            System.out.println("\n¡¡¡ EMPATE !!!");
                                        }
                                    }
                                }
                                else
                                {
                                    seguir = ter.quedanMovimientos();
                                    System.out.println("\n¡¡¡ EMPATE !!!");
                                }
                            }
                        }
                    }
                        break;
                    case 3:
                    {
                        boolean seguir = ter.quedanMovimientos();
                        System.out.println("\nEste será vuestro tablero:");
                        ter.dibujaTablero();
                        int turno = 0;

                        while (seguir)
                        {
                            turno++;
                            System.out.print("\nJ1 - Elige una posición: ");
                            int pos = sc.nextInt();
                            while (ter.movimientoInvalidoPlayer(pos))
                            {
                                System.out.print("Posición ocupada, prueba de nuevo: ");
                                pos = sc.nextInt();
                            }
                            ter.mueveJugador1(pos);

                            ter.dibujaTablero();
                            if (ter.ganaJugador1())
                            {
                                System.out.println("\n¡¡¡ GANA JUGADOR !!!");
                                seguir = false;
                            }
                            else if (ter.ganaJugador2())
                            {
                                System.out.println("\n¡¡¡ GANA CPU !!!");
                                seguir = false;
                            }
                            else
                            {
                                if (ter.quedanMovimientos())
                                {
                                    TimeUnit.SECONDS.sleep(1);
                                    System.out.print("\nCPU mueve:\n");
                                    ter.mueveOrdenador2ProV2(turno);

                                    ter.dibujaTablero();
                                    if (ter.ganaJugador1())
                                    {
                                        System.out.println("\n¡¡¡ GANA JUGADOR !!!");
                                        seguir = false;
                                    }
                                    else if (ter.ganaJugador2())
                                    {
                                        System.out.println("\n¡¡¡ GANA CPU !!!");
                                        seguir = false;
                                    }
                                    else
                                    {
                                        seguir = ter.quedanMovimientos();
                                        if (!seguir)
                                        {
                                            System.out.println("\n¡¡¡ EMPATE !!!");
                                        }
                                    }
                                }
                                else
                                {
                                    seguir = ter.quedanMovimientos();
                                    System.out.println("\n¡¡¡ EMPATE !!!");
                                }
                            }
                        }
                    }
                        break;
                    default:
                        System.out.println("\u001B[31m" + "----------ERROR----------");
                }
            }
                break;
            case 3:
            {
                System.out.println("\nElige el nivel de dificultad:");
                System.out.print("1. Fácil");
                System.out.println("                       2. Intermedio");
                System.out.println("3. Dificil");
                System.out.print("Dificultad: ");
                opcion = sc.nextInt();

                switch (opcion)
                {
                    case 1:
                    {
                        boolean seguir = ter.quedanMovimientos();
                        System.out.println("\nEste será vuestro tablero:");
                        ter.dibujaTablero();

                        while (seguir)
                        {
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("\nCPU mueve:");
                            ter.mueveOrdenador1();

                            ter.dibujaTablero();
                            if (ter.ganaJugador1())
                            {
                                System.out.println("\n¡¡¡ GANA CPU !!!");
                                seguir = false;
                            }
                            else if (ter.ganaJugador2())
                            {
                                System.out.println("\n¡¡¡ GANA JUGADOR !!!");
                                seguir = false;
                            }
                            else
                            {
                                if (ter.quedanMovimientos())
                                {
                                    System.out.print("\nJ2 - Elige una posición: \n");
                                    int pos = sc.nextInt();
                                    while (ter.movimientoInvalidoPlayer(pos))
                                    {
                                        System.out.print("Posición ocupada, prueba de nuevo: ");
                                        pos = sc.nextInt();
                                    }
                                    ter.mueveJugador2(pos);

                                    ter.dibujaTablero();
                                    if (ter.ganaJugador1())
                                    {
                                        System.out.println("\n¡¡¡ GANA CPU !!!");
                                        seguir = false;
                                    }
                                    else if (ter.ganaJugador2())
                                    {
                                        System.out.println("\n¡¡¡ GANA JUGADOR !!!");
                                        seguir = false;
                                    }
                                    else
                                    {
                                        seguir = ter.quedanMovimientos();
                                        if (!seguir)
                                        {
                                            System.out.println("\n¡¡¡ EMPATE !!!");
                                        }
                                    }
                                }
                                else
                                {
                                    seguir = ter.quedanMovimientos();
                                    System.out.println("\n¡¡¡ EMPATE !!!");
                                }
                            }
                        }
                    }
                        break;
                    case 2:
                    {
                        int turno = 0;
                        boolean seguir = ter.quedanMovimientos();
                        System.out.println("\nEste será vuestro tablero:");
                        ter.dibujaTablero();

                        while (seguir)
                        {
                            turno++;
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("\nCPU mueve:");
                            ter.mueveOrdenador1Pro(turno);

                            ter.dibujaTablero();
                            if (ter.ganaJugador1())
                            {
                                System.out.println("\n¡¡¡ GANA CPU !!!");
                                seguir = false;
                            }
                            else if (ter.ganaJugador2())
                            {
                                System.out.println("\n¡¡¡ GANA JUGADOR !!!");
                                seguir = false;
                            }
                            else
                            {
                                if (ter.quedanMovimientos())
                                {
                                    System.out.print("\nJ2 - Elige una posición: \n");
                                    int pos = sc.nextInt();
                                    while (ter.movimientoInvalidoPlayer(pos))
                                    {
                                        System.out.print("Posición ocupada, prueba de nuevo: ");
                                        pos = sc.nextInt();
                                    }
                                    ter.mueveJugador2(pos);

                                    ter.dibujaTablero();
                                    if (ter.ganaJugador1())
                                    {
                                        System.out.println("\n¡¡¡ GANA CPU !!!");
                                        seguir = false;
                                    }
                                    else if (ter.ganaJugador2())
                                    {
                                        System.out.println("\n¡¡¡ GANA JUGADOR !!!");
                                        seguir = false;
                                    }
                                    else
                                    {
                                        seguir = ter.quedanMovimientos();
                                        if (!seguir)
                                        {
                                            System.out.println("\n¡¡¡ EMPATE !!!");
                                        }
                                    }
                                }
                                else
                                {
                                    seguir = ter.quedanMovimientos();
                                    System.out.println("\n¡¡¡ EMPATE !!!");
                                }
                            }
                        }
                    }
                        break;
                    case 3:
                    {
                        int turno = 0;
                        boolean seguir = ter.quedanMovimientos();
                        System.out.println("\nEste será vuestro tablero:");
                        ter.dibujaTablero();

                        while (seguir)
                        {
                            turno++;
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("\nCPU mueve:");
                            ter.mueveOrdenador1ProV2(turno);

                            ter.dibujaTablero();
                            if (ter.ganaJugador1())
                            {
                                System.out.println("\n¡¡¡ GANA CPU !!!");
                                seguir = false;
                            }
                            else if (ter.ganaJugador2())
                            {
                                System.out.println("\n¡¡¡ GANA JUGADOR !!!");
                                seguir = false;
                            }
                            else
                            {
                                if (ter.quedanMovimientos())
                                {
                                    System.out.print("\nJ2 - Elige una posición: \n");
                                    int pos = sc.nextInt();
                                    while (ter.movimientoInvalidoPlayer(pos))
                                    {
                                        System.out.print("Posición ocupada, prueba de nuevo: ");
                                        pos = sc.nextInt();
                                    }
                                    ter.mueveJugador2(pos);

                                    ter.dibujaTablero();
                                    if (ter.ganaJugador1())
                                    {
                                        System.out.println("\n¡¡¡ GANA CPU !!!");
                                        seguir = false;
                                    }
                                    else if (ter.ganaJugador2())
                                    {
                                        System.out.println("\n¡¡¡ GANA JUGADOR !!!");
                                        seguir = false;
                                    }
                                    else
                                    {
                                        seguir = ter.quedanMovimientos();
                                        if (!seguir)
                                        {
                                            System.out.println("\n¡¡¡ EMPATE !!!");
                                        }
                                    }
                                }
                                else
                                {
                                    seguir = ter.quedanMovimientos();
                                    System.out.println("\n¡¡¡ EMPATE !!!");
                                }
                            }
                        }
                    }
                        break;
                    default:
                        System.out.println("\u001B[31m" + "----------ERROR----------");
                }

            }
                break;
            case 4:
            {
                int turno = 0;
                boolean seguir = ter.quedanMovimientos();
                System.out.println("\nEste será vuestro tablero:");
                ter.dibujaTablero();

                while (seguir)
                {
                    turno++;
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("\nCPU1 mueve:");
                    ter.mueveOrdenador1Pro(turno);

                    ter.dibujaTablero();
                    if (ter.ganaJugador1())
                    {
                        System.out.println("\n¡¡¡ GANA CPU1 !!!");
                        seguir = false;
                    }
                    else if (ter.ganaJugador2())
                    {
                        System.out.println("\n¡¡¡ GANA CPU2 !!!");
                        seguir = false;
                    }
                    else
                    {
                        if (ter.quedanMovimientos())
                        {
                            TimeUnit.SECONDS.sleep(1);
                            System.out.print("\nCPU2 mueve:\n");
                            ter.mueveOrdenador2ProV2(turno);

                            ter.dibujaTablero();
                            if (ter.ganaJugador1())
                            {
                                System.out.println("\n¡¡¡ GANA CPU1 !!!");
                                seguir = false;
                            }
                            else if (ter.ganaJugador2())
                            {
                                System.out.println("\n¡¡¡ GANA CPU2 !!!");
                                seguir = false;
                            }
                            else
                            {
                                seguir = ter.quedanMovimientos();
                                if (!seguir)
                                {
                                    System.out.println("\n¡¡¡ EMPATE !!!");
                                }
                            }
                        }
                        else
                        {
                            seguir = ter.quedanMovimientos();
                            System.out.println("\n¡¡¡ EMPATE !!!");
                        }
                    }
                }
            }
                break;
            default:
                System.out.println("\u001B[31m" + "----------ERROR----------");
        }
    }
}