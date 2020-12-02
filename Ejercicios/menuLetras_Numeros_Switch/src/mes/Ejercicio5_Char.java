
package mes;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio5_Char {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
         boolean continuar = true;
        
        while(continuar){
       
        System.out.print("Ingresa una letra [a-l] ");
        Scanner entrada = new Scanner(System.in);
        char mes = entrada.next().charAt(0);
        
        switch(mes){
            case 'a': 
                System.out.println("Enero");
                break;
            case 'b': 
                System.out.println("Febero");
                break;
            case 'c': 
                System.out.println("Marzo");
                break;
            case 'd': 
                System.out.println("Abril");
                break;
            case 'e': 
                System.out.println("Mayo");
                break;
            case 'f': 
                System.out.println("Junio");
                break;
            case 'g': 
                System.out.println("Julio");
                break;
            case 'h': 
                System.out.println("Agosto");
                break;
            case 'i': 
                System.out.println("Septiembre");
                break;
            case 'k': 
                System.out.println("Octubre");
                break;
            case 'j': 
                System.out.println("Noviembre");
                break;
            case 'l': 
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("No es válido");
              
                
                break;
         
                
         }
        
            System.out.println("");
            System.out.print("¿Deseas intentarlo otra vez? [S:Si N:No]: ");
            char respuesta = entrada.next().charAt(0);
            
            if(respuesta == 'S'){
                continuar = true;
            }else if(respuesta == 'N'){
                continuar = false;
            }
        
        
          
            
            
        }
        
              
        
    }
    
}
