package Lab1_OOP;
public class UndergraduateStudent extends Student{
    public UndergraduateStudent(String name,int studentID,String email, String phoneNumber, int age, double gpa,String major) {
        super(name, studentID, email, phoneNumber, age, gpa, major);
    }
        @Override
                public double calculateGpa(){
            return getGpa();
        }
    }


