package Academy;

public class Student extends Academy {
    private String studentID;
    private String course;

    public Student() {}

    public Student(String studentID, String course) {
        this.studentID = studentID;
        this.course = course;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void study() {
        System.out.println("Student with ID " + studentID + " is studing " + course);
    }
}
