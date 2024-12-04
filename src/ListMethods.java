import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListMethods {
    public static void main(String[] args) {

        LinkedList<String> custom = new LinkedList<>();
        custom.add("Xeyransa");
        custom.add("Cavidan");
        custom.add("Malik");
        custom.add("Musa");
        custom.add("Əli");

        String longestString = custom.get(0);

        for (String s : custom){
            if (s.length() > longestString.length()){
                longestString = s;
            }
        }

        System.out.println("Ən uzun ad: " + longestString);
    }
}
