package BankAppFullOPP;

public class Main {
    public static void main(String[] args) {
        try {
            BankCustomer bankCustomer = new BankCustomer("Samad Ahmadov", 1000.0, "12345");

            bankCustomer.checkBalance();

            bankCustomer.deposit(500.0);
            bankCustomer.checkBalance();

            bankCustomer.pay(300.0);
            bankCustomer.checkBalance();

            bankCustomer.refund(150.0);
            bankCustomer.checkBalance();
        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}
