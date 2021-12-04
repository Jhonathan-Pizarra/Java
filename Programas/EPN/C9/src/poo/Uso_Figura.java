package poo;

public class Uso_Figura {

	public static void main(String[] args) {
		
		Circulo figura_a=new Circulo(3);
		
		System.out.println("Area-Circulo: "+figura_a.GetArea());
		System.out.println("Perimetro-Circulo: "+figura_a.GetPerimetro());
		System.out.println("................");
		
		Triangulo figura_b=new Triangulo(2, 2);
		System.out.println("Area-Triangulo: "+figura_b.GetArea());
		System.out.println("Perimetro-Triangulo: "+figura_b.GetPerimetro());
		System.out.println("................");

		
		Rectangulo figura_c=new Rectangulo(2, 2);
		System.out.println("Area-Rectangulo: "+figura_c.GetArea());
		System.out.println("Perimetro-Rectangulo: "+figura_c.GetPerimetro());
		
		
	}

}
