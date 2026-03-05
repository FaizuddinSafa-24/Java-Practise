/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circlearray;

/**
 *
 * @author 602.22.IP122
 */
public class Test {
    public static void main(String[] args) {
        CircleArray[] c1 = new CircleArray[3];
        for(int i= 0; i <c1.length; i++) {
            c1[i] = new  CircleArray(i+1);
        }
        for(int i = 0; i < c1.length; i++) {
            c1[i].showRadius();
        }
    }
}
