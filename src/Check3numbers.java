import java.util.Scanner;

public class Check3numbers {
    public static void main(String[] args) {
        Scanner mysc = new Scanner(System.in);
        System.out.println("3-reqemli eded daxil edin");
        int a = mysc.nextInt();
        boolean myBoolean = (a % 3) == 0;
        System.out.println(myBoolean);

    }
}
