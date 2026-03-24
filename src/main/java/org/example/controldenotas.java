package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class controldenotas {
    static void main() {
        Scanner numeros = new Scanner(System.in);
        Scanner letras = new Scanner(System.in);


        int Notas;
        int Aprobado= 0;
        int Desaprobado = 0;


        for (int contador = 0; contador < 5; contador++){
            System.out.println("Ingrese la nota del alumno: ");
            Notas = numeros.nextInt();

            if (Notas >= 6 ){
                Aprobado++;
            }
            if (Notas < 6 && Notas >= 0){
                Desaprobado++;
            }
        }
        System.out.println("La cantidad de aprobados son: "+Aprobado);
        System.out.println("La cantidad de  reprobados son: "+Desaprobado);



















    }
}
