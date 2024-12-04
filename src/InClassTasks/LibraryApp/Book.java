package InClassTasks.LibraryApp;

public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String toString() {
        return "Book title: " + title + ", author: " + author + ", status: " + (isAvailable ? "is available." : "is not available.");
    }

    public void rent() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " the book was rented.");
        } else {}
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println(title + " the book was returned.");
        } else {}
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
