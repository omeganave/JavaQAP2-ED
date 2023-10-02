public class TestMyRectangle {
    public static void main(String[] args) {
        MyRectangle rect1 = new MyRectangle(1, 4, 3, 2);
        System.out.println();
        System.out.println("Rectangle 1:");
        System.out.println(rect1);
        // Since the get/set x/y methods are pretty much the exact same as the get/set
        // x/y methods in MyLine, I won't test them very much here.
        rect1.setTopLeftX(3);
        rect1.setBottomRightX(9);
        System.out.println(rect1);

        System.out.println("Length: " + rect1.getLength());
        System.out.println("Height: " + rect1.getHeight());
        System.out.println("Diagonal: " + rect1.getDiagonal());
        System.out.println("Area: " + rect1.getArea());

        // Finding the length, height, diagonal and area of a new rectangle.
        MyPoint p1 = new MyPoint(4, 11);
        MyPoint p2 = new MyPoint(21, 3);
        MyRectangle rect2 = new MyRectangle(p1, p2);

        System.out.println();
        System.out.println("Rectangle 2:");
        System.out.println(rect2);

        System.out.println("Length: " + rect2.getLength());
        System.out.println("Height: " + rect2.getHeight());
        System.out.println("Diagonal: " + rect2.getDiagonal());
        System.out.println("Area: " + rect2.getArea());
    }
}
