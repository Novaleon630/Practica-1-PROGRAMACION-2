/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia4;

public class MaterialBibliografico {
    protected String titulo;
    protected String autor;
    protected int anio;
    
    public MaterialBibliografico(String titulo, String autor, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = año;
    }
    
    public String descripcion() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", Anio: " + anio;
    }
}

