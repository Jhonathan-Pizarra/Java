package poo;

public class Triangulo extends Figura {

	private int lados_base;
	private int lados_altura;
	//private int perimetro;
	
	public Triangulo(int lados_base, int lados_altura){
		this.lados_base=lados_base;
		this.lados_altura=lados_altura;
		
	}
	
	public int GetArea() {
		
		return ((lados_base*lados_altura)/2);
		
	}
	
	public int GetPerimetro() {
		
		return (lados_base*3);//si fuera un triangulo equilatero... 
		
	}
	
	
	
}
