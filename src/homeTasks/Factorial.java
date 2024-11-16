package homeTasks;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir ədəd daxil edin: ");
        int a = scanner.nextInt();

        int faktorial = 1;

        for (int i = 1; i <= a; i++) {
            faktorial *= i;
        }
        System.out.println(a + "! = " + faktorial);
    }
}
