package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese el primer numero: ");
        int Numero1=sc.nextInt();


        while (true){

            if (Numero1%2==0){
            System.out.println("Es par");

            System.out.println("Ingrese otro numero: ");
            Numero1= sc.nextInt();
            }
            else {
                System.out.println("El numero es impar");
                System.out.println("Escribe otra vez el numero");
                Numero1= sc.nextInt();
            }
        }

    }
}
