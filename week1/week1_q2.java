import java.util.Scanner;
public class week1_q2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter second number: ");
        int num2=sc.nextInt();
        System.out.println("Sum: "+(num1+num2));
        System.out.println("Difference: "+(num1-num2));
        System.out.println("Product: "+(num1*num2));
        System.out.println("Quoitent: "+(num1/num2));
        System.out.println("Maximum: "+Math.max(num1,num2));
        System.out.println("Minimum: "+Math.min(num1,num2));
    }
}
