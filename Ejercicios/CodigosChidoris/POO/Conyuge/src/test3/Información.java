
package test3;

import java.util.Date;
import java.util.GregorianCalendar;


public class Información {
    
    private String nombre;
    private int edad;
    private String estadoCivil;
    private Date fechaNacimiento;

    //*
    

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

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int year, int month, int day) {
        GregorianCalendar calendario = new GregorianCalendar(year, month-1, day);
        
        this.fechaNacimiento = calendario.getTime();
    }
    
    @Override
    public String toString(){
    
    return "Nombre: "+this.nombre+"\n"+"Estado Civil: "+this.estadoCivil+"\n"+"Fecha de Nacimiento: "+this.fechaNacimiento+"\n"+" Edad: "+this.edad;
    }

    
  
    
    
    
}
