import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Prob6 {
    public static void main(String[] args) {
        String filename = "grades.txt";

        double sum = 0;
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {

            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    double grade = Double.parseDouble(line);
                    sum += grade;  
                    count++;

                } catch (NumberFormatException e) {
                    System.out.println("Invalid grade format: " + line);
                }
            }

            // if grades are available:
            if (count > 0) {
                double average = sum / count; 
                System.out.println("Submitted grade #: " + count);
                System.out.println("Average grade percentage: " + average);
            } else {
                System.out.println("No grades available in file.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading this file.");
            e.printStackTrace();
        }
    }
}

