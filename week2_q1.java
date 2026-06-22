import java.util.Scanner;
public class week2_q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        int odd = 0, even = 0;
        for (int i=0;i<5;i++) {
            int num=sc.nextInt();
            if (num%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Odd count: "+odd);
        System.out.println("Even count: "+even);
    }
}
