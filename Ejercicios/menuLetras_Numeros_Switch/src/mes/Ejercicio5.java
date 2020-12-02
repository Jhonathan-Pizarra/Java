package mes;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        // TODO  Escribir un programa que pida al usuario ingresar el número de un mes y que imprima en pantalla el nombre del mes. 
        boolean continuar = true;
        
        while(continuar){
       
        System.out.print("Ingresa un numero [1-12]: ");
        Scanner entrada = new Scanner(System.in);
        int mes = entrada.nextInt();
        
        switch(mes){
            case 1: 
                System.out.println("Enero");
                break;
            case 2: 
                System.out.println("Febero");
                break;
            case 3: 
                System.out.println("Marzo");
                break;
            case 4: 
                System.out.println("Abril");
                break;
            case 5: 
                System.out.println("Mayo");
                break;
            case 6: 
                System.out.println("Junio");
                break;
            case 7: 
                System.out.println("Julio");
                break;
            case 8: 
                System.out.println("Agosto");
                break;
            case 9: 
                System.out.println("Septiembre");
                break;
            case 10: 
                System.out.println("Octubre");
                break;
            case 11: 
                System.out.println("Noviembre");
                break;
            case 12: 
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("No es válido");
                break;
                
         
         }
          /*  
            char salir = 'S';
            char seguir = 'N';
            char respuesta = 0; //¿Esto se puede hacer?
            
            System.out.println(" ");
            System.out.print("¿Deseas volverlo a intentar?[S-N]: ");
            
           */
        
           // respuesta = entrada.hasNext(); El problema es al momento de pedir por teclado que ingre una letra...
           // respuesta = entrada.next(); //Dice que un String no puede ser convertido a char
         
            
            
            /*
            if(respuesta == 'S'){ //Pude observar que me daba error a menos que inicialize la valiable respuesta...¿Por qué?
                continuar = true;
            }else if (respuesta == 'N'){
.                continuar = false;
            } */
            
            System.out.println(" ");
            System.out.print("¿Deseas volverlo a intentar? [Si:0 / No:1]: ");
            int respuesta ;
            respuesta = entrada.nextInt();
            
            if(respuesta == 0){ //Pude observar que me daba error a menos que inicialize la valiable respuesta...¿Por qué?
                continuar = true;
            }else if (respuesta == 1){
                System.out.println("Ok, Hasta luego!");
                continuar = false;
            }
            
        }
        
              
        
        
 
    }
    
}
