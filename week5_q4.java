import java.util.*;

class user {

    private int userId, bookId;
    private String name;

    user(int userId, int bookId, String name) {
        this.userId = userId;
        this.bookId = bookId;
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public int getBookId() {
        return bookId;
    }

    public String getName() {
        return name;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class book {

    private int bookId;
    private String title, author, genre;
    private boolean available;

    book(int bookId, String title, String author, String genre, boolean available) {
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

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

public class week5_q4
{
  public static void main(String[] args){
    Book b1 = new Book(1002, "Java Basics", "John Doe", "Programming", true);
    User u1 = new User(101, 1002, "Raj");
    b1.bookId=1002;
    u1.name="raj";
  }
}
