package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Dni {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String Nombredeusuario;
        String Contrasena;


        System.out.println("Ingrese el nombre de usuario: ");
        Nombredeusuario = sc.nextLine();

        System.out.println("Ingrese la contraseña: ");
        Contrasena = sc.nextLine();


        if (Nombredeusuario.equals("Fabrica")&& Contrasena.equals("Pollo")){
            System.out.println("Felicidades ingreso correctamente!!");
        }
        else{ System.out.println("Error de credenciales.");}






    }
}
