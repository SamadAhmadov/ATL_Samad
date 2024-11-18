import java.util.Scanner;

public class November16 {
    public static void main(String[] args) {

//        var a = "*";
//
//        for (int i = 1; i < 6; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(a);
//            }
//            System.out.println();
//        }


//        for (int i = 1; i < 5; i++) {
//            System.out.print("*");
//            for (int j = 0; j <= 3; j++) {
//                System.out.print(" ");
//            }
//            System.out.println("*");
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ədəd daxil edin: ");
        int a = scanner.nextInt();
        int bolunenlerinSayi = 0;

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.println(i);
            }
//                bolunenlerinSayi++;
//                System.out.println("Bölünənlərin sayı: " + bolunenlerinSayi);
            }


        }
    }
