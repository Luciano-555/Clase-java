package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String usuario;
        String contraseña;


        for (int contador = 1; contador <= 4; contador++){

            System.out.println("Ingrese su usuario: ");
            usuario = sc.nextLine();

            System.out.println("Ingrese su contraseña: ");
            contraseña = sc.nextLine();

            if (usuario.equals("Perro") && contraseña.equals("Perra")){
                System.out.println("Ingreso correctamente");
                break;
            }
            System.out.println("A usted le quedan "+(4 - contador) + " Intentos");
        }
        System.out.println("Cuenta bloqueada");







    }
}
