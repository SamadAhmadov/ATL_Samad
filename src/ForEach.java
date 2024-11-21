public class ForEach {
    public static void main(String[] args) {

//        int[] myList = new int[];

//        int[] mylist = {1, 2, 3, 4};
//
//        for (int a : mylist){
//            System.out.println(a);
//        }

        int[] myList = {23, 44, 55, 66, 32};
        int count = 0;

//        //for each yazanda
//        for (int a : myList){
//            if (a>40){
//                count++;
//            }
//        }

        for (int a = 0; a < myList.length; a++) {
            if (myList[a] > 40) {
                count++;
            }
        }


    }
}
