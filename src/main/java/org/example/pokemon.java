package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import static org.example.listaPokemon.conseguirPokemones;


public class pokemon {

        static void main(String[] args) {
            Scanner numeros = new Scanner(System.in);
            String json;
            int numerodelista;
            try {
                System.out.println("Cuantos pokemones quiere ver? ");
                numerodelista = numeros.nextInt();

                json = conseguirPokemones(numerodelista);

                // Buscar los nombres manualmente
                int index = 0;
                int numeroposicion = 1;

                
                while ((index = json.indexOf("\"name\":\"", index)) != -1 && numeroposicion <= numerodelista) {
                    index += 8; // longitud de "name":"
                    int end = json.indexOf("\"", index);
                    String name = json.substring(index, end);

                    System.out.println(numeroposicion +". " + name);
                    index = end ;
                    numeroposicion++;
                }

            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }










