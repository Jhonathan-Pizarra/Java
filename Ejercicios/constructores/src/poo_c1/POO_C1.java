
package poo_c1;

import java.util.Date; //Esto nos dejará usar el tipo de dato Date

public class POO_C1 {
    
    //Declarar atributos
    private String nombre;
    private String apellido;
    private Date fechaDeNacimiento;
    
    //Método(s) contrusctor(es)
    public POO_C1(){ //1) Sin argumentos
    
    }
    
    public POO_C1(String nombre){ //2) No puede haber 2 contrsctores iguales, por lo que este dee tener almenos un argumento
    
        this.nombre = nombre; //Este atributo nombre, hace referencia a este argumento: "nombre"
        //El tipo de dato del argumento debe ser el mismo que el del atributo... 
    }
    
    public POO_C1(String nombre, String apellido){ //3) No puede haber 2 contrcurtores (o mas) iguales, este debe tener al menos 2 arguemntos
    
        this.nombre = nombre;
       // this.apellido = apellido;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}
