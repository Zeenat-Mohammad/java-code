import java.util.Scanner;

public class week2_q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        System.out.println("Floyd's triangle"); 
        for (int i=1;i<=n;i++) {
            for (int j =1;j<=i;j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
        System.out.println("Alternating pattern");
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=i;j++) {
                int num=(i+j)%2;
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
