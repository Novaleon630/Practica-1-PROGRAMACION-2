/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia6;

/**
 *
 * @author Precision 7510
 */
public class Herencia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //b)
        Bebida b1=new Bebida(12, true, "cocacola", 34);
        b1.mostrar();
        Bebida b2=new Bebida(12, true, "sprite", 34);
        b2.mostrar();
        
        Comida c1=new Comida("sajta", 34, 45);
        c1.mostrar();
        Comida c2=new Comida("bistec", 34, 45);
        c2.mostrar();
        
        NoComestible n1=new NoComestible("cepillo", 23, "plastico");
        n1.mostrar();
        //c)
        c1.mostrarInfo();
        b2.mostrarInfo();
        
        
    }
    
}
