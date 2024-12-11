package InClassTasks.GenericsTask;

public class Generic<T> {

    private T object;

    public Generic(T obj) {
        this.object = obj;
    }

    public T getObject() {
        return object;
    }
}
