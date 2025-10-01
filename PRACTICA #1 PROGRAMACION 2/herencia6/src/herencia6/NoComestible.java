/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia6;

public class NoComestible  extends Producto{
     private String tipo; 
    
    public NoComestible(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }
    public void mostrar(){
        super.mostrar();
        System.out.println(tipo);
    }
}
