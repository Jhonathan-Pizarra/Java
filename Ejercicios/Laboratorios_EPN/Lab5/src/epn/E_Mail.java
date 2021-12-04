import javax.swing.*;
public class E_Mail {

	public static void main(String[] args) {
		/*Hacer un casillero de usuario pedir que ingrese nuestro mail
		 * Luego, validar si el correo es valido
		 * El correo es valido si tiene una arroba, 
		//Nos debe mostrar si es un email valido, o email no valido*/
		
		String correo=JOptionPane.showInputDialog("Ingresa tu correo: ");
		boolean estado=false;
		
		for(int i=0; i<correo.length(); i++) {//Lenght contabiliza las letras que componen una cadena. En este caso esamos diciendo que si i es menor que n letras de la cadena donde n es un numero entero
			//Ahora evaluaremos dentro del bucle, si el correo tiene lo necesario para ser valido
			if(correo.charAt(i)=='@') {
				estado=true;
			} //CharAt evalua de entre una cadena de caracteres un caracter especifico
			
		}
		if(estado==true) {
			System.out.println("Correo válido");
		}else {
			System.out.println("Correo no váldio");

		}

	}

}
//¿Por qué usamos bool?, porque nos pide evaluar primero para dos casos, uno donde es verdad, y otro donde es falso
//¿Por qué  pusimos el lenght y no , por ejemplo <3? porque, en el bucle no estamos evaluando las veces que se va a repetirn un evento,
// sino que ese 3 estableceria el tamaño de la cadena, aun si pusiera bien el correo, me daria correo no valido
