public class Widget {
    // Static attribute for count
    private static int count;

    // Instance attributes
    private int color;
    private float alignment;

    // Constructor
    public Widget(int color, float alignment) {
        this.color = color;
        this.alignment = alignment;
    }

    // Static method to access the static attribute
    public static int getCount() {
        return count;
    }

    // Instance method for drawing the widget
    public void draw() {
        System.out.println("Drawing the widget with color " + color + " and alignment " + alignment);
    }

    // Getter for color
    public int getColor() {
        return color;
    }

    // Setter for color
    public void setColor(int color) {
        this.color = color;
    }
}
