package epn;

public class Triangulo extends Poligono{
	//1) Atributos
	
	private double lado1;
	private double lado2;
	private double lado3=2;
	private double area;
	
	//2) M�todo Constructor
	public Triangulo(double base, double altura,  int numLados) {
		super(numLados);
		
		this.lado1=base;
		this.lado2=altura;
		
	}
	
	//3) Metodos Setters y Getters
	
	//Getter Area
	public double GetArea() {
		area=((lado1*lado2)/lado3);
		return area;
	}
	
}
