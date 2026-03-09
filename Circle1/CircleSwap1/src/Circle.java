//package circleswap1;
class Circle {
    double radius;

    Circle() {
        this.radius = 1;
    }

    Circle(double newRadius) {
        this.radius = newRadius;
    }
    // public static void swap(Circle y1, Circle y2) {
    // Circle temp = y1;
    // y1 = y2;
    // y2 = temp;
    // }
    // doesn't work this swap

    public static void swap2(Circle a, Circle b) {
        double temp = a.radius;
        a.radius = b.radius;
        b.radius = temp;
    }

    public double getCircle2Radius() {
        return this.radius;
    }

    public double getCircle1Radius() {
        return this.radius;
    }
}
