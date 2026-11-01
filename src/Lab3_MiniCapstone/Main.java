package Lab3_MiniCapstone;

import java.util.Scanner;
import Lab2_JDBC.StudentDAO;
import Lab2_JDBC.CourseDAO;
import Lab2_JDBC.EnrollmentDAO;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentDAO studentDAO = new StudentDAO();
        CourseDAO courseDAO = new CourseDAO();
        EnrollmentDAO enrollmentDAO = new EnrollmentDAO();
        int choice;
        do{
System.out.println("======================================");
System.out.println("     UNIVERSITY MANAGEMENT SYSTEM");
System.out.println("======================================");
System.out.println("1. Add Student");
System.out.println("2. View All Students");
System.out.println("3. Update Student");
System.out.println("4. Delete Student");
System.out.println("5. Add Course");
System.out.println("6. View All Courses");
System.out.println("7. Update Course"); System.out.println("8. Delete Course");
System.out.println("9. Enroll Student in Course");
System.out.println("10. View Student Enrollments");
System.out.println("0. Exit");
System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input Please enter a number.");
                scanner.nextLine();
                choice = -1;
                continue;
            }

            choice = scanner.nextInt();
            if (choice < 0 || choice > 10) {
                System.out.println("Invalid choice Please select between 0 and 10.");
                continue;
            }
System.out.println("You selected option: " + choice);
            switch (choice) {
                case 1:
                    scanner.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
System.out.print("Enter Email: ");
String email = scanner.nextLine();
System.out.print("Enter Phone Number: ");
 String phoneNumber = scanner.nextLine();
System.out.print("Enter Age: ");

if (!scanner.hasNextInt()) {
    System.out.println("Invalid age Please enter a number.");
            scanner.nextLine();
   break;
   }

int age = scanner.nextInt();
if (age < 16 || age > 100) {
    System.out.println("Age must be between 16 and 100.");
 scanner.nextLine();
 break;
     }
System.out.print("Enter GPA: ");

if (!scanner.hasNextDouble()) {
 System.out.println("Invalid GPA  Please enter a number.");
  scanner.nextLine();
 break;
 }

double gpa = scanner.nextDouble();
                    if (gpa < 0.0 || gpa > 4.0) {
                        System.out.println("GPA must be between 0.0 and 4.0.");
    scanner.nextLine();
                        break;
                    }
                    scanner.nextLine();

                    System.out.print("Enter Major: ");
                    String major = scanner.nextLine();

                    studentDAO.addStudent(name, email, phoneNumber, age, gpa, major);
                    break;
                case 2:
                    studentDAO.getAllStudents();
                    break;
                case 3:
                    System.out.print("Enter Student ID: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid Student ID! Please enter a number.");
                        scanner.nextLine();
                        break;
                    }

                    int studentId = scanner.nextInt();

                    if (studentId <= 0) {
                        System.out.println("Student ID must be greater than zero.");
                        scanner.nextLine();
                        break;
                    }
                    scanner.nextLine();

        System.out.print("Enter New Email: ");
        String newEmail = scanner.nextLine();

        studentDAO.updateStudent(studentId, newEmail);
        break;

 case 4:
System.out.print("Enter Student ID to delete: ");

  if (!scanner.hasNextInt()) {
System.out.println("Invalid Student ID Please enter a number.");
scanner.nextLine();
break;
                    }

int studentIdToDelete = scanner.nextInt();

                    if (studentIdToDelete <= 0) {
                        System.out.println("Student ID must be greater than zero.");
                        scanner.nextLine();
                        break;
                    }
     scanner.nextLine();
                    studentDAO.deleteStudent(studentIdToDelete);
break;
                case 5:
                    scanner.nextLine();

                    System.out.print("Enter Course Name: ");
                    String courseName = scanner.nextLine();

                    System.out.print("Enter Course Code: ");
                    String courseCode = scanner.nextLine();

                    System.out.print("Enter Credit Hours: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid credit hours Please enter a number.");
                        scanner.nextLine();
                        break;
                    }

                    int creditHours = scanner.nextInt();
                    if (creditHours <= 0) {
                        System.out.println("Credit hours must be greater than zero.");
                        scanner.nextLine();
                        break;
                    }



                    courseDAO.addCourse(courseName, courseCode, creditHours);
                    break;
                case 6:
                    courseDAO.getAllCourses();
                    break;
                case 7:
                    System.out.print("Enter Course ID: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid Course ID Please enter a number.");
                        scanner.nextLine();
                        break;
                    }

                    int courseId = scanner.nextInt();

                    if (courseId <= 0) {
                        System.out.println("Course ID must be greater than zero.");
                        scanner.nextLine();
                        break;
                    }

                    scanner.nextLine();

                    System.out.print("Enter New Course Name: ");
                    String newCourseName = scanner.nextLine();

                    System.out.print("Enter New Credit Hours: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid credit hours! Please enter a number.");
                        scanner.nextLine();
                        break;
                    }

                    int newCreditHours = scanner.nextInt();

                    if (newCreditHours <= 0) {
                        System.out.println("Credit hours must be greater than zero.");
                        scanner.nextLine();
                        break;
                    }

                    courseDAO.updateCourse(courseId, newCourseName, newCreditHours);
                    break;


                case 8:
                    System.out.print("Enter Course ID to delete: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid Course ID! Please enter a number.");
                        scanner.nextLine();
                        break;
                    }

                    int courseIdToDelete = scanner.nextInt();

                    if (courseIdToDelete <= 0) {
                        System.out.println("Course ID must be greater than zero.");
                        scanner.nextLine();
                        break;
                    }

                    courseDAO.deleteCourse(courseIdToDelete);
                    break;
                case 9:

                    System.out.print("Enter Student ID: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid Student ID! Please enter a number.");
                        scanner.nextLine();
                        break;
                    }

                    int studentIdToEnroll = scanner.nextInt();

                    if (studentIdToEnroll <= 0) {
                        System.out.println("Student ID must be greater than zero.");
                        scanner.nextLine();
                        break;
                    }

                    System.out.print("Enter Course ID: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid Course ID! Please enter a number.");
                        scanner.nextLine();
                        break;
                    }

                    int courseIdToEnroll = scanner.nextInt();

                    if (courseIdToEnroll <= 0) {
                        System.out.println("Course ID must be greater than zero.");
                        scanner.nextLine();
                        break;
                    }

                    enrollmentDAO.addEnrollment(studentIdToEnroll, courseIdToEnroll);
                    break;
                case 10:
                    enrollmentDAO.getAllEnrollments();
                    break;

                case 0:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice  Please try again.");
            }
        } while (choice != 0);

        System.out.println("Thank you for using University Management System");
scanner.close();
    }
}