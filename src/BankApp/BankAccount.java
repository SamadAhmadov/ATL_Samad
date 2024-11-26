package BankApp;

public class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Balans menfi ola bilmez.");
        }
    }

    public void deposit(double mebleg) {
        if (mebleg > 0) {
            balance += mebleg;
            System.out.println(mebleg + " mebleg medaxil olundu. " + "Yekun balans: " + balance);
        } else {
            System.out.println("Daxil edilen mebleg yanlisdir.");
        }
    }

public void withdraw(double mebleg) {
    if (mebleg > 0 && mebleg < balance) {
        balance -= mebleg;
        System.out.println(mebleg + " mebleg mexaric olundu. " + "Yekun balans: " + balance);
    } else if (mebleg > balance) {
        System.out.println("Balansda kifayət qeder mebleg yoxdur.");
    } else {
        System.out.println("Mebleg musbet reqem olmalidir.");
    }
}

}