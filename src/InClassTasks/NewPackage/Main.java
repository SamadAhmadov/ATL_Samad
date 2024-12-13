package InClassTasks.NewPackage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Human human1 = new Human("Samad", 33, LocalDate.of(1991, 02, 07));
        Human human2 = new Human("Tofiq", 18, LocalDate.of(2006, 05, 06));
        Human human3 = new Human("Kanan", 22, LocalDate.of(2002, 11, 23));

        ArrayList<Human> people = new ArrayList<>();
        people.add(human1);
        people.add(human2);
        people.add(human3);

        for (Human human : people) {
            if (human.getAge() > 20) {
                System.out.println(human);
            }
        }

        HashMap<String, Integer> humanMap = new HashMap<>();
        for (Human human : people) {
            humanMap.put(human.getName(), human.getAge());
        }

        System.out.println("Name-Age Map:");
        for (String name : humanMap.keySet()) {
            System.out.println(name + " -> " + humanMap.get(name));
        }

        int totalAge = 0;











//        int totalAge = 0;
//        for (Human human : people) {
//            totalAge += human.getAge();
//        }
//
//        double averageAge = totalAge / people.size();
//        System.out.println("Average age: " + averageAge);
    }
}