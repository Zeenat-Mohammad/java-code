import java.util.Scanner
class week3_q1 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in); 
    int n = 10, 
    for (int i = 1; i <= n; i++) {
      System.out.print(firstTerm + ", ");
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}
