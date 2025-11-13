/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_a;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alfre
 */
public class CarroService {
    
    
    List<Carro> milistCarro=new ArrayList<>();
    
    
    
    
    public void AgregarCarro(Carro carro){
    
    milistCarro.add(carro);
    
    }
    
    public List<Carro> listarcarro(){
   /* List<Carro> nuevalista=new ArrayList<>();
    
        for (Carro carro : milistCarro) {
            
            nuevalista.add(carro);
            
        }
    return nuevalista;*/
     return milistCarro;
    } 
    
   
}
