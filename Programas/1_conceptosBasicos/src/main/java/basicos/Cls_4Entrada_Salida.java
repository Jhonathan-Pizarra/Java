package basicos;

import java.util.Scanner; //Importamos esta libreria pra tener acceso a el método Scanner

public class Cls_4Entrada_Salida {
    
    public static void main(String[] args){
        
        //Entrada del usuario
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.print("Digite un número: ");
        numero = entrada.nextInt(); //Podemos obtener diferentes tipos de entradas (Leer la teoría)
        
        //Salida
        System.out.println("El número que ingresaste fue: "+numero);
    
    
        //Nota: Para los flotantes, cuando se solicita entrada se debe escribir: 4,5 y lo que se imprimirá es 4.5
    }
    
}
