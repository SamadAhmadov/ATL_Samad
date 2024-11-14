import java.util.Scanner;

public class Calculating {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Birinci ededi daxil edin");
        int a=scanner.nextInt();

        System.out.println("Ikinci ededi daxil edin");
        int b= scanner.nextInt();

        int cem = a+b;
        int ferq = a-b;
        int vurma = a*b;
        int bolme = a/b;

        System.out.println("cem " + cem);
        System.out.println("ferq " + ferq);
        System.out.println("vurma " + vurma);
        System.out.println("bolme " + bolme);

    }
}

