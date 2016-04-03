/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;

/**
 *
 * @author USER
 */
public class Ventas extends Cliente {

    public Ventas() {
    }
    
    public Pizza crearPizza(String tipo){
        if (tipo.equals("vegetariana")){
            return new Vegetariana();
        }else if (tipo.equals("peperoni")){
            return new Peperoni();
        }else if(tipo.equals("queso")){
            return new Queso();
        }else return null;
    }
    
        
}
    
    

