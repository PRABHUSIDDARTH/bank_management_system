import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\n1. Create New Account");
            System.out.println("2. Existing User");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Account Type (savings/current): ");
                    String type = sc.nextLine();

                    bank.createAccount(name, type);
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();

                    BankAccount acc = bank.findAccount(accNo);
                    if (acc == null) {
                        System.out.println("Account not found!");
                        break;
                    }

                    System.out.println("1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Check Balance");
                    System.out.println("4. View Details");

                    int op = sc.nextInt();

                    if (op == 1) {
                        System.out.print("Amount: ");
                        acc.deposit(sc.nextInt());
                    } else if (op == 2) {
                        System.out.print("Amount: ");
                        acc.withdraw(sc.nextInt());
                    } else if (op == 3) {
                        acc.checkBalance();
                    } else if (op == 4) {
                        acc.getDetails();
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using the Bank System!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
