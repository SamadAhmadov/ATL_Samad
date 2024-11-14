import java.util.Scanner;

public class Task3If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a >= 51 && a <= 60) {
            System.out.println("Netice: E");
        } else if (a >= 61 && a <= 70) {
            System.out.println("Netice: D");
        } else if (a >= 71 && a <= 80) {
            System.out.println("Netice: C");
        } else if (a >= 81 && a <= 90) {
            System.out.println("Netice: B");
        } else if (a >= 91 && a <= 100) {
            System.out.println("Netice: A");
        } else if (a >= 0 && a <= 50) {
            System.out.println("Imtahandan kesildiz");
        }

    }
}
