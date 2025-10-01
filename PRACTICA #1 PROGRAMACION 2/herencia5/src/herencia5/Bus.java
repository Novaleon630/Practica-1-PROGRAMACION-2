/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia5;

/**
 *
 * @author Precision 7510
 */
public class Bus extends Vehiculo{
    private int capacidad;
    private String sindicato;


    public Bus(int capa, String sindi, String c, String p, int i) {
        super(c, p, i);
        this.capacidad = capa;
        this.sindicato = sindi;
    }
    public void mostrar(){
        System.out.println("DATOS: ");
        super.mostrar();
        
        System.out.println("Capacidad: "+capacidad);
        System.out.println("Sindicato: "+sindicato);
    }
    
}
