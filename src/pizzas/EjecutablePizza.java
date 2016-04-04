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
public class EjecutablePizza {
    public static void main (String[]args){
        java.util.Scanner lectura=new java.util.Scanner(System.in);
        String Digi;
        do{
        System.out.println("Desea crear una pizza? Escriba si o no");
        Digi=lectura.next();
        if (Digi.equals("si")){
        System.out.println("Escoge la pizza que desea el Cliente: ");
        System.out.println("Escribe vegetariana, queso o peperoni");
        
        String Escoge=lectura.next();
        
        
        Cliente creacion=new Ventas();
        /** Se usan interfaces con Cliente 
         * pero se usa una instancia de Cliente "una clase hija en concreto"
         */
        Pizza pizza= creacion.OrdendelCliente(Escoge);       
             System.out.println(pizza.getNombre());
        }
        else {System.out.println("Gracias por su compra");}
        }while(Digi.equals("si"));
    }
  
}
  
