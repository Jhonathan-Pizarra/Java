import javax.swing.JOptionPane;

public class E_Mail3 {

	public static void main(String[] args) {
		// Tal y como el anterior, pero ahora, que además de arrobas tenga por lo menos un punto

		String correo=JOptionPane.showInputDialog("Ingresa tu correo: ");
		boolean estado_arroba=false;
		int contador_arroba=0;
		boolean estado_punto=false;
		
		for(int i=0; i<correo.length(); i++) {
			
			if(correo.charAt(i)=='@') { //Si entre la cadaena hay un caracter @, hacer:
				estado_arroba=true;
				contador_arroba++;
			}
			
			if(correo.charAt(i)=='.') {
				estado_punto=true;
			}
		}
		if(estado_arroba==true && contador_arroba==1 && estado_punto==true) {
			System.out.println("Correo válido");
		}else {
			System.out.println("Correo no válido");
		}
	}

}
