package InClassTasks;

public class StarPattern {
    public static void main(String[] args) {

//        int rows = 4;
//
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= 4; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        //int n = 4;
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = i; j < n; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= (2 * i - 1); k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        //int m = 5;
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 0; j < m - 2 * i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        int l = 7;

        for (int i = 0; i < l / 2 + 1; i++) {
            // Print spaces
            for (int j = 0; j < l / 2 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = l / 2 - 1; i >= 0; i--) {
            for (int j = 0; j < l / 2 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
