package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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

    public void getUserNames() throws SQLException {
        String names = "SELECT name, url FROM users";

        var stmt = connection.createStatement();

        var rs = stmt.executeQuery(names);

        while (rs.next()) {
            System.out.println(rs.getString("name"));
            System.out.println(rs.getString("url"));
        }
    }


    public static void main(String[] args) throws SQLException {


        Phone_book phone_book = new Phone_book();
        phone_book.getUserNames();
    }
}
