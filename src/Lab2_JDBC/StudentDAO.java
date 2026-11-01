package Lab2_JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO {

    public void addStudent(String name, String email, String phoneNumber,
                           int age, double gpa, String major) {
String sql = """
insert into students (name, email, phone_number, age, gpa, major)
values(?, ?, ?, ?, ?, ?)
""";
try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(sql)) {
    preparedStatement.setString(1, name);
    preparedStatement.setString(2, email);
    preparedStatement.setString(3, phoneNumber);
    preparedStatement.setInt(4, age);
    preparedStatement.setDouble(5, gpa);
    preparedStatement.setString(6, major);
    preparedStatement.executeUpdate();

    System.out.println("Student added successfully");

    } catch (SQLException e) {
    System.out.println("Error adding student");
    e.printStackTrace();

        }
    }
}
