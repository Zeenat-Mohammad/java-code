import java.util.Scanner;
public class week1_q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        System.out.println("Absolute value: "+Math.abs(num));
        System.out.println("Square root: "+Math.sqrt(num));
        System.out.println("Power (num^2): "+Math.pow(num, 2));
        System.out.println("Sine value: "+Math.sin(num));
        System.out.println("Cosine value: "+Math.cos(num));
    }
}
