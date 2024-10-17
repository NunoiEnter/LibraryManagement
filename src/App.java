import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("12345", 1000);

        System.out.println("=== Savings Account Operations ===");
        
        // Deposit operation
        System.out.println("============");
        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        savingsAccount.deposit(depositAmount);

        // Withdraw operation
        System.out.println("============");
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        savingsAccount.withdraw(withdrawAmount);
        
        // Display final balance
        System.out.println("============");
        System.out.println("Final balance: " + savingsAccount.getBalance());

        scanner.close();
    }
}
