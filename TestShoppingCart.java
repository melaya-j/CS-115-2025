import java.util.*;

public class TestShoppingCart {
    public static void main(String[] args) {
        List<String> availableProducts = Arrays.asList("apple", "banana", "orange", "milk", "bread");
        ShoppingCart cart = new ShoppingCart(3, availableProducts);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Shopping Cart!");
        System.out.println("Available products: " + " " + availableProducts);
        System.out.println("Type 'exit' to finish.\n");

        for (int i = 0; i < products.length; i++) {
            if (quantities[i] > 0) {
                double cost = quantities[i] * prices[i];  // Calculate the cost for this product
                totalCost += cost;  // Add to the total cost
                System.out.println(products[i] + ": " + quantities[i] + " x $" + prices[i] + " = $" + cost);
            }
        }

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
            int quantity = 0;
            if (scanner.hasNextInt()) {
                quantity = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Invalid quantity. Please enter a valid number.\n");
                scanner.next()
            }
        }
    }
}