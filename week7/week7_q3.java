import java.io.*;

public class week7_q3 {
    public static void main(String[] args) {
        double sum = 0;
        int count = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("f1.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] arr = line.split(",");
                for (String i : arr) {
                    double num = Double.parseDouble(i.trim());
                    sum += num;
                    count++;
                }
            }
            br.close();
            if (count > 0) {
                System.out.println("Average: " + (sum / count));
            } else {
                System.out.println("Average: 0.0");
            }
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
