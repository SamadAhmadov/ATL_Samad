package November21;

import java.util.Scanner;

public class PracticeTask {
    public static void main(String[] args) {

        Scanner mySc = new Scanner(System.in);

        System.out.print("Type first array's length: ");
        int firstLen = mySc.nextInt();
        int[] firstArr = new int[firstLen];

        for(int i = 0; i < firstLen; i++) {
            firstArr[i] = mySc.nextInt();
        }

        System.out.print("Type second array's length: ");
        int secondLen = mySc.nextInt();
        int[] secondArr = new int[secondLen];

        if(secondLen > firstLen) {
            for(int i = 0; i < firstLen; i++) {
                secondArr[i] = firstArr[i];
            }
            for(int i = firstLen; i < secondLen; i++) {
                secondArr[i] = mySc.nextInt();
            }
        }
        else {
            for(int i = 0; i < secondLen; i++) {
                secondArr[i] = firstArr[i];
            }
        }
        for(int i = 0; i < secondLen; i++) {
            System.out.print(secondArr[i] + " ");
        }
    }
}
