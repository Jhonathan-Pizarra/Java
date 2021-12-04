package Poo;

public class Uso_Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Nombre: Jhonathan Pizarra");
		System.out.println(" ");
		
		System.out.println("Ejercicio en clase: #1");
		System.out.println(" ");
		Calculadora calculadora_1 =new Calculadora();
		
		System.out.println("Suma: "+calculadora_1.getsuma());
		System.out.println("Resta: "+calculadora_1.getresta());
		System.out.println("Multiplicacion: "+calculadora_1.getmultiplicacion());
		System.out.println("Division: "+calculadora_1.getdivision());
		System.out.println("Potenciacion: "+calculadora_1.getexponente());
		System.out.println(".........................................");
		
		Calculadora calculadora_2 =new Calculadora(2,3);

		System.out.println("Suma: "+calculadora_2.getsuma());
		System.out.println("Resta: "+calculadora_2.getresta());
		System.out.println("Multiplicacion: "+calculadora_2.getmultiplicacion());
		System.out.println("Division: "+calculadora_2.getdivision());
		System.out.println("Potenciacion: "+calculadora_2.getexponente());
		System.out.println(".........................................");
		
		Calculadora calculadora_3 =new Calculadora(4);

		System.out.println("Suma: "+calculadora_3.getsuma());
		System.out.println("Resta: "+calculadora_3.getresta());
		System.out.println("Multiplicacion: "+calculadora_3.getmultiplicacion());
		System.out.println("Division: "+calculadora_3.getdivision());
		System.out.println("Potenciacion: "+calculadora_3.getexponente());
		System.out.println(".........................................");
		

	}

}