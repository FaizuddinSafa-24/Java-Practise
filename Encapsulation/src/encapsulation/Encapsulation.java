/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encapsulation;

/**
 *
 * @author 602.22.IP122
 */
public class Encapsulation {

    private String name;
    private int id;
    
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
       this.id =id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
   
    
    public void displayInfo() {
        System.out.println("Name:"+name);
        System.out.println("Id:"+id);
    }
    /**
     * @param args the command line arguments
     */
    
    
}
