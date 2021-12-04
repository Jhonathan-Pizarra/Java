package Poo;
import javax.swing.JOptionPane;
import java.util.*;

public class Uso_Estudiantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1) Crear un objeto
		Estudiante alumno_1=new Estudiante(1725358525, 2018, 02, 01);
		
		//2) Paso por teclado
		/*Scanner entrada=new Scanner(System.in);
		 * System.out.println("Ingrese un nombre: ");
		String nombre=entrada.nextLine();
		O así...*/
		
		String nombre=JOptionPane.showInputDialog("Nombre: ");
		alumno_1.SetNombre(nombre);
		System.out.println(alumno_1.GetNombre());	
	}
	
}
