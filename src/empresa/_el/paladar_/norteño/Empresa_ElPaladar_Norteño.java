/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa._el.paladar_.norteño;

import clase_a.Carro;
import clase_a.CarroService;




/**
 *
 * @author alfre
 */
public class Empresa_ElPaladar_Norteño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        // TODO code application logic here
        
        
        Carro car=new Carro();
        
        car.setColor("azul");
        car.setLlanta(4);
        
        
        Carro car1=new Carro(8,"negro");
        
        System.out.println("El carro 1"+car.toString());
        System.out.println("El carro 2"+car1.toString());
        
        
        CarroService carroservice=new CarroService();
        carroservice.AgregarCarro(car);
        carroservice.AgregarCarro(car1);
        
      
        
        System.out.println("aaass"+carroservice.listarcarro().toString());
        System.out.println("sin"+carroservice.listarcarro());
        for (Carro c : carroservice.listarcarro()) {
            Object [] a={c.getLlanta(),c.getColor()};
           
        }
    }
    
}
