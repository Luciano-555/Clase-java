package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class listaPokemon {
     public static String conseguirPokemones (int number) throws  IOException {
        URL url = new URL("https://pokeapi.co/api/v2/pokemon?limit="+number);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestMethod("GET");

        BufferedReader br = new BufferedReader(
                new InputStreamReader(conn.getInputStream())
        );

        StringBuilder response = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {
            response.append(line);
        }

        conn.disconnect();

        String json = response.toString();
        return json;
    }
}
