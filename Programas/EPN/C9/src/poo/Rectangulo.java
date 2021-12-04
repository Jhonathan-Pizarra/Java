package poo;

public class Rectangulo extends Figura {
	
	//1) Atributos
	private int ancho;
	private int largo;
	
	public Rectangulo(int ancho, int largo) {
		this.ancho=ancho;
		this.largo=largo;
	
		if(ancho==largo) {
			System.out.println("Es un cuadrado");
		}
	}
	
	public int GetArea() {
		
		return ((ancho)*(largo));	
	}
	public int GetPerimetro() {
		
		return (2*(ancho)+(2*(largo)));
	}
	

	
	
	
	

}
