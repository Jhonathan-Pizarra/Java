/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author chalosalvador
 */
public class Materia {
    private String nombre;
    private int nivel;

    Materia(String nombreMateria, int nivel) {
        this.nombre = nombreMateria;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + ", nivel: " + this.nivel;
    }
    
    
}
