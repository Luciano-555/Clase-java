package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class asdasdasdas {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int contador = 3;
        String Usuario;



        while (contador > 0){
            System.out.println("Ingrese el usuario: ");
            Usuario = sc.nextLine();

            if (Usuario.equals("Perro")){
                System.out.println("Felicidades ingreso correctamente: ");
                break;
            }
            else{ contador--;
                System.out.println("Le quedan: "+contador +"  intentos");
            }
            if (contador == 0){
                System.out.println("Cuenta bloqueada.");
            }
        }




















    }
}
