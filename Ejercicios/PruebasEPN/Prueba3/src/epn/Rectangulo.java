package Poo;

public class Rectangulo extends Figura {
	
	//1) Atributos
	private int ancho;
	private int alto;
	private int area;
	private int perimetro;
	//private String es_cuadrado;
	
	//2) Constructor
	public Rectangulo(int ancho, int alto) {
		super();
		this.ancho=ancho;
		this.alto=alto;
		
		if(ancho==alto) {
			System.out.println("Es cuadrado");
		}
	}
	
	//3) Metodos Setters y Getters
	
	/*public void esCuadrado() {
	
	}
	
	public String obtenerDimension() {
		
		return es_cuadrado;
	}*/
	
	public int obtenerArea() {
		area=(ancho*alto);
		
		return area;
	}
	
	public int obtenerPermitero() {
		perimetro=((ancho+alto)*2);
		
		return perimetro;
	}
	
	//Si ancho y largo son iguales, decir es cuadrado, si no, nada

}
