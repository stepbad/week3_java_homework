public class Instructor {
    private String lastName;
    private String firstName;
    private String officeNumber;

    // Constructor
    public Instructor(String lastName, String firstName, String officeNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.officeNumber = officeNumber;
    }

    // Copy Constructor
    public Instructor(Instructor otherInstructor) {
        this.lastName = otherInstructor.lastName;
        this.firstName = otherInstructor.firstName;
        this.officeNumber = otherInstructor.officeNumber;
    }

    // Setter Method
    public void set(String lastName, String firstName, String officeNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.officeNumber = officeNumber;
    }

    // toString Method
    public String toString() {
        return firstName + " " + lastName + ", Office: " + officeNumber;
    }
}
