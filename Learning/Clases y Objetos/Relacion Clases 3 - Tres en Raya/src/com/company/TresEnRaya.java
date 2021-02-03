package com.company;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TresEnRaya
{
    private int[] tablero;

    public TresEnRaya()
    {
        tablero = new int[9];
        this.iniciar();
    }

    public void mueveJugador1(int pos)
    {
        List<Integer> pad = new ArrayList<>(List.of(7, 8, 9, 4, 5, 6, 1, 2, 3));
        int i = pad.indexOf(pos);
        if (i >= 0  && i < 9)
        {
            tablero[i] = 1;
        }
        else
        {
            throw new InvalidParameterException("Posición inválida");
        }
    }
    public void mueveJugador2(int pos)
    {
        List<Integer> pad = new ArrayList<>(List.of(7, 8, 9, 4, 5, 6, 1, 2, 3));
        int i = pad.indexOf(pos);
        if (i >= 0  && i < 9)
        {
            tablero[i] = 2;
        }
        else
        {
            throw new InvalidParameterException("Posición inválida");
        }
    }
    public boolean movimientoValido (int pos)
    {return tablero[pos] == 0;}
    public boolean movimientoInvalidoPlayer(int pos)
    {
        List<Integer> pad = new ArrayList<>(List.of(7, 8, 9, 4, 5, 6, 1, 2, 3));
        return tablero[pad.indexOf(pos)] != 0;
    }
    public void mueveOrdenador1 ()
    {
        Random r = new Random();
        int pos = r.nextInt(9);
        while (!movimientoValido(pos))
        {
            pos = r.nextInt(9);
        }
        tablero[pos] = 1;
    }
    public void mueveOrdenador2 ()
    {
        Random r = new Random();
        int pos = r.nextInt(9);
        while (!movimientoValido(pos))
        {
            pos = r.nextInt(9);
        }
        tablero[pos] = 2;
    }
    public void mueveOrdenador1Pro (int turno)
    {
        Random r = new Random();
        int[] copia = copiaTablero();

        switch (turno)
        {
            case 1:
            {
                int[] posInic = {0, 2, 4, 6, 8};
                int pos = 2;
                while (!movimientoValido(posInic[pos]))
                {
                    pos = r.nextInt(5);
                }
                tablero[posInic[pos]] = 1;
            }
            break;
            case 2:
            case 3:
            case 4:
            case 5:
            {
                IABloquea();
                if (Arrays.equals(copia, tablero))
                {
                    int pos = r.nextInt(9);
                    while (!movimientoValido(pos))
                    {
                        pos = r.nextInt(9);
                    }
                    tablero[pos] = 1;
                }
            }
            break;
            default:
                IABloquea();
        }
    }
    public void mueveOrdenador2Pro (int turno)
    {
        Random r = new Random();
        int[] copia = copiaTablero();

        switch (turno)
        {
            case 1:
            {
                int[] posInic = {0, 2, 4, 6, 8};
                int pos = 2;
                while (!movimientoValido(posInic[pos]))
                {
                    pos = r.nextInt(5);
                }
                tablero[posInic[pos]] = 2;
            }
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            {
                IA2Bloquea();
                if (Arrays.equals(copia, tablero))
                {
                    int pos = r.nextInt(9);
                    while (!movimientoValido(pos))
                    {
                        pos = r.nextInt(9);
                    }
                    tablero[pos] = 2;
                }
            }
                break;
            default:
                throw new InvalidParameterException("Sin turnos");
        }
    }
    public void mueveOrdenador1ProV2(int turno)
    {
        Random r = new Random();
        int[] copia = copiaTablero();

        switch (turno)
        {
            case 1:
            {
                int[] posInic = {0, 2, 4, 6, 8};
                int pos = 2;
                while (!movimientoValido(posInic[pos]))
                {
                    pos = r.nextInt(5);
                }
                tablero[posInic[pos]] = 1;
            }
            break;
            case 2:
            case 3:
            case 4:
            case 5:
            {
                IAGana();
                if (Arrays.equals(copia, tablero))
                {
                    IABloquea();
                }
                if (Arrays.equals(copia, tablero))
                {
                    int pos = r.nextInt(9);
                    while (!movimientoValido(pos))
                    {
                        pos = r.nextInt(9);
                    }
                    tablero[pos] = 1;
                }
            }
            break;
            default:
                throw new InvalidParameterException("Sin turnos");
        }
    }
    public void mueveOrdenador2ProV2(int turno)
    {
        Random r = new Random();
        int[] copia = copiaTablero();

        switch (turno)
        {
            case 1:
            {
                int[] posInic = {0, 2, 4, 6, 8};
                int pos = 2;
                while (!movimientoValido(posInic[pos]))
                {
                    pos = r.nextInt(5);
                }
                tablero[posInic[pos]] = 2;
            }
            break;
            case 2:
            case 3:
            case 4:
            {
                IA2Gana();
                if (Arrays.equals(copia, tablero))
                {
                    IA2Bloquea();
                }
                if (Arrays.equals(copia, tablero))
                {
                    int pos = r.nextInt(9);
                    while (!movimientoValido(pos))
                    {
                        pos = r.nextInt(9);
                    }
                    tablero[pos] = 2;
                }
            }
            break;
            default:
                throw new InvalidParameterException("Sin turnos");
        }
    }
    public void iniciar ()
    {
        int i;
        for (i = 0; i < tablero.length; i++)
        {
            tablero[i] = 0;
        }
    }
    public boolean quedanMovimientos ()
    {
        boolean quedan = false;
        int i;
        for (i = 0; i < tablero.length; i++)
        {
            if (tablero[i] == 0)
            {
                quedan = true;
            }
        }
        return quedan;
    }
    public boolean ganaJugador1 ()
    {
        boolean ganap1 = false;
        int i;
        for (i = 0; i < 9; i++)
        {
            if (tablero[i] == 1)
            {
                if ((i == 0 || i == 3 || i == 6) &&
                        tablero[i] == tablero[i + 1] &&
                        tablero[i] == tablero[i + 2])
                {
                    ganap1 = true;
                }
                if ((i == 0 || i == 1 || i == 2) &&
                        tablero[i] == tablero[i + 3] &&
                        tablero[i] == tablero[i + 6])
                {
                    ganap1 = true;
                }
                if (i == 0 && tablero[i] == tablero[i + 4]
                        && tablero[i] == tablero[i + 8])
                {
                    ganap1 = true;
                }
                if (i == 2 && tablero[i] == tablero[i + 2]
                        && tablero[i] == tablero[i + 4])
                {
                    ganap1 = true;
                }
            }
        }
        return ganap1;
    }
    public boolean ganaJugador1(int[] tablero)
    {
        boolean ganap1 = false;
        int i;
        for (i = 0; i < 9; i++)
        {
            if (tablero[i] == 1)
            {
                if ((i == 0 || i == 3 || i == 6) &&
                        tablero[i] == tablero[i + 1] &&
                        tablero[i] == tablero[i + 2])
                {
                    ganap1 = true;
                }
                if ((i == 0 || i == 1 || i == 2) &&
                        tablero[i] == tablero[i + 3] &&
                        tablero[i] == tablero[i + 6])
                {
                    ganap1 = true;
                }
                if (i == 0 && tablero[i] == tablero[i + 4]
                        && tablero[i] == tablero[i + 8])
                {
                    ganap1 = true;
                }
                if (i == 2 && tablero[i] == tablero[i + 2]
                        && tablero[i] == tablero[i + 4])
                {
                    ganap1 = true;
                }
            }
        }
        return ganap1;
    }
    public boolean ganaJugador2 ()
    {
        boolean ganap2 = false;
        int i;
        for (i = 0; i < 9; i++)
        {
            if (tablero[i] == 2)
            {
                if ((i == 0 || i == 3 || i == 6) &&
                        tablero[i] == tablero[i + 1] &&
                        tablero[i] == tablero[i + 2])
                {
                    ganap2 = true;
                }
                if ((i == 0 || i == 1 || i == 2) &&
                        tablero[i] == tablero[i + 3] &&
                        tablero[i] == tablero[i + 6])
                {
                    ganap2 = true;
                }
                if (i == 0 && tablero[i] == tablero[i + 4]
                        && tablero[i] == tablero[i + 8])
                {
                    ganap2 = true;
                }
                if (i == 2 && tablero[i] == tablero[i + 2]
                        && tablero[i] == tablero[i + 4])
                {
                    ganap2 = true;
                }
            }
        }
        return ganap2;
    }
    public boolean ganaJugador2(int[] tablero)
    {
        boolean ganap2 = false;
        int i;
        for (i = 0; i < 9; i++)
        {
            if (tablero[i] == 2)
            {
                if ((i == 0 || i == 3 || i == 6) &&
                        tablero[i] == tablero[i + 1] &&
                        tablero[i] == tablero[i + 2])
                {
                    ganap2 = true;
                }
                if ((i == 0 || i == 1 || i == 2) &&
                        tablero[i] == tablero[i + 3] &&
                        tablero[i] == tablero[i + 6])
                {
                    ganap2 = true;
                }
                if (i == 0 && tablero[i] == tablero[i + 4]
                        && tablero[i] == tablero[i + 8])
                {
                    ganap2 = true;
                }
                if (i == 2 && tablero[i] == tablero[i + 2]
                        && tablero[i] == tablero[i + 4])
                {
                    ganap2 = true;
                }
            }
        }
        return ganap2;
    }
    public void IABloquea()
    {
        int i;
        for (i = 0; i < tablero.length; i++)
        {
            int[] copia = copiaTablero();
            if (movimientoValido(i))
            {
                copia[i] = 2;
                if (ganaJugador2(copia))
                {
                    tablero[i] = 1;
                    i = tablero.length;
                }
            }
        }
    }
    public void IA2Bloquea()
    {
        int i;
        for (i = 0; i < tablero.length; i++)
        {
            int[] copia = copiaTablero();
            if (movimientoValido(i))
            {
                copia[i] = 1;
                if (ganaJugador1(copia))
                {
                    tablero[i] = 2;
                    i = tablero.length;
                }
            }
        }
    }
    public void IAGana()
    {
        int i;
        for (i = 0; i < tablero.length; i++)
        {
            if (movimientoValido(i))
            {
                int[] copia = copiaTablero();
                copia[i] = 1;
                if (ganaJugador1(copia))
                {
                    tablero[i] = 1;
                    i = tablero.length;
                }
            }
        }
    }
    public void IA2Gana()
    {
        int i;
        for (i = 0; i < tablero.length; i++)
        {
            int[] copia = copiaTablero();
            if (movimientoValido(i))
            {
                copia[i] = 2;
                if (ganaJugador2(copia))
                {
                    tablero[i] = 2;
                    i = tablero.length;
                }
            }
        }
    }
    public int[] copiaTablero ()
    {
        int[] copia = new int[tablero.length];
        int i;
        for (i = 0; i < tablero.length; i++)
        {
            copia[i] = tablero[i];
        }
        return copia;
    }
    public void dibujaTablero ()
    {
        int i;
        System.out.println("―――――――――――――");
        for (i = 0; i < 9; i++)
        {
            if (tablero[i] == 1)
            {
                System.out.print("║ X ");
            }
            else if (tablero[i] == 2)
            {
                System.out.print("║ O ");
            }
            else
            {
                System.out.print("║   ");
            }

            if (i == 2 || i == 5 || i == 8)
            {
                System.out.println("║");
                System.out.println("―――――――――――――");
            }
        }
    }
}
