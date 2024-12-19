public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 6, 8, 23, 46, 65};
        int low = 0;
        int high = arr.length - 1;
        int step = 0;
        int find = 23;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;
            ++step;
            if (arr[mid] == find) {
                System.out.println("Element found at index: " + mid);
                System.out.println("Steps taken: " + step);
                return;
            } else if (arr[mid] < find) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Element not found.");
        System.out.println("Steps taken: " + step);
    }
}
