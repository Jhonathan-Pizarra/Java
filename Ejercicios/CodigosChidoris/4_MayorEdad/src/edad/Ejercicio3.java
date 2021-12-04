package edad;
import java.util.Scanner;


public class Ejercicio3 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean validacion = false;
        while(validacion != true){
        
        System.out.print("¿Cuantos años tienes?: ");
        Scanner entrada = new Scanner(System.in);
        int edad = entrada.nextInt();
        
            if(edad <= 0){
                       System.out.println("Esto no puede ser posible.");

            }else if(edad > 100){
                        System.out.println("No te creo");

            }else if(edad >= 18){
                        System.out.println(edad+ " años, eres mayor de edad");
                        validacion = true;

            }else if (edad < 18){
                        System.out.println(edad+ " años, eres menor de edad");
                        validacion = true;

            }
        
        
        }
        
    }
    
}
