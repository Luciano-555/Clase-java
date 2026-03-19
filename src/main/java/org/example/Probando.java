package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Probando {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int contador = 3;
        String usuario;
        String contraseña;




        while (contador > 0){
            System.out.println("Ingrese su nombre de usuario: ");
            usuario = sc.nextLine();

            System.out.println("Ingrese su contraseña: ");
            contraseña = sc.nextLine();

            if (usuario.equals("Casa")&& contraseña.equals("Mesa")){
                System.out.println("Se logeo correctamente.");
            }
            else{ contador--;
                System.out.println("Usted tiene " +contador + " De intentos ");
            }
            if (contador == 0){
                System.out.println("Cuenta bloqueada.");
            }
        }










    }
}
