package BankAppFullOPP;

public interface PaymentService {
    void pay(double amount) throws InsufficientFundsException, InvalidAmountException;
    void refund(double amount) throws InvalidAmountException;
}
