package poo;
import java.util.*;
public class Uso_Estudiantes {

	public static void main(String[] args) {

		Estudiante [] estudiante = new Estudiante[2];
		
		estudiante[0]=new Estudiante(24);
		estudiante[1]=new Estudiante(19);
		
		
		for(int i=0; i<2; i++) {
			Scanner entrada=new Scanner (System.in);
			System.out.print("Ingresa el nombre: ");
			String nombre;
			nombre=entrada.nextLine();
			
			estudiante[i].SetNombre(nombre);
			
		}
		
		for(int i=0; i<2; i++) {
			System.out.println("Edad: "+estudiante[i].GetEdad());
			System.out.println("Nombre: "+estudiante[i].GetNombre());
			System.out.println("ID "+estudiante[i].GetID());
			System.out.println(".......");
			
		}
		
		Presidente_Clase[] presidente=new Presidente_Clase[2];
		//Los atributos del construcotr
		presidente[0] = new Presidente_Clase(12, "Quito");
		presidente[1] = new Presidente_Clase(18, "Guayaquil");
		
		for(int i=0; i<presidente.length; i++) {
			Scanner entrada=new Scanner (System.in);
			System.out.print("Ingresa el nombre DEL PRESIDENTE: ");
			String nombre;
			nombre=entrada.nextLine();
			
			presidente[i].SetNombre(nombre);//Esto se heredo de estudiante
			presidente[i].SetPuntos(20); //Esto es propio de presidente del curso
						
		}
		
		for(int i=0; i<2; i++) {
			System.out.println("Edad: "+presidente[i].GetEdad());
			System.out.println("Nombre: "+presidente[i].GetNombre());
			System.out.println("ID "+presidente[i].GetID());
			System.out.println("Puntos Extra: "+presidente[i].Getpuntos());
			System.out.println(".......");
			
		}
		
	}

}
