package InClassTasks.FcInterface;

@FunctionalInterface
public interface GenericPredicate<T> {
    boolean test(T t);

    static <T extends Comparable<T>> GenericPredicate<T> isGreaterThan(T threshold) {
        return (T value) -> value.compareTo(threshold) > 0;
    }
}
