import javax.swing.JOptionPane;

public class ContraseniaYCorreo {

	public static void main(String[] args) {
		// El programa consiste en que el usuario ingresa un correo v�ldio
		//El correo es valido si tiene una arroaba y al meno sun punto
		//Luego, si el correo es valido, le solicita una contrase�a
		//Si la contrase�a es correcta, se imprime: "Acceso concedido"
		//De lo contrario, "Vuleva a introducir su contrase�a"
		//Tdoo esto , a traves de JOptionPane..
		
		//Parte 1) Validar el correo
		String correo=JOptionPane.showInputDialog("Ingrese su correo: ");
		boolean estado_correo=false;
		int contador_arrobas=0;
		boolean estado_puntos=false;
		
		for(int i=0; i<correo.length(); i++) {
			if(correo.charAt(i)=='@') {
				estado_correo=true;
				contador_arrobas++;
			}
			if(correo.charAt(i)=='.') {
				estado_puntos=true;
			}
		}
		//Evaluar la validacion
		//Estableces la contrase�a para cando ya sea valido
		String contrasenia="Jhonathan";
		String estado_contrasenia="";
		
		if(estado_correo==true && contador_arrobas==1 && estado_puntos==true) {
			System.out.println("Correo valido");
			do{
			estado_contrasenia=JOptionPane.showInputDialog("Ingresa la contrasenia: ");
			
			if(estado_contrasenia.equals(contrasenia)) {
				System.out.println("Acceso concedido!");
				
			}else {
				estado_contrasenia=JOptionPane.showInputDialog("Vuelva a ingresar la contrasenia: ");
			}
			
			}while(!estado_contrasenia.equals(contrasenia));
			
		}else {
			System.out.println("Correo no valido");
		}

	}

}
