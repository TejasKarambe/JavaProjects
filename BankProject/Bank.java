package BankProject;
import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to HDFC Bank");

        BankAccount.bankName = "HDFC Bank";
        BankAccount.branchName = "Lalbagh Pune";
        BankAccount.ifsc = "LP231GHA3M";
        BankAccount b = new BankAccount();
        System.out.print("Enter BankAccount Number :");
        b.accNumber = sc.nextLong();
        System.out.print("Enter Account owner name : ");
        b.accHName = sc.next();

        System.out.println("Hello, " + b.accHName + "\nYour Account Number :- " + b.accNumber);
        int cho;
        do {
            System.out.println("Enter the Choice\n1 - Deposit Amount\n2 - Withdraw Amount\n3 - Check Balance\n0 - Exit");
            cho = sc.nextInt();
            switch (cho) {
                case 1 -> {
                    System.out.println("Enter Amount to deposit");
                    double amt = sc.nextDouble();
                    b.deposit(amt);
                    b.currentBalance();
                }
                case 2 -> {
                    System.out.println("Enter Amount to Withdraw");
                    double amt = sc.nextDouble();
                    b.withdraw(amt);
                    b.currentBalance();
                }
                case 3 ->   b.currentBalance();

                default ->System.out.println("Wrong Choice, Try again");
            }
        }while(cho != 0);
    }
}
