//package circlestatic;
class Circle {
    double radius;
    static int numOfObj;
    
    Circle() {
        radius = 1;
        numOfObj++;
    }
    Circle(double newRadius) {
        this.radius = newRadius;
        numOfObj++;
    }
    static int getNumOfObj() {
        return numOfObj;
    }
    
}
