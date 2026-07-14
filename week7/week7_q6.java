import java.io.*;

class InvalidDataException extends Exception {

    InvalidDataException(String message) {
        super(message);
    }
}

public class week7_q6 {

    public static void main(String[] args) {
        try {
            File file = new File("f1.txt");

            if (!file.exists()) {
                throw new FileNotFoundException("The file does not exist.");
            }

            BufferedReader br = new BufferedReader(new FileReader(file));

            double sum = 0;
            int count = 0;
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\s+"); // Split by spaces

                for (String value : data) {
                    try {
                        double num = Double.parseDouble(value);
                        sum += num;
                        count++;
                    } catch (NumberFormatException e) {
                        throw new InvalidDataException(value + " is not a valid number.");
                    }
                }
            }

            br.close();

            if (count == 0) {
                throw new IllegalArgumentException("No numeric values found in the file.");
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter("f2.txt"));
            bw.write("Average: " + (sum / count));
            bw.newLine();
            bw.close();

            System.out.println("Average written successfully to f2.txt");

        } catch (FileNotFoundException e) {
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter("f2.txt"));
                bw.write("Exception: FileNotFoundException - " + e.getMessage());
                bw.close();
            } catch (IOException ex) {
                System.out.println("Error writing to file: " + ex.getMessage());
            }
        } catch (FileNotFoundException e) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("f2.txt"))) {
                bw.write("Exception: FileNotFoundException - " + e.getMessage());
            } catch (IOException ex) {
                System.out.println("Error writing to file: " + ex.getMessage());
            }

        } catch (InvalidDataException e) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("f2.txt"))) {
                bw.write("Exception: InvalidDataException - " + e.getMessage());
            } catch (IOException ex) {
                System.out.println("Error writing to file: " + ex.getMessage());
            }

        } catch (IllegalArgumentException e) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("f2.txt"))) {
                bw.write("Exception: IllegalArgumentException - " + e.getMessage());
            } catch (IOException ex) {
                System.out.println("Error writing to file: " + ex.getMessage());
            }

        } catch (IOException e) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("f2.txt"))) {
                bw.write("Exception: IOException - " + e.getMessage());
            } catch (IOException ex) {
                System.out.println("Error writing to file: " + ex.getMessage());
            }
        }
    }
}
