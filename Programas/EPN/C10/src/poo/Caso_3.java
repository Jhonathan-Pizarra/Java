package poo;
import java.util.*;
public class Caso_3 {
		
	
	public static void main(String[] args) {
		
		boolean auxiliar=false;
		
	// TODO Auto-generated method stub
		do {
			System.out.println(".......................");
			Scanner entrada=new Scanner(System.in);	
			System.out.println("Ingrese un numero(a): ");
			int numerador = 1;	
			
			try {
				
			System.out.println("Ingreso al TRY..");	
			numerador=entrada.nextInt();//La idea es escribir algo que no sea un numero
		//	System.out.println(numerador);
			System.out.println("...Salida del TRY");
			
			} catch (InputMismatchException e1) {
				
				System.out.println("Entrada catch_1");
				System.out.println("Error: "+ e1.getMessage());
				System.out.println("Salida Catch_1");
				System.out.println(" ");
				
			}
			
			System.out.println("..........................");
			System.out.println("Ingrese un numero(b): ");
			int denominador=1;
			System.out.println(" ");
			
			try {
				
			System.out.println("Ingreso al TRY..");	
			denominador=entrada.nextInt();
		//	System.out.println(denomiandor);
			System.out.println("...Salida del TRY");
			
			} catch (InputMismatchException e2) {
				
				System.out.println("Entrada catch_2");
				System.out.println("Error: "+ e2.getMessage());
				System.out.println("Salida Catch_2");
				System.out.println(" ");
				
			} //Se salt� eeste chatc porque aqui no hubo error, si ingrese un numero para el deniminar (aunque erea cero)
			int division = 0;
			try {
			
				System.out.println("Entrada try");
				division=(numerador/denominador);
				System.out.println("Salida try");
			
			}catch (ArithmeticException e3) {
				
				System.out.println("Entrada catch");
				System.out.println("Error: "+ e3.getMessage());
				System.out.println("Salida Catch");
				System.out.println(" ");
				
			}
			finally {
				System.out.println("Entrada Finally");
			//	System.out.println("No existe division para cero");
				System.out.println("Salida Finally");
	
			}
			
			if(division<=0 || division >=0) {
				auxiliar=false;
			}else {
				auxiliar=true;
			}
			
		}while(auxiliar!=true);	
				
			
		}
}


