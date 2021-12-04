package poo;
import java.util.*;
public class Policia {
	//1) Atributs
	private double sueldo;
	private String nombre;
	private Date fecha_ingreso;
	
	//2)Metodo constrcutor
	//Sobrecarga de constuctores
	public Policia() {
		sueldo=300;
		nombre="Jorge";
				
		
	}
	
	public Policia(String nombre, double sueldo) {
		this.nombre=nombre;
		this.sueldo=sueldo;
		
	}
	
	public Policia(String nombre) {
		//this(nombre, 200); //Esto �C�mo funciona? Si ves que arriba el metodo tiene los atributos nombre y sueldo? bueno yo puedo
		// definir un metodo constructor que pase al menos uno de esos parametros, y los demas yo le defino aui mismo...
		// ojo, que esto solo leera al contructor de arriba... �MENTIRA! si hubiera otro contructor, con m�s atributos y aqui tambi�n le pusiera esos atributos, entonces asimilaria los de ese contucotr asi:
	
		this(nombre,200, 1990, 12, 11);
	}
	
	public Policia(String nombre, double sueldo, int year, int month, int day) {
		this.nombre=nombre;
		this.sueldo=sueldo;
		
		GregorianCalendar calendario=new GregorianCalendar(year,  month-1, day);
		fecha_ingreso=calendario.getTime();
	}
	
	
	
	public void SetCalendario(int year, int month, int day) {
		GregorianCalendar calendario=new GregorianCalendar(year,  month-1, day);
		fecha_ingreso=calendario.getTime();
	}
	
	public Date GetCalendario() {
		
		return fecha_ingreso;
	}
	
	public double GetSueldo() {
		
		return sueldo;
	}
	
	public String GetNombre() {
		
		return nombre;
	}
	
	//SI QUISIERA AGREGARLE UN AUMENTO AL SUELDO
	//nO ES necesario que defina un nuevo atributo, sino que modifique el que ya tengo..
	public void SetAumento() {
		double sueldo_aumnetado=sueldo+((sueldo/100)*50);
	
		sueldo=sueldo_aumnetado;
	}
}
