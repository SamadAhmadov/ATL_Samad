package Academy;

public class Teacher extends Academy {
    private String teacherID;
    private String subject;

    public Teacher() {}

    public Teacher(String teacherID, String subject) {
        this.teacherID = teacherID;
        this.subject = subject;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void teach() {
        System.out.println("Teacher with ID " + teacherID + " is teaching " + subject);
    }
}
