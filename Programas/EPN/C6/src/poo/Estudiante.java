//ESTE EJERCICIO ES uN RESUMEN...
package poo;

public class Estudiante {
	
	//1) Atributos
	private String nombre; //Este lo voy a setear
	private int edad; //Este le voy a dar estado inicial en el constructor
	private byte id; //Este es una variable que se ira modificando sola
	
	//2)Variable
	private static byte id_siguiente=1; //para la variable id...
	
	//3) Construvtor
	public Estudiante(int edad){
		this.edad=edad;
		id=id_siguiente;
		id_siguiente++;
	}
	
	//4) METOODS SETTER Y GETTER
	
	public void SetNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String GetNombre() {
		
		return nombre;
	}
	public int GetID() {
		
		return id;
	}
	
	public int GetEdad() {
		
		return edad;
	}
	
	

}
