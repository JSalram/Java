package com.company;

public class Main {

    public static void main(String[] args)
    {
        String frase = "¿Qué más querías que hiciera José? Éste trajo el paragüas";
        System.out.println(quitaAcentos(frase));
        System.out.println(quitaAcentos2(frase));
        System.out.println(quitaAcentos3(frase));
    }

    public static String quitaAcentos (String s)
    {
        String acentos = "ÁÉÍÓÚÜáéíóúü";
        String vocales = "AEIOUUaeiouu";
        String s2 = "";
        boolean acentuado;
        int i, j;
        for (i = 0; i < s.length(); i++)
        {
            acentuado = false;
            for (j = 0; j < acentos.length(); j++)
            {
                if (s.charAt(i) == acentos.charAt(j))
                {
                    acentuado = true;
                    s2 += vocales.charAt(j); // s2 = s2 + vocales.charAt(j);
                    j = acentos.length(); // Para salir del 2º Bucle for
                }
            }
            if (!acentuado)
            {
                s2 += s.charAt(i); // s2 = s2 + s.charAt(i);
            }
        }
        return s2;
    }
    public static String quitaAcentos2 (String s)
    {
        String acentos = "ÁÉÍÓÚÜáéíóúü";
        String vocales = "AEIOUUaeiouu";
        String s2 = "";
        int i;
        for (i = 0; i < s.length(); i++)
        {
            String caracter = String.valueOf(s.charAt(i));
            if (acentos.contains(caracter))
            {
                int pos = acentos.indexOf(caracter);
                s2 += vocales.charAt(pos);
            }
            else
            {
                s2 += s.charAt(i);
            }
        }
        return s2;
    }
    public static String quitaAcentos3 (String s)
    {
        String acentos = "ÁÉÍÓÚÜáéíóúü";
        String vocales = "AEIOUUaeiouu";
        String s2 = s;
        int i;
        for (i = 0; i < acentos.length(); i++)
        {
            s2 = s2.replace(acentos.charAt(i), vocales.charAt(i));
        }
        return s2;
    }
}
