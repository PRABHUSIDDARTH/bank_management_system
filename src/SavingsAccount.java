public class SavingsAccount extends BankAccount {

    private static final int MIN_BALANCE = 1000;

    public SavingsAccount(String name) {
        super(name, MIN_BALANCE);
    }

    @Override
    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
            return;
        }
        if (balance - amount < MIN_BALANCE) {
            System.out.println("Withdrawal denied. Minimum balance required: " + MIN_BALANCE);
            return;
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Balance: " + balance);
    }
}
