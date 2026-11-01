package Lab2_JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CourseDAO {
public void addCourse(String name, String courseCode, int creditHours) {
String sql = """
insert into courses (name, course_code, credit_hours)
values (?, ?, ?)
""";
try(Connection connection = DBConnection.getConnection();
PreparedStatement preparedStatement = connection.prepareStatement(sql))
{preparedStatement.setString(1, name);
preparedStatement.setString(2, courseCode);
preparedStatement.setInt(3, creditHours);
preparedStatement.executeUpdate();

System.out.println("Course added successfully");
} catch (SQLException e) {
System.out.println("Error adding course");
e.printStackTrace();
}
}
public void getAllCourses() {
String sql = "select * from courses";
try (Connection connection = DBConnection.getConnection();
PreparedStatement preparedStatement = connection.prepareStatement(sql);
ResultSet resultSet = preparedStatement.executeQuery()) {
while (resultSet.next()) {
System.out.println("Course ID: " + resultSet.getInt("course_id"));
System.out.println("Name: " + resultSet.getString("name"));
System.out.println("Course Code: " + resultSet.getString("course_code"));
System.out.println("Credit Hours: " + resultSet.getInt("credit_hours"));
System.out.println("-----------------------------");
}
} catch (SQLException e) {
System.out.println("Error retrieving courses");
e.printStackTrace();
}
}
public void updateCourse(int courseId, String name, int creditHours) {
String sql = """
update courses
set name = ?, credit_hours = ?
where course_id = ?
""";
try (Connection connection = DBConnection.getConnection();
PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
preparedStatement.setString(1, name);
preparedStatement.setInt(2, creditHours);
preparedStatement.setInt(3, courseId);
preparedStatement.executeUpdate();

System.out.println("Course updated successfully");
} catch (SQLException e) {
System.out.println("Error updating course");
e.printStackTrace();
}
}
public void deleteCourse(int courseId) {
String sql = "delete from courses WHERE course_id = ?";
try (Connection connection = DBConnection.getConnection();
PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
preparedStatement.setInt(1, courseId);
preparedStatement.executeUpdate();

System.out.println("Course deleted successfully");

} catch (SQLException e) {
System.out.println("Error deleting course");
e.printStackTrace();

        }
    }
}
