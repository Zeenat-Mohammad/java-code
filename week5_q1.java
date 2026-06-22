import java.util.Scanner;

class Book {
    private int bookId;
    private String title, author,  genre;
    private boolean available;

    public Book(int bookId, String title, String author, String genre, boolean available) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
    }

    public void display() {
        System.out.println("ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Available: " + available);
    }
}

public class week5_q1 {
    public static void main(String[] args) 
        Book book = new Book(1001, "book", "tom", "action", true);
        book.display();
    }
}
