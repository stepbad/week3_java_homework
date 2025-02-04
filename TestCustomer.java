public class TestCustomer {
    public static void main(String[] args) {
        // Create Customer instances
        Customer c1 = new Customer(101, "Alice", 10);
        Customer c2 = new Customer(102, "Bob", 20);

        // Display initial customer details
        System.out.println("Customers:");
        System.out.println(c1);
        System.out.println(c2);

        // Test Getters
        System.out.println("\nTesting Getters:");
        System.out.println("Customer 1 ID: " + c1.getId());
        System.out.println("Customer 1 Name: " + c1.getName());
        System.out.println("Customer 1 Discount: " + c1.getDiscount() + "%");

        System.out.println("Customer 2 ID: " + c2.getId());
        System.out.println("Customer 2 Name: " + c2.getName());
        System.out.println("Customer 2 Discount: " + c2.getDiscount() + "%");

        // Test Setters
        System.out.println("\nUpdating Discount for Alice to 15%...");
        c1.setDiscount(15);
        System.out.println("Updated Customer 1: " + c1);
    }
}
