import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int id;
    String title, author, genre;
    boolean available;
    Book(int id, String title, String author, String genre, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
    }
}

public class Catalog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> catalog = new ArrayList<>();
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Author: ");
        String author = sc.nextLine();
        System.out.print("Enter Genre: ");
        String genre = sc.nextLine();
        System.out.print("Available: ");
        boolean available = sc.nextBoolean();
        Book book = new Book(id, title, author, genre, available);
        catalog.add(book);
        System.out.println("Catalog: " + catalog);
    }
}
public class week5_q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Catalog catalog = new Catalog();
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Author: ");
        String author = sc.nextLine();
        System.out.print("Enter Genre: ");
        String genre = sc.nextLine();
        System.out.print("Is Available: ");
        boolean available = sc.nextBoolean();
        Book book = new Book(id, title, author, genre, available);
        catalog.addBook(book);
        catalog.displayCatalog();
    }
}
