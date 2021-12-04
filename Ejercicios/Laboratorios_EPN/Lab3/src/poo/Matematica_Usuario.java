import java.util.*;
public class Matematica_Usuario {

	public static void main(String[] args) {
		// El usuario ingresa los numeros a=? y b=? Por medio de Scanner
		//Realizar..:
		//Suma
		//Division
		//Ra�z de b
		//Potenciacion
		//Hipotenusa
		//El mayor de los dos
		//El coseno de a
		//El seno de b
		//Transformar a radianes a
		//Transformar a decimales b
		
		Scanner entrada=new Scanner (System.in);
		System.out.print("Ingrese un numero a: ");
		double a;
		//a=entrada.nextInt();  Este no seria el ideal para la division.. 
		a=entrada.nextDouble(); //Tambi�n esto mal ,porque esto me dice que me retorna un resultado de entero...
		//Asi que lo correcto es cambiar el tipo de dato de a ! 
		
		System.out.print("Ingrese un numero b: ");
		double b;
		b=entrada.nextDouble();
		
		//Operaciones
		int suma;
		suma=(int) (a+b);
		System.out.println("La suma es: "+suma);
		
		double division;
		division=(a/b);
		System.out.println("La division es: "+division);
		//�QU� PASO? LO QUE PAS� ES QUE al momento de meter los dos numeros, estos son enteros, y si yo pido que me retorne un resultado double de dos enteros... no va a valer...
		//Por lo tanto, lo que debo hacer es convertir a double los parametros de entrada.
		
		float raiz;
		raiz=(float)Math.sqrt(b);
		System.out.println("La ra�z es: "+raiz);
		
		int potencia;
		potencia=(int) Math.pow(a, b);
		System.out.println("La potencia es: "+potencia);
		
		double hipotenusa;
		hipotenusa=Math.hypot(a, b);
		System.out.println("La hipotenusa es: "+hipotenusa);
		
		int mayor;
		mayor=(int)Math.max(a, b);
		System.out.println("El numero mayor ingresado es: "+mayor);
		
		float coseno;
		coseno=(float)Math.cos(a);
		System.out.println("El coseno de a: "+coseno); //Este rsultado es el de radianes

		float seno;
		seno=(float)Math.sin(b);
		System.out.println("El seno de b: "+seno);
		
		double radianes;
		radianes=Math.toRadians(a);
		System.out.println("a en radianes es: "+radianes);
		
		double grados;
		grados=Math.toDegrees(radianes);
		System.out.println("a en grados es: "+grados);
	}

}
