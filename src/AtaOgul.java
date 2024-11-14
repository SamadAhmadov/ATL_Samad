import java.util.Scanner;

public class AtaOgul {
    public static void main(String[] args) {
        int ataAge=new Scanner(System.in).nextInt();
        System.out.println("ata yas:" + ataAge);
        int sonAge=new Scanner(System.in).nextInt();
        System.out.println("ogul yas " +sonAge );
        int yasFerqi=ataAge-sonAge;
        System.out.println("Ata oguldan " + yasFerqi + " yas boyukdur");

    }
}
