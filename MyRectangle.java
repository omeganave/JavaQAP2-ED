public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MyPoint getTopLeft() {
        return this.topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return this.bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public int getTopLeftX() {
        return this.topLeft.getX();
    }

    public void setTopLeftX(int x) {
        this.topLeft.setX(x);
    }

    public int getTopLeftY() {
        return this.topLeft.getY();
    }

    public void setTopLeftY(int y) {
        this.topLeft.setY(y);
    }

    public int getBottomRightX() {
        return this.bottomRight.getX();
    }

    public void setBottomRightX(int x) {
        this.bottomRight.setX(x);
    }

    public int getBottomRightY() {
        return this.bottomRight.getY();
    }

    public void setBottomRightY(int y) {
        this.bottomRight.setY(y);
    }

    public int[] getTopLeftXY() {
        return new int[] { this.topLeft.getX(), this.topLeft.getY() };
    }

    public void setTopLeftXY(int x, int y) {
        this.topLeft.setXY(x, y);
    }

    public int[] getBottomRightXY() {
        return new int[] { this.bottomRight.getX(), this.bottomRight.getY() };
    }

    public void setBottomRightXY(int x, int y) {
        this.bottomRight.setXY(x, y);
    }

    public int getLength() {
        return Math.abs(this.topLeft.getX() - this.bottomRight.getX());
    }

    public int getHeight() {
        return Math.abs(this.topLeft.getY() - this.bottomRight.getY());
    }

    public double getDiagonal() {
        return this.topLeft.distance(this.bottomRight);
    }

    public int getArea() {
        return this.getLength() * this.getHeight();
    }

    public String toString() {
        return "MyRectangle[" + this.topLeft.toString() + ", " + this.bottomRight.toString() + "]";
    }
}
