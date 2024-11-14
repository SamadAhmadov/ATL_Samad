import java.util.Scanner;

public class FourDigitNum3and4 {
    public static void main(String[] args) {
        Scanner mysc = new Scanner(System.in);
        System.out.println("Print 4-digit number");
        int a = mysc.nextInt();
        int thousands = a / 1000;
        int hundreds = a / 100 % 10;
        int tens = a / 10 % 10;
        int ones = a % 10;
        boolean b = (thousands % 2 == 0 && hundreds % 2 == 0 && tens % 2 == 0 && ones % 2 == 0);
        System.out.println(b);
    }
}
