import java.util.Scanner;  

public class AtmSimulation {

    String accountHolder;  
    int accountNumber;  
    double balance;  

    // Constructor to initialize account details
    AtmSimulation(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {  // Check if deposit amount is valid
            balance += amount;  
            System.out.println("Deposited: " + amount);
            System.out.println("Updated Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money (only if sufficient balance exists)
    public void withdraw(double amount) {
        if (amount > 0) {  // Check if withdrawal amount is valid
            if (balance >= amount) {  
                balance -= amount;  
                System.out.println("Withdrawn: " + amount);
                System.out.println("Updated Balance: " + balance);
            } else {
                System.out.println("Withdrawal failed! Insufficient funds.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to display the current account balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for account details
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        
        System.out.print("Enter initial balance: ");
        double initialBalance = sc.nextDouble();

        // Creating an object of AtmSimulation
        AtmSimulation obj = new AtmSimulation(name, accountNumber, initialBalance);
        
        System.out.println("\nATM MENU");
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Check Balance");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();  // Taking user choice

        // Performing actions based on user input
        switch (choice) {
            case 1:  // Deposit money
                System.out.print("Enter deposit amount: $");
                double depositAmount = sc.nextDouble();
                obj.deposit(depositAmount);
                break;

            case 2:  // Withdraw money
                System.out.print("Enter withdrawal amount: $");
                double withdrawAmount = sc.nextDouble();
                obj.withdraw(withdrawAmount);
                break;

            case 3:  // Check balance
                obj.displayBalance();
                break;

            default:  // Invalid choice
                System.out.println("Invalid choice! Please select a valid option.");
        }
        
        sc.close();  // Closing Scanner object
    }
}
