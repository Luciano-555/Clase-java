package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class NumerosParesFor {
    static void main() {
        Scanner sc = new Scanner(System.in);


        for (int contador = 1 ; contador < 21 ; contador++){

            if (contador%2==0){
                System.out.println("El numero "+contador+ " Es par");
            }
            else {
                System.out.println("El numero "+contador+ " Es impar");
            }

        }













    }
}
