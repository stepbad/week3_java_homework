public class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(MyPoint another) {
        double xDiff = this.x - another.x;
        double yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
