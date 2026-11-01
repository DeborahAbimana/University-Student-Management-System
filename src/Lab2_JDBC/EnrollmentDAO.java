package Lab2_JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EnrollmentDAO {

    public void getAllEnrollments() {
        System.out.println("===== ALL STUDENT ENROLLMENTS =====");
String sql = """
                select
enrollments.enrollment_id,
students.name as student_name,
courses.name as course_name,
enrollments.enrollment_date
from enrollments
inner join students on enrollments.student_id = students.student_id
inner join courses on enrollments.course_id = courses.course_id
""";
try (Connection connection = DBConnection.getConnection();
  PreparedStatement preparedStatement = connection.prepareStatement(sql);
   ResultSet resultSet = preparedStatement.executeQuery()) {
while (resultSet.next()) {
    System.out.println("Enrollment ID: " + resultSet.getInt("enrollment_id"));
    System.out.println("Student Name: " + resultSet.getString("student_name"));
    System.out.println("Course Name: " + resultSet.getString("course_name"));
    System.out.println("Enrollment Date: " + resultSet.getDate("enrollment_date"));
    System.out.println("--------------------------------");

     }

} catch (SQLException e) {
    System.out.println("Error retrieving enrollments");
    e.printStackTrace();
        }
    }
    public void addEnrollment(int studentId, int courseId) {
        String sql = "insert into enrollments (student_id, course_id) values (?, ?)";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, studentId);
            preparedStatement.setInt(2, courseId);

            preparedStatement.executeUpdate();

            System.out.println("Student enrolled successfully");

        } catch (SQLException e) {
            System.out.println("Error enrolling student");
            e.printStackTrace();
        }
    }
}
