package BankProject;

class BankAccount {

        static String branchName;
        static String bankName;
        static String ifsc;

        long accNumber;
        String accHName;
        double balance;


        void deposit(double amount){
            balance = balance + amount;
        }

        void withdraw(double amount){
            balance = balance - amount;
        }

        void currentBalance(){
            System.out.println("Your Current Balance is " + balance + "\n\n");
        }

    }


