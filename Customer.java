public class Customer {
    private int id;
    private String name;
    private int discount; // Percentage discount (e.g., 10 for 10%)

    // Constructor
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getDiscount() { return discount; }

    // Setter for discount
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    // toString() method
    public String toString() {
        return String.format("%s(%d) Discount: %d%%", name, id, discount);
    }
}
