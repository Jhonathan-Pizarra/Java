package farenheit;
import java.util.Scanner;

public class Ejercicio1 {

 
    public static void main(String[] args) {
        // TODO Programa que convierte grados Farenheit a Celsius 
        System.out.print("¿Cuántos grados farenheit?: ");
        Scanner entrada = new Scanner(System.in);
        double farenheit = entrada.nextDouble(); //Hasta aqui llega el programa, me pedirá un numero para poder seguir su ejecución
        
        //Pero ¿Y si le ingreso una letra?...
        
        double celsius;
        celsius = ((farenheit - 32)*5)/9;
        System.out.println(farenheit+" °F" +" equivalen a: "+ celsius+" °C");
        
        
        /*
            Nota: Al momento de ingresar, por ejemlo: 4.0 me sale un error...
            pero si le ingreso 4,0 ahí si funciona, 
            ¿Ese error tiene corrección? Algo como... 
            Si ingresa una "," que salga un mensaje
        
         */
                
        
        
    }
    
}
