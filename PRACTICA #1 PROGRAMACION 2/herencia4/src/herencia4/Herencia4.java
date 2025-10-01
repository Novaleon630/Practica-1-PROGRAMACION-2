/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia4;

/**
 *
 * @author Precision 7510
 */
public class Herencia4 {
    public static void main(String[] args) {
        MaterialBibliografico[] materiales = new MaterialBibliografico[4];
        
        materiales[0] = new Libro("cien anios de soledad", "auronplay", 1967, "aaaaa");
        materiales[1] = new Revista("geopolitica ", "rrrrr", 2023, 245);
        materiales[2] = new Libro("2344", "aaaaaaaa", 1949, "ciencia ficcion");
        materiales[3] = new Revista("avon", "abc editorial", 2024, 150);
        
        System.out.println("CATALOGO DE LOS MATERIALES:");
        System.out.println("Total de materiales: " + materiales.length);
        
        for (int i = 0; i < materiales.length; i++) {
            System.out.println(materiales[i].descripcion());
        }
    }
}
    

