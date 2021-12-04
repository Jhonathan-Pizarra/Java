import javax.swing.JOptionPane;

public class Matematica_Usuario2 {

	public static void main(String[] args) {
		// El usuario ingresa los numeros a=? y b=? Por medio de JOptionPane
		//Realizar..:
				//Resta
				//Multiplicacion
				//Valor absoluto de b
				//Potenciacion
				//Hipotenusa
				//Tangegte de b
				//Transformar a radianes a
				//Transformar a decimales b
		
		String cadena_a=JOptionPane.showInputDialog("Ingresa un numero para a: ");
		String cadena_b=JOptionPane.showInputDialog("Ingresa un numero para b: ");
		
		/*int a=Integer.parseInt(cadena_a);
		int b=Integer.parseInt(cadena_b); */
		double a=Double.parseDouble(cadena_a);
		double b=Double.parseDouble(cadena_b);
		/*Y si quiesieras un dato double:
		 * float a=Float.parseFloat(argumnto)
		 * Algo que tambien, es de reclcar es que no puedes usar el mismo para dos o mas datos, debes crear diferentes JOptions para las diferentes variables que tengas
		 */
		
		//OPERACIONES
		int resta;
		resta=(int)(a-b);
		System.out.println("Resta: "+resta);
		
		double multiplicacion;
		multiplicacion=(a*b);
		System.out.println("Multiplicacion: "+multiplicacion);
		
		
		float division;
		division=(float)(a/b);
		System.out.println("Division: "+division);
		//Mismo error... ya que int a=Integer... dice que es un tipo de dato entero, el resultado de la divison, no se mostrará como double
		//A pesar de que pude transformar de cadena a entero, ahora me es necesario 
		//convertir ese entero a double solo así podre usarlos en la division.
		
		int absoluto;
		absoluto=(int)Math.abs(b);
		System.out.println("Valor absouluto: "+absoluto);
		
		double raiz;
		raiz=Math.sqrt(a);
		System.out.println("Raíz de a: "+raiz);
		
		float hipotensa;
		hipotensa=(float)Math.hypot(a, b);
		System.out.println("La hipotenusa es: "+hipotensa);

			//TRUNCAR EL RESULTADO: Es el arte de reducir los decimales a nuestro gusto
		//SIntaxis:
		System.out.printf("%1.3f", hipotensa); //Cabe señalar que no se puede usar el println
		//Sino se debe usar el pirnt f, "el que imprune los decimales".
		System.out.println("");
		//Ahora, ajustemos
		System.out.printf("El resultado trucndaso es: "+ "%1.3f", hipotensa);
		
	}

}
