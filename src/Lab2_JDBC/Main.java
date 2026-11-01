package Lab2_JDBC;

public class Main {

    public static void main(String[] args) {

        StudentDAO studentDAO = new StudentDAO();
        CourseDAO courseDAO = new CourseDAO();
        EnrollmentDAO enrollmentDAO = new EnrollmentDAO();
        //studentDAO.updateStudent(13, "abdeb200@gmail");
        //studentDAO.deleteStudent(13);
        //courseDAO.updateCourse(5, "Object Oriented Programming", 7);
        //courseDAO.addCourse("Test Course", "TEST999", 3);
        //courseDAO.updateCourse(5, "Object Oriented Programming", 6);
        //courseDAO.deleteCourse(8);
        //courseDAO.updateCourse(5, "Object Oriented Programming", 6);
        System.out.println("======================================");
        System.out.println("    UNIVERSITY MANAGEMENT SYSTEM\n        DATABASE REPORT");
        System.out.println("======================================");

        System.out.println("\n----- STUDENTS RECORDS -----");
        studentDAO.getAllStudents();

        System.out.println("\n----- COURSES RECORDS -----");
        courseDAO.getAllCourses();

        System.out.println("\n------------- ENROLLMENT RECORDS ------------");
        enrollmentDAO.getAllEnrollments();

        System.out.println("        END OF DATABASE REPORT           ");
        System.out.println("========================================");
    }
    }


