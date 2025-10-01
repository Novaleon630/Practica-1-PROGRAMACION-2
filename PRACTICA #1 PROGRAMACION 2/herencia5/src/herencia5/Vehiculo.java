/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia5;

public class Vehiculo {
    private String conductor, placa;
    private int id;
    
    public Vehiculo(){
        conductor="juan";
        placa="213-tro";
        id=9998;
        
    }
    public Vehiculo(String c, String p, int i) {
        this.conductor = c;
        this.placa = p;
        this.id = i;
    }
    public void mostrar(){
        System.out.println("DATOS DEL VEHICULO:===================>");
        System.out.println("CONDUCTOR: "+conductor);
        System.out.println("PLACA: "+placa);
        System.out.println("ID: "+id);
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public boolean mostrar (boolean x){
        if(x){
            System.out.println("PLACA: "+placa+" "+"conductor: "+conductor+" ");
        }
        return false;
    }
    //c)
    public void cambiarConductor(Vehiculo px){
        this.conductor=px.getConductor();
        System.out.println("se cambio el conductor: "+conductor);
    }
    
    
}
