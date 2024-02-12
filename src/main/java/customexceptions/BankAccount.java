package customexceptions;

public final class BankAccount {
    private static double balance;
    public BankAccount(double balance) {

        this.balance = balance;
    }

    public double getbalance() {

        return balance;
    }

    public static void withdraw(double amount) throws InsufficientFundsException, InvalidWithdrawalException {
        if (amount < 0) {
            throw new InvalidWithdrawalException("Withdrawal amount cannot be negative");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal");
        }
        balance -= amount;
        System.out.println("Withdrawal of $" + amount + " successful.");
    }

}