/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;

/**
 *
 * @author Diego Alejandro Herrera Burgos
 * @version 1.0
 */
public abstract class Cliente {
   protected abstract Pizza crearPizza(String tipoPizza);
   /**
    * Es un metodo que se usa para que luego de que el cliente escoga, se cree una pizza.
    * @param tipoPizza
    * @return 
    */
 
    public Pizza OrdendelCliente(String tipoPizza){
        /**
         * Metodo donde se da la orden del cliente.
         */
        Pizza pizza;
        pizza=crearPizza(tipoPizza);
        pizza.preparacion();
        pizza.hornear();
        pizza.cortar();
        pizza.empacar();
        return pizza;
    }
    
    
}
