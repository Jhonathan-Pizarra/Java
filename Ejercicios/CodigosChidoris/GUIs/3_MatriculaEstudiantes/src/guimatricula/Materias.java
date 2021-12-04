
package guimatricula;


public class Materias {
    
    String nombre;
   

    public Materias(String nombre) {
        
        this.nombre = nombre;
       
    }
    
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    
    
    //To String.. Para que me filtre en el comboBox
    @Override
    public String toString() {
        
        return nombre;
    }
    
    
    
}
