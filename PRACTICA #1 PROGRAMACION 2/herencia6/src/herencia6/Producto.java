/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia6;

/**
 *
 * @author Precision 7510
 */
public class Producto {
    protected String nombre;
    protected double precio;

    public Producto(String n, double p) {
        this.nombre = n;
        this.precio = p;
    }
    
    public void mostrar(){
        System.out.println("nombre: "+nombre+" "+"precio: "+precio);
    }
    public void mostrarInfo(){
        System.out.println("nombre: "+nombre+" "+"precio: "+precio);
    }
    
    
}
