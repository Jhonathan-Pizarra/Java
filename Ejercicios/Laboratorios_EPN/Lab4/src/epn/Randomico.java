import java.util.*;
public class Randomico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hacer un programa que genere un numero randomico (EL que se va a giardar en una variable entera) Se genera un lazo while que nos diga si adivinamos o no
		double numero;
		numero=Math.random()*10; // *10 me genrara un numero del 0 al 9, por 100 me generara un numero del 10 al 99
									//Y asi sucesivamente, me ira generando numeros de acorde al numero de cifras como ceros tenga 
		//Us� double porque random solo se puede usar con numeros de tipo double, lueg
		//con el cast ya lo pude convertir a entero
		int numero_int=(int)numero;
		System.out.println("Numero rand�mico: "+numero_int);
		
		//Que comience el juego....
		System.out.println("Estoy pensando en un numero del 0 al 10...");
	
		Scanner entrada=new Scanner (System.in);
		int juego=0;
		int intentos=0;
		
		while(juego!=numero_int) {
			System.out.print("�Puedes adivinar que numero es?: ");
			juego=entrada.nextInt();
			
			if(juego>numero_int) {
				System.out.println("Frio...");
			}else if(juego<numero_int) {
				System.out.println("Caliente...");
			}
			
			
			intentos++;
		}
		System.out.println("Felicidades, "+numero_int+" es el que pens�");
		System.out.println("Lo logrante en " + intentos +" intentos");
	}
		


}
