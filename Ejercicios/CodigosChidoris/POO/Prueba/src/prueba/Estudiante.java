/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author chalosalvador
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private Materia[] materias;

    Estudiante(String nombre, int edad, Materia[] materias) {
        this.nombre = nombre;
        this.edad = edad;
        this.materias = materias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Materia[] getMaterias() {
        return materias;
    }

    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }

    @Override
    public String toString() {
        String stringEstudiante = "Nombre: " + this.nombre + "\nEdad: " + this.edad + "\n";
               
        for(int i = 0; i < this.materias.length; i++) {
            stringEstudiante += "Materia " + (i+1) + ": " + this.materias[i] + "\n";
        }
        
        return stringEstudiante;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final Estudiante other = (Estudiante) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!this.nombre.equals(other.nombre)) {
            return false;
        }
        
        for(int i = 0; i < this.materias.length; i++) {
            boolean encontrada = false;
            for(int j = 0; j < this.materias.length; j++) {
                if(this.materias[i].getNombre().equals(other.materias[j].getNombre())){
                    encontrada = true;
                    break;
                }
            }
            
            if(!encontrada){
                return false;
            }
            
        } 
        
        return true;
    }
    
    
}
