package InClassTasks.FcInterface;

@FunctionalInterface
public interface GenericBiFunction<T, U, R> {
    R apply(T t, U u);

    static <T extends Number, U extends Number> GenericBiFunction<T, U, Integer> add() {
        return (T a, U b) -> a.intValue() + b.intValue();
    }
}
