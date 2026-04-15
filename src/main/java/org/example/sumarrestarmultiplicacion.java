package org.example;

import java.util.Scanner;

import static org.example.dentrodesumarestaymulti.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class sumarrestarmultiplicacion {




    static void main() {

        Scanner sc = new Scanner(System.in);
        Scanner letras = new Scanner(System.in);

        int Num;
        int Num2;
        int eleccion;
        String json;


        System.out.println("Bienvenido al programa de Sumar,Restar O Multiplicar");
        System.out.println("1- sumar");
        System.out.println("2- Restar");
        System.out.println("3- Multiplicar");
        eleccion = sc.nextInt();

         if (eleccion == 1){
        System.out.println("Elige el primer numero a sumar: ");
        Num = sc.nextInt();

        System.out.println("Elige el segundo numero a sumar: ");
        Num2 = sc.nextInt();

        suma(Num,Num2);
         }

        if (eleccion == 2){
            System.out.println("Elige el primer numero a sumar: ");
            Num = sc.nextInt();

            System.out.println("Elige el segundo numero a sumar: ");
            Num2 = sc.nextInt();

            resta (Num,Num2);
        }
        if (eleccion == 3){
            System.out.println("Elige el primer numero a multiplicarr: ");
            Num = sc.nextInt();

            System.out.println("Elige el segundo numero a multiplicarr: ");
            Num2 = sc.nextInt();

            multi (Num,Num2);

        }










    }
}















