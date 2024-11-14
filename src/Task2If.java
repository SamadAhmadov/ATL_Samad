import java.util.Scanner;

public class Task2If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 3 == 0 || a % 4 == 0) {
            System.out.println("3 ve ya 4 bolunur");
        } else {
            System.out.println("3 ve ya 4 bolunmur");
        }

    }
}