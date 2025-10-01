/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia5;

/**
 *
 * @author Precision 7510
 */
public class Herencia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //a)
        Bus b1=new Bus(90,"mixto","ana","djsakl-00", 542);
        b1.mostrar();
        
        
        Auto a1=new Auto(100, true, "roman", "pppppp", 2135);
        a1.mostrar();
        
        Moto m1=new Moto(300, true, "jeff","yui3y4", 3244);
        m1.mostrar();
        
        //b)
        b1.mostrar(true);
        a1.mostrar(true);
        m1.mostrar(true);
        //c)
        a1.cambiarConductor(b1);
        a1.mostrar();
    }
    
}
