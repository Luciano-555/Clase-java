package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class whileparaatras {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int contador = 1;
        int Numero;

        System.out.println("Ingrese el numero que quiere para llegar a 1: ");
        Numero = sc.nextInt();

        while (contador <= Numero){


            System.out.println("El contador va: "+Numero);
            Numero--;

        }



    }}













