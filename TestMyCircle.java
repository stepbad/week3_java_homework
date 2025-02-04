public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(5, 5, 10);
        MyCircle c2 = new MyCircle(2, 3, 7);

        System.out.println("Circle 1 Area: " + c1.getArea());
        System.out.println("Circle 2 Area: " + c2.getArea());

        // Attempt to modify the final variable PI
        // Uncommenting the next line will cause an error because pi is final and cannot be changed.
         //MyCircle.PI = 22.0 / 7.0; 

        System.out.println("Value of PI: " + MyCircle.PI);
    }
}
