import javax.swing.JOptionPane;

public class E_Mail2 {

	public static void main(String[] args) {
		// Lo mismo que el programa anterior, pero ahora que si tiene dos o mas arrobas
		//Ya no me lo valide al correo
		
		String correo=JOptionPane.showInputDialog("Ingresa tu correo: ");
		boolean estado=false;
		int contador=0;
		
		for(int i=0; i<correo.length(); i++) {
			if(correo.charAt(i)=='@') {
				estado=true;
				contador++;
			}
		}
		if(estado==true && contador==1) {
			System.out.println("Correo válido");
		}else {
			System.out.println("Correo no valido");
		}

	}

}
