package InClassTasks.StudentHashMapTask;

import java.util.HashMap;

public class StudentRegister {
    private HashMap<Integer, Student> register = new HashMap<>();

    public void addStudent(Student student) {
        register.put(student.getId(), student);
    }

    public Student getStudent (int id) {
        return register.get(id);
    }
}
