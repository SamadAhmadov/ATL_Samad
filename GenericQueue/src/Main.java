public class Main {
    public static void main(String[] args) {

        GenericQueue<String> queue = new GenericQueue<>();

        queue.enqueue("Hi, my name is ..");
        queue.enqueue("Slim");
        queue.enqueue("Shady");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue);
    }
}
