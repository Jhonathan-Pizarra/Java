
package persona;
import java.util.*;

public class Persona {

    private String nombre;
    private String apellido;
    private Date fechaDeNacimiento;
    private String cedula;    
    
    public Persona(){} //Método constructor, vacío
    
   //Métodos Setter y Getter
    //GETTERS
      public String getNombre(){
      
          return this.nombre;
      }
      
       public String getApellido(){
           
          return apellido;
      }
      
       public String getCedula(){
           
          return this.cedula;
      }
       
        public Date getFechaNacimeinto(){
      
          return fechaDeNacimiento;
      }
    
       //SETTERS
      public void setNombre(String nombre){
      
          this.nombre = nombre;
      }
      
      public void setApellido(String apellido){
      
          this.apellido = apellido;
      }
      
       public void setCedula(String cedula){
           
           
           if(cedulaValida(cedula)){
               this.cedula = cedula;
           }else {
               System.out.println("Cédula no válida");
           }
          
      }
      
       public void setFechaNacimeinto(int año, int mes, int dia){
           GregorianCalendar calendario = new GregorianCalendar(año, mes, dia);
           this.fechaDeNacimiento = calendario.getTime();
      
       }
       
       //METODOS PRIVADOS // no van a ser visibles desde otra clase
       private boolean cedulaValida(String cedula){
           
           //Implemetar el algoritmo de validacion
           int digitos = Integer.parseInt(cedula.charAt(0)+" "+cedula.charAt(1));
            
           if( (digitos <= 24  && digitos >= 1)){
               
               int digito3 = Integer.parseInt(cedula.charAt(2)+" ");
               if(digito3 < 6 ){
                    //Los digitos a partir del tercero son un numero consecutivo: 1223456678 Todo es un numero consecutivos
                   int almacenarConsecutivos;
                   
                   for(int i = 0 ; i < cedula.length(); i++ ){ //Tamaño de la cédula (9)
                       
                       
                       
                
                       /* if(i%2 == 0){
                         almacenarConsecutivos = Integer.parseInt(cedula.charAt(i)+" ")*2;
                     
                        }else {
                        almacenarConsecutivos = Integer.parseInt(cedula.charAt(i)+" ")*1;
                        
                        }
                   
                   if(almacenarConsecutivos > 9){
                   almacenarConsecutivos = almacenarConsecutivos - 9;
                   
                   }
                   
                   acumulador += almacenarConsecutivos; */
                   
                    
                       
   
                       
                   }
               
               }
           
           }
           
           
           
           
           
                   
               
                   
               return false;
               
           
           }
    
                  
                    
       
 //CADA CPNSTRCTOR INICIALAIZA UN ATRIBUITO O VARISO ATRIBUTOS DEIFERENEA
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona1 = new Persona(); //Cuando se crea una instancia se sepra un espacio en memora para esta variable
        
        //Como llamamos al contructor? con la palabra new.
        //y que pasa cuando lo llaamamos? se crea una instancia.
        persona1.setNombre("Jhonathan");
        persona1.setApellido("Pizarra");
        persona1.setFechaNacimeinto(1997, 11, 19);
        persona1.setCedula("1725358525");
        
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Apellido: " + persona1.getApellido());
        System.out.println("Fecha de Nacimiento: "+ persona1.getFechaNacimeinto());
        System.out.println("Cédula: "+persona1.getCedula());
        
    }
    
}

//Primera prueba, Martes 15 prubea teórica ¡Estudiarás!

//Coeficientes 2.1.2.1.2.1.2.1.2
//Cedula :     1 7 2 5 3 5 8 5 2 5
//Multiplicar:  2.7.5.6.5.16.5.4 // Ese 16 o sumanos 1+6 o restamos 16 -9 y se reenokaza por 7 
//Sumar todos esos: 2+7+5+6+6+7+5+4 = 42 50 -42 // El 50 es el decimo superior = 8 este 8 debe coincidir  con el ultimo digito de la cedula

//Strings" arreglo de caacteres, es mas facil iterar 

//metodo charAt(i) // i es una posicion
// char.At(i) multiplicar por cada uni de los coediciientes
// o IF(I %2 == 0) multiplica por 2 , caso contrario multiplica por 1 
// varios if...
//usar una variable acumuladora
    

