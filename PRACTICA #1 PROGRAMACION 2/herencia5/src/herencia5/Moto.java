/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia5;

public class Moto extends Vehiculo{
    private int cilindrada;
    private boolean casco;

    public Moto(int cili, boolean ca, String c, String p, int i) {
        super(c, p, i);
        this.cilindrada = cili;
        this.casco = ca;
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("Cilindrada: "+cilindrada);
        System.out.println("casco: "+casco);
    }
    
    
    
}
