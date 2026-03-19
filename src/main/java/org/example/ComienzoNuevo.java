package org.example;

import java.util.Scanner;

public class ComienzoNuevo {
    static void main() {
        Scanner sc = new Scanner(System.in);




        System.out.println("Escribe su primer Nombre: ");
        String Nombre=sc.nextLine();

        System.out.println("Ahora escriba su apellido: ");
        String Apellido=sc.nextLine();

        System.out.println("Cuantos años tiene? ");


        int Edad = sc.nextInt();
        System.out.println("Su nombre es: " );
        System.out.println("" +Nombre    );

        System.out.println("Su apellido es: ");
        System.out.println("" +Apellido);

        System.out.println("Su edad: " );
        System.out.println("" +Edad);

        if (Edad >= 18){
            System.out.println("Usted es mayor de edad");
        }
        if (Edad <= 17){
            System.out.println("Usted es menor de edad;");
        }



    }
}
