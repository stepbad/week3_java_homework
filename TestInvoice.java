public class TestInvoice {
    public static void main(String[] args) {
        // Create Customer instances
        Customer c1 = new Customer(101, "Alice", 10);
        Customer c2 = new Customer(102, "Bob", 20);

        // Create Invoice instances
        Invoice inv1 = new Invoice(5001, c1, 200.0);
        Invoice inv2 = new Invoice(5002, c2, 500.0);

        // Display initial invoice details
        System.out.println("Invoices:");
        System.out.println(inv1);
        System.out.println(inv2);

        // Test Getters
        System.out.println("\nTesting Getters:");
        System.out.println("Invoice 1 ID: " + inv1.getId());
        System.out.println("Invoice 1 Customer Name: " + inv1.getCustomerName());
        System.out.println("Invoice 1 Amount: " + inv1.getAmount());
        System.out.println("Invoice 1 Amount After Discount: " + inv1.getAmountAfterDiscount());

        System.out.println("Invoice 2 ID: " + inv2.getId());
        System.out.println("Invoice 2 Customer Name: " + inv2.getCustomerName());
        System.out.println("Invoice 2 Amount: " + inv2.getAmount());
        System.out.println("Invoice 2 Amount After Discount: " + inv2.getAmountAfterDiscount());

        // Test Setters
        System.out.println("\nUpdating Alice's discount to 15% and Invoice amount to 250.0...");
        c1.setDiscount(15);
        inv1.setAmount(250.0);
        System.out.println("Updated Invoice 1: " + inv1);
    }
}
