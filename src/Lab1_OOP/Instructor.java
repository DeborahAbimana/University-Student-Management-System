package Lab1_OOP;

public class Instructor {
    private String name;
    private int instructorID;
    private String email;
    private String phoneNumber;
    private int age;
    private String department;
    public Instructor(String name,int instructorID,String email,String phoneNumber,int age,String department){
        this.name=name;
        this.instructorID=instructorID;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.age=age;
        this.department=department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getInstructorID() {
        return instructorID;
    }

    public void setInstructorID(int instructorID) {
        this.instructorID = instructorID;
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
        this.phoneNumber= phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age= age;
    }
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "name: " + name +
                "\ninstructorID: "+ instructorID +
                "\nemail: " + email +
                "\nPhoneNumber: " + phoneNumber +
                "\nAge: " + age +
                "\nDepartment: " + department;

    }
}


