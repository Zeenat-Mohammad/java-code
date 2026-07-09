import java.io.*;
import java.util.*;

class InvalidDataException extends Exception {
    InvalidDataException(String message) {
        super(message);
    }
}
public class week7_q1 {
    public static void main(String[] args) {
        try {
            File file = new File("f1.txt");
            if (!file.exists()) {
                throw new FileNotFoundException("The file does not exist.");
            }
            Scanner sc = new Scanner(file);
            double sum = 0;
            int count = 0;
            while (sc.hasNext()) {
                String data = sc.next();
                try {
                    double num = Double.parseDouble(data);
                    sum += num;
                    count++;
                } catch (NumberFormatException e) {
                    throw new InvalidDataException(data + " is not a valid number.");
                }
            }
            if (count == 0) {
                throw new IllegalArgumentException("No numeric values found in the file.");
            }
            FileWriter fw = new FileWriter("f2.txt");
            fw.write(String.valueOf(sum / count);
            fw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Exception: FileNotFoundException - " + e.getMessage());
        } catch (InvalidDataException e) {
            System.out.println("Exception: InvalidDataException - " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: IllegalArgumentException - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
