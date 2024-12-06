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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void rentBook() throws BookAlreadyRentedException {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " the book has rented.");
        } else {
            throw new BookAlreadyRentedException(title + " the book is on loan.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println(title + " the book was returned.");
        } else {
        }
    }
    public String toString() {
        return "Book title: " + title +
                ", author: " + author +
                ", status: " + (isAvailable ? "is available." : "is not available.");
    }
}
