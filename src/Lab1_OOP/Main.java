package Lab1_OOP;

public class Main {
    public static void main(String[]args){
        Student student=new Student("Deborah",101,"debah100@gmail.com","+250792566790",20,3.5,"Cybersecurity");
        Course course=new Course("Data communication",11,"DT109",5);
        Instructor instructor=new Instructor("Johnson",1,"jons109@gmail.com","+2507862736849",30,"IT Department");
        GraduateStudent graduateStudent=new GraduateStudent("Hanah",111,"hanah160@gmail.com","+2507996640",27,3.1,"Networking");
        UndergraduateStudent undergraduateStudent=new UndergraduateStudent("Grace",112,"grac190@gmail.com","+250792092790",25,3.0,"Computer Science");
        System.out.println("----------Student Details----------");
        System.out.println("Student "+student);
        System.out.println();
        System.out.println("----------Course Details----------");
        System.out.println("Course "+ course);
        System.out.println();
        System.out.println("---------Instructor Details----------");
        System.out.println("Instructor "+instructor);
        System.out.println();
        System.out.println("---------Graduate student Details----------");
        System.out.println("Student "+graduateStudent);
        System.out.println();
        System.out.println("---------Undergraduate Details----------");
        System.out.println("Student "+undergraduateStudent);

    }

    }
