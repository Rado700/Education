package DataBase;

import java.security.Key;
import java.sql.*;
import java.sql.Date;
import java.util.*;

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
    public void addPosts(String contento, Date date, Time time, int users_id){

        try {
            String addpst = "INSERT INTO post (contento,date,time,users_id)"+
                    "VALUES (?,?,?,?)";
            var psmt = connection.prepareStatement(addpst, Statement.RETURN_GENERATED_KEYS);

            psmt.setString(1,contento);
            psmt.setDate(2,date);
            psmt.setTime(3,time);
            psmt.setInt(4,users_id);

            int insertedRow = psmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void addLike(int person_post,int likes_post){
        try {
            String addLikes = "INSERT INTO likes (person_post,likes_post)"+
                    "VALUES (?,?)";

            var pstmnt = connection.prepareStatement(addLikes, Statement.RETURN_GENERATED_KEYS);

            pstmnt.setInt(1,person_post);
            pstmnt.setInt(2,likes_post);

            int insertedRow = pstmnt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Map<String, List<String>> getlikePost(){

        Map<String , List<String>>hashMap = new HashMap<>();

        try {
            String newLike = "SELECT name,likes_post,contento, person_post FROM users INNER JOIN post on users.id=post.id INNER JOIN likes on users.id=likes.person_post";
            var stmn = connection.createStatement();
            var rs = stmn.executeQuery(newLike);
            while (rs.next()){
                String name = rs.getString("name");
                String contento = rs.getString("contento");
                   int person_post = rs.getInt("person_post");

                if (hashMap.containsKey("name")){
                    hashMap.get(name).add(contento);
                    hashMap.get(name).add(String.valueOf(person_post));
                }else {
                    List<String>newList = new ArrayList<>();
                    newList.add(contento);
                    hashMap.put(name,newList);
                }
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return hashMap;
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
    public void deleteString(int id){

        try {
            String name = "DELETE FROM likes WHERE id=?";
            var sttm = connection.prepareStatement(name);

            sttm.setInt(1,id);

            int insertedRow = sttm.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
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

    //    phone_book.addLike(2,2);
 //       phone_book.addUsers("Sergei","Sergeev","http://vk5");
        System.out.println( phone_book.getlikePost());

        System.out.println(phone_book.getUsersPosts());
 //       phone_book.addPosts("New phone its very good", new Date(5-2-2024),new Time(16-33),6);
        phone_book.deleteString(20);
    }
}
