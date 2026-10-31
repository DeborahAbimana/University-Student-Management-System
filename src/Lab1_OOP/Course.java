package Lab1_OOP;

public class Course {
private String name;
private String courseID;
private String courseCode;
private int creditHours;
public Course( String name,String courseID,String courseCode,int creditHours){
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

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
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
    return "name: " + name +
            "\nCourseID: " + courseID +
            "\nCourse Code: " + courseCode +
            "\n Credit Hours: " + creditHours+"hours";



    }
}
