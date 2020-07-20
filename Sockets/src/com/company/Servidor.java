package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor
{
    public static void main(String[] args)
    {
        ServerSocket servidor = null;
        Socket sc = null;
        DataInputStream dis;
        DataOutputStream dos;
        final int PUERTO = 5000;

        try
        {
            servidor = new ServerSocket(PUERTO);
            System.out.println("Servidor iniciado");

            while (true)
            {
                sc = servidor.accept();
                System.out.println("Cliente conectado");

                dis = new DataInputStream(sc.getInputStream());
                dos = new DataOutputStream(sc.getOutputStream());

                String msg = dis.readUTF();
                System.out.println(msg);

                dos.writeUTF("Hola Mundo desde el servidor");

                sc.close();
                System.out.println("Cliente desconectado");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
