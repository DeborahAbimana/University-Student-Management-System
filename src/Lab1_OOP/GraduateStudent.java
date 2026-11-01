package Lab1_OOP;
    public class GraduateStudent extends Student{
        public GraduateStudent(String name,int studentID,String email, String phoneNumber, int age, double gpa,String major) {
            super(name, studentID, email, phoneNumber, age, gpa, major);
        }
        @Override
        public double calculateGpa(){
            return Math.min(getGpa()+0.1,4.0);
        }
    }




