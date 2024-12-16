package InClassTasks.FcInterface;

@FunctionalInterface
public interface GenericSupplier<T> {
    T get();

    static GenericSupplier<Integer> randomIntegerSupplier() {
        return () -> (int) (Math.random() * 100) + 1;
    }

    static GenericSupplier<String> randomStringSupplier() {
        return () -> "Random String";
    }
}
