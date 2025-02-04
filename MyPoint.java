public class MyPoint {
    private int x;
    private int y;

    // Default constructor (0,0)
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor with given x and y
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter for x
    public int getX() {
        return x;
    }

    // Setter for x
    public void setX(int x) {
        this.x = x;
    }

    // Getter for y
    public int getY() {
        return y;
    }

    // Setter for y
    public void setY(int y) {
        this.y = y;
    }

    // Set both x and y
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // toString() method
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    // Distance from this point to another (x, y)
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Distance from this point to another MyPoint
    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Distance from this point to origin (0,0)
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }
}
