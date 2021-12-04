package paroimpar;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Bienvenido!");
        System.out.print("Ingresa un numero: ");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        
        //Un numero puede ser par o impar 
        if(numero % 2 == 0){ //El resido de la division de un numero para 2 debe ser igual a 0, entonces es par
            System.out.println(numero +" es par");
           
        }else if(numero %2 != 0){
            System.out.println(numero +" es impar");
        }else {
            System.out.println("Eso no es un numero");
        }
        
    }
  
}
