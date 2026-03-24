package org.example;

import java.util.Scanner;

public class TablaMultiplicar {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int multiplicacion;

        System.out.println("Ingrese un numero para saber la tabla: ");
        multiplicacion = sc.nextInt();

        for ( int contador = 1; contador <= 10; contador++){



            System.out.println(multiplicacion +" x "+contador+" = "+multiplicacion*contador);


        }







    }






}
