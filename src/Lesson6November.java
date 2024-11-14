import java.util.Scanner;

public class Lesson6November {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        /*int a= myscan.nextInt();
        int yuz= a/100;
        int on= (a/10)%10;
        int bir= a%10;
        int reverseNum= bir*100+ on*10+ yuz*1;
        System.out.println(reverseNum+10);*/

//        int a= myscan.nextInt();
//        int min=a/1000;
//        int yuz=a/100%10;
//        int on= a/10%10;
//        int bir=a%10;
//        int num1=min*yuz;
//        int num2=on+bir;
//        int num3=num1-num2;
//        System.out.println(num3);

//        int a = myscan.nextInt();
//        int min=a/1000;
//        int yuz=a/100%10;
//        int on= a/10%10;
//        int bir=a%10;
//        int newnum= bir*1000+yuz*100+on*10+min;
//        int cemi= newnum+10;
//        System.out.println(cemi);

//        int a = myscan.nextInt();
//        boolean c = (a  % 5)==0;
//        System.out.println(c);


//        int a = myscan.nextInt();
//        boolean d = (a % 2) == 0;
//        System.out.println(d);

        //prove palindrome
        int a = myscan.nextInt();
        int yuz = a/100;
        int onluq= a/10;
        int bir= a%10;
        boolean palindrom = (yuz==bir);
        System.out.println(palindrom);



    }
}
