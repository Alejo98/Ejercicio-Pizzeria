/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;

/**
 *
 * @author Diego Alejandro Herrera Burgos
 *  @version 1.0
 */
public  class Queso extends Pizza {
    
    public Queso() {
         /**
         * en el caso de esta extencion de la clase padre Pizza, se genera un constructor
         * con cada uno de los componetes de la pizza y el nombre con el que se conoce 
         * dentro de la pizzeria.
         */
        String nombre="Pizza Queso";
        String salsa="Tomate";
        masa.add("Corteza Regular");
        ingredientes.add("Queso Mosarrella fresco");
        ingredientes.add("Queso Parmessano");
        
    }

   
}
