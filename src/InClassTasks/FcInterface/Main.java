package InClassTasks.FcInterface;

public class Main {

    public static void main(String[] args) {

        GenericPredicate<Integer> isGreaterThan10 = GenericPredicate.isGreaterThan(10);
        System.out.println("Is 15 greater than 10? " + isGreaterThan10.test(15));
        System.out.println("Is 5 greater than 10? " + isGreaterThan10.test(5));

        GenericBiFunction<Integer, Integer, Integer> addNumbers = GenericBiFunction.add();
        System.out.println("Sum of 5 and 10: " + addNumbers.apply(5, 10));

        GenericFunction<String, Integer> stringToLength = GenericFunction.stringToLength();
        System.out.println("Length of 'Hello': " + stringToLength.apply("Hello"));

        GenericFunction<Integer, String> intToString = GenericFunction.intToString();
        System.out.println(intToString.apply(10));

        GenericSupplier<Integer> randomIntSupplier = GenericSupplier.randomIntegerSupplier();
        System.out.println("Random Integer: " + randomIntSupplier.get());

        GenericSupplier<String> randomStringSupplier = GenericSupplier.randomStringSupplier();
        System.out.println("Random String: " + randomStringSupplier.get());
    }
}
