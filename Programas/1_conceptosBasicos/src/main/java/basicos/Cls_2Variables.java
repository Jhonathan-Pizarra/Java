//TEMAS
//Tipos de variables
//Variables (Declaracion y asignacion)
//Comcatemación
package basicos;

public class Cls_2Variables {
    
    public static void main(String[] args){
        
    //Tipos de Variables    
    char letra = 'A';
    int edad = 42; 
    float decimales = 3.4f;
    double puntaje = 15.9; 
    boolean boleano = false; //solo tiene dos valores, true o false
    String apellido = "Pizarra"; //String: un arreglo de caracteres
    
    //Variables declaracion y asignacion
        //Para declara y asignar:
        int variable;
        variable = 34;
        //O también:
        int variable2 = 35; 
    
        //Multiple
        int var1,var2,var3 = 5; //3 variables, de tipo int, cada una con el valor de 5
    
    
    //Concatenación
    System.out.println("Jhonathan" + " " + apellido ); //Jhonathan Pizarra
    //O también
    String concatenada = "Jhonathan"+apellido;
    System.out.println(concatenada); //JhonathanPizarra
    
    
    }
  
}
