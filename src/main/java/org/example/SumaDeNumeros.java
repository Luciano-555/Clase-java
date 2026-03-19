package org.example;

import java.io.FilterOutputStream;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SumaDeNumeros {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int Num = 0;
        int Resultado = 0;



        while(Num !=-1){
            System.out.println("Ingrese otro numero: ");
            Num = sc.nextInt();


            if (Num !=-1){
                Resultado = Resultado+Num;
                System.out.println("La suma actual es: "+Resultado);
            }

        }
        System.out.println("El resultado es: " +Resultado);













    }
}
