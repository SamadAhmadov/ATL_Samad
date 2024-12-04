package BankAppFullOPP;

public abstract class BankOperation {

    public abstract void checkBalance();
    public abstract void deposit(double amount) throws InvalidAmountException;

}
