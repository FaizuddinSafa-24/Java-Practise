/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circle;

/**
 *
 * @author 602.22.IP122
 */
public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadiius(5);
        System.out.println(c1.getRadius());
        Circle c2 = new Circle(5.5);
        Circle c3 = new Circle(4.5);
        System.out.println(c2.compareGreaterRadius(c3));
    }
}
