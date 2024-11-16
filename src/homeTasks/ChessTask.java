package homeTasks;

public class ChessTask {
    public static void main(String[] args) {

//        long totalGrains = 0;
//
//        for (var a = 1; a <= 64; a++) {
//            //long grainsOnCell = 1L << (a - 1);
//            long grainsOnCell = (long) Math.pow(2, a - 1);
//            totalGrains += grainsOnCell;
//        }
//        System.out.println(totalGrains);

        long totalGrains = 0;
        for (int i = 0; i < 64; i++) {
            totalGrains += 1L << i;
        }
        System.out.println("Общее количество зёрен на шахматной доске: " + totalGrains);



    }
}
