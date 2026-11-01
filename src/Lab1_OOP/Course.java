package Lab1_OOP;

public class Course {
private String name;
private int courseID;
private String courseCode;
private int creditHours;
public Course( String name,int courseID,String courseCode,int creditHours){
    this.name=name;
    this.courseID=courseID;
    this.courseCode=courseCode;
    this.creditHours=creditHours;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    @Override
    public String toString() {
    return "CourseName: " + name +
            "\nCourseID: " + courseID +
            "\nCourse Code: " + courseCode +
            "\nCredit Hours: " + creditHours+"hours";



    }
}
