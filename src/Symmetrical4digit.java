import java.util.Scanner;

public class Symmetrical4digit {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int a = myscanner.nextInt();
        int minlik = a / 1000;
        int yuz = a / 100 % 10;
        int onluq = a / 10 % 10;
        int bir = a % 10;
        boolean myB = (minlik==bir);
        boolean myC = (yuz==onluq);
        System.out.println(myB);
        System.out.println(myC);

    }
}
