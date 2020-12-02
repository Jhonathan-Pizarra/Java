
package test4;


public class Pasajeros {
    
    private String nombre;
    private int edad ;
    private Sexo sexo;
    
    
    
    
    
    

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
    
    
        public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    
    
    //
    @Override
    public String toString(){
      
    return "\n"+"Nombre: "+nombre+
            "\n"+"Edad: "+edad+
            "\n"+"Sexo: "+sexo;
    }


    
}
