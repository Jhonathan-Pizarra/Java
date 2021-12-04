package Poo;

import java.util.*;

public class Hombres extends Personas {
	
	//1) Atributos
	private String nombre;
	private String apellido;
	//private String ID;
	private Date fecha_nacimiento;
	private String tipo_empleo;
	private int anios_servicio;
	private double sueldo_promedio;
	private int edad_hombre;
	private double calculo_jubilacion;
	//private double jubilacion;
	
	//2) Metodo Cosntructor
	public Hombres(String nombre, String apellido, String tipo_empleo, double sueldo_promedio ){
		this.nombre=nombre;
		this.apellido=apellido;
		//this.ID=ID;
		
		if(tipo_empleo=="Publico") {
			this.tipo_empleo=tipo_empleo;
			this.sueldo_promedio=(sueldo_promedio+0);
		}else if(tipo_empleo=="Privado") {
			this.tipo_empleo=tipo_empleo;
			this.sueldo_promedio=(sueldo_promedio+300);
		}
		
		
	}
	
	//3) Getters y Setters
	/*public void SetFecha_Ingreso(int year, int month, int day) {
		GregorianCalendar calendario=new GregorianCalendar(year, month-1, day);
		fecha_nacimiento=calendario.getTime();
		
	}*/
	
	//4) Getters
	public String GetNombre() {
		
		return nombre;
	}
	public String GetApellido() {
		
		return apellido;
	}

	public Date GetFecha_Nacimiento(int year, int month, int day) {
		GregorianCalendar calendario=new GregorianCalendar(year, month-1, day);
		fecha_nacimiento=calendario.getTime();	
		edad_hombre= (2018-year);
		return fecha_nacimiento;
	}

	public String GetTipo_Empleo() {
	
	return tipo_empleo;
	}
	
	public int GetAnios_Servicio(int anios_servicio) {
		
		if(anios_servicio >= edad_hombre) {
			System.out.println("No puede ser esto posible");
			
		}else if(anios_servicio < edad_hombre) {
			anios_servicio=(anios_servicio-edad_hombre);
			System.out.println("A�os de servicio: "+anios_servicio);
		}
		
		return 0;
	}
	public double GetSueldo_Promedio() {
		
		return sueldo_promedio;
	}
	public int GetEdad_Hombre() {
		
		return edad_hombre;
	}
	public String GetID(String ID_valido) {
		//ID_valido ="1725358525";
		
		if(ID_valido.length()== 10) {
			System.out.print("ID: "+ ID_valido);
		}else {
			System.out.print("ID no valido");
		}
		
		return " ";
	}
	
	public double GetCalculo_Jubilacion() {
		
		calculo_jubilacion=((sueldo_promedio*anios_servicio)/30)*(20/100);
		
		return calculo_jubilacion;
	}
	
	
	
	
}
