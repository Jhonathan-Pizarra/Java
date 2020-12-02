package holaMundo;

import java.util.Scanner;

public class Cls_3Entrada_Salida {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.print("Digite un número: ");
        numero = entrada.nextInt();
        
        System.out.println("El número que ingresaste fue: "+numero);
    
    
        //Nota: Para los flotantes, cuando se solicita entrada se debe escribir: 4,5 y lo que se imprimirá es 4.5
    }
    
}
