package API;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GejCoding {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        ZoneId timeZone = ZoneId.systemDefault();
        LocalDateTime time = LocalDateTime.now();

        HttpURLConnection connection = (HttpURLConnection) new URL("https://geocoding-api.open-meteo.com/v1/search?name=" + name + "&count=1&language=ru&format=json").openConnection();
        connection.setRequestMethod("GET");
        StringBuilder stringBuilder = new StringBuilder();

        if (connection.getResponseCode() == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
            JSONObject jsonObject = new JSONObject(stringBuilder.toString());
            if (jsonObject.keySet().contains("results")) {
                Double one = jsonObject.getJSONArray("results").getJSONObject(0).getDouble("latitude");
                Double two = jsonObject.getJSONArray("results").getJSONObject(0).getDouble("longitude");

                System.out.println(one + " " + two);
                System.out.println();

                String url = "https://api.open-meteo.com/v1/forecast?latitude=" + one + "&longitude=" + two + "&hourly=temperature_2m&timezone=" + timeZone + "&forecast_days=3";
                connection = (HttpURLConnection) new URL(url).openConnection();
                connection.setRequestMethod("GET");

                StringBuilder stringBuilder1 = new StringBuilder();
                if (connection.getResponseCode() == 200) {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

                    String line2;
                    while ((line2 = reader.readLine()) != null) {
                        stringBuilder1.append(line2);
                    }
                    JSONObject jsonObject1 = new JSONObject(stringBuilder1.toString());
                    if (jsonObject1.keySet().contains("hourly")) {

                        JSONArray times = jsonObject1.getJSONObject("hourly").getJSONArray("time");

                        for (int i = 0; i < times.length() -1; i++) {
                            String tempTime1 = times.getString(i);
                            String tempTime2 = times.getString(i + 1);


                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
                            LocalDateTime time1 = LocalDateTime.parse(tempTime1, formatter);
                            LocalDateTime time2 = LocalDateTime.parse(tempTime2, formatter);

                            if (time.isAfter(time1) && time.isBefore(time2)){
                                Double tempNow = jsonObject1.getJSONObject("hourly").getJSONArray("temperature_2m").getDouble(i);
                                System.out.println(tempNow);
                        }

/// Нужно реализовать чтоб поль вводил время и дату в течений 3 дней в формате 13.01.2024 20:00 через DateTimeFormatter и выдать температуру
                    }
                }


                System.out.println();
                System.out.println(time);
            }
        } else {
            System.out.println("Такой город не найден");
        }

    }
}
}
