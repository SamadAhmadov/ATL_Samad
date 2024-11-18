package homeTasks;

import java.util.Scanner;

public class Task1Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];
        System.out.println("Print array's elements: ");

        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("int arr[] = ");
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i] + " ");
        }
    }
}


