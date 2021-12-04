import javax.swing.*; //Este es en cabio para el JOptionPane

public class Entrada_JOption {

	public static void main(String[] args) {
		// Entrada de datos (Por medio de JOption)
		//Sintaxis:
		////Tipo de dato + Nombre del objeto = JOpionPane.shortImputDialog(Mensjae por consola)
		String nombre=JOptionPane.showInputDialog("Ingresa tu nombre: ");
		System.out.println("Hola, "+nombre);
		
		System.out.println(" ");
	//	int edad=JOptionPane.showInputDialog("Ingresa tu edad: ");
		/*Algo esta mal... Edad, le puse como tipo de dato int, pero el JOption solo funciona con tipos de dato String
		lo que significa que, debo cambiar el tipo de dato edad de int a Strig*/
		String edad=JOptionPane.showInputDialog("Ingresa tu edad: ");
	  //System.out.println("Hola, "+edad);
		//¿Pero que pasa si el usuario ingresa edad: dieciocho?,¿Cómo puedo hacer para que solo hacepte numeros?
		
		//Facil..//Cambiar un tipo de dato de tipo strig a tipo Integer!!,
		// buscamos el metodo parseInt (COje un string como argumento y nos devuelve un entero)
		//Sintaxis:
		//Tipo de dato + nombre del objeto= Integer.parse(Lo que neceistes) y (Argumento)
		int edad_int=Integer.parseInt(edad);
		System.out.println("Tu edad es: "+ edad_int);
	}

}
