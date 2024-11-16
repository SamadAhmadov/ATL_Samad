package homeTasks;

public class Task2DoWhile {
    public static void main(String[] args) {

        int a = 1;
        int cem = 0;

        do {
            cem += a;
            a++;
        } while (a <= 10);

        System.out.println("Birdən ona qədər ədədlərin cəmi: " + cem);
    }
}
