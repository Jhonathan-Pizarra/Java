
package testlast;

public class Materias {
    
    private String nombre;
    private int nivel;
    
    //Constructor
    
    
    //Setter y Getter (s)
   

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
   
        //Sobreescritura de metodos

    @Override
    public String toString() {
        return "Nombre: " + nombre +"\n "+
               "Nivel: "+ nivel+"\n ";
    }
    
}
