import java.util.Scanner;

class week4_q1 {
    private int oddCount;
    private int evenCount;
    public OddAndEven() {
        oddCount = 0;
        evenCount = 0;
    }
    public void check(int num) {
        if (num % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }
    }
    public void display() {
        System.out.println("Number of Odd: " + oddCount);
        System.out.println("Number of Even: " + evenCount);
    }
}

public class TestOddAndEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OddAndEven obj = new OddAndEven();
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            obj.check(num);
        }
        obj.display();
        sc.close();
    }
}
