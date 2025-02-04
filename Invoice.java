public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    // Constructor
    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    // Getters
    public int getId() { return id; }
    public Customer getCustomer() { return customer; }
    public double getAmount() { return amount; }

    // Setter for amount
    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Get Customer's Name
    public String getCustomerName() {
        return customer.getName();
    }

    // Calculate final amount after applying the discount
    public double getAmountAfterDiscount() { // Renamed from getFinalAmount()
        return amount * (1 - customer.getDiscount() / 100.0);
    }

    // toString() method
    public String toString() {
        return String.format("Invoice[id=%d, customer=%s, amount=%.2f, amountAfterDiscount=%.2f]", 
                             id, customer, amount, getAmountAfterDiscount());
    }
}
