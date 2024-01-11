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

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("cумма обмена");
        int rub = scanner.nextInt();
        System.out.println("первая валюта");
        String valute = scanner1.nextLine();
        System.out.println("вторая валюта");
        String valute2 = scanner2.nextLine();


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
            Double total = null;
            Double total2 = null;
            if (ss.keySet().contains(valute)){
                Double nom1 = ss.getJSONObject(valute).getDouble("Nominal");
                Double val1 = ss.getJSONObject(valute).getDouble("Value");

                total = rub/nom1*val1;

            }
            if (ss.keySet().contains(valute2)){
                Double nom2 = ss.getJSONObject(valute2).getDouble("Nominal");
                Double val2 = ss.getJSONObject(valute2).getDouble("Value");

                total2 = rub/nom2*val2;
            }

            Double result = total/total2*100;
            System.out.println(result);

        }


}
}
//Сделать так что из одной валюты можно перевести на другую валюту