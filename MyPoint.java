public class MyPoint {
    private double x;
    private double y;

    // Default constructor (0,0)
    public MyPoint() {
        this.x = 0.0;
        this.y = 0.0;
    }

    // Constructor with given x and y
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters and Setters
    public double getX() { return x; }
    public void setX(double x) { this.x = x; }
    public double getY() { return y; }
    public void setY(double y) { this.y = y; }

    // Set both x and y
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // toString() method
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    // Distance from this point to another (x, y)
    public double distance(double x, double y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    // Distance from this point to another MyPoint
    public double distance(MyPoint another) {
        return Math.sqrt((this.x - another.x) * (this.x - another.x) + (this.y - another.y) * (this.y - another.y));
    }

    // Distance from this point to the origin (0,0)
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }
}