public class TestAccount {
    public static void main(String[] args) {
        // Create BankCustomer instances
        BankCustomer c1 = new BankCustomer(101, "Alice", 'F');
        BankCustomer c2 = new BankCustomer(102, "Bob", 'M');

        // Create Account instances (with and without initial balance)
        Account a1 = new Account(2001, c1, 500.0);
        Account a2 = new Account(2002, c2); // Default balance should be 0.0

        // Display initial account details
        System.out.println("Bank Accounts:");
        System.out.println(a1); // Expected: Alice(101) balance=$500.00
        System.out.println(a2); // Expected: Bob(102) balance=$0.00

        // Test Getters
        System.out.println("\nTesting Getters:");
        System.out.println("Account 1 ID: " + a1.getId());  // Expected: 2001
        System.out.println("Account 1 Customer Name: " + a1.getCustomer().getName());  // Expected: Alice
        System.out.println("Account 1 Balance: $" + a1.getBalance());  // Expected: 500.00

        System.out.println("Account 2 ID: " + a2.getId());  // Expected: 2002
        System.out.println("Account 2 Customer Name: " + a2.getCustomer().getName());  // Expected: Bob
        System.out.println("Account 2 Balance: $" + a2.getBalance());  // Expected: 0.00

        // Test setBalance()
        System.out.println("\nUpdating Bob's balance to $100...");
        a2.setBalance(100.0);
        System.out.println("Updated Account 2: " + a2); // Expected: Bob(102) balance=$100.00

        // Test deposit()
        System.out.println("\nDepositing $200 into Alice's account...");
        a1.deposit(200.0);
        System.out.println("Updated Account 1: " + a1); // Expected: Alice(101) balance=$700.00

        // Test withdraw()
        System.out.println("\nWithdrawing $50 from Alice's account...");
        a1.withdraw(50.0);
        System.out.println("Updated Account 1: " + a1); // Expected: Alice(101) balance=$650.00

        System.out.println("\nAttempting to withdraw $500 from Bob's account...");
        a2.withdraw(500.0); // Expected: Insufficient funds

        System.out.println("\nDepositing $500 into Bob's account and then withdrawing $300...");
        a2.deposit(500.0).withdraw(300.0); // Chaining methods
        System.out.println("Final Account 2: " + a2); // Expected: Bob(102) balance=$300.00
    }
}
