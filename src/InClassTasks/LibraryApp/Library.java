package InClassTasks.LibraryApp;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.toString() + " the book was added.");
    }

    public void rentBook(String title) {
        for (Book book : books) {
            if (book.toString().contains(title)) {
                book.rent();
                return;
            }
        }
        System.out.println(title + " was not found.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.toString().contains(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println(title + " was not found.");
    }

    public void showAvailableBooks() {
        boolean anyAvailable = false;
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book.toString());
                anyAvailable = true;
            }
        }
        if (!anyAvailable) {
            System.out.println("No available books.");
        }
    }
}
