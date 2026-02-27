import java.util.Scanner;

public class Quiz2Prep3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter x coordinate:");
        double x = scan.nextDouble();
        System.out.print("Enter y coordinate:");
        double y = scan.nextDouble();
        
        double radii = 10;
        double ox = 0;
        double oy = 0;
        double xDis = x- ox;
        double yDis = y- oy;
        double xSqr = Math.pow(xDis, 2);
        double ySqr = Math.pow(yDis, 2);
        double sqrt = Math.sqrt(xSqr+ySqr);
        double distance = radii - sqrt;
        System.out.println(distance);
        if (distance >= 0) {
            System.out.println("It is inside the circle.");
        } else {
            System.out.println("It is not inside the circle.");

        }
        System.exit(0);
    }
}
