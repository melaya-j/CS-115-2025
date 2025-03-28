import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Prob8 {
    public static void main(String[] args) {
        String filename = "grades.txt";

        double sum = 0;
        double gradeMinimum = 0;
        double gradeMaximum = 100;


        int count = 0;
        int numA = 0;
        int numB = 0;
        int numC = 0;
        int numD = 0;
        int numE = 0;

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


            if (grade > 89) {
                numA ++;
            } else if (grade > 79)
            numB ++;
            } else if (grade > 69){
                numC ++;
            }else if (grade > 59){
                numD ++;
            }else{
                numE = 0;
                numE ++;
            }
            
        if (count > 0) {
            double average = sum/count;
            System.out.println("Number of grades: " + count);
                System.out.println("Average grade: " + average);
                System.out.println("Number of A's: " + numAs);
                System.out.println("Number of B's: " + numBs);
                System.out.println("Number of C's: " + numCs);
                System.out.println("Number of D's: " + numDs);
                System.out.println("Number of E's: " + numEs);
            } else {
                System.out.println("No grades found in the file.");
            }
        }catch (IOException e) {
            System.out.println("An error occurred while reading this file.");
            e.printStackTrace();
            System.exit(1);
            //exits programs
        }

        if (grade > gradeMaximum){
    System.out.println("Error: You have exceeded maximum input")
        }
        if (grade < gradeMinimum){
            System.out.println("Error: You have exceeded minximum input")
        }
    }


        
