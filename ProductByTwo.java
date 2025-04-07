public class ProductByTwo {

    public static void main(String[] args) {

        final int ASIZE = 4;
        int [] numbers = new int [ASIZE];
        Scanner scanner = new Scanner(System.in);
        //user enter ASIZE product
        System.out.println("Enter:" + ASIZE + " integers:");

        for (int i = 0; i < ASIZE; i++) {
            System.out.println("Enter an integer:" + (i + 1) + ":");
            number[i] = scanner.nextInt();
        }

        int product = 1;
        for (int i = 0; i < ASIZE; i++) {
            product *= numbers [i];

        }

        System.out.println ("The product of each value is: " + product);
        System.out.println ("After multiplying each value by 2:");
        for (int i = 0; i < ASIZE; i++) {
            numbers[i] *= 2;
            System.out.println("Value " + (i + 1) + "after multiplication:" + numbers[i]);
        }
    }
}
