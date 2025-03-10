import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor to initialize item details
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to display item details
    public void displayItem() {
        System.out.println(itemName + " | Price: $" + price + " | Quantity: " + quantity);
    }
}

class ShoppingCart {
    private CartItem[] cart; // Array to store items
    private int itemCount;   // Number of items in the cart
    private final int MAX_ITEMS = 10; // Maximum cart size

    // Constructor to initialize the cart
    ShoppingCart() {
        cart = new CartItem[MAX_ITEMS];
        itemCount = 0;
    }

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        if (itemCount < MAX_ITEMS) {
            cart[itemCount] = new CartItem(itemName, price, quantity);
            itemCount++;
            System.out.println("Item added to cart: " + itemName);
        } else {
            System.out.println("Cart is full! Cannot add more items.");
        }
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        for (int i = 0; i < itemCount; i++) {
            if (cart[i].itemName.equalsIgnoreCase(itemName)) {
                // Shift items to the left to remove the gap
                for (int j = i; j < itemCount - 1; j++) {
                    cart[j] = cart[j + 1];
                }
                cart[itemCount - 1] = null; // Remove last item
                itemCount--;
                System.out.println("Item removed: " + itemName);
                return;
            }
        }
        System.out.println("Item not found in cart.");
    }

    // Method to display the total cost of the cart
    public void displayTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < itemCount; i++) {
            totalCost += cart[i].price * cart[i].quantity;
        }
        System.out.println("\nTotal Cost: $" + totalCost);
    }

    // Method to display all items in the cart
    public void displayCart() {
        if (itemCount == 0) {
            System.out.println("Your cart is empty.");
            return;
        }
        System.out.println("\nCart Items:");
        for (int i = 0; i < itemCount; i++) {
            cart[i].displayItem();
        }
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("\n1. Add Item to Cart");
            System.out.println("2. Remove Item from Cart");
            System.out.println("3. View Cart");
            System.out.println("4. View Total Cost");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter item price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();
                    cart.addItem(name, price, quantity);
                    break;

                case 2:
                    System.out.print("Enter item name to remove: ");
                    String removeName = sc.nextLine();
                    cart.removeItem(removeName);
                    break;

                case 3:
                    cart.displayCart();
                    break;

                case 4:
                    cart.displayTotalCost();
                    break;

                case 5:
                    System.out.println("Thank you for shopping!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
