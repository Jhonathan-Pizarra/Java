package Poo;

public class Uso_Figura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo figura_a=new Rectangulo(2, 2);
		
		System.out.println("Area: "+figura_a.obtenerArea());
		
		Triangulo figura_b=new Triangulo(2, 5, 6);
		System.out.println("Area Triganulo: "+figura_b.obtenerArea());

	}

}
