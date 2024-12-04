package BankAppFullOPP;

public class BankCustomer extends Customer implements PaymentService {

    public BankCustomer(String name, double balance, String id) {
        super(name, balance, id);
    }

    @Override
    public void pay(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Daxil edilən məbləğ yanlışdır.");
        }
        if (getBalance() < amount) {
            throw new InsufficientFundsException("Balansda kifayət qədər vəsait yoxdur.");
        }
        deposit(-amount);
        System.out.println("Payment of " + amount + " processed.");
    }

    @Override
    public void refund(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Refund amount must be positive.");
        }
        deposit(amount);
        System.out.println("Refund of " + amount + " processed.");
    }
}
