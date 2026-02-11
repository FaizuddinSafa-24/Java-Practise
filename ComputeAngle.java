import java.util.Scanner;   // importing utlity package for Scanner class
import java.lang.Character;
public class ComputeAngle { // class name declaration
    public static void main(String[] args) {    // main method
    System.out.println("Enter coordiantes for three points of a triangle: "); // user prompt
        Scanner scan = new Scanner(System.in); // Scanner object created
        //Input for every sub-coordiate
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double x3 = scan.nextDouble();
        double y3 = scan.nextDouble();
        // calculating length of each side
        double a = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow(y1- y2,2));
        double b = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow(y2- y3,2));
        double c = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow(y3- y1,2));
        // calculating each inclined angle
        double A = Math.toDegrees(Math.acos((a*a-b*b-c*c)/(-2*b*c)));
        double B = Math.toDegrees(Math.acos((b*b-a*a-c*c)/(-2*a*c)));
        double C = Math.toDegrees(Math.acos((c*c-b*b-a*a)/(-2*b*a)));
        // print angles
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(" ");
        // print after rounding up for 2 decimals
        System.out.println(Math.round(A*100)/100.0);
        System.out.println(Math.round(B*100)/100.0);
        System.out.println(Math.round(C*100)/100.0);

        // meanwhile character test 
        Character charac ;
        char ch = (char)65;
        System.out.println(ch);

    }
}
