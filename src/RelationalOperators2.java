import java.util.Scanner;

public class RelationalOperators2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        boolean a = (numA == numB);
        boolean b = (numA != numB);
        System.out.println("numA == numB " + a);
        System.out.println("numA != numB " + b);

    }
}
