import java.security.SecureRandom;
import java.awt.geom.Point2D;

public class TestPoint2D {
    public static void main(String[] args) {
        SecureRandom s1 = new SecureRandom();
        SecureRandom s2 = new SecureRandom();

        Point2D p1 = new Point2D(s1.nextDouble(10),s2.nextDouble(10));
        System.out.println("point 1 is "+p1.toString());
        // not working.
        // need to learn abstract class to use as point2d is an abstract class.
    }
}
