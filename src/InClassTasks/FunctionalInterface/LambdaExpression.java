package InClassTasks.FunctionalInterface;

public class LambdaExpression {
    public static void main(String[] args) {

        customFunctionalInterface add = (a, b) -> a + b;
        customFunctionalInterface multiply = (a, b) -> a * b;

        System.out.println(add.operation(6, 3));
        System.out.println(multiply.operation(4, 5));
    }
}