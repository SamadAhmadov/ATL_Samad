package BankAppFullOPP;

public class Customer {
    private String customerName;
    private double balance;
    private String uniqueID;

    public Customer(String customerName, double balance, String id) {
        this.customerName = customerName;
        this.balance = balance;
        this.uniqueID = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void checkBalance() {
        System.out.println("Cari balans: " + balance);
    }

    public void deposit(double amount) throws InvalidAmountException {
        balance += amount;
        System.out.println("Yeni balans: " + balance);
    }
}
