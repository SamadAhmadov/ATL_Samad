import java.util.Scanner;

public class ThreeDigitNumber {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        int hundreds = a/100;
        int tens = a/10%10;
        int ones = a%10;
        int sum = hundreds+tens+ones;
        int difference = hundreds-tens-ones;
        int multiplication = hundreds*tens*ones;
        System.out.println("Hundreds: " + hundreds);
        System.out.println("Tens: " + tens);
        System.out.println("Ones: " + ones);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Multiplication: " + multiplication);

    }
}
