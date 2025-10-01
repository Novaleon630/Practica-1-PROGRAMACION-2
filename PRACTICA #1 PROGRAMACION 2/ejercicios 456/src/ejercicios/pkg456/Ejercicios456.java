/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.pkg456;

public class Ejercicios456 {

    public static void main(String[] args) {
        /*System.out.println("EJERCICIO 4=================");
        CuentaBancaria c1=new CuentaBancaria();
        c1.mostrar();
        // inciso a)
        c1.retitar(9000);
        c1.retitar(100);
        //inciso b)
        c1.depositar(-1000);
        c1.depositar(3000);*/
        
        
        /*System.out.println("ejercicio 5: ================");
        //inciso a) y b)
        Persona p1=new Persona();
        p1.mostrarDatos();
        
        Persona p2=new Persona("jaeida", "loza", "soza", "1234321", 17);
        p2.mostrarDatos();
        //inciso c)
        p1.MayorDeEdad();
        p2.MayorDeEdad();
        
        //inciso d)
        p1.ModificarEdad(34);
        p1.mostrarDatos();
        
        //inciso e)
        System.out.println(p1.VerificaApellPaterno(p2));*/
        
        
        System.out.println("EJERCICIO 6=====================> ");
        Fecha f1 = new Fecha();
        f1.mostrar();

        Fecha f2 = new Fecha(28, 2, 2024);
        f2.mostrar();

        // inciso a
        System.out.println(f2.esBisiesto(2024));
        System.out.println(f2.esBisiesto(2023));

        // inciso b) 
        f2.diaSiguiente();
        f2.mostrar();

        // Prueba con fin de mes
        System.out.println("prueba con el fin de mes: ");
        Fecha f3 = new Fecha(31, 12, 2023);
        f3.mostrar();
        f3.diaSiguiente();
        f3.mostrar();

        // fecha invalida
        Fecha f4 = new Fecha(32, 13, 2023);
        f4.mostrar();
        
    
    }
    
}
