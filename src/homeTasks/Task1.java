package homeTasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci ədədi daxil edin: ");
        int a = scanner.nextInt();
        System.out.println("İkinci ədədi daxil edin: ");
        int b = scanner.nextInt();

        int teklerinSayi = 0;
        int teklerinCemi = 0;
        int cutlerinSayi = 0;
        int cutlerinCemi = 0;

        for (int i = a + 1; i < b; i++) {
            if (i % 2 == 0) {
                cutlerinSayi++;
                cutlerinCemi += i;
            } else {
                teklerinSayi++;
                teklerinCemi += i;
            }
        }

        System.out.println("Tək ədədlərin sayı: " + teklerinSayi);
        System.out.println("Tək ədədlərin cəmi: " + teklerinCemi);
        System.out.println("Cüt ədədlərin sayı: " + cutlerinSayi);
        System.out.println("Cüt ədədlərin cəmi: " + cutlerinCemi);
    }
}