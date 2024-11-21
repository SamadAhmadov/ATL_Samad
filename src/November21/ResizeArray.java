package November21;

public class ResizeArray {
    public static void main(String[] args) {
        int[] arr = new int[7];
        arr = new int[] {1,2,3,4,5,6,7};
        int[] newArr = new int[10];

//        newArr [7] = 8;
//        newArr [8] = 9;
//        newArr [9] = 10;

        for (int i=0; i<arr.length; i++){
            newArr[i]=arr[i];
        }
        for (int num:arr){
            System.out.print(num + " ");
        }
        System.out.println();

        for (int num: newArr){
            System.out.print(num + " ");
        }
    }
}
