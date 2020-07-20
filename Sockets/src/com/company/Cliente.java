package com.company;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Cliente
{
    public static void main(String[] args)
    {
        final String HOST = "127.0.0.1";
        final int PUERTO = 5000;
        DataInputStream dis;
        DataOutputStream dos;

        try
        {
            Socket sc = new Socket(HOST, PUERTO);

            dis = new DataInputStream(sc.getInputStream());
            dos = new DataOutputStream(sc.getOutputStream());

            dos.writeUTF("Hola mundo desde el cliente");
            String msg = dis.readUTF();
            System.out.println(msg);

            sc.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
