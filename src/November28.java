import java.util.Scanner;
import java.util.SortedMap;

public class November28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print some text: ");

        String input = scanner.nextLine();

        try {
            if (input == null){
              throw new NullPointerException("Bos deyer daxil edildi");
            }
            System.out.println("Daxil edilnish metn: " + input);
        }
        catch (NullPointerException e){
            System.out.println("Xeta: " + e.getMessage());
        }
    }
}
