package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class eventonocturno {
    static void main() {
        Scanner numeros = new Scanner(System.in);
        Scanner letras = new Scanner(System.in);

        int edad;
        String vip;
        String lista;


        System.out.println("Cuantos años tiene? ");
        edad = numeros.nextInt();

        if (edad >= 18 ){

            System.out.println("Tiene entrada? ");
            vip = letras.nextLine();
            if (vip.equals("Si")||vip.equals("No")){
                System.out.println("Esta en la lista vip? ");
                vip = letras.nextLine();
                if (vip.equals("Si")|| vip.equals("No")){
                    System.out.println("Esta en la lista negra? ");
                    vip = letras.nextLine();

                }
                if (vip.equals("Si")){
                    System.out.println("Usted no puede pasar");
                }
                if (vip.equals("No")){
                    System.out.println("Usted puede pasar");
                }
            }
        }
        else {
            System.out.println("Usted es menor de edad, no podra pasar.");
        }

    }





}















