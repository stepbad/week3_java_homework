public class TestInstructor {
    public static void main(String[] args) {
        // Create an Instructor instance
        Instructor instructor1 = new Instructor("Seven", "Noah", "B203");

        // Display the instructor details
        System.out.println("Instructor 1: " + instructor1); 

        // Create a copy of the first instructor
        Instructor instructor2 = new Instructor(instructor1);
        System.out.println("Instructor 2 (Copy of 1): " + instructor2); 

        // Modify Instructor 2 details
        instructor2.set("Brown", "Sarah", "C101");
        System.out.println("Updated Instructor 2: " + instructor2); 
    }
}
