package InClassTasks.GenericsTask;

class Main {
    public static void main(String[] args) {
        Generic<Integer> obj1 = new Generic<Integer>(100);
        System.out.println(obj1.getObject());

        Generic<String> sObj = new Generic<String>("Java");
        System.out.println(sObj.getObject());
    }
}