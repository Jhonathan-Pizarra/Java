
package testlast;

import java.util.Date;
import java.util.GregorianCalendar;

public class Estudiantes {
    
    private String nombre;
    private int edad;
    private String pais;
    private Date fechNacimiento;
    private String [] cursos; //Ref. salones de clase
    private Materias[] materias;
    
    //Constructor
    
    //Setter y Getter (S)

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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Date getFechNacimiento() {
        return fechNacimiento;
    }

    public void setFechNacimiento(int year, int month, int day) {
        GregorianCalendar calendario = new GregorianCalendar(year, month-1, day);
        
        this.fechNacimiento = calendario.getTime();
    }

    public Materias[] getMaterias() {
        return materias;
    }

    public void setMaterias(Materias[] materias) {
        this.materias = materias;
    }
    
    

    public String[] getCursos() {
        return cursos;
    }

    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }
        

    //Sobreescritura de Métodos: 
    @Override
    public boolean equals(Object objeto){
    
        final Estudiantes otrosEstudiantes = (Estudiantes)objeto;
            if(this.nombre.equals(otrosEstudiantes.nombre)){
                if(this.edad == otrosEstudiantes.edad){
                    if(this.fechNacimiento.equals(otrosEstudiantes.fechNacimiento)){
                        for(int k=0 ;k<cursos.length; k++){
                            for(int m=0; m<cursos.length; m++){
                                if(this.cursos[k].equals(otrosEstudiantes.cursos[m])){
                                    for(int i=0; i<materias.length; i++){
                                        for(int j=0; j<materias.length; j++){
                                            if(this.materias[i].equals(otrosEstudiantes.materias[j])){
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }    
                        }
                    }
                }
            }
        
        
        
        return false;
        
    }

    @Override
    public String toString() {
        String cadena=" ";
        String cadena2=" ";
        for(int i=0; i<cursos.length; i++){
            cadena += cursos[i]+",";
        }
        for(int i=0; i<materias.length; i++){
            cadena2 += materias[i]+",";
        }
        
        return "Nombre: " + nombre +"\n "+
               "Edad: " + edad +"\n "+ 
               "Pais: " + pais +"\n "+
               "Fecha_Nacimiento: " + fechNacimiento +"\n "+
               "Cursos:" + cadena +"\n"+ 
               "Materias: "+cadena2;
    }
    
  
    
    
}
