package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10 primeros números pares:");
        int n = 0;
        for (int cont = 0; ; cont++ ){
            if ((n%2) == 0){
                System.out.println(n);
            }
            n++;
        }
    }
}
