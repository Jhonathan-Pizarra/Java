package epn;

import javax.swing.JOptionPane;


public class Uso_Poligono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JOptionPane para la entrada de datos
		double lado1= Double.parseDouble(JOptionPane.showInputDialog("Ingrese un lado(1): "));
		double lado2= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado(2): "));
		
		
		//Creamos los objetos
		Triangulo figura_a = new Triangulo(lado1,lado2, 0);
		Rectangulo figura_b = new Rectangulo(lado1,lado2, 0);
		  
		//Impresi�n: 
		System.out.println("El area del Triangulo es: "+figura_a.GetArea());
		System.out.println("El area del Rectangulo es: "+figura_b.GetArea());

		
		 
		
	}
	

	

}
