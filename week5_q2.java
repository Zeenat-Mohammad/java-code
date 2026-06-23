import java.util.ArrayList;
import java.util.Scanner;

class User {
    private int userId;
    private String name;
    private ArrayList<Integer> borrowedBooks;
    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
        borrowedBooks = new ArrayList<>();
    }
    public void borrowBook(int bookId) {
        borrowedBooks.add(bookId);
    }
    public void returnBook(int bookId) {
        borrowedBooks.remove(Integer.valueOf(bookId));
    }
    public void displayUser() {
        System.out.println("User ID: " + userId);
        System.out.println("Name: " + name);
        System.out.println("Borrowed Books: " + borrowedBooks);
    }
}

public class week5_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter User ID: ");
        int userId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        User u = new User(userId, name);
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        u.borrowBook(id);
        u.displayUser();
    }
}
