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
public class EjecutablePizza {
    public static void main (String[]args){
        java.util.Scanner lectura=new java.util.Scanner(System.in);
        System.out.println("Escoge la pizza que desea el Cliente: ");
        System.out.println("Escribe vegetariana, queso o peperoni");
        
        String Escoge=lectura.next();
        
        Cliente creacion=new Ventas();
        
        Pizza pizza= creacion.OrdendelCliente(Escoge);       
             System.out.println(pizza.getNombre());
            
    }
    
}
