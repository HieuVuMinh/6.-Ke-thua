import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(1,2);
        System.out.println(point.toString());
        point.setXY(3,4);
        System.out.println(point.toString());
        point.setXY(5,6);
        System.out.println(Arrays.toString(point.getXY()));

        MoveablePoint moveablePoint = new MoveablePoint(1,2,3,4);
        System.out.println(moveablePoint.toString());
        moveablePoint.setSpeed(5,6);
        System.out.println(moveablePoint.toString());
        System.out.println(moveablePoint.move());
    }
}
