import java.util.*;
public class Intrucciones_Seleccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hcer un menu de opciones
		System.out.println("\t MENU DE OPCIONES"); //t es un TAB
		System.out.println("1) Helado de Chocolate");
		System.out.println("2) Helado de Fresa");
		System.out.println("3) Helado de Vainilla");
		System.out.println("4) Helado Trixto");
		
		Scanner entrada=new Scanner (System.in);
		System.out.println("¿Cuál es tu eleccion?: ");
		int eleccion=entrada.nextInt();
		
		
		switch (eleccion){
		case 1:
			System.out.println("Chocolate!");
			break;
		case 2:
			System.out.println("Fresa");
			break;
		case 3:
			System.out.println("Vainilla");
			break;
		case 4:
			System.out.println("Trixto");
			break;
			
		default:
			System.out.println("No es una opcion válida");
			break;
		}
		

	}

}
