package saludo;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("¿Cuál es tu nombre?: ");
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.nextLine();
        
        System.out.println(" Hola "+ nombre);
        
        //Nota: ¿Cómo podría conrolar de que me ingrese un nombre y no un numero?
        
        
    }
    
}
