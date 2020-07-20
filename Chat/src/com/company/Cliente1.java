package com.company;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Cliente1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final String HOST = "127.0.0.1";
        final int PUERTO = 5000;
        DataInputStream dis;
        DataOutputStream dos;

        try
        {
            Socket socket = new Socket(HOST, PUERTO);

            while (true)
            {
                dos = new DataOutputStream(socket.getOutputStream());

                System.out.print("Mensaje: ");
                String msg = sc.nextLine();
                dos.writeUTF("C1: " + msg);

                if (msg.equals("exit"))
                {
                    socket.close();
                    System.out.println("Desconectado con éxito");
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
