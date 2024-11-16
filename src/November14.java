import java.util.Scanner;

public class November14 {
    public static void main(String[] args) {

//        //change their places
//        var a = 3;
//        var b = 5;


//        System.out.println("Enter any number:");
//        Scanner mysc = new Scanner(System.in);
//        int myNum = mysc.nextInt();
//        boolean myBoo = (myNum%2==0);
//        System.out.println(myBoo);

//        var a = 2;

//        while (a <= 10) {
//            if (a % 2 == 0) {
//                System.out.println(a);
//                a++; //a=a+1
//            }
// }
//

        var b = 9;
        for (var a = 1; a <= 10; a++) {
            System.out.println(b + "*" + a + "=" + a * b);
        }

        int[] box = {1, 5, 6, 3, 2};
        for (var i = 0; i < box.length; i++) {
            System.out.println(box[i]);
        }

        //reverse
        for (var i = box.length - 1; i >= 0; i--) {
            System.out.println(box[i]);
        }
    }
}