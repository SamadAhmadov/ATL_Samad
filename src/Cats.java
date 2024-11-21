import javax.xml.namespace.QName;

public class Cats {

    public String name;

    public Cats(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Cats myCat = new Cats("Luna");
        System.out.println(myCat.name);
    }
}
