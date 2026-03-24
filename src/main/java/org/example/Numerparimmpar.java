package org.example;

import java.util.Scanner;

public class Numerparimmpar {
    static void main() {
        Scanner sc = new Scanner(System.in);


        for (int contador = 0; contador <= 50; contador++){

            System.out.print(contador);

            if (contador %2==0){
                System.out.print(" - Par");
            }else System.out.print(" - Impar");

            System.out.println();
        }

}}
