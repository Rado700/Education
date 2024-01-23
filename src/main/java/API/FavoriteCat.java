package API;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.HTTP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class FavoriteCat {


    final static String API_KEY = "live_8KKGGfBSyVdace1vGasM38w5xrWZKz2bzl4qPhxzvZVVBb12ZmaDXizYk8rMoerV";

    public static void addFavoriteCat(String id) throws IOException {

        Map<String,String>map = new HashMap<>();
        map.put("image_id",id);


        HttpURLConnection connection = (HttpURLConnection) new URL("https://api.thecatapi.com/v1/favourites?api_key="+API_KEY).openConnection();
        connection.setRequestMethod("POST");   //GET // POST

        connection.setRequestProperty("Content-Type","application/json");

        ObjectMapper objectMapper = new ObjectMapper();
        String requestBody = objectMapper.writeValueAsString(map);

        System.out.println(requestBody);

        connection.setDoOutput(true);
        OutputStream os = connection.getOutputStream();
        byte[] input = requestBody.getBytes("utf-8");
        os.write(input, 0, input.length);


        System.out.println(connection.getResponseCode());
        StringBuilder stringBuilder = new StringBuilder();
//        if (connection.getResponseCode() == 200){

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));


            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }

            System.out.println(stringBuilder);

        }
//    }

    public static void putFavoriteCat(Object id) throws IOException {

        Map<String ,Object> map = new HashMap<>();
        map.put("id",id);
        map.put("value",22);

        HttpURLConnection connection = (HttpURLConnection) new URL("https://api.thecatapi.com/v1/favourites?api_key="+API_KEY).openConnection();
        connection.setRequestMethod("PUT");

        connection.setRequestProperty("Content-Type","application/json");

        ObjectMapper mapper = new ObjectMapper();
        String requestBody = mapper.writeValueAsString(map);

        connection.setDoOutput(true);
        OutputStream ss = connection.getOutputStream();
        byte[] input = requestBody.getBytes("utf-8");
        ss.write(input,0,input.length);

        System.out.println(connection.getResponseCode());
        StringBuilder stringBuilder = new StringBuilder();


        if (connection.getResponseCode() == 200){

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String line;
            while ((line = bufferedReader.readLine()) != null){
                stringBuilder.append(line);
            }

            System.out.println(stringBuilder);
        }

    }


    public static void deleteFavoriteCat(String id) throws IOException {

//        Map<String,String>map = new HashMap<>();
//        map.put("image_id",id);


        HttpURLConnection connection = (HttpURLConnection) new URL("https://api.thecatapi.com/v1/favourites/"+id+"?api_key="+API_KEY).openConnection();
        connection.setRequestMethod("DELETE");   //GET // POST //DELETE //PUT -workHome

//        connection.setRequestProperty("Content-Type","application/json");

//        ObjectMapper objectMapper = new ObjectMapper();
//        String requestBody = objectMapper.writeValueAsString(map);
//
//        System.out.println(requestBody);
//
//        connection.setDoOutput(true);
//        OutputStream os = connection.getOutputStream();
//        byte[] input = requestBody.getBytes("utf-8");
//        os.write(input, 0, input.length);


        System.out.println(connection.getResponseCode());
        StringBuilder stringBuilder = new StringBuilder();
//        if (connection.getResponseCode() == 200){

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));


        String line;
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line);
        }

        System.out.println(stringBuilder);

    }
//    }



    public static void main(String[] args) throws IOException {
     //   addFavoriteCat("dnf");
      //  deleteFavoriteCat("232432926");
        putFavoriteCat(1153616);
    }
}
