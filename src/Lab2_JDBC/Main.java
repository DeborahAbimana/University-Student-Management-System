package Lab2_JDBC;

public class Main {

    public static void main(String[] args) {

        StudentDAO studentDAO = new StudentDAO();
        CourseDAO courseDAO = new CourseDAO();
        EnrollmentDAO enrollmentDAO = new EnrollmentDAO();
        //studentDAO.addStudent("Abimana", "abdeb189@gmail.com", "+250788000000", 21, 3.5, "Information Technology");

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


