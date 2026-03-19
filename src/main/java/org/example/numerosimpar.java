package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class numerosimpar {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int Numero;


        System.out.println("Ingrese el primer numero: ");
        Numero = sc.nextInt();



        while (Numero !=-1){

            if (Numero % 2 == 0){
                System.out.println("El numero " +Numero+ " Es par");

            }
            else{ System.out.println("El numero " +Numero+ " Es impar");
            }

            System.out.println("Ingrese el primer numero: ");
            Numero = sc.nextInt();

        }
        System.out.println("Fin de la aplicacion");
















    }
}
