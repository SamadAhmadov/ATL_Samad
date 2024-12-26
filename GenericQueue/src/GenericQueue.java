import java.util.PriorityQueue;
import java.util.Queue;

public class GenericQueue<T> {

    Queue<T> queue = new PriorityQueue<>();

    public void isEmpty(){
        try{
            queue.element();
        }catch (Exception e){
            System.out.println("Queue is empty.");
        }
    }

    public void enqueue(T element) {
        queue.add(element);
    }

    public void dequeue() {
        queue.poll();
    }

    @Override
    public String toString() {
        return "GenericQueue{" +
                "queue=" + queue +
                '}';
    }
}
