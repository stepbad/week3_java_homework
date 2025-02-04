public class MyCircle {
    private MyPoint center;
    private int radius;
    public static final double PI = 3.14; // Added static final PI

    // Default Constructor
    public MyCircle() {
        this(new MyPoint(), 1);
    }

    // Constructor with x, y, radius
    public MyCircle(int x, int y, int r) {
        this(new MyPoint(x, y), r);
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
        return PI * radius * radius; // Using static PI instead of Math.PI
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }

    public String toString() {
        return String.format("Circle[Center=%s, Radius=%d]", center, radius);
    }
}
