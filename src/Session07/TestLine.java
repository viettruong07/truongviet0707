package Session07;
import java.util.Arrays;
import Session06.Point;

public class TestLine {
    public static void main(String[] args) {
        Line l1 = new Line(1,2,3,4);
        System.out.println(11);
        Line l2 = new Line(new Point(5,6), new Point(7,8));
        System.out.println(12);

        l1.setBegin(new Point(11,12));
        l1.setEnd(new Point(13,14));
        System.out.println(11);
        System.out.println("begin is: " + l1.getBegin());
        System.out.println("end is: " + l1.getEnd());
        System.out.println("end's x is: " + l1.getEndX());
        System.out.println("end's y is: " + l1.getEndY());

        l1.setBeginXY(31,32);
        l1.setEndXY(33,34);
        System.out.println(11);
        System.out.println("begin's x and y are: " + Arrays.toString(l1.getBeginXY()));
        System.out.println("end's x and y are: " + Arrays.toString(l1.getEndXY()));

        System.out.printf("length is: %.2f%n", l1.getLength());
    }
}
