package BankApp;

public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setBalance(1000);
        account1.deposit(250);
        account1.withdraw(150);
        account1.setAccountNumber("AZ0123456789");

    }
}