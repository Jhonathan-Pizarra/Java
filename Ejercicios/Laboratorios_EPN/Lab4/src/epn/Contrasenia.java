import javax.swing.*;
public class Contrasenia {

	public static void main(String[] args) {
		//Hacer un programa que, cuando le ingreses la palabra Jhonathan, muestre: "Acceso concedido"

		String acceso = " ";
		String contrasenia="Jhonathan";
		
		while(acceso.equals(contrasenia)==false) { //Equals, compara una cadena con otra
			acceso=JOptionPane.showInputDialog("Ingrese la contrase?a: ");
			
			/*if(acceso.equals(contrase?a)==false) {
				System.out.println("Contrase?a Porfavor"); 
				}  // Esto lo hice para que , cuando aunque le ponga la contrase?a, ya no me salga lo que esta dentro del bucle 
			  //Prueba borrando desde el if.. y hasta el } ...para que veas de lo que hablo jaja
			*/
			
		}
		System.out.println("Acceso concedido");
		
	}
}

