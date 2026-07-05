import java.util.Scanner;
public class week1_q3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Fahrenheit\t\tCelcius");
        for(int i=0;i<n;i++){
            double c=(double)((arr[i]-32)/1.8);
            System.out.println(arr[i]+"\t\t"+c);
        }
    }
}
