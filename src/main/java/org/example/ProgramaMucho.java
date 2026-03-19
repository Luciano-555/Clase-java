package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ProgramaMucho {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Scanner letras = new Scanner(System.in);

        int opcion = 0;
        int Numeros;
        int Sumador = 0;
        String Nombre;

        while (opcion !=3){
            System.out.println("Bienvenido al proyecto");
            System.out.println("1)Hara que muestre su nombre en pantalla: ");
            System.out.println("2)Hara sumas, solo debe ingresar numeros y le dara la suma en pantalla: ");
            System.out.println("3)Saldra del programa");
            opcion = sc.nextInt();

            if (opcion == 1){
                System.out.println("Ingrese su nombre por favor: ");
                Nombre = letras.nextLine();
                System.out.println("Su nombre es: "+Nombre);
            }
            if (opcion == 2){
                System.out.println("Ingrese los numeros a sumar: ");
                Numeros = sc.nextInt();

                while (Numeros !=-1) {
                    Sumador = Sumador + Numeros;
                    System.out.println("Ingrese los numeros a sumar: ");
                    Numeros = sc.nextInt();
                }
                System.out.println("El resultado es: "+Sumador);
            }
        }
        System.out.println("Programa cerrado.");

    }}















