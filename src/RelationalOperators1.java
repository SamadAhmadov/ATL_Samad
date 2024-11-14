import java.util.Scanner;

public class RelationalOperators1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        boolean a = (numA == numB);
        boolean b = (numA <= numB);
        boolean c = (numA > numB);
        boolean d = (numA >= numB);
        boolean e = (numA != numB);
        System.out.println("numA == numB  " + a);
        System.out.println("numA <= numB  " + b);
        System.out.println("numA >  numB  " + c);
        System.out.println("numA >= numB  " + d);
        System.out.println("numA != numB  " + e);

    }
}
