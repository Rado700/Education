package API;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class LikesCat {

    final static String API_KEY = "live_8KKGGfBSyVdace1vGasM38w5xrWZKz2bzl4qPhxzvZVVBb12ZmaDXizYk8rMoerV";

    public static void likeCat(String id) throws IOException {


        Map<String, Object> requestBodyMap = new HashMap<>();
        requestBodyMap.put("image_id", id);
        requestBodyMap.put("value", -1);

        HttpURLConnection connection = (HttpURLConnection) new URL("https://api.thecatapi.com/v1/votes?api_key=" + API_KEY).openConnection();
        connection.setRequestMethod("GET");   //GET // POST

        connection.setRequestProperty("Content-Type", "application/json");

        ObjectMapper objectMapper = new ObjectMapper();
        String requestBody = objectMapper.writeValueAsString(requestBodyMap);

        System.out.println(requestBody);


//
//        connection.setDoOutput(true);
//        OutputStream os = connection.getOutputStream();
//        byte[] input = requestBody.getBytes("utf-8");
//        os.write(input, 0, input.length);


        StringBuilder stringBuilder = new StringBuilder();


        System.out.println(connection.getResponseCode());
        if (connection.getResponseCode() == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }

            JSONArray jsonObject = new JSONArray(stringBuilder.toString());

            int total = 0;
            int diz = 0;
            for (int i = 0; i < jsonObject.length(); i++) {
                String is = jsonObject.getJSONObject(i).getString("image_id");
                if (is.equals(id)) {
                    Double obj = jsonObject.getJSONObject(i).getDouble("value");
                    if (obj > 0) {
                        total++;
                    } else {
                        diz++;
                    }
                }
            }
            System.out.println("лайки " + total);
            System.out.println("дизлайк "+ diz);
        }
    }

    public static void main(String[] args) throws IOException {

        likeCat("dnf");

    }
}
//сдлеать метод сколько лайков и диз у опр фотки по ид