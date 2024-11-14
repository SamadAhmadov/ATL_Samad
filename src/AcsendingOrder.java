import java.util.Scanner;

public class AcsendingOrder {
    public static void main(String[] args) {
        System.out.println("Print 4-digit number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int thousands = a / 1000;
        int hundreds = a / 100 % 10;
        int tens = a / 10 % 10;
        int ones = a % 10;
        boolean b = ones>tens && tens>hundreds && hundreds>thousands;
        System.out.println(b);




    }
}
