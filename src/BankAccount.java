public abstract class BankAccount {

    private static int nextAccountNumber = 100000114;

    protected int accountNumber;
    protected String name;
    protected int balance;

    public BankAccount(String name, int initialBalance) {
        this.accountNumber = nextAccountNumber++;
        this.name = name;
        this.balance = initialBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
            return;
        }
        balance += amount;
        System.out.println("Deposit successful. Balance: " + balance);
    }

    public abstract void withdraw(int amount);

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
