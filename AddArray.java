import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        final int ASIZE = 5;
        int [] numbers = new int [ASIZE];
        Scanner scanner = new Scanner(System.in);
        //user enter ASIZE int
        System.out.println("Enter:" + ASIZE + " integers:");

        for (int i = 0; i < ASIZE; i++) {
            System.out.println("Enter an integer:" + (i + 1) + ":");
            number[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < ASIZE; i++) {
            sum += numbers [i];

        }

        System.out.println("The sum of each value is: " + sum);
    }
}
