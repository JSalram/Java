package com.company;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("¡Bienvenido al 'generaCartonBingo'!");
        System.out.print("Indica el nombre que quieres ponerle al cartón: ");
        String s = sc.next() + ".bingo";

        generaCartonBingo("..\\Ficheros\\" + s);
        System.out.println();
        System.out.println("Fichero '" + s + "' generado con éxito.");
    }

    public static void generaCartonBingo (String s)
    {
        Random r = new Random();
        int i, numRandom = r.nextInt(90) + 1;;
        List<Integer> nums = new LinkedList<>();

        for (i = 0; i < 15; i++)
        {
            while (nums.contains(numRandom))
            {
                numRandom = r.nextInt(90) + 1;
            }
                nums.add(numRandom);
        }
        Collections.sort(nums);

        try
        {
            FileOutputStream fos = new FileOutputStream(s);
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeUTF("BINGO");

            for (i = 0; i < nums.size(); i++)
            {
                dos.writeInt(nums.get(i));
            }

            dos.close();
            fos.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
