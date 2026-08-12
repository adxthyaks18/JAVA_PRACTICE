package mod1;
import java.util.Scanner;

class BankAccount {
    long accountNumber;
    String accountHolder;
    double balance;

    BankAccount(long accNo, String holder, double bal) {
        accountNumber = accNo;
        accountHolder = holder;
        balance = bal;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }
 void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);
    }
}
public class BankAccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        long accNo = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String holder = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(accNo, holder, balance);

        System.out.print("Enter Deposit Amount: ");
        double amount = sc.nextDouble();

        account.deposit(amount);

        System.out.println("\nUpdated Account Details");
        account.displayDetails();

        sc.close();
    }
}