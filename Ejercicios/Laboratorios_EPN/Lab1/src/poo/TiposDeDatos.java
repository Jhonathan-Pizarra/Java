
public class TiposDeDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Primitivos:
		//Enteros: int, byte, short, long 
		//Decimal: Simple: float
		//		   Doble: double
		//Caracteres: char
		//Booleanos: bool
		
		//VARIABLES:
		//Sintaxis: (Tipo de dato) + (nombre de la variable)
		int variable;
		
		//INICIALIZAR UNA VARIABLE
		byte variable_2=2; //Hasta un numero con 2 dígitos acepta este tipo de dato 
		int variable_2_1=1234567890; //Hasta un numero con 10 digitos
		short vaiable_2_2=12345; //Hasta un numero con 5 dígitos
		long variable_2_3=1234567890; //Tambien hasta un numero con 10 digitos
		//Nota:
		//No podemos usar long int, son dos tipos de datos diferentes... 
		System.out.println(variable_2_3);
		
		float variable_3=3;
		//¿Por qué no le podemos poner 3.4 por ejemplo?
			// Porque debemos hacerlo asi float variable_3=3.4F (ndicanto que es float)
		   //O f miniscula también es válido
		float variable_3_2=3.4F; //o f 
		double variable_4=4.0;
		char variable_5='A'; //Caracteres siempre entre comillas simples.
		
		//CONSTANTES
		final int VARIABLE_7=12;
		
		//OPERADORES
		/*Aritmeticos : +, - * , / 
		Logicos (O Blolleanos): > , <, <>, != , ==, &&, || .
		<> "Mayor o menor que"

		Incremento y decremteno: ++, --, +=, -=, 
								x++ es: x=x+1;
								x-- es: x=x-1;
								x+= es: a x, sumale 1, y asignale ese nuevo valor.
								//Es diferente, porque, por ejemplo
								 * en un bucle, puede realizar primero lo uno y despues lo otro
								 * y el resultado sería diretente...
		Concatenacion: + (Une caracteres o concatena palabras)*/
	
		
		
		//Tambien podemos cambiarle el valor d ela variable
		//Basta con volver a escribir la variable y asignarle el nuevo valor, así:
		variable_2_3=1;
		System.out.println(variable_2_3);
		
		//Veremos que primero se imprime el valor original, y luego, el nuevo valor que asignamos : 1.
		
		
	}

}
