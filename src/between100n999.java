import java.util.Scanner;

public class between100n999 {
    public static void main(String[] args) {
        Scanner mysc= new Scanner(System.in);
        int a = mysc.nextInt();
        boolean result = (a>=100 && a<=999);
        System.out.println(result);

    }
}
