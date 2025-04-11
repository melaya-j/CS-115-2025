import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> availableProducts = Arrays.asList("apple", "banana", "orange", "milk", "bread");
        int maxProducts = 3;

        ShoppingCart cart = new ShoppingCart(maxProducts, availableProducts);

        System.out.println("Welcome to the Shopping Cart!");
        System.out.println("Available products: " + " " + availableProducts);
        System.out.println("Type 'exit' to finish.\n");

        while (true) {
            System.out.print("Enter product name: ");
            String product = scanner.nextLine().toLowerCase();

            if (product.equals("exit")) {
                break;
            }

            if (!availableProducts.contains(product)) {
                System.out.println("Sorry, that product is not available.\n");
                continue;
            }

            System.out.print("Enter quantity: ");
            int quanitity = 0;if (scanner.hasNextInt()) {
                quantity = scanner.nextInt();
                scanner.nextLine(); 
    
                if (quantity <= 0) {
                    System.out.println("Quantity must be a positive number.\n");
                    continue;
                }
            } else {
                System.out.println("Invalid quantity. Please enter a valid number.\n");
                scanner.nextLine();
                continue;
            }

            String message = cart.addProduct(product, quantity);
            System.out.println(message + "\n");
            cart.display();
            System.out.println();
        }

        System.out.println("Final Cart:");
        cart.display();

        scanner.close();
    }
}


            