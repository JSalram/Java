package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int dia, mes, anyo, dia2, mes2, anyo2;

        System.out.println("Dime un mes (en nº) y un año y te digo los días que tiene");
        System.out.print("Mes: ");
        mes = sc.nextInt();
        System.out.print("Año: ");
        anyo = sc.nextInt();
        System.out.println("Días del mes: " + diasMes2(mes, anyo));


        System.out.print("Dime un día y te digo los días que llevan de año junto con el mes proporcionado anteriormente: ");
        dia = sc.nextInt();
        System.out.println("Días transcurridos: " + diasTranscurridos(dia, mes, anyo));

        System.out.println("Días transcurridos desde 1980: " + diasTranscurridos1980(dia, mes, anyo));

        System.out.println("Dime dos fechas y te digo los días que hay entre ellas");
        System.out.println("Primera fecha: ");
        System.out.print("Día: ");
        dia = sc.nextInt();
        System.out.print("Mes: ");
        mes = sc.nextInt();
        System.out.print("Año: ");
        anyo = sc.nextInt();

        System.out.println("Segunda fecha");
        System.out.print("Día: ");
        dia2 = sc.nextInt();
        System.out.print("Mes: ");
        mes2 = sc.nextInt();
        System.out.print("Año: ");
        anyo2 = sc.nextInt();

        System.out.println("Días entre fechas: " + diasEntreFechas(dia, mes, anyo, dia2, mes2, anyo2));

        System.out.println("Día de la semana");
        System.out.print("Día: ");
        dia = sc.nextInt();
        System.out.print("Mes: ");
        mes = sc.nextInt();
        System.out.print("Año: ");
        anyo = sc.nextInt();

        System.out.println(diaSemanaFecha(dia, mes, anyo));

    }

    public static int diasMes (int mes)
    {
        int dias;
        switch (mes){
            case 1: dias = 31; break;
            case 2: dias = 28; break;
            case 3: dias = 31; break;
            case 4: dias = 30; break;
            case 5: dias = 31; break;
            case 6: dias = 30; break;
            case 7: dias = 31; break;
            case 8: dias = 31; break;
            case 9: dias = 30; break;
            case 10: dias = 31; break;
            case 11: dias = 30; break;
            case 12: dias = 31; break;
            default:
                dias = 0;
                System.out.println("---ERROR---"); break;
        }
        return dias;
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

    public static int diasTranscurridos1980 (int dia, int mes, int anyo)
    {
        int dias1980 = 0, i;
        for (i = 1980; i < anyo; i++)
        {
            if (bisiesto(i))
            {
                dias1980 = dias1980 + 366;
            }
            else
            {
                dias1980 = dias1980 + 365;
            }
        }
        dias1980 = dias1980 + diasTranscurridos(dia, mes, anyo);
        return dias1980;
    }

    public static int diasEntreFechas (int dia1, int mes1, int anyo1, int dia2, int mes2, int anyo2)
    {
        int dias1 = diasTranscurridos1980(dia1, mes1, anyo1);
        int dias2 = diasTranscurridos1980(dia2, mes2, anyo2);
        int dif = dias2 - dias1;
        return dif;
    }

    public static int diaSemanaFecha (int dia, int mes, int anyo)
    {
        int i, diaSemana = 2, diasTotales;
        diasTotales = diasTranscurridos1980(dia, mes, anyo);
        diasTotales = diasTotales % 7; // Obviamos las semanas completas

        for (i = 1; i < diasTotales; i++){
            diaSemana++;
            if (diaSemana == 8){
                diaSemana = 1;
            }
        }
        return diaSemana;
        }
    }