package InClassTasks.MapTask;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer, Student> studentsMap = new HashMap<>();
        
        studentsMap.put(1, new Student(1, "Alice"));
        studentsMap.put(2, new Student(2, "Bob"));
        studentsMap.put(3, new Student(3, "Charlie"));

        System.out.println("All students:");
        studentsMap.values().forEach(System.out::println);

        studentsMap.remove(2);
        System.out.println("\nStudent with ID 2 was removed.");
        
        System.out.println("\nAll students (after removing): ");
        studentsMap.values().forEach(System.out::println);
    }
}