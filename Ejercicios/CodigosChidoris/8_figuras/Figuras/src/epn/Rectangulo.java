package epn;
public class Rectangulo extends Poligono {

	//1) Atributos
	private double lado1;
	private double lado2;
	private double area;
	
	//2) M�todo Constructor
	public Rectangulo(double lado_a, double lado_b, int numLados) {
		super(numLados);
		this.lado1=lado_b;
		this.lado2=lado_a;
		
	}
	
	//3) Metodos Setters y Getters
	
	//Getter Area
	public double GetArea() {
		area=(lado1*lado2);
		return area;
	}
	
	
}
