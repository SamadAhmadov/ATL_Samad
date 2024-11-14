import java.math.BigDecimal;
import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BigDecimal myBigDecimal1=BigDecimal.valueOf(1.3);
        BigDecimal myBigDecimal2=BigDecimal.valueOf(1.5);
        System.out.println((myBigDecimal1).add(myBigDecimal2));
    }
}
