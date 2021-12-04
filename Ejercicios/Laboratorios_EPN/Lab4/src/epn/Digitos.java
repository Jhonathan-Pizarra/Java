import java.util.*;

public class Digitos {

	public static void main(String[] args) {
		// Programa en donde el usuario ingresa 10 numeros y el programa va mostrando los digitos , se detiene
		// Y al final debe imprimir  Fin.
		
		Scanner entrada=new Scanner (System.in);
		int numero;
		int contador=1;
	
		
		do {
			System.out.print("Imgresa un numero: ");
			numero=entrada.nextInt();
			
			System.out.println("Digitos: "+contador);
			contador++;
			if(contador==6) {
			System.out.println("Fin!");
			}
				
		
		}while(contador<=5);
	//Otra forma era inciar a contar desde 1... ahi si pondr�a el <= a 5
		
	
	
	
	
	}

}
