package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class veintenumeros {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int suma;

        int Resultado = 0;


        System.out.println("Ingrese el primer numero: ");
        suma = sc.nextInt();


        while (suma !=-1){
            Resultado = suma+Resultado;
            System.out.println("Ingrese el otro numero a sumar: ");
            suma = sc.nextInt();

        }
        System.out.println("El resultado es: "+Resultado);





        }















        }

















