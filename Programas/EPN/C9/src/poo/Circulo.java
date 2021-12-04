package poo;

public class Circulo extends Figura {
	
	private int radio;
	
	
	public Circulo(int radio) {
		
		this.radio=radio;
		
	}
	
	public int GetArea() {
		
		return (int) (Math.PI*radio*radio);
		
	}
	
	public int GetPerimetro() {
		
		return (int) (Math.PI*radio*2);
	}
}
