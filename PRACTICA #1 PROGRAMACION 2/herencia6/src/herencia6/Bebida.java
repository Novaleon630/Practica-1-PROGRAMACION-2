/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia6;

public class Bebida extends Producto{
    
    private double contenido;
    private boolean gaseosa;

    public Bebida(double con, boolean ga, String n, double p) {
        super(n, p);
        this.contenido = con;
        this.gaseosa = ga;
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("contenido: "+contenido);
        System.out.println("gaseosa: "+gaseosa);

    }
    
    

    
    
    
    
    
    
    
}
