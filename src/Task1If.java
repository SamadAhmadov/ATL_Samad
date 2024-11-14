import java.util.Scanner;

public class Task1If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 4 == 0 && a % 6 == 0) {
            System.out.println("4 ve 6 bolunur");
        }  else
        {
            System.out.println("4 ve 6 bolunmur");
        }

    }
}
