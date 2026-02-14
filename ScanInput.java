import java.util.Scanner;
public class ScanInput {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number for radius: ");
        double radius = scan.nextDouble();

        final double PI = 3.14159;
        double area = Math.pow(radius, 2);
        System.out.printf("The area for the circle of radius: %.2f is %.2f ", radius, area);
    }
}