package Lab1_OOP;

import java.util.*;

public class Main {
    public static void main(String[]args){
        Student student=new Student("Deborah",101,"debah100@gmail.com","+250792566790",20,3.5,"Cybersecurity");
        Course course=new Course("Data communication",11,"DT109",5);
        Instructor instructor=new Instructor("Johnson",1,"jons109@gmail.com","+2507862736849",30,"IT Department");
        GraduateStudent graduateStudent=new GraduateStudent("Hanah",111,"hanah160@gmail.com","+2507996640",27,3.1,"Networking");
        UndergraduateStudent undergraduateStudent=new UndergraduateStudent("Grace",112,"grac190@gmail.com","+250792092790",25,3.0,"Computer Science");

        List<Student>students=new ArrayList<>();
        students.add(student);
        students.add(graduateStudent);
        students.add(undergraduateStudent);
        //students.remove(graduateStudent);

        Course course1=new Course("java",190,"JV177",6);

        Map<Instructor, List<Course>> instructorAssignments = new HashMap<>();

        List<Course> assignedCourses = new ArrayList<>();
        assignedCourses.add(course);
        assignedCourses.add(course1);

        instructorAssignments.put(instructor, assignedCourses);

        Set<Course>courses=new HashSet<>();

        courses.add(course1);
        courses.add(course);
        Map<Course, List<Student>> courseRosters = new HashMap<>();

        courseRosters.put(course, new ArrayList<>());
        courseRosters.put(course1, new ArrayList<>());

        courseRosters.get(course).add(student);
        courseRosters.get(course).add(graduateStudent);

        courseRosters.get(course1).add(undergraduateStudent);
        System.out.println("==========================================");
        System.out.println("       UNIVERSITY SYSTEM REPORT");
        System.out.println("==========================================");


        System.out.println("\n======= AVAILABLE COURSES =======");

        for(Course c:courses){
            System.out.println(c);
            System.out.println();
        }
        System.out.println("Total Available Courses: "+courses.size());
        System.out.println("\n======= COURSE ROSTERS =======");

        for (Map.Entry<Course, List<Student>> entry : courseRosters.entrySet()) {

            System.out.println("Course Name: " + entry.getKey().getName());

            for (Student s : entry.getValue()) {
                System.out.println("Enrolled Student: " + s.getName());
            }

            System.out.println("Total Enrolled Students: " + entry.getValue().size());
            //System.out.println("-------------------------------");
            System.out.println();
        }

        System.out.println("\n======= STUDENTS RECORDS =======");
        System.out.println("Total Registered Students: " + students.size());

        for (Student s : students) {
            System.out.println();
            System.out.println(s);
        }
        System.out.println("\n======= INSTRUCTOR INFORMATION =======");

        for (Map.Entry<Instructor, List<Course>> entry :
                instructorAssignments.entrySet()) {

            System.out.println( entry.getKey());
            System.out.println("\nAssigned Courses: ");
            for (Course c:entry.getValue()){
                System.out.println("- "+c.getName());

            }

            System.out.println("Total Assigned Courses: " + entry.getValue().size());
            System.out.println("--------------------------------------");
        }

        System.out.println();

        Student student1=graduateStudent;
        Student student2=undergraduateStudent;

        System.out.println("======= GPA PERFORMANCE =======");
        System.out.println("Graduate GPA: "+student1.calculateGpa());
        System.out.println("Undergraduate GPA: "+student2.calculateGpa());
        System.out.println("==========================================");
        System.out.println("       END OF UNIVERSITY SYSTEM REPORT");
        System.out.println("==========================================");

    }

    }
