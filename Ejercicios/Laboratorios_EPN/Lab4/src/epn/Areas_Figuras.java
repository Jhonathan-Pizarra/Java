import java.util.*;
import javax.swing.*;

public class Areas_Figuras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hacer un menu de opciones:
		/*1) Area de cuadrado
		 * 2) Area de circulo
		 * 3) Area de triangulo
		 * 4) Atrea de recutangulo
		 *El usuario debe por medio de JOption ingresar los datos, y por medio de un Scanner escoger las opciones
		 */
		
		//NO PUDE HACERLO CON CHAR...
		/*
		System.out.println(" \t MENU DE OPCIONES.");
		System.out.println("a) Area de Cuadrado");
		System.out.println("b) Area de Circulo");
		System.out.println("c) Área de triangulo");
		System.out.println("d) Área de rectángulo");
		Scanner entrada=new Scanner(System.in);
		
		System.out.print("Escoge una opcion: ");
		String opc=entrada.nextLine();
		
		
		switch(opc) {
		case 'a':
		
		}
		*/
		
		System.out.println(" \t MENU DE OPCIONES.");
		System.out.println("1) Area de Cuadrado");
		System.out.println("2) Area de Circulo");
		System.out.println("3) Área de triangulo");
		System.out.println("4) Área de rectángulo");
		System.out.println(" ");
		Scanner entrada=new Scanner(System.in);
		
		System.out.print("Escoge una opcion: ");
		int opc=entrada.nextInt();
		
		switch(opc) {
		case 1:
			System.out.println("Area de Cuadrado...");
			String lado=JOptionPane.showInputDialog("Ingresa un lado del cuadrado: ");
			int lado_int=Integer.parseInt(lado);
			int area_cuadrado;
			area_cuadrado=(lado_int*lado_int);
			
			System.out.println("El area del cuadrado es: "+area_cuadrado);
			break;
		case 2:
			System.out.println("Area del Círculo...");
			String radio=JOptionPane.showInputDialog("Ingresa el radio del círculo: ");
			double radio_circulo=Double.parseDouble(radio);
			float area_circulo;
			area_circulo=(float) ((radio_circulo*radio_circulo)*(Math.PI));
			
			System.out.println("El area del circulo es: "+area_circulo);
			break;
		case 3:
			System.out.println("Area del Triangulo...");
			String base=JOptionPane.showInputDialog("Ingresa el base del triangulo: ");
			String altura=JOptionPane.showInputDialog("Ingresa la altura del triangulo: ");
			
			int base_int=Integer.parseInt(base);
			int altura_int=Integer.parseInt(altura);
			float area_triangulo;
			area_triangulo=(float) ((base_int*altura_int)/2);
			
			System.out.println("El area del circulo es: "+area_triangulo);
			break;
		case 4:
			System.out.println("Area del Rectángulo...");
			String base2=JOptionPane.showInputDialog("Ingresa el base del rectángulo: ");
			String altura2=JOptionPane.showInputDialog("Ingresa la altura del rectángulo: ");
			
			int base_int2=Integer.parseInt(base2);
			int altura_int2=Integer.parseInt(altura2);
			float area_rectagnulo;
			area_rectagnulo=(float) ((base_int2*altura_int2));
			
			System.out.println("El area del rectangulo es: "+area_rectagnulo);
			break;
		default:
			System.out.println("Opción no valida");
			break;
		}
		
		
	}

}
