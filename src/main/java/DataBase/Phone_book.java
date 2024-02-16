package DataBase;

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

    public void addComment(int user_id, int post_id, String text) {
        try {
            String value = "INSERT INTO commentarie (user_id,post_id,text)" +
                    "VALUES (?,?,?)";
            var sttm = connection.prepareStatement(value);

            sttm.setInt(1, user_id);
            sttm.setInt(2, post_id);
            sttm.setString(3, text);

            int refresh = sttm.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addUsers(String name, String surname, String url) {

        try {
            String adds = "INSERT INTO users (name,surname,url)" +
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

    public void addPosts(String contento, Date date, Time time, int users_id) {

        try {
            String addpst = "INSERT INTO post (contento,date,time,users_id)" +
                    "VALUES (?,?,?,?)";
            var psmt = connection.prepareStatement(addpst, Statement.RETURN_GENERATED_KEYS);

            psmt.setString(1, contento);
            psmt.setDate(2, date);
            psmt.setTime(3, time);
            psmt.setInt(4, users_id);

            int insertedRow = psmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addLike(int post_id, int user_id) {

        try {
            String countLike = "SELECT name, post_id,count(user_id) FROM likes " +
                    "INNER JOIN users on likes.user_id = users.id " +
                    "GROUP BY name,post_id,user_id " +
                    "HAVING post_id = " + post_id + " AND user_id =" + user_id;

            var pst = connection.createStatement();
            var rsPst = pst.executeQuery(countLike);

            while (rsPst.next()) {
                String name = rsPst.getString("name");
                int post = rsPst.getInt("post_id");
                int like = rsPst.getInt("count");

                if (like >= 1) {
                    System.out.println("пост уже имеет лайк");
                    return;
                }

                System.out.println(name);
                System.out.println(like);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        try {
            String myLike = "SELECT users_id FROM post" +
                    " WHERE id = " + post_id;

            var pstm = connection.createStatement();
            var psw = pstm.executeQuery(myLike);

            while (psw.next()) {
                int postUserId = psw.getInt("users_id");

                if (postUserId == user_id) {
                    System.out.println("Нельзя лайкать свой пост");
                }
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            String newLIKE = "INSERT INTO likes (post_id,user_id) " +
                    "VALUES (?,?)";
            var stmtt = connection.prepareStatement(newLIKE, Statement.RETURN_GENERATED_KEYS);


            stmtt.setInt(1, post_id);
            stmtt.setInt(2, user_id);

            var ss = stmtt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void selectComment(){
        try {

            String select = "SELECT post_id,contento,author.name as author,user_id,commentator.name as commentator FROM commentarie " +
                    "INNER JOIN users commentator on commentarie.user_id=commentator.id " +
                    "INNER JOIN users author on commentarie.post_id=author.id " +
                    "INNER JOIN post on author.id=post.users_id " +
                    "GROUP BY post_id,contento,author.name,user_id,commentator.name";

            var newSel = connection.createStatement();
            var sel = newSel.executeQuery(select);

            while (sel.next()){

                System.out.println(sel.getInt("post_id"));
                System.out.println(sel.getString("contento"));
                System.out.println(sel.getString("author"));
                System.out.println(sel.getInt("user_id"));
                System.out.println(sel.getString("commentator"));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void updateComment(int text_id,int user_id,String newPost){
        try {
        String commen = "SELECT post_id,contento,author.name as author,user_id,commentator.id as commentator FROM commentarie " +
                "INNER JOIN users commentator on commentarie.user_id=commentator.id " +
                "INNER JOIN users author on commentarie.post_id=author.id " +
                "INNER JOIN post on author.id=post.users_id " +
                "GROUP BY post_id,contento,author.name,user_id,commentator.id "+
                "HAVING user_id = "+user_id+" AND commentator.id ="+ user_id;


            var stmt = connection.createStatement();
            var updat = stmt.executeQuery(commen);

            while (updat.next()) {
                int commentator = updat.getInt("commentator");

                if (user_id != commentator ){
                    System.out.println("Не наш комментарий");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
        String updateComment = "UPDATE commentarie SET text ='"+newPost+
                "' WHERE id ="+text_id;

//            var sad = connection.prepareStatement(updateComment);
                var stmts = connection.createStatement();
                var sst = stmts.execute(updateComment);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Map<String, Map<String, List<String>>> getlikePost() {

        Map<String, Map<String, List<String>>> hashMap = new HashMap<>();

        try {
            String newLike = "SELECT author.name as author_name,contento, likes.user_id, visitor.name as visitor_name FROM likes " +
                    "INNER JOIN post on likes.post_id=post.id " +
                    "INNER JOIN users author on post.users_id=author.id " +
                    "INNER JOIN users visitor on visitor.id=likes.user_id";
            var stmn = connection.createStatement();
            var rs = stmn.executeQuery(newLike);
            while (rs.next()) {
                String author_name = rs.getString("author_name");
                String contento = rs.getString("contento");
                String user_id = rs.getString("user_id");
                String visitor = rs.getString("visitor_name");

                if (hashMap.containsKey(author_name)) {
                    if (hashMap.get(author_name).containsKey(contento)) {
                        hashMap.get(author_name).get(contento).add(visitor);
                    } else {
                        hashMap.get(author_name).put(contento, new ArrayList<>());
                        hashMap.get(author_name).get(contento).add(visitor);
                    }
                } else {
                    Map<String, List<String>> hash = new HashMap<>();
                    hash.put(contento, new ArrayList<>());
                    hash.get(contento).add(visitor);
                    hashMap.put(author_name, hash);
                }
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return hashMap;
    }

    public Map<String, List<String>> getUsersPosts() {

        Map<String, List<String>> hashmap = new HashMap<>();

        try {
            String query = "SELECT name,contento FROM users INNER JOIN post on users.id=post.users_id ";

            var stmt = connection.createStatement();
            var rs = stmt.executeQuery(query);

            while (rs.next()) {
                String name = rs.getString("name");
                String content = rs.getString("contento");

                if (hashmap.containsKey(name)) {
                    hashmap.get(name).add(content);
                } else {
                    List<String> contentList = new ArrayList<>();
                    contentList.add(content);
                    hashmap.put(name, contentList);
                }
            }

        } catch (SQLException sqlException) {
            System.out.println("Ошибка запроса " + sqlException);
        }
        return hashmap;
    }

    public void deleteLike(int id) {

        try {
            String name = "DELETE FROM likes WHERE id=?";
            var sttm = connection.prepareStatement(name);

            sttm.setInt(1, id);

            int insertedRow = sttm.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public void deletePost(int id) {

        try {
            String name = "DELETE FROM post WHERE id=?";
            var sttm = connection.prepareStatement(name);

            sttm.setInt(1, id);

            int insertedRow = sttm.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteComment(int id) {
        String delet = "DELETE FROM commentarie " +
                "WHERE id =?";
        try {
            var stm = connection.prepareStatement(delet);

            stm.setInt(1, id);

            int refresh = stm.executeUpdate();

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

 //       phone_book.getlikePost();
//        phone_book.selectComment();
        phone_book.updateComment(5,1,"Nice");
        //    phone_book.deletePost(8);
        //          phone_book.addLike(6,2);
//        phone_book.addComment(1, 3, "its very good post");
//        phone_book.addComment(1, 5, "good comment");
//        phone_book.addComment(2, 2, "cool comment");
//        phone_book.addComment(4, 2, "very nice");
//        phone_book.addComment(5, 4, "nice");
        //       phone_book.deleteComment(1);
        //       phone_book.addUsers("Sergei","Sergeev","http://vk5");
        //          System.out.println(phone_book.getlikePost());
        //       System.out.println(phone_book.getUsersPosts());
        //      phone_book.addPosts("Happy new year", new Date(2024-1900,2,6),new Time(16,33,0),6);
        //    phone_book.deleteLike(24);
    }
}


//            String addlike = "SELECT post_id,user_id,author.name as author_name,liker.name as liker_name  FROM likes " +
//                    "INNER JOIN post on likes.user_id=post.id " +
//                    "INNER JOIN users author on post.users_id=author.id " +
//                    "INNER JOIN users liker on post.users_id=liker.id";

//            String addLikes = "INSERT INTO likes (post_id,user_id)"+
//                    "VALUES (?,?)";

//            pstmnt.setInt(1,post_id);
//            pstmnt.setInt(2,user_id);

//          int insertedRow = pstmnt.executeUpdate();

//           var pstmnt = connection.prepareStatement(addLikes, Statement.RETURN_GENERATED_KEYS);

//            while (rsPst.next()) {
//                    int value = 1;
//                    int post = rsPst.getInt("post_id");
//                    int userLike = rsPst.getInt("user_id");
//                    int author = rsPst.getInt("author_name");
//                    int liker = rsPst.getInt("liker_name");

