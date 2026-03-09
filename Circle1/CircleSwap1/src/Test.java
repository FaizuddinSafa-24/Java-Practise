//package circleswap1;
public class Test {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(4);
        
        System.out.println("Before swaping: Circle1 radius "+ circle1.getCircle2Radius()+ " Circle2 radius "+circle2.getCircle2Radius());
        
        // Circle.swap(circle1, circle2);
        Circle.swap2(circle1,circle2);
        System.out.println("After swaping: Circle1 radius "+ circle1.getCircle2Radius()+ " Circle2 radius "+circle2.getCircle2Radius());

    }
}
