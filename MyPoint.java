public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    public double distance(int x, int y) {
        double xDiff = this.x - x;
        double yDiff = this.y - y;
        double distance = Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));
        return distance;
    }

    public double distance(MyPoint another) {
        double xDiff = this.x - another.x;
        double yDiff = this.y - another.y;
        double distance = Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));
        return distance;
    }

    public double distance() {
        double distance = Math.sqrt((this.x * this.x) + (this.y * this.y));
        return distance;
    }
}
