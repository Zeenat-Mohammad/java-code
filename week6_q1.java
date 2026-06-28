import java.util.Scanner;

public class week6_q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        for (String j : words) {
            String rev = "";
            for (int i = j.length() - 1; i >= 0; i--) {
                rev += j.charAt(i);
            }
            System.out.print(rev + " ");
        }
    }
}
