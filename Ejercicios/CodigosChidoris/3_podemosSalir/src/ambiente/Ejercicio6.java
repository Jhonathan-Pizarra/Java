package ambiente;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        // TODO Escribir un programa en Java que imprima por pantalla ”Nos quedamos en casa!” si está lloviendo, 
        
        boolean estaNevando = true;
        boolean estaLloviendo = true;
        double temperatura = 0;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Está lloviendo? [Si:1 / No:0]: ");
       // String aux = entrada.next();
        int respuesta = entrada.nextInt();
        
        if(respuesta == 1){
            estaLloviendo = true;
            
        }else if(respuesta == 0){
            estaLloviendo= false;
        }
        
        System.out.print("¿Está nevando? [Si:S / No:N]: ");
        String aux2 = entrada.next();
        int respuesta2 =  Integer.parseInt(aux2);
        
        if(respuesta2 == 1){
            estaNevando = true;
            
        }else if(respuesta2 == 0){
            estaNevando= false;
        }
        
        System.out.print("¿Cuál es la temperatura?: ");
        temperatura = entrada.nextDouble();
        
        System.out.println(""); 
        if(estaLloviendo || estaNevando || temperatura <= 10){
           
            System.out.println("Nos quedamos en casa.");
        }else{
            System.out.println("Vamos afuera!");
        }
    }
    
}
