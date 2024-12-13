package InClassTasks.StudentRegistration;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Hüseyn", LocalDate.of(2005, 03, 15));
        Student student2 = new Student("Aydın", LocalDate.of(2010, 07, 20));
        Student student3 = new Student("Tural", LocalDate.of(1995, 11, 05));

        Student[] students = {student1, student2, student3};

        Student[] clonedArray = students.clone();
        for (Student student : clonedArray) {}

        Student[] copiedArray = Arrays.copyOf(students, students.length);
        for (int i = 0; i < clonedArray.length; i++) {
            System.out.println(clonedArray[i]);
        }

        System.out.println("\n18 yaşından kiçik tələbələr:");
        for (Student student : clonedArray) {
            if (student.getAge() < 18) {
                System.out.println(student);
            }
        }
    }
}