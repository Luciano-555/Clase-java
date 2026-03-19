package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ASDAS {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String usuario;
        String contraseña;
        int intentos = 3;


        while (intentos > 0) {
            System.out.println("Ingrese su usuario: ");
            usuario = sc.nextLine();

            System.out.println("Ingrese su contraseña: ");
            contraseña = sc.nextLine();

            if (usuario.equals("mirth") && contraseña.equals("12345")) {
                System.out.println("Ingreso correctamente");
                break;
            }
            else {
                intentos--;
                System.out.println("Ingreso incorrectamente, vuelva a intentarlo, usted tiene intentos: "+intentos);
            }
            if (intentos == 0 ){
                System.out.println("Cuenta blqueada.");
            }
        }




















        }












    }

