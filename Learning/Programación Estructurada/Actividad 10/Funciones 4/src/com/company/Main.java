package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        imprimeSerie(a,b);

    }
    public static int imprimeSerie(int a, int b){
        int num;
        if (a > b){
            for (num = a; a==b; num++){
                System.out.println(num);
            }
            }
        else{
            for (num = b; a==b; num++){
                System.out.println(num);
            }
        }
        return num;
    }

}
