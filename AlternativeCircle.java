public class AlternativeCircle {
    public static void main(String[] args) {
        AlternativeCircle circ1 = new AlternativeCircle();
        System.out.println("First radius = "+circ1.radius+ " and its area = "+circ1.getArea());
        AlternativeCircle circ2 = new AlternativeCircle(10);
        System.out.println("Second radius = "+circ2.radius+ " and its area = "+circ2.getArea());
        AlternativeCircle circ3 = new AlternativeCircle(20);
        System.out.println("Third radius = "+circ3.radius+ " and its area = "+circ3.getArea());
    }
    double radius;
    AlternativeCircle() {  
        radius = 1;
    }
    AlternativeCircle(double newRadius) {
        radius = newRadius;
    }
    double getArea(){
        return Math.pow(radius, 2)*Math.PI;
    }

}
