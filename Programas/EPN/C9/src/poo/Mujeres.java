package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Mujeres extends Persona{
	
	private String nombre;
	private String apellido;
	private int edad;
	private long ID;
	private Date fecha_nacimiento;
	private int anios_servicio;
	private double sueldo_promedio;
	
	//Esta va a ser abstracta
	private double calculo_jubilacion;

	public Mujeres(String nombre,int edad, int year, int month, int day,long ID, int anios_servicio,double sueldo_promedio) {
		this.nombre=nombre;	
		this.edad=edad;
		GregorianCalendar calendario=new GregorianCalendar(year, month-1, day);
		fecha_nacimiento=calendario.getTime();
		this.anios_servicio=anios_servicio;
		this.sueldo_promedio=sueldo_promedio;
		
		this.ID=ID;
		
	}
	
	//SETTERS Y GETTERS
	public String GetNombre() {
		
		return nombre;
	}
	public Date GetFechaNacimiento() {
		
		return fecha_nacimiento;
	}
	
	public double GetSueldo_Promedio() {
			
			return sueldo_promedio;
	}
		public int GetAnios_Servicio() {
			
			return anios_servicio;
	}
	
	public long GetID() {
			
			return ID;
	}
	
	//SETTER
	public void SetCalculo() {
		
		calculo_jubilacion=((sueldo_promedio*anios_servicio)/30)*(0.45);	
	}
	
	public double GetCalculo() {
		
		
		return calculo_jubilacion;	
	}
}
