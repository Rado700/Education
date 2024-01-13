package API;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class LikesCat {

    final static String API_KEY = "live_8KKGGfBSyVdace1vGasM38w5xrWZKz2bzl4qPhxzvZVVBb12ZmaDXizYk8rMoerV";

    public static void likeCat(String id) throws IOException {


        Map<String, Object> requestBodyMap = new HashMap<>();
        requestBodyMap.put("image_id", id);
        requestBodyMap.put("value", 1);
        HttpURLConnection connection = (HttpURLConnection) new URL("https://api.thecatapi.com/v1/votes?api_key=" + API_KEY).openConnection();
        connection.setRequestMethod("POST");

        connection.setRequestProperty("Content-Type", "application/json");

        ObjectMapper objectMapper = new ObjectMapper();
        String requestBody = objectMapper.writeValueAsString(requestBodyMap);

        System.out.println(requestBody);

        StringBuilder stringBuilder = new StringBuilder();
        connection.setDoOutput(true);

        OutputStream os = connection.getOutputStream();
        byte[] input = requestBody.getBytes("utf-8");
        os.write(input, 0, input.length);



        System.out.println(connection.getResponseCode());
        if (connection.getResponseCode() == 201) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }

            System.out.println(stringBuilder);

        }
    }


    public static void main(String[] args) throws IOException {

        likeCat("dnf");

    }
}
//сдлеать метод сколько лайков и диз у опр фотки по ид