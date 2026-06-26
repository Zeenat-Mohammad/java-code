class Book {
    private int bookId;
    private String title;
    private String author;
    private String genre;
    private boolean available;

    Book(int bookId, String title, String author, String genre, boolean available) {
        this.bookId = bookId; 
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isAvailable() {
        return available;
    }

    public void displayDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Available: " + available);
    } 
}

class FictionBook extends Book {
    private String type;

    FictionBook(int bookId, String title, String author, String genre, boolean available, String type) {
        super(bookId, title, author, genre, available);
        this.type = type;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: " + type);
    }
}

public class week5_q5 {
    public static void main(String[] args) {
        Book b1 = new FictionBook(3, "Fiction Novel", "Fiction Author", "Fiction", true, "Fiction");
        b1.displayDetails();
    }
}
