/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;
import java.util.*;
/**
 *
 * @author Diego Alejandro Herrera Burgos
 * @version 1.0
 */
public abstract class Pizza {
    /**
     *
     * Se crean los atributos de pizza
     */
    private String nombre;
    public ArrayList masa=new ArrayList();
    public String Salsa;
    public ArrayList ingredientes= new ArrayList();
    /**
     * el constructor es por defecto
     */
    public void preparacion(){
        /**
         * el metodo preparacion explica, al cliente, como es la preparacion de
         * la masa de la pizza, sus salsas e ingredientes
         */
        System.out.println("Preparando y amasando la masa...");
        System.out.println("Tipo de Masa");
        for(int i=0;i<masa.size();i++){
             System.out.println(" "+(i+1)+": "+masa.get(i));
        }
        System.out.println("Salsas: Tipo de Salsa Tomate");
        System.out.println("Ingredientes: ");
        for(int i=0;i<ingredientes.size();i++){
            System.out.println(" "+(i+1)+": "+ingredientes.get(i));
        }
    }
    /**
     * Se generan tres metodos mas con el fin de satisfacer la necesidad del cliente por 
     * saber cual es la preparacion de su producto
     */
    public void hornear(){System.out.println("El proceso de hornear tarda de 15 a 50 minutos");}
    public void cortar(){System.out.println("El corte de la pizza se debe realizar en porciones triangulares del mismo tamaño");}
    public void empacar(){System.out.println("Su caja es proporcional al tamaño de la pizza"
            + " y de caracter cubico");}     

    public String getNombre() {
        /**
         *El metodo getNombre hace posible que las clases del mismo paquete accedan con el fin de llamar
         * a sus clases hija.
         */
        return nombre;
    }
 }
           
 
