public class TestCircle {
    // main method
    public static void main(String[] args) {
        // create circle  with initialized(1) radius
        Circle circle1 = new Circle();
        System.out.println("The area of the circle of radius "+circle1.radius + " is "+ circle1.getArea());
        // now, create circle object with radi 25
        Circle circle2 = new Circle(25);
        System.out.println("The area of the circle of radius "+circle2.radius + " is "+ circle2.getArea());
        // now, create circle object with radi 125
        
        Circle circle3 = new Circle(125);
        System.out.println("The area of the circle of radius "+circle3.radius + " is "+ circle3.getArea());
        // modify circle radius
        circle2.setRadius(100);
        System.out.println("The area of the circle of radius "+circle2.radius + " is "+ circle2.getArea());
        
    }
}
// define a class with two constructors
class Circle {
    double radius;

// construct the class with radius =1 
    Circle() { // 1st constructor with no-arg
        radius = 1;
    }
// construct a circle with a specific radius   
    Circle(double newRadius) { // 2nd constructor with argument
        radius = newRadius;
    }
// return area
    double getArea() {
        return Math.pow(radius,2) * Math.PI;
    }
// return perimeter
    double getPerimeter() {
        return 2* radius * Math.PI;
    }
//call this method to set radius to another
    void setRadius(double newRadius) {
        radius = newRadius;
    }
}
