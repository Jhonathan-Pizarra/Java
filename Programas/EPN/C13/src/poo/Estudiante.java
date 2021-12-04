package Poo;
import java.util.*;
public class Estudiante {
	
	//1) Atributos Generales
	private String nombre;
	private long cedula;

	//2) Atributos Especificos
	private String carrera;
	private int semestre;//1-6
	private Date fecha_ingreso;
	private long numero_unico; //Deben ser numero aleatorios
	private byte numero_matricula;//1,2,3
	private boolean cambio_carrera;//Si o No
	private double valor_matricula;//500
	
	//3) Metodo Constructor
	public Estudiante(long cedula, int year, int month, int day) {
		this.cedula=cedula;
		GregorianCalendar calendario=new GregorianCalendar(year, month, day);
		fecha_ingreso=calendario.getTime();
			
	}

	//4) METODOS SETTER Y GETTER
	//------------SETTERS.................
	public void SetNumeroUnico() {
		numero_unico=(long) (Math.random()*100);
	}
	public void SetNombre(String nombre) { //Si yo quisiera ecoger un nombre, deberia hacer un swith case aqui, pero si lo quiero escribir, entonces hago esto..
		this.nombre=nombre;
	}
	public void SetSesmestre(int semestre) {
		if(semestre==1) {
			this.semestre=1;
		}else if(semestre==2) {
			this.semestre=2;
		}else if(semestre==3) {
			this.semestre=3;
		}
	}
	//.............GETTERS-------------
	//1) Getters: Atributos Generales
	public String GetNombre() {
		
		return nombre;
	}
	public long GetCedula() {
		
		return cedula;
	}

	//2) Getters: Atributos Especificos
	public String GetCarrera() {
		
		return carrera;
	}
	public int GetSemestre() {
		
		return semestre;
	}//1-6
	public Date GetFecha_Ingreso() {
		
		return fecha_ingreso;
	}
	public long GetNumero_Unico() {
		
		return numero_unico;
	} //Deben ser numero aleatorios
	public byte GetNumero_Matricula() {
		
		return numero_matricula;
	}//1,2,3
	public boolean GetCambio_Carrera() {
		
		return cambio_carrera;
	}//Si o No
	public double GetValor_Matricula() {
		
		return valor_matricula;
	}//500
	 
	
}
