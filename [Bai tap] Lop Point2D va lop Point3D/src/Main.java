import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Test Point2D
        Point2D point2D = new Point2D(3,2);
        System.out.println("x, y trước khi set " + point2D.toString());
        point2D.setXY(5,6);
        System.out.println("x, y sau khi set " + point2D.toString());
        System.out.println("Set x,y trả về một mảng " + Arrays.toString(point2D.getXY()));
        System.out.println("------------------------------------------------");
        //Test Point2D
        Point3D point3D = new Point3D(16, 10, 97);
        System.out.println("x, y, z trước khi set " + point3D.toString());
        point3D.setXYZ(7,8, 9);
        System.out.println("x, y, z sau khi set " + point3D.toString());
        System.out.println("Set x,y,z trả về một mảng " + Arrays.toString(point3D.getXYZ()));
    }
}
