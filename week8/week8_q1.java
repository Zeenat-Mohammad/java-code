import java.io.*;

public class week8_q1 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("f1.txt"));
        String line;
        int count = 0;
        while ((line = br.readLine()) != null) {
            if (line.contains("throw") || line.contains("catch"))
                count++;
        }
        br.close();
        System.out.println("Total exceptions: " + count);
    }
}
