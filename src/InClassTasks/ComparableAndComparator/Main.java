package InClassTasks.ComparableAndComparator;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.sort;

public class Main {
    public static void main(String[] args) {

//        var emp1 = new Employee("Samad", 1500, 33);
//        var emp2 = new Employee("Tofiq", 1800, 34);
//        var emp3 = new Employee("Kanan", 1200, 22);
//
//        var empList = Arrays.asList(emp1, emp2, emp3);
//        System.out.println(empList);
//        Collections.sort(empList);
//        System.out.println(empList);

        var animal1 = new Animal("monkey", 50, 150);
        var animal2 = new Animal("zebra", 95, 160);
        var animal3 = new Animal("giraffe", 150, 300);
//
        var animalList = Arrays.asList(animal1, animal2, animal3);
        System.out.println(animalList);
//        Collections.sort(animalList, new AnimalComparator());
//        System.out.println(animalList);

        Collections.sort(animalList, AnimalComparator.comparatorForName());
        System.out.println(animalList);
        Collections.sort(animalList, AnimalComparator.comparatorForWeight());
        System.out.println(animalList);
    }
}
