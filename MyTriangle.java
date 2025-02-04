public class MyTriangle {
    private MyPoint v1, v2, v3;

    // Constructor with coordinates (now using double)
    public MyTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    // Constructor with MyPoint instances
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    // toString() method
    public String toString() {
        return String.format("MyTriangle[v1=%s, v2=%s, v3=%s]", v1, v2, v3);
    }

    // Get the perimeter of the triangle
    public double getPerimeter() {
        double side1 = v1.distance(v2);
        double side2 = v2.distance(v3);
        double side3 = v3.distance(v1);
        return side1 + side2 + side3;
    }

    // Determine the type of triangle using EPSILON for floating-point comparison
    public void printType() {
        double side1 = v1.distance(v2);
        double side2 = v2.distance(v3);
        double side3 = v3.distance(v1);

        final double EPSILON = 1e-6; // Small tolerance for floating-point comparison

        if (Math.abs(side1 - side2) < EPSILON && Math.abs(side2 - side3) < EPSILON) {
            System.out.println("Equilateral");
        } else if (Math.abs(side1 - side2) < EPSILON || Math.abs(side2 - side3) < EPSILON || Math.abs(side3 - side1) < EPSILON) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}
