public class TextBook {
    private String title;
    private String author;
    private String publisher;

    // Constructor
    public TextBook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    // Copy Constructor
    public TextBook(TextBook otherTextBook) {
        this.title = otherTextBook.title;
        this.author = otherTextBook.author;
        this.publisher = otherTextBook.publisher;
    }

    // Setter Method
    public void set(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    // toString Method
    public String toString() {
        return title + " by " + author + ", Publisher: " + publisher;
    }
}
