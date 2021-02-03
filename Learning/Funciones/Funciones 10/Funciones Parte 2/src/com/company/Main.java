package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int h, min, seg, h2, min2, seg2, anyo, mes, dia;

        System.out.println("Dime horas, minutos y segundos y te digo el total de segundos");
        System.out.print("Horas: ");
        h = sc.nextInt();
        System.out.print("Minutos: ");
        min = sc.nextInt();
        System.out.print("Segundos: ");
        seg = sc.nextInt();

        System.out.println("Segundos totales: " + horaASegundos(h, min, seg) + " segs");

        System.out.print("La hora que has introducido es ");
        escribeHoraBonita(h, min, seg);

        System.out.println();

        System.out.print("Dime una cantidad en segundos y te digo la hora a la que equivale: ");
        seg = sc.nextInt();
        escribeSegundosBonito(seg);

        System.out.println();

        System.out.println("Dime dos horas (h, min y seg) y te digo la diferencia de segundos entre ellas");
        System.out.println("Primera hora:");
        System.out.print("Hora: ");
        h = sc.nextInt();
        System.out.print("Minutos: ");
        min = sc.nextInt();
        System.out.print("Segundos: ");
        seg = sc.nextInt();

        System.out.println("Segunda hora:");
        System.out.print("Hora: ");
        h2 = sc.nextInt();
        System.out.print("Minutos: ");
        min2 = sc.nextInt();
        System.out.print("Segundos: ");
        seg2 = sc.nextInt();

        System.out.println("Diferencia en segundos: " + segundosTranscurridos(h, min, seg, h2, min2, seg2));

        System.out.println();
        System.out.println("Dime una fecha (año, mes y día) con su hora correspondiente (hora, minutos y segundos) y te digo los segundos que han transcurrido desde 1980:");
        System.out.print("Año: ");
        anyo = sc.nextInt();
        System.out.print("Mes: ");
        mes = sc.nextInt();
        System.out.print("Día: ");
        dia = sc.nextInt();
        System.out.print("Hora: ");
        h = sc.nextInt();
        System.out.print("Minutos: ");
        min = sc.nextInt();
        System.out.print("Segundos: ");
        seg = sc.nextInt();

        System.out.println("Los segundos transcurridos hasta esta fecha son: " + segundosTranscurridos1980(dia, mes, anyo, h, min, seg));
    }

    public static int horaASegundos (int h, int min, int seg)
    {
        int segundos;
        segundos = (h * 3600) + (min * 60) + seg;
        return segundos;
    }

    public static void escribeHoraBonita (int h, int min, int seg)
    {
        int HH, MM, SS, segundos;
        segundos = horaASegundos(h, min, seg);
        HH = segundos / 3600;
        MM = segundos % 3600 / 60;
        SS = segundos % 3600 % 60;

        if (HH < 9){
            HH = Integer.parseInt("0" + HH);
        }
        if (MM < 9){
            MM = Integer.parseInt("0" + MM);
        }
        if (SS < 9){
            SS = Integer.parseInt("0" + SS);
        }

        System.out.println(HH + ":" + MM + ":" + SS);
    }

    public static void escribeSegundosBonito (int seg)
    {
        int HH, MM, SS;
        HH = seg / 3600;
        MM = seg % 3600 / 60;
        SS = seg % 3600 % 60;

        if (HH <= 9){
            HH = Integer.parseInt("0" + HH);
        }
        if (MM <= 9){
            MM = Integer.parseInt("0" + MM);
        }
        if (SS <= 9){
            SS = Integer.parseInt("0" + SS);
        }

        System.out.println(HH + ":" + MM + ":" + SS);
    }

    public static int segundosTranscurridos (int h1, int min1, int seg1, int h2, int min2, int seg2)
    {
        int secs1, secs2, dif;
        secs1 = horaASegundos(h1, min1, seg1);
        secs2 = horaASegundos(h2, min2, seg2);
        dif = secs1 - secs2;
        if (dif < 0){
            dif = dif * (-1);
        }
        return dif;
    }

    public static boolean bisiesto (int anyo)
    {
        boolean bis;
        if (anyo % 4 == 0 && anyo % 100 != 0 || anyo % 400 == 0){
            bis = true;
        }
        else {
            bis = false;
        }
        return bis;
    }

    public static int diasMes (int mes)
    {
        int dias;
        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31; break;
            case 2:
                dias = 28; break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30; break;
            default:
                dias = 0;
                System.out.println("---ERROR---");
        }
        return dias;
    }

    public static int diasMes2(int mes, int anyo)
    {
        int dias;
        if(bisiesto(anyo) && mes == 2) {
            dias = 29;
        }
        else {
            dias = diasMes(mes);
        }
        return dias;
    }

    public static int diasTranscurridos (int dia, int mes, int anyo)
    {
        int dias = 0, i;
        for (i = 1; i < mes; i++) {
            dias = dias + diasMes2(i, anyo);
        }
        dias = dias + dia;
        return dias;
    }

    public static int segundosTranscurridos1980 (int dia, int mes, int anyo, int h, int min, int seg)
    {
    int segundos, i, dias1980 = 0;
        for (i = 1980; i < anyo; i++) {
            if (bisiesto(i)) {
                dias1980 = dias1980 + 366;
            }
            else {
                dias1980 = dias1980 + 365;
            }
        }
        dias1980 = dias1980 + diasTranscurridos(dia, mes, anyo);
        segundos = ((dias1980 -1) * 24 * 3600) + (h * 3600) + (min * 60) + seg;
        return segundos;
    }
}