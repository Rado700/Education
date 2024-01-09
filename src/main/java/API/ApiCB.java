package API;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.net.http.HttpRequest;
import java.util.Scanner;

public class ApiCB {
    public static void main(String[] args) throws URISyntaxException, IOException {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        String valute = scanner1.nextLine();
        int rub = scanner.nextInt();

        HttpURLConnection connection = (HttpURLConnection) new URL("https://www.cbr-xml-daily.ru/daily_json.js").openConnection();
        connection.setRequestMethod("GET");
        StringBuilder responseStringBuilder = new StringBuilder();

        if (connection.getResponseCode() == 200){

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));


            String line;

            while ((line = reader.readLine()) != null) {
                responseStringBuilder.append(line);
            }
            JSONObject jsonResponse = new JSONObject(responseStringBuilder.toString());

            JSONObject ss = jsonResponse.getJSONObject("Valute");
            if (ss.keySet().contains(valute)){
                Double nom = ss.getJSONObject(valute).getDouble("Nominal");
                Double sp = ss.getJSONObject(valute).getDouble("Value");
                Double total = rub/nom*sp;
                System.out.println(total);
            }

            System.out.println(ss);
        }


}
}
//Сделать так что из одной валюты можно перевести на другую валюту