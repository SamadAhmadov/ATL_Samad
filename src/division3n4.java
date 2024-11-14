import java.util.Scanner;

public class division3n4 {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Print any number:");
        int a = newScanner.nextInt();
        boolean myBoo = (a%3==0 && a%4==0);
        System.out.println(myBoo);

    }
}
