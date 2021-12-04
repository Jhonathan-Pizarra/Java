import java.util.*; //Imprtamos este para hacer uso de Scanner

public class Entrada_Scanner {

	public static void main(String[] args) {
		//Entrada de datos:
		//Sintaxis
		//Nombre de la clase + Nombre del objeto = Palabra reservada (New) + Tipo
		Scanner entrada= new Scanner (System.in);
		
		System.out.print("Ingresa tu nombre: ");
		String nombre;
		nombre= entrada.next(); //Aqui le estamos diciendo que esta variable "nombre" (Que es del tipo cadena)
										// tendrá como entrada unca la siguiente escritura que se le haga
		System.out.println("Hola "+ nombre);
		
		System.out.println(" ");
		
		System.out.print("Ahora ingresa tu edad: ");
		int edad;
		edad= entrada.nextInt();
		System.out.println("Tu edad es: "+ edad);
	}

}
/* Podemos crear varios objetos con una sola entrada, basta con que las variavles sean diferentes
 Y si se quere, también, el tipo de dato

Otra cosa que cabe recalcar es la diferencia entre print y println 
El primero dice que escribas ahí mismo: 
Y el otro que escribas en la siguiente linea. */

//Lo que hemos hecho detrás de todo esto, es crear un objeto.... Ver la siguiente JOptionPane, date cuenta
// De que al momento de estar en el .showImput, se despliegan las ociones , una duce (Objetc message);
//Esto indica y reafirma la teoría, etamos creando un objeto