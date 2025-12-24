import java.util.ArrayList;

public class Bank {

    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public void createAccount(String name, String type) {
        BankAccount account;

        if (type.equalsIgnoreCase("savings")) {
            account = new SavingsAccount(name);
        } else if (type.equalsIgnoreCase("current")) {
            account = new CurrentAccount(name);
        } else {
            System.out.println("Invalid account type");
            return;
        }

        accounts.add(account);
        System.out.println("Account created successfully!");
        System.out.println("Your Account Number: " + account.getAccountNumber());
    }

    public BankAccount findAccount(int accNumber) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber() == accNumber) {
                return acc;
            }
        }
        return null;
    }
}
