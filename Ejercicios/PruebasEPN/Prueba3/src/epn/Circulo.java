package Poo;
public class Circulo extends Figura {

	//1) Atributos
			private double radio;
			private int area;
			private double perimetro;
			
			//2) Constructor
			public Circulo(double radio) {
				
				this.radio=radio;
				
				
			}
			
			//3) Metodos Setters y Getters
			
			public int obtenerArea() {
				double pi=Math.PI;
				area=(int) (pi*(radio*radio));
				
				return area;
			}
			
			public double obtenerPermitero() {
				double pi=Math.PI;
				perimetro=(2*pi*radio);
				
				return perimetro;
			}
			
			//Si ancho y largo son iguales, decir es cuadrado, si no, nada


}
