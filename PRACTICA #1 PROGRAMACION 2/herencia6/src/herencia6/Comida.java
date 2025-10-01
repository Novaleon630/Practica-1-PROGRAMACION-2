/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia6;

/**
 *
 * @author Precision 7510
 */
public class Comida extends Producto{
    private int calorias;

    public Comida(String n, double p, int ca) {
        super(n, p);
        calorias=ca;
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("calorias: "+calorias);
    }
    
    
    
}
