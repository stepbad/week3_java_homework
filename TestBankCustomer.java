public class TestBankCustomer {
    public static void main(String[] args) {
        // Create BankCustomer instances
        BankCustomer c1 = new BankCustomer(101, "Sarah", 'F');
        BankCustomer c2 = new BankCustomer(102, "Noah", 'M');

        // Display Customers
        System.out.println("Bank Customers:");
        System.out.println(c1);
        System.out.println(c2);

        // Test Getters
        System.out.println("\nTesting Getters:");
        System.out.println("Customer 1 ID: " + c1.getId());
        System.out.println("Customer 1 Name: " + c1.getName());
        System.out.println("Customer 1 Gender: " + c1.getGender());

        System.out.println("Customer 2 ID: " + c2.getId());
        System.out.println("Customer 2 Name: " + c2.getName());
        System.out.println("Customer 2 Gender: " + c2.getGender());
    }
}
