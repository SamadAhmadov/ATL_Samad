import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Author<String> author1 = new Author<>("Samad", "Ahmadov");

        News<Category, String> news1 = new News<>(new Category("Economics"), "Macro economics", author1, LocalDateTime.now());

        System.out.println(news1);
    }
}