package com.company;

public class Main {

    public static void main(String[] args) {
//        //Todo esto son funciones
//       /* Scanner sc = new Scanner(System.in);
//        Random r = new Random();
//
//        double raiz = Math.sqrt(9);
//        int n = r.nextInt(10);
//        int n2 = sc.nextInt();
//
//        System.out.println("raiz = " + raiz);
//        System.out.println("n = " + n);
//        System.out.println("n2 = " + n2);
//
//        int f = funcion(3);
//    }
//    //Necesario poner public static en Java
//    public static int funcion(int parametro){
//        // funcion = nombre de la funcion
//
//    }
//        Función creada a mano para sumar 2 nºs

        int valor, a, b;
        a = 4;
        b = 5;

        valor = suma2(a, b);
        System.out.println(valor);
        System.out.println();
        System.out.println("a = " + a);

        System.out.println(resta2(10,5));
        System.out.println(restaGuay(24,56));
        System.out.println("Dolares: " + euroADolar(25));
        if (suspenso(6)){
            System.out.println("Mejor que te vayas pa tu casa");
        }
        else{
            System.out.println("Aprobao");
        }

        imprimeNumeros(5);
    }
    public static int suma2(int a, int b){
        int n = a + b;
        a++;
        return n;
    }
    public static int resta2(int a, int b){
        int n = a - b;
        return n;
    }
    public static int restaGuay(int a, int b) //Resta el mayor por el menor
    {
        int n;
        if (a > b) {
            n = a - b;
        }
        else {
            n = b - a;
        }
        return n;
    }
    public static double euroADolar(double euros){
        double dolares = euros * 1.1116;
        return dolares;
    }
    public static boolean suspenso(double nota){
        boolean resultado;
        if (nota < 5){
            resultado = true;
        }
        else {
            resultado = false;
        }
        return resultado;
    }
    public static void imprimeNumeros(int tope){
        int i;
        for (i = 1; i <= tope; i++){
            System.out.println(i);
        }
    }




}
