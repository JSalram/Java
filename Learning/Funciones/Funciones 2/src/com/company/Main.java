package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Indica un año y te digo si es bisiesto o no: ");
        int anno = sc.nextInt();
        if (bisiesto(anno)){
            System.out.println("Es bisiesto");
        }
        else{
            System.out.println("No es bisiesto");
        }
    }
    public static boolean bisiesto(int anno){
        boolean bisiest;
        int bis = anno % 4;
        int bis00 = anno % 100;
        if (bis == 0 && bis00 != 0){
            return true;
        }
        else{
            return false;
        }
    }
}
