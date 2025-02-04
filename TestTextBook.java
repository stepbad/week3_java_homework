public class TestTextBook {
    public static void main(String[] args) {
        // Create a Textbook instance
        TextBook textbook1 = new TextBook("Java Programming", "Deitel & Deitel", "Pearson");

        // Display the textbook details
        System.out.println("Textbook 1: " + textbook1);

        // Create a copy of the first textbook
        TextBook textbook2 = new TextBook(textbook1);
        System.out.println("Textbook 2 (Copy of 1): " + textbook2);

        // Modify Textbook 2 details
        textbook2.set("Data Structures", "Mark Weiss", "Addison-Wesley");
        System.out.println("Updated Textbook 2: " + textbook2);
    }
}
