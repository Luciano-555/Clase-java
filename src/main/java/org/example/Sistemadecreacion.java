package org.example;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Sistemadecreacion {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int crearcuenta;
        String Logeousuario;
        String Contraseña;

        System.out.println("Elige una de las opciones para continuar: ");

        System.out.println("1 - Crear cuenta nueva: ");

        System.out.println("2 - Logeo de cuenta: ");

        System.out.println("3 - Salir de la aplicacion: ");

        crearcuenta = sc.nextInt();
        sc.nextLine();


        if (crearcuenta == 1){
            System.out.println("Ingrese su usario nuevo:  ");
            crearcuenta = sc.nextInt();
        }
        if (crearcuenta == 2){
            System.out.println("Ingrese su usuario: ");
            Logeousuario = sc.nextLine();
            System.out.println("ingrese su contraseña: ");
            Contraseña = sc.nextLine();

            if (Logeousuario.equals("Cono")&& Contraseña.equals("Nazi")){
                System.out.println("Usted ingreso correctamente :D ");

            }
            else System.out.println("Usted se logeo mal");
        }

















    }
}
