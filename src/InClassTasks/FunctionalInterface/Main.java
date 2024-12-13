package InClassTasks.FunctionalInterface;

public class Main {
    public static void main(String[] args) {

        CalculatorInterface addition = (a, b) -> a+b; //lambda expression
        CalculatorInterface subtraction = (a, b) -> a-b;
        CalculatorInterface multiplication = (a, b) -> a*b;
        CalculatorInterface division = (a, b) -> a/b;

        System.out.println(addition.operation(4,5));
        System.out.println(subtraction.operation(15, 6));
        System.out.println(multiplication.operation(3, 7));
        System.out.println(division.operation(45, 5));
    }
}
