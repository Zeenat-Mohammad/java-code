import java.util.Scanner;

public class week6_q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=3;
        String[] str = new String[3];
        System.out.println("Enter three strings:");
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(str[i] + " ");
        }
    }
}
