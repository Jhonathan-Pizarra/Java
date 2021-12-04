
package guimatricula;

import java.util.ArrayList;


public class Estudiantes {
    
    String nombre;
    String apellido;
    int edad;
    ArrayList<Materias> materias;

    public Estudiantes(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.materias = new ArrayList();
    }

    //Metodos Setter y Gettes
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //ArrayList
    public ArrayList<Materias> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materias> materias) {
        this.materias = materias;
    }

    
    
    
    
    
    
    //To String para mandar al comboBox..Sólo el nombre y el apellido, no la edad...
    @Override
    public String toString() {
        
        return  nombre + " " + apellido;
    }

 
    
    
    
}
