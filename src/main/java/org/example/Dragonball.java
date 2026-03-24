package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Dragonball {
    static void main() {
        Scanner numero = new Scanner(System.in);
        Scanner letras = new Scanner(System.in);

        String Personaje;
        int Poder;
        int Goku = 0;
        int Debil = 0;
        int Guerrero = 0;
        int Elite = 0;


        for (int contador = 0; contador <5;contador++){

            System.out.println("Nombre de personaje? ");
            Personaje = letras.nextLine();

            System.out.println("Su nivel de poder? ");
            Poder = numero.nextInt();

            if (Poder <= 1000 && 0 <= Poder){
                Debil++;
            }
            if (Poder >1000 && Poder < 5000){
                Guerrero++;
            }
            if (Poder >= 5000 && Poder < 20000){
                Elite++;
            }
            if (Poder >= 20000){
                Goku++;
            }
        }
        System.out.println("La clase debil son: "+Debil);
        System.out.println("La clase Guerrera son: "+Guerrero);
        System.out.println("La clase Elite son: "+Elite);
        System.out.println("La clase Goku son: "+Goku);


    }













    }

