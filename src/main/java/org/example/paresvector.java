package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class paresvector {
    static void main() {
        Scanner letras = new Scanner(System.in);


        int [] enteros = {  0, 4 ,5 ,7 ,8 ,9 ,20 ,12 ,10 ,3};

       for (int contador = 0; contador < enteros.length;contador++){


           if (enteros[contador] % 2 == 0){
               System.out.println("Estamos posicionados en: "+contador);
               System.out.println("El numero par es: "+enteros[contador]);
               System.out.println("-------------");
           }
        }













    }
    }

