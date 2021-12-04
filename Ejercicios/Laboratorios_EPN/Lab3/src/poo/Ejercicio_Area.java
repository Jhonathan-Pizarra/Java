import java.util.*;
import javax.swing.*;
public class Ejercicio_Area {

	public static void main(String[] args) {
		// Ejercicio consiste en que el usuario ingresa su edad
		//Si el usuario ingresa un numero mayor a 18, respode que es mayor de edad
		//De lo contrario, es menor
		//Verificar los valores "Imposibles" y corregirlos
		//Hasta aqui, a traves de un Scanner
		//Tambien que adivine un numeor del 1 al 10, el cinco, si lo adivina que me siga
		//Adivinaste, de lo contrario, que me salga, fallaste, era el 5
		//Todo eso a traves del JOption
		//Por ultimo, calcular el area de un circulo
		
		//EJERCICIO 1
		Scanner entrada=new Scanner (System.in);
		System.out.println("Ingresa tu edad: ");
		int edad=entrada.nextInt();
		
		if(edad<=0 || edad>100) {
			System.out.println("No es posible que tega esa edad.");
		}else if(edad>=18) {
			System.out.println("Mayor de edad.");
		}else if(edad<18) {
			System.out.println("Menor de edad.");
		}else {
			System.out.println("Fin del porgrama.");
		}
		
		//EJERCICIO 2
		String entrada_2=JOptionPane.showInputDialog("Estoy pensando en un numero del 1 al 10: ");
		int numero=Integer.parseInt(entrada_2);
		if(numero==5) {
			System.out.println("Adivinaste! es "+numero);
		}else {
			System.out.println("Fallaste, yo pensaba en: "+ "5");
		}
		
		//EJERCICIO 3
		//Area del circulo es Pi* r al cuadrado
	//	final double Pi=3.14; O bien
		double pi=Math.PI;
		Scanner entrada_circulo=new Scanner (System.in);
		System.out.print("Ingresa el valor del radio del circulo: ");
		double radio;
		radio=entrada_circulo.nextDouble();
		
		//Elaboracion...
		double area;
		area=((pi)*(radio*radio));
		System.out.println("El area es: "+area);
		System.out.printf("Truncado: El area es: "+"%1.2",area);
		//SI sale un error, mira bien.. Quiza es que ingreas un radio tan grande que necesariamente debe tener más de una cifra
		
		
		
		
	
		
	}

}
