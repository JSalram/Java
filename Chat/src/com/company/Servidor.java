package com.company;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ServerSocket servidor = null;
        Socket s = null;
        Socket s2 = null;
        DataInputStream dis;
        DataOutputStream dos;
        final int PUERTO = 5000;

        try
        {
            servidor = new ServerSocket(PUERTO);
            System.out.println("Servidor iniciado");

            while (true)
            {
                if (s == null)
                {
                    s = servidor.accept();
                }
                if (s2 == null)
                {
                    s2 = servidor.accept();
                }

                System.out.println("Cliente conectado");

                dis = new DataInputStream(s.getInputStream());

                String msg = dis.readUTF();
                System.out.println(msg);

                s.close();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
