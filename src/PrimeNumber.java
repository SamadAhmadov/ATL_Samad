import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner mySc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int myNum = mySc.nextInt();

        boolean isPrime = true;

            for (int i = 2; i * i <= myNum; i++) {
                if (myNum % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(myNum + " is a prime number.");
            } else {
                System.out.println(myNum + " is not a prime number.");
            }
        }
    }