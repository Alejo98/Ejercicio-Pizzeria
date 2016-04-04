/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;

/**
 *
 * @author Diego Alejandro Herrera
 *  @version 1.0
 */
public class Vegetariana extends Pizza{
    public Vegetariana() {
         /**
         * en el caso de esta extencion de la clase padre Pizza, se genera un constructor
         * con cada uno de los componetes de la pizza y el nombre con el que se conoce 
         * dentro de la pizzeria.
         */
        String nombre="Pizza Vegetariana";
        String salsa="Tomate";
        masa.add("Regular");
        ingredientes.add("Queso Mozzarella");
        ingredientes.add("parmesano rallado");
        ingredientes.add("cebolla picada");
        ingredientes.add("hongos en rebanadas");
        ingredientes.add("pimienta roja en rodajas");
        ingredientes.add("aceitunas negras rebanadas");
    }
    
}
