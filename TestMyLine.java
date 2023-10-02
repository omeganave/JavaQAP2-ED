import java.util.Arrays;

public class TestMyLine {
    public static void main(String[] args) {
        MyLine line1 = new MyLine(1, 2, 3, 4);
        System.out.println(line1);

        System.out.println("Begin point X: " + line1.getBeginX());
        System.out.println("End point Y: " + line1.getEndY());

        line1.setBeginX(7);
        line1.setEndY(5);

        System.out.println("New begin point X: " + line1.getBeginX());
        System.out.println("New end point Y: " + line1.getEndY());

        line1.setBeginXY(1, 4);
        int[] resultBegin = line1.getBeginXY();
        int[] resultEnd = line1.getEndXY();
        System.out.println("Begin XY: " + Arrays.toString(resultBegin));
        System.out.println("End XY: " + Arrays.toString(resultEnd));

        System.out.println("Length: " + line1.getLength());
        System.out.println("Gradient: " + line1.getGradient());
        System.out.println(line1.toString());
    }
}
