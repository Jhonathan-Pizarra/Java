
package test2;

import java.util.Date;
import java.util.GregorianCalendar;

public class Profesor {
    
    
    //1)Atributos
    private String nombre;
    private Date fechaNacimiento;
    private String pais;

    //Constructor vacio...De adorno? xD, osea si, pero a lo que quiera inicializar el objeto ... No sé we :'v 
    public Profesor() {}

    //Métodos setter(s) y getters(s)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int year, int month, int day) {
        GregorianCalendar calendario = new GregorianCalendar(year, month-1, day);
        
        this.fechaNacimiento = calendario.getTime();   
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    //Equals sobreescribir
    @Override
    public boolean equals(Object objeto){
        final Profesor otroProfesor = (Profesor)objeto;
        
        if(this.nombre.equals(otroProfesor.nombre)){ //Si el nombre de este profesor es igual al del otro
           /* if(this.fechaNacimiento.equals(otroProfesor.fechaNacimiento)){ //Y ademas de eso la fecha de nacimiento es igual  a la del otro
                if(this.pais.equals(otroProfesor.pais)){ // Y ademas de eso tambien son del mismo pais 
                    return true;
                }
            }
           */ //Voy a hacerle el return solo para esta condicion: de que el nombre es idual al nombre..
            return true;
        }//Si no se cumplen esas 3 condiciones...
    
        return false;
    }

    
    
    
}
