package poo;
import java.util.*;
public class Caso_4 {

	public static void main(String[] args) {
		
		int variable=1;
		int variable2=2;
		int variable3=3;
		
		try {
		Scanner entrada=new Scanner(System.in);
		
		System.out.print("Ingresa un numero: ");
		variable=entrada.nextInt();
		
		System.out.print("Ingresa otro numero: ");
		variable2=entrada.nextInt();
		
		variable3=(variable/variable2);
		} catch(InputMismatchException ex1) {
			System.out.println("Error: "+ex1.getMessage());
			
		} catch(ArithmeticException ex2) {
			System.out.println("Error: "+ex2.getMessage());

		} //Puedo tener un solo try y n cashs.,,
		
		

	}

}
