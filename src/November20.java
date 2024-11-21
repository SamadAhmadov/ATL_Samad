import java.math.BigDecimal;

public class November20 {
    public static void main(String[] args) {
        Object[] myNum = {34,"salam", 56, 2,2};
        String s = "hello";
        Integer i = 2;

        System.out.println(myNum.getClass().arrayType());
        System.out.println(s.getClass().getTypeName());
        System.out.println(i.getClass().getTypeName());

//        Object[] myNum = {34,"salam", 56, 2,2};
//        System.out.println(myNum[0]);
//        System.out.println(myNum[1]);
//        for (Object elements : myNum) {
//            System.out.println(elements);
//        }
    }
}
