import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		////Ingresamos un numero y de ese numero nos calcule en factorial
		Scanner entrada=new Scanner(System.in);
		System.out.print("Ingresa un numero: ");
		int numero_original;
		numero_original=entrada.nextInt();
		//Hasta aqui, solo pedimos cual va a ser nuestro numero
		int factorial=1;
		//Ojo, si inicia factoial en 0, el valor del factorial se ira multiplicando por cero
		//De igual forma, si i inicia en cero, caput !, todo esta perdido...
		for(int i=1; i<=numero_original; i++) { //El numeo que ingresamos queda como condicion
			
			factorial=factorial*i;
			
			
		}
		System.out.println("El factorial es: "+ factorial);
		

	}

}
