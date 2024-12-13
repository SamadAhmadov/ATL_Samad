package InClassTasks;

import java.util.ArrayList;

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myArrList = new ArrayList<>();
        myArrList.add(1);
        myArrList.add(2);
        myArrList.add(3);
        myArrList.add(4);

        myArrList.forEach(n -> System.out.println(n));
        System.out.println("\n");
        myArrList.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n);
        });

    }
}
