
package Lab1_OOP;

public class Student {
    private String name;
    private int studentID;
    private String email;
    private String phoneNumber;
    private int age;
    private double gpa;
    private String major;
    public double calculateGpa(){
        return gpa;
    }

    public Student(String name, int studentID, String email, String phoneNumber, int age, double gpa,String major){
           this.name=name;
           this.studentID=studentID;
           this.email=email;
           this.phoneNumber=phoneNumber;
           this.age=age;
           this.gpa=gpa;
           this.major=major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa){
        this.gpa=gpa;
    }
    @Override
    public String toString(){
      return"StudentName: "+ name +
            "\nstudentID: "+ studentID +
            "\nemail: "+ email +
            "\ngpa: "+ gpa +
            "\nphoneNumber: "+ phoneNumber +
            "\nage: "+ age +
            "\nmajor: " +major;



    }
}

