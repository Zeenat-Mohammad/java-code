import java.util.Scanner;

public class week4_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        System.out.print("Enter center x: ");
        double X1 = sc.nextDouble();
        System.out.print("Enter center y: ");
        double Y1 = sc.nextDouble();
        System.out.print("Enter point x: ");
        double X2 = sc.nextDouble();
        System.out.print("Enter point y: ");
        double Y2 = sc.nextDouble();
        double perimeter = ;
        double distance = Math.sqrt(Math.pow (X2 - X1, 2) + Math.pow(Y2 - Y1, 2));
        System.out.println("Area: " +  (3.14 * radius * radius));
        System.out.println("Perimeter: " + (2 * 3.14 * radius));
        if (distance <= radius) {
            System.out.println("Point is inside the circle");
        } else {
            System.out.println("Point is outside the circle");
        }
    }
}
