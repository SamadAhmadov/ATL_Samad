package InClassTasks.StudentHashSetTask;

public class Main {
    public static void main(String[] args) {

        StudentDatabase studentDatabase = new StudentDatabase();

        try {
            studentDatabase.addStudent(new Student("Ilkin", 1));
            studentDatabase.addStudent(new Student("Xan", 2));
            studentDatabase.addStudent(new Student("Elnur", 3));
            studentDatabase.addStudent(new Student("Emin", 4));
            studentDatabase.addStudent(new Student("Musa", 5));
            studentDatabase.addStudent(new Student("Huseyn", 6));
            studentDatabase.addStudent(new Student("Tofiq", 3));
        } catch (DuplicateStudentException e) {
            System.out.println(e.getMessage());
        }

        studentDatabase.displayAllStudents();

        try {
            System.out.println("Found: " + studentDatabase.findStudentById(2));
            System.out.println("Found: " + studentDatabase.findStudentById(7));
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
