public class Account {
    private int id;
    private BankCustomer customer;
    private double balance;

    // Constructor with balance
    public Account(int id, BankCustomer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    // Constructor without balance (default 0.0)
    public Account(int id, BankCustomer customer) {
        this(id, customer, 0.0);
    }

    // Getters
    public int getId() { return id; }
    public BankCustomer getCustomer() { return customer; }
    public double getBalance() { return balance; }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public Account deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(customer.getName() + " deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
        return this;
    }

    // Withdraw method
    public Account withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(customer.getName() + " withdrew $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
        return this;
    }

    // toString() method formatted as "name(ID) balance=$xxx.xx"
    public String toString() {
        return String.format("%s balance=$%.2f", customer.toString(), balance);
    }
}
