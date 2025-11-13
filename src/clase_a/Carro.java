/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_a;

/**
 *
 * @author alfre
 */
public class Carro {
          private int llanta;
    private String color;

    public Carro() {}
 public Carro(int llanta, String color) {
        this.llanta = llanta;
        this.color = color;
    }
    
    

    public int getLlanta() {
        return llanta;
    }

    public String getColor() {
        return color;
    }

    public void setLlanta(int llanta) {
        this.llanta = llanta;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return ""+getColor()+getLlanta();
    }
    
    
    
   
    
}
