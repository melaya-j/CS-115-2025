import java.util.Scanner;

public class MultiplyArray {
    public static void main(String[] args) {
        final int ASIZE = 4;
        int [] numbers = new int [ASIZE];
        Scanner scanner = new Scanner(System.in);
        //user enter ASIZE int
        System.out.println("Enter:" + ASIZE + " integers:");

        for (int i = 0; i < ASIZE; i++) {
            System.out.println("Enter an integer:" + (i + 1) + ":");
            number[i] = scanner.nextInt();
        }

        int product = 0;
        for (int i = 0; i < ASIZE; i++) {
            product *= numbers [i];

        }

        System.out.println("The product of each value is: " + product);
    }
}
