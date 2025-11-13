/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import clientes.ClienteService;
import inventario.Insumo;
import inventario.InventarioService;
import  menu.MenuService;
        
        
        

/**
 *
 * @author alfre
 */
public class AppContext {
    
    public static  final ClienteService clienteservice =new ClienteService();
    public static  final MenuService menuservice = new MenuService();
    
    public static  final InventarioService inventarioservice=new InventarioService();
    
}
