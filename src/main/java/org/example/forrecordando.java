package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class forrecordando {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Scanner letras = new Scanner(System.in);


        String contrasenia = "Lucha";
        String usuarioingresar;
        String contraseñaingresar;




        System.out.println("Ingrese su usuario: ");
        usuarioingresar = letras.nextLine();

        for (int intentos = 1; intentos < 5 ; intentos++)
        {

            if (usuarioingresar.equals(contrasenia)){
                System.out.println("Felicidades entro en la pagina");
                break;
            }

            System.out.println("Error le quedan: "+intentos+ " De intentos de 4");
            usuarioingresar = letras.nextLine();


        }







    }





}















