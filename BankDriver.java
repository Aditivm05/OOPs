import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables to store account data
        String customerName;
        String accountNumber;
        double balance = 0;

        // Collect user details
        System.out.print("Enter your name: ");
        customerName = scanner.nextLine();

        System.out.print("Enter your account number: ");
        accountNumber = scanner.nextLine();

        System.out.println("\nWelcome, " + customerName + "!");

        int choice;
        do {
            // Display menu
            System.out.println("\n=== Banking Menu ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is: $" + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: $");
                    double deposit = scanner.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit successful!");
                    } else {
                        System.out.println("Invalid deposit amount!");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: $");
                    double withdraw = scanner.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful!");
                    } else {
                        System.out.println("Invalid or insufficient amount!");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using our banking system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
