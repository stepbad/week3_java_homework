public class TestMyTriangle {
    public static void main(String[] args) {
        // Triangle 1: Scalene (0,0), (4,0), (2,3)
        MyTriangle t1 = new MyTriangle(0.0, 0.0, 4.0, 0.0, 2.0, 3.0);
        System.out.println("Triangle 1: " + t1);
        System.out.println("Perimeter: " + t1.getPerimeter());
        System.out.print("Triangle Type: ");
        t1.printType(); // Expected: Scalene

        // Triangle 2: Scalene (same as t1, different instance)
        MyTriangle t2 = new MyTriangle(new MyPoint(0.0, 0.0), new MyPoint(4.0, 0.0), new MyPoint(2.0, 3.0));
        System.out.println("\nTriangle 2: " + t2);
        System.out.println("Perimeter: " + t2.getPerimeter());
        System.out.print("Triangle Type: ");
        t2.printType(); // Expected: Scalene

        // Triangle 3: Isosceles (0,0), (4,0), (2,4)
        MyTriangle t3 = new MyTriangle(0.0, 0.0, 4.0, 0.0, 2.0, 4.0);
        System.out.println("\nTriangle 3: " + t3);
        System.out.println("Perimeter: " + t3.getPerimeter());
        System.out.print("Triangle Type: ");
        t3.printType(); // Expected: Isosceles

        // Triangle 4: Equilateral (0,0), (3,0), (1.5, sqrt(6.75))
        MyTriangle t4 = new MyTriangle(0.0, 0.0, 3.0, 0.0, 1.5, Math.sqrt(6.75));
        System.out.println("\nTriangle 4: " + t4);
        System.out.println("Perimeter: " + t4.getPerimeter());
        System.out.print("Triangle Type: ");
        t4.printType(); // Expected: Equilateral
    }
}
