public class Main {
    public static void main(String[] args) {

        var operation = new Operation();

        String errMessage = "";

        try {
            var student = new Student(1, "Samad");
            var course = new Course<Student>("Java Backend", Subject.PROGRAMMING);
            operation.registerStudent(student, course);

        }catch(Exception ex) {
            errMessage = ex.getMessage();
        } finally {
            operation.displayInfo();
            System.err.println(errMessage);
        }
    }
}