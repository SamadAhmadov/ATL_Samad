import java.util.Scanner;

public class TamQaliq {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Birinci ededi daxil edin");
        var a = scanner.nextInt();
        System.out.println("Ikinci ededi daxil edin");
        var b= scanner.nextInt();
        var tam=a/b;
        var kesir=a%b;
        System.out.println("Tam: "+ tam + " ,Kesir: " + kesir);




    }
}
