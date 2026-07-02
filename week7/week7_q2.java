import java.io.*;
import java.util.*;

class InvalidDataException extends Exception {
    InvalidDataException(String message) {
        super(message);
    }
}
public class week7_q2 {
    public static void main(String[] args) {
        ArrayList<Double> values = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("f1.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\s+");
                for (String s : data) {
                    try {
                        double num = Double.parseDouble(s);
                        values.add(num);
                    } 
                    catch (NumberFormatException e) {
                        try {
                            throw new InvalidDataException(s + " is not a valid number.");
                        } 
                        catch (InvalidDataException e) {
                            System.out.println("Exception: InvalidDataException - " + e.getMessage());
                        }
                    }
                }
            }
            br.close();
            fr.close();
            System.out.println("Valid values: " + values);
        } 
        catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
