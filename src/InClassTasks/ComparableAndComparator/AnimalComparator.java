package InClassTasks.ComparableAndComparator;

import java.util.Comparator;

//public class AnimalComparator implements Comparator<Animal> {
//
//    @Override
//    public int compare(Animal o1, Animal o2) {
//        return o1.getName().compareTo(o2.getName());
//    }
//}
public class AnimalComparator {

    public static Comparator<Animal> comparatorForName(){
        return (a1, a2) -> a1.getName().compareTo(a2.getName());
    }

    public static Comparator<Animal> comparatorForWeight(){
        return (a1, a2) -> a1.getWeight().compareTo(a2.getWeight());
    }
}
