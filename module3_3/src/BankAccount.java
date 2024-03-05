import java.util.ArrayList;

public class BankAccount {

    private static int totalAccounts = 0;

    private double balance;
    private int accountNumber;

    public BankAccount(double balance){
        this.accountNumber = ++totalAccounts;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Amount must be greater than 0.");
        }else{
            this.balance += amount;
            System.out.println("New balance: " + this.balance);
        }
    }

    public void withdraw(double amount){
        if (amount < 0){
            System.out.println("Amount must be positive.");
        }else if(this.balance < amount){
            System.out.println("Insufficient funds.");
        }else{
            this.balance -= amount;
            System.out.println("New Balance: " + this.balance);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }
}
