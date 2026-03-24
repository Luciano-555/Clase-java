package org.example;

import java.util.Scanner;

public class Trabajoia {
    static void main() {
        Scanner sc = new Scanner(System.in);


        int suma;
        int resta;
        int division;
        int multiplicacion;
        int resultado;
        int Eleccion;

        System.out.println("Bienvenido al programa de la calculadora: ");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Dividir");
        System.out.println("4 - Multiplicacion");
        System.out.println("Ingrese un numero para continuar: ");
        Eleccion = sc.nextInt();

        if (Eleccion == 1){
            System.out.println("Ingrese el primer numero a sumar: ");
            suma = sc.nextInt();

            System.out.println("Ingrese el segundo numero a sumar: ");
            Eleccion = sc.nextInt();

            resultado = suma +  Eleccion;

            System.out.println("El resultado de: " +suma+ " + "+ Eleccion+ " Es " +resultado);
        }
        if (Eleccion == 2){
            System.out.println("Ingrese el primer numero a restar: ");
            resta = sc.nextInt();

            System.out.println("Ingrese el segundo numero a restar: ");
            Eleccion = sc.nextInt();

            resultado = resta -  Eleccion;

            System.out.println("El resultado de: " +resta+ " - "+ Eleccion+ " Es " +resultado);
        }
        if (Eleccion == 3){
            System.out.println("Ingrese el primer numero a dividir: ");
            division = sc.nextInt();

            System.out.println("Ingrese el segundo numero a dividir: ");
            Eleccion = sc.nextInt();

            resultado = division /  Eleccion;

            System.out.println("El resultado de: " +division+ " / "+ Eleccion+ " Es " +resultado);
        }
        if (Eleccion == 4){
            System.out.println("Ingrese el primer numero a multiplicar: ");
            multiplicacion = sc.nextInt();

            System.out.println("Ingrese el segundo numero a multiplicar: ");
            Eleccion = sc.nextInt();

            resultado = multiplicacion *  Eleccion;

            System.out.println("El resultado de: " +multiplicacion+ " * "+ Eleccion+ " Es " +resultado);
        }








    }






}
