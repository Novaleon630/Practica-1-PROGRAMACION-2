/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia4;

/**
 *
 * @author Precision 7510
 */
public class Revista extends MaterialBibliografico {
    private int numeroEdicion;
    
    public Revista(String titulo, String autor, int año, int numeroEdicion) {
        super(titulo, autor, año);
        this.numeroEdicion = numeroEdicion;
    }
    
    @Override
    public String descripcion() {
        return "REVISTA - " + super.descripcion() + ", Edicion: " + numeroEdicion;
    }
}
