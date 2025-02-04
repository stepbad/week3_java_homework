public class TestMyTriangle {
    public static void main(String[] args) {
        // Triangle 1: Scalene (Using coordinate-based constructor)
        MyTriangle t1 = new MyTriangle(1, 1, 4, 2, 2, 5);
        System.out.println("Triangle 1 (Coordinate-based Constructor): " + t1.toString());
        System.out.println("Perimeter: " + t1.getPerimeter());
        System.out.print("Triangle Type: ");
        t1.printType();

        // Triangle 2: Isosceles (Using coordinate-based constructor)
        MyTriangle t2 = new MyTriangle(0, 0, 4, 0, 2, 4);
        System.out.println("\nTriangle 2 (Coordinate-based Constructor): " + t2.toString());
        System.out.println("Perimeter: " + t2.getPerimeter());
        System.out.print("Triangle Type: ");
        t2.printType();

        // Triangle 3: Equilateral (This was very fussy, really did not want to work.  i ended up completely changing mypoint to use double instead of int and final double EPSILON = 1e-6) to allow minute differences
        double height = Math.sqrt(3) * 2;  // Equilateral triangle height for side length 4
        MyTriangle t3 = new MyTriangle(0, 0, 4, 0, 2, height);
        System.out.println("\nTriangle 3 (Coordinate-based Constructor): " + t3.toString());
        System.out.println("Perimeter: " + t3.getPerimeter());
        System.out.print("Triangle Type: ");
        t3.printType();

        // Triangle 4: Scalene (Using MyPoint-based constructor)
        MyPoint p1 = new MyPoint(-1, -1);
        MyPoint p2 = new MyPoint(3, -2);
        MyPoint p3 = new MyPoint(1, 4);
        MyTriangle t4 = new MyTriangle(p1, p2, p3);
        System.out.println("\nTriangle 4 (MyPoint-based Constructor): " + t4.toString());
        System.out.println("Perimeter: " + t4.getPerimeter());
        System.out.print("Triangle Type: ");
        t4.printType();

        // Triangle 5: Isosceles (Using MyPoint-based constructor)
        MyTriangle t5 = new MyTriangle(new MyPoint(0, 0), new MyPoint(4, 0), new MyPoint(2, 5));
        System.out.println("\nTriangle 5 (MyPoint-based Constructor): " + t5.toString());
        System.out.println("Perimeter: " + t5.getPerimeter());
        System.out.print("Triangle Type: ");
        t5.printType();
    }
}
