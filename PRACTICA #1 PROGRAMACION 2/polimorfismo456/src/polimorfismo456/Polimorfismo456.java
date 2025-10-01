
package polimorfismo456;

public class Polimorfismo456 {

    public static void main(String[] args) {
        System.out.println("ejercicio 4==========================");
        //inciso a)
        Persona p1=new Persona();
        p1.mostrar();
        
        Persona p2=new Persona("juan", "quipe", "mamani", 23);
        p2.mostrar();
        
        //b)
        p1.mostrar(true);
        p2.mostrar(false);
        //c)
        System.out.println(p1.CompararApellido(p2));
        System.out.println(p1.CompararApellido(true, p2));
        
        //d)
        p1.solucion(24);
        p2.solucion(true, 12);
        
        System.out.println("ejercicio 5=========================");
        
    }
    
}
