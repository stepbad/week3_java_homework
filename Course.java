public class Course {
    private String courseName;
    private Instructor instructor;
    private TextBook textBook;

    // Constructor
    public Course(String courseName, Instructor instructor, TextBook textBook) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textBook = textBook;
    }

    // Getters
    public String getName() { return courseName; }
    public Instructor getInstructor() { return instructor; }
    public TextBook getTextBook() { return textBook; }

    // toString Method
    public String toString() {
        return "Course: " + courseName + "\nInstructor: " + instructor + "\nTextBook: " + textBook;
    }
}
