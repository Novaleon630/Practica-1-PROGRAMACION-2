/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia5;

/**
 *
 * @author Precision 7510
 */
public class Auto extends Vehiculo{
    private int caballosdefuerza;
    private boolean descapotable;

    public Auto(int cabal, boolean desca, String c, String p, int i) {
        super(c, p, i);
        this.caballosdefuerza = cabal;
        this.descapotable = desca;
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("CABALLOS DE FUERZA: "+caballosdefuerza+" "+"DESCAPOTABLE: "+descapotable);
    }
    
    
    
    
}
