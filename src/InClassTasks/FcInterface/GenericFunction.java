package InClassTasks.FcInterface;

@FunctionalInterface
public interface GenericFunction<T, R> {
    R apply(T t);

    static GenericFunction<String, Integer> stringToLength() {
        return (str) -> str.length();
    }

    static GenericFunction<Integer, String> intToString() {
        return (i) -> "Number: " + i;
    }
}
