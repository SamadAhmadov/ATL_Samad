package November21;

import java.util.Scanner;

public class PracticeTask {
    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);

        System.out.println("Type array's length: ");
        int firstArrLength = mySc.nextInt();
        int [] arr= new int[firstArrLength];
        arr = new int[] {1,2,3,4,5,6,7};
        System.out.println("Type new array's length: ");
        int secondArrLength = mySc.nextInt();
        int [] newArr= new int[secondArrLength];

        for (int i=0; i<firstArrLength; i++){
            newArr[i]=arr[i];
        }
        newArr[7]= 8;
        newArr[8]= 9;
        newArr[9]=10;

        for (int num:arr){
            System.out.print(num + " ");
        }
        System.out.println();

        for (int num: newArr){
            System.out.print(num + " ");
        }

    }
}
