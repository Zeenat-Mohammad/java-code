import java.util.Scanner;

public class week4_q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        int words = 0,  sentences = 0;
        int e = 0, z = 0;
        for (char ch : text.toCharArray()) {
            if (ch == '.' || ch == '!' || ch == '?') {
                sentences++;
            }
            if (ch == ' ') {
              word++;
            }
            if (ch == 'e') {
                e++;
            }
            if (ch == 'z') {
                z++;
            }
        }
        word +=1;
        System.out.println("Number of words: " + words);
        System.out.println("Number of sentences: " + sentences);
        System.out.println("Number of 'e': " + e);
        System.out.println("Number of 'z': " + z);
    }
}
