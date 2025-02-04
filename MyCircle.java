public class MyCircle {
    private MyPoint center;
    private int radius;
    public static final double PI = 3.14;  // Keep PI as a constant

    // Default Constructor
    public MyCircle() {
        this.center = new MyPoint();
        this.radius = 1;
    }

    // Constructor with x, y, radius
    public MyCircle(int x, int y, int r) {
        this.center = new MyPoint(x, y);
        this.radius = r;
    }

    // Constructor with a MyPoint object
    public MyCircle(MyPoint p, int r) {
        this.center = p;
        this.radius = r;
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public MyPoint getCenter() {
        return center;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }

    public String toString() {
        return String.format("Circle[Center=%s, Radius=%d]", center, radius);
    }
}
