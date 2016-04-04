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
public class Ventas extends Cliente {

    public Ventas() {
    }
    
    public Pizza crearPizza(String tipo){
        /**
         * En la clase cliente se implemento CrearPizza()
         */
        if (tipo.equals("vegetariana")){
             /**
             * Creacion de clases concretas, para cada Pizza.
             */
            return new Vegetariana();
        }else if (tipo.equals("peperoni")){
             /**
             * Creacion de clases concretas, para cada Pizza.
             */
            return new Peperoni();
        }else if(tipo.equals("queso")){
             /**
             * Creacion de clases concretas, para cada Pizza.
             */
            return new Queso();
        }else return null;
    }
    
        
}
    
    

