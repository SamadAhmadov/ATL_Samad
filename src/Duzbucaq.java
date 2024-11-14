import java.util.Scanner;

public class Duzbucaq {
    public static void main(String[] args) {
        Scanner scanner1=new Scanner(System.in);
        int en= scanner1.nextInt();
        int uzunluq= scanner1.nextInt();
        int perimetr=en+uzunluq;
        int sahe=en*uzunluq;
        System.out.println("Duzbucaqin eni: " + en +" sm," + " uzunlugu: " + uzunluq +" sm," + " perimetri: " + perimetr + " sm," + "sahesi: " + sahe + " sm" );
    }
}
