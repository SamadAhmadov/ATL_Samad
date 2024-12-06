package InClassTasks.LibraryApp;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.toString() + " the book was added.");
    }

    public void rentBook(String title) throws BookNotFoundException, BookAlreadyRentedException {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.rentBook();
                return;
            }
        }
        System.out.println(title + " was not found in library.");
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
        System.out.println("\nAvailable books: ");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }

        }
}
