package API;

import org.json.JSONObject;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;

public class GejCoding {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        HttpURLConnection connection = (HttpURLConnection) new URL("https://geocoding-api.open-meteo.com/v1/search?name="+name+"&count=1&language=ru&format=json").openConnection();
        connection.setRequestMethod("GET");
        StringBuilder stringBuilder = new StringBuilder();

        if (connection.getResponseCode()== 200){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String line;
            while ((line = bufferedReader.readLine()) != null){
                stringBuilder.append(line);
            }
            JSONObject jsonObject = new JSONObject(stringBuilder.toString());
            if (jsonObject.keySet().contains("results")) {
                Double one = jsonObject.getJSONArray("results").getJSONObject(0).getDouble("latitude");
                Double two = jsonObject.getJSONArray("results").getJSONObject(0).getDouble("longitude");


                connection = (HttpURLConnection) new URL("https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&hourly=temperature_2m").openConnection();
                connection.setRequestMethod("GET");
                stringBuilder = new StringBuilder();

                System.out.println(one+" "+two);
            }else System.out.println("Такой город не найден");


        }
    }
}
