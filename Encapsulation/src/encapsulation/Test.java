/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

/**
 *
 * @author 602.22.IP122
 */
public class Test {
    public static void main(String[] args) {
        Encapsulation e1 = new Encapsulation();
//        e1.name = "Jack";
//        e1.id = 252;

          e1.setName("Jack");
          System.out.println(e1.getName());
          e1.setId(252);
          System.out.println(e1.getId());
          e1.displayInfo();
    }
}
