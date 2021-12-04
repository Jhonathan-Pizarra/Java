package Poo;

public class Triangulo extends Figura{
	//1) Atributos
		private int lado_1;
		private int lado_2;
		private int lado_3;
		private int area;
		private int perimetro;
		
		//2) Constructor
		public Triangulo(int lado_1, int lado_2, int lado_3) {
			
			this.lado_1=lado_1;
			this.lado_2=lado_2;
			
			
		}
		
		//3) Metodos Setters y Getters
		
		
		public int obtenerArea() {
			area=((lado_1*lado_2)/2);
			
			return area;
		}
		
		public int obtenerPermitero() {
			perimetro=((lado_1+lado_2+lado_3));
			
			return perimetro;
		}
		
		//Si ancho y largo son iguales, decir es cuadrado, si no, nada


}
