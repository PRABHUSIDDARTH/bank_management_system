public class CurrentAccount extends BankAccount {

    public CurrentAccount(String name) {
        super(name, 0);
    }

    @Override
    public void withdraw(int amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Invalid withdrawal amount");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Balance: " + balance);
    }
}
