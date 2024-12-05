package InClassTasks.LibraryApp;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book("Chemistry", "Alfred Nobel");
        Book book2 = new Book("Mathematics", "Hewlett Packard");
        Book book3 = new Book("Biology", "Charles Darwin");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("\nAvailable books:");
        library.showAvailableBooks();

        library.rentBook("Chemistry");
        library.rentBook("Mathematics");
        System.out.println("\nAvailable books (after rent):");
        library.showAvailableBooks();


        library.returnBook("Chemistry");
        System.out.println("\nAvailable books (after return):");
        library.showAvailableBooks();
    }
}
