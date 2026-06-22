import java.util.Scanner;

public class week4_q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sales: ");
        double sales = sc.nextDouble();
        double commission;
        if (sales < 500) {
            commission = sales * 0.02;
        } else if (sales < 5000) {
            commission = sales * 0.05;
        } else {
            commission = sales * 0.08;
        }
        System.out.println("Commission: " + commission);
    }
}
