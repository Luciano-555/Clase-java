package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LogeoFor {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String logeo;




        for (int conteo = 3; conteo >= 0; conteo--){

            System.out.println("Ingrese su usuario: ");
            logeo = sc.nextLine();

            if (logeo.equals("Perro")){
                System.out.println("Felicidades se logeo correctamente");
                break;

            }
            else {
                if (3 == conteo || 2 == conteo){
                    System.out.println("Le quedan "+conteo+" Intentos");
                }
                if (1 == conteo){
                    System.out.println("Le queda "+conteo+" Intento ");
                }
                if (0 == conteo)
                    System.out.println("Cuenta bloqueada");
                }
            }
        }















        }

















