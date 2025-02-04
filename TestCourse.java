public class TestCourse {
    public static void main(String[] args) {
        // Create an Instructor
        Instructor instructor1 = new Instructor("Smith", "John", "B203");

        // Create a TextBook
        TextBook textbook1 = new TextBook("Java Programming", "Deitel & Deitel", "Pearson");

        // Create a Course
        Course course1 = new Course("Object-Oriented Programming", instructor1, textbook1);

        // Display Course Details
        System.out.println(course1);

        // Testing Copy Constructor in TextBook
        TextBook textbook2 = new TextBook(textbook1);
        System.out.println("\nCopied TextBook: " + textbook2);

        // Testing Setter in TextBook
        textbook2.set("Python for Beginners", "John Doe", "O'Reilly");
        System.out.println("Updated TextBook: " + textbook2);
    }
}
