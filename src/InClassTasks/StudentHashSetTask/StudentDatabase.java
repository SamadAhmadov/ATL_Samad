package InClassTasks.StudentHashSetTask;

import java.util.HashSet;

public class StudentDatabase {
    private HashSet<Student> students;

    public StudentDatabase() {
        this.students = new HashSet<>();
    }

    public void addStudent(Student student) throws DuplicateStudentException {
        if (!students.add(student)) {
            throw new DuplicateStudentException("Student with ID " + student.getId() + " already exists.");
        }
        System.out.println("Student added: " + student);
    }

    public Student findStudentById(int id) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        throw new StudentNotFoundException("Student with ID " + id + " not found.");
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
