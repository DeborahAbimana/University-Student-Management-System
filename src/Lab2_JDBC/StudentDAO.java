package Lab2_JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    public void getAllStudents() {
        String sql = "select * from students";

    try (Connection connection = DBConnection.getConnection();
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    ResultSet resultSet = preparedStatement.executeQuery()) {

    while (resultSet.next()) {
     System.out.println("Student ID: " + resultSet.getInt("student_id"));
     System.out.println("Student Name: " + resultSet.getString("name"));
     System.out.println("Email: " + resultSet.getString("email"));
     System.out.println("Major: " + resultSet.getString("major"));
     System.out.println("---------------------------");
     }
     } catch (SQLException e) {
     e.printStackTrace();

     }
    }
    public void updateStudent(int studentId, String email) {

        String sql = "update students set email = ? where student_id = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, email);
            preparedStatement.setInt(2, studentId);

            preparedStatement.executeUpdate();

            System.out.println("Student updated successfully!");

        } catch (SQLException e) {
            System.out.println("Error updating student!");
            e.printStackTrace();
        }
    }

    public void deleteStudent(int studentId) {

    String sql = "delete from students where student_id = ?";

    try (Connection connection = DBConnection.getConnection();
    PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
preparedStatement.setInt(1, studentId);
preparedStatement.executeUpdate();

System.out.println("Student deleted successfully!");
} catch
    (SQLException e) {
System.out.println("Error deleting student!");
e.printStackTrace();

}
}
}
