package Lab2_JDBC;

import java.sql.Connection;
import java.sql.SQLException;
public class TestConnection {

public static void main(String[] args) {

Connection connection = DBConnection.getConnection();

if (connection != null) {
    System.out.println("JDBC test successful");
    try {
        connection.close();
    } catch (SQLException e) {
    e.printStackTrace();

    }
    }
    }
    }

