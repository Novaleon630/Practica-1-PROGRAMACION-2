/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.pkg456;
import java.util.*;
public class Persona {
    private String nombre, pat, mat,ci;
    private int edad;
    public Persona(){
        nombre="abel";
        pat="torrez";
        mat="tarqui";
        edad=21;
        ci="1249873";
        
    }

    public Persona(String n, String p, String m, String c, int e) {
        this.nombre = n;
        this.pat = p;
        this.mat = m;
        this.ci = c;
        this.edad = e;
    }
    //b)
    public void mostrarDatos(){
        System.out.println("DATOS DE LA PERSONA==============>");
        System.out.println("nombre: "+nombre);
        System.out.println("apellidos :"+pat+" "+mat+" ");
        System.out.println("edad: "+edad);
        System.out.println("carnet: "+ci);
    }
    //c)
    public void MayorDeEdad(){
        if(edad > 18){
            System.out.println(nombre+" "+" es mayor de edad");
        }
        else{
            System.out.println(nombre+ " "+"es menor de edad");
        }
    }
    /*public void modificaredad(){
        edad=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("modifique la edad ");
        edad=sc.nextInt();
        
        System.out.println("edad modificada"+edad);
    }*/
    //e)
    public void ModificarEdad(int nuevo){
        edad=nuevo;
        System.out.println("nueva edad modificada: "+edad);
    }
    //d)
    public boolean VerificaApellPaterno(Persona px){
        if(pat.equals(px.nombre)){
            return true;
            
        }return false;
    }
    
    
}
