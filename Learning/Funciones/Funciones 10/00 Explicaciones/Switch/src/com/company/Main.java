package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // SWITCH = Condicional múltiple (p.e: Múltiples if)

        // p.e: Día de la semana
        Scanner sc = new Scanner(System.in);

        System.out.print("Día de la semana: ");
        int a = sc.nextInt();
        System.out.println(diaSemana(a));
    }

    public static String diaSemana(int dia){

        String texto;
        switch (dia){
            case 1: texto = "Lunes"; break;
            case 2: texto = "Martes"; break;
            case 3: texto = "Miércoles"; break;
            case 4: texto = "Jueves"; break;
            case 5: texto = "Viernes"; break;
            case 6: texto = "Sábado"; break;
            case 7: texto = "Domingo"; break;

            default: texto = "ERROR"; break;
        }
        return texto;

    }


}
