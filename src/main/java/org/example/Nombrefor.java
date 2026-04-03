package org.example;

import java.util.Scanner;

public class Nombrefor {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String[] nombresArray = {"ana", "Juan", "alcalde", "Pedro", "Azul", "CArlos", "Armando", "anastasio"};
        String nombreAAnalizar;
        String letra;


        for (int contador = 0; contador < nombresArray.length; contador++){

            nombreAAnalizar = nombresArray[contador];

            //if (nombreAAnalizar.contains("A")){
                //System.out.println("Los nombres con A son: "+nombresArray[contador]);
            //}
            //if (nombreAAnalizar.charAt(0) == 'A' || nombreAAnalizar.charAt(0) == 'a'){
                //System.out.println("Los nombres con A son: "+nombresArray[contador]);
            //}

           // letra = String.valueOf(nombreAAnalizar.charAt(0));
            //if (letra.equalsIgnoreCase("A")){
                //System.out.println("Los nombres con A son: "+nombresArray[contador]);
            //}

        }







    }






}
