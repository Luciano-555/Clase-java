package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AlumnoPrueba {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String Nombre;
        int Nota;
        int Nota2;
        int Nota3;
        int Examen;

        System.out.println("Nombre del Alumno?: ");
        Nombre = sc.nextLine();

        System.out.println("Ingrese su primer nota: ");
        Nota = sc.nextInt();

        System.out.println("Ingrese su segunda nota: ");
        Nota2 = sc.nextInt();

        System.out.println("Ingrese su tecer nota: ");
        Nota3 = sc.nextInt();

        Examen = (Nota + Nota2+ Nota3)/3;

        if (Examen >= 8 ){
            System.out.println("El alumno "+ Nombre + " Promociono la materia con: "+Examen);
        }

        if (Examen >= 6 && Examen < 8 ){
            System.out.println("El alumno " + Nombre+ " Aprobo la materia con: "+Examen);
        }

        if (Examen <= 5 && Examen > 0){
            System.out.println("El alumno " +Nombre+ " Reprobo la materia con: "+Examen);
        }














    }
}
