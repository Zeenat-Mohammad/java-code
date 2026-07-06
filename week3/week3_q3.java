import java.util.Scanner;

public class week3_q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, product = 1, n = 4;
        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            sum += num;
            product *= num;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
