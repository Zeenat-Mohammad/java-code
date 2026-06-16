public class week3_q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int div = 1000;
        while (divisor > 0) {
            System.out.println(num / div);
            num %= div;
            div /= 10;
        }
    }
}
