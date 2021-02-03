package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, max, i;

        System.out.println();
        a = sc.nextInt();
        System.out.println();
        b = sc.nextInt();

        if (a<b){
            max = a;
        }
        else{
            max = b;
        }

        /*int tope = a * b;
        for (i = max; i <= tope; i++){
            if (i % a == 0 && i % b == 0){
                System.out.println("MCM: " + i);
                i = tope;
            }
        }*/

        i = max;
        while (!(i % a == 0 && i % b == 0)){
            i++;
        }
        System.out.println("MCM= " + i);
    }
}
