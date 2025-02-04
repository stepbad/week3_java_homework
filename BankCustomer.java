public class BankCustomer {
    private int id;
    private String name;
    private char gender; // 'M' for Male, 'F' for Female, etc.

    // Constructor
    public BankCustomer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public char getGender() { return gender; }

    // toString() method (returns "name(ID)")
    public String toString() {
        return name + "(" + id + ")";
    }
}
