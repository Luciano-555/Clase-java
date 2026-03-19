package org.example;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Nanda {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int contador = 4;
        String Logeo;



        while (contador > 0){

            System.out.println("Ingrese su usuario: ");
            Logeo = sc.nextLine();

            if (Logeo.equals("Casa")){
                System.out.println("Ingreso perfecto");
                break;
            }
            else  {
                contador--;
                if (contador == 3){
                    System.out.println("A usted le quedan: "+contador+ " intentos");
                }
                if (contador == 2){
                    System.out.println("A usted le quedan: "+contador+ " intentos");
                }
                if (contador == 1){
                System.out.println("A usted le queda: "+contador+ " intento");
                }
            }
            if (contador == 0){
                System.out.println("Cuenta bloqueada.");
            }
        }

    }













    }

