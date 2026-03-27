package org.example;

import java.util.Scanner;

public class sorpresasiete {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int sorpresa;
        int numerosorpresa;

        System.out.println("Ingrese el numero sorpresa: ");
        numerosorpresa = sc.nextInt();

        System.out.println("Ingresa un numero y encuentra el numero secreto !!");
        sorpresa = sc.nextInt();


        while (sorpresa !=numerosorpresa ){



            if (sorpresa < numerosorpresa){
                System.out.println("Su numero es menor, ingrese nuevamente: ");
            } else {
                System.out.println("Su numero es mayor, ingrese nuevamente: ");
            }
            sorpresa = sc.nextInt();


        }
        System.out.println("Encontraste el numero secreto!! ");




    }






}
