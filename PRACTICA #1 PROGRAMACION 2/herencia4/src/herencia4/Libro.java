/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia4;

/**
 *
 * @author Precision 7510
 */
public class Libro extends MaterialBibliografico {
    private String genero;
    
    public Libro(String titulo, String autor, int año, String genero) {
        super(titulo, autor, año);
        this.genero = genero;
    }
    
    @Override
    public String descripcion() { 
        return "LIBRO - " + super.descripcion() + ", Genero: " + genero;
    }
}
