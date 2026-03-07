/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circle;

/**
 *
 * @author 602.22.IP122
 */
public class Circle {
    
    /**
     * @param args the command line arguments
     */
    private double radius;
    Circle() {
        this.radius = radius;
    }
    
    
    Circle(double r) {
     this.radius = r;   
    }
    
    public void setRadiius(double r) {
        this.radius = r;
    }
    
    public double getRadius() {
        return radius;
    }
    public boolean compareGreaterRadius(Circle c) {
        return this.radius > c.radius;
    }
}
