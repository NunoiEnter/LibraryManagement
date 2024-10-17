public class SavingsAccount extends BankAccount {

    // Constructor
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    // Deposit method
    @Override
    public void deposit(double amount) {
        if (amount == 0) {
            System.out.println("*************");
            System.out.println("Warning: Deposit amount is zero. Setting deposit amount to 100.");
            amount = 100;
        }
        amount = Math.abs(amount); // Take absolute value
        setBalance(getBalance() + amount); // Update balance
        System.out.println("*************");
        System.out.println("Successfully deposited " + amount + ". Current balance: " + getBalance());
    }

    // Withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount == 0) {
            System.out.println("*************");
            System.out.println("Warning: Withdraw amount is zero. Setting withdraw amount to 100.");
            amount = 100;
        }
        amount = Math.abs(amount); // Take absolute value

        // Check if balance is sufficient
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.print("==============");
            System.out.println("Successfully withdrew " + amount + ". Current balance: " + getBalance());
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }
}
