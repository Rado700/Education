package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phone_book {
    Connection connection;

    public Phone_book() {
        try {

            String jdbcUrl = DatabaseConfig.getDbUrl();
            String user = DatabaseConfig.getDbUsername();
            String password = DatabaseConfig.getDbPassword();

            connection = DriverManager.getConnection(jdbcUrl, user, password);

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

    }

    public void addUsers(String name, String surname,String url){


        try{
            String adds = "INSERT INTO users (name,surname,url)"+
                    "VALUES (?,?,?)";
            var pstmt = connection.prepareStatement(adds, Statement.RETURN_GENERATED_KEYS);

            pstmt.setString(1, name);
            pstmt.setString(2, surname);
            pstmt.setString(3, url);

            int insertedRow = pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Map<String, List<String>> getUsersPosts()  {

        Map<String,List<String>> hashmap = new HashMap<>();

        try {
            String query = "SELECT name,contento FROM users INNER JOIN post on users.id=post.users_id ";
            var stmt = connection.createStatement();
            var rs = stmt.executeQuery(query);
            while (rs.next()) {
                String name = rs.getString("name");
                String content = rs.getString("contento");

                if (hashmap.containsKey(name)){
                    hashmap.get(name).add(content);
                } else {
                    List<String>contentList = new ArrayList<>();
                    contentList.add(content);
                    hashmap.put(name,contentList);
                }
            }

        }
        catch (SQLException sqlException){
            System.out.println("Ошибка запроса "+ sqlException);
        }
        return hashmap;
    }


    public void getUserNames() throws SQLException {

        String names = "SELECT * FROM users";


        var stmt = connection.createStatement();

        var rs = stmt.executeQuery(names);

        while (rs.next()) {
            System.out.println(rs.getString("name"));
            System.out.println(rs.getString("url"));
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getString("surname"));
            System.out.println(rs.getInt("phonebook_id"));
            System.out.println(rs.getBoolean("premium"));
        }
    }


    public static void main(String[] args) throws SQLException {


        Phone_book phone_book = new Phone_book();

        phone_book.addUsers("Rafail","Venediktov","http://vk2");

        System.out.println(phone_book.getUsersPosts());
    }
}
