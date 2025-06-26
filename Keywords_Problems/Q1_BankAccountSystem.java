public class Q1_BankAccountSystem {
    static String bankName = "ABC Bank";
    static int totalAccounts = 0;

    String accountHolderName;
    final long accountNumber;
    double balance;

    Q1_BankAccountSystem(String accountHolderName, long accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayAccountDetails() {
        if (this instanceof Q1_BankAccountSystem) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        Q1_BankAccountSystem acc1 = new Q1_BankAccountSystem("Alice", 1001001L, 15000);
        Q1_BankAccountSystem acc2 = new Q1_BankAccountSystem("Bob", 1001002L, 25000);

        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
        Q1_BankAccountSystem.getTotalAccounts();
    }
}
