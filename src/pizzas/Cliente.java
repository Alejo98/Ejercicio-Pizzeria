/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;

/**
 *
 * @author Diego Herrera 
 */
public abstract class Cliente {
   protected abstract Pizza crearPizza(String tipoPizza);
 
    public Pizza OrdendelCliente(String tipoPizza){
        Pizza pizza=null;
        pizza=crearPizza(tipoPizza);
        pizza.preparacion();
        pizza.hornear();
        pizza.cortar();
        pizza.empacar();
        return pizza;
    }
    
    
}
