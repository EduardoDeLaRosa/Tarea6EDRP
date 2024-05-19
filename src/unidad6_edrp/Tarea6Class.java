/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad6_edrp;

/**
 *
 * @author eduar
 */
public class Tarea6Class {
    
    
    private static final int DESCUENTO_GENERAL = 5;
    // Metodo para mostrar el mensaje del total a pagar.
    private void mensajeMostrarTotal(double total) {
        System.out.println("El total a pagar es:"+total);
        System.out.println("Enviado");
    }
    
    public void aplicarDescuento(double precioProducto, int numProductos){
    double total;
    if(numProductos>3)
        precioProducto-=DESCUENTO_GENERAL;
            if (numProductos!=0){
                total = precioProducto*0.8;
                mensajeMostrarTotal(total);
            }else {
                total = precioProducto*0.95;
                mensajeMostrarTotal(total);
            }   
    }
}
