public class TestCircle2 {
    public static void main(String[] args) {
        Circle cir1 = new Circle();
        System.out.println("The radius "+ cir1.radius+ " and its area: "+cir1.getArea());
        Circle cir2 = new Circle(10);
        System.out.println("The radius "+ cir2.radius+ " and its area: "+cir2.getArea());
        Circle cir3 = new Circle(20);
        System.out.println("The radius "+ cir3.radius+ " and its area: "+cir3.getArea());
    }
}

class Circle {
    double radius;


    Circle() { // constructor 1
        radius = 1;
    }
    Circle(double newRadius) { // constructor 2
        radius = newRadius;
    }
    double getArea() {
        return Math.pow(radius, 2)*Math.PI;
    }
    double setRadius(double newRadius) {
        radius = newRadius;
        return radius;
    }
}
