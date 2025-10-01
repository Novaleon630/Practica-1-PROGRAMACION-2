/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo456;

public class Persona {
    private String nombre, pat, mat;
    private int edad;
    
    public Persona(){
        nombre="jeimy";
        pat="loaiza";
        mat="mamani";
        edad=45;
    }

    public Persona(String n, String p, String m, int e) {
        this.nombre = n;
        this.pat = p;
        this.mat = m;
        this.edad = e;
    }
    public void mostrar(){
        System.out.println("nombre: "+nombre+" "+"/apellidos: "+pat+" "+mat+" "+"/edad: "+edad+" ");
    }

    
    //inciso b)
    public void mostrar(boolean unir){
        if(unir){
            System.out.println("nombre: "+nombre+" "+"/paterno: "+pat+" "+"/materno: "+mat+" ");
        }
        else{
            mostrar();
        }
        
    }
    public boolean CompararApellido(Persona px){
        if(pat == px.pat){
            return true;
        }
        return false;
    }
    public boolean CompararApellido(boolean verifica, Persona pc){
        if(verifica && mat.equals(pc.mat)){
            return true;
        }
        return false;
        
    }
    //d) modificar edad
    public void solucion(int x){
        System.out.println("aumentar edad: ");
        edad=edad+x;
        System.out.println("edad aumentada: "+edad);
    }
    public void solucion(boolean mod, int y){
        if(mod){
            edad=edad -y;
            System.out.println("edad disminuida a: "+edad);
        }
        
        
    }
    
    
}
