/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia4;


public class Tesis extends MaterialBibliografico {
    private String universidad;

    public Tesis(String u, String t, String au, int a) {
        super(t, au, a);
        this.universidad = u;
    }
    
    @Override
    public String descripcion(){
        return super.descripcion() + ", UNIVERSIDAD: " + universidad;
    }
}