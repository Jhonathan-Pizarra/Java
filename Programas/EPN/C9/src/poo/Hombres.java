//Normalmente dar�a la impresion de que hombres y mujeres heredarian tooodos los atributos de una persona
//Asi como el nombre, la edad, etc...
/*Pero en abstracion no funciona as�
 * Cada clase tiene sus propios metodos, y "algunas tienen nombres parecdios
 * pero comportamientos diferentes" como ser�a el calculo del suelo
 * a esas clases que a pesar de llamarse igual se comportan diferente les tenemos que hacer
 * ABSTRACCION
 * Si bien, el polimorfismo es la manera en como se comporta un objeto (Que es a su vez una subclase de una clase encapsulada)
 * la abstracci�n se refiere a la manera en como se comportan dos (o mas objetos) que no son encapsulados entre si, pero si lo son de alguna otra clase superior (A la que hay que hacer abstraccion para que me permita acceder al comportamiento verdadero de mi objeto) */
package poo;
import java.util.*;
public class Hombres extends Persona{

	private String nombre;
	private int edad;
	//private String ID;
	private Date fecha_nacimiento;
	private int anios_servicio;
	private double sueldo_promedio;
	private String tipo_empleo;
	
	//Esta va a ser abstracta
	private double calculo_jubilacion;
	
	public Hombres(String nombre, int year, int month, int day, double sueldo_promedio, String tipo_empleo) {

		this.nombre=nombre;		
		GregorianCalendar calendario=new GregorianCalendar(year, month-1, day);
		edad=(2018-year);
		fecha_nacimiento=calendario.getTime();
		this.sueldo_promedio=sueldo_promedio;
		this.tipo_empleo=tipo_empleo;
	
	}
	
	//SETTERS Y GETTERS
	public String GetNombre() {
		
		return nombre;
	}
	public Date GetFechaNacimiento() {
		
		return fecha_nacimiento;
	}
	
	/*public String GetID() {
			
			return ID;
	}*/
	public double GetSueldo_Promedio() {
		
		return sueldo_promedio;
	}
	public int GetEdad() {
			
			return edad;
		}
	public int GetAnios_Servicio() {
		
		return anios_servicio;
	}
	
	//SETTER
	public void SetAnios_Servicio(int anios_servicio) {
		
		if(anios_servicio >= edad) {
			System.out.println("No puede ser esto posible");
		}else {
			this.anios_servicio=anios_servicio;
		}
		
		
	}
		public void SetID(String ID) {
			if(ID.length()==10) {
				System.out.println("ID valido: "+ID);
			}else {
				System.out.println("ID no v�lido");
			}
		}
	
		public void SetCalculo() {
			if(tipo_empleo=="Privado") {
				
				sueldo_promedio=sueldo_promedio+300;

			}else if (tipo_empleo=="P�blico") {
				
				sueldo_promedio=sueldo_promedio+0;

			}
			
			if(edad>=65) {
				System.out.println("Usted ya puede Jubilarse...");
				
				calculo_jubilacion=(((sueldo_promedio*anios_servicio)/30)*(0.2));	

			}else {
				System.out.println("Usted no puede jubilarse a�n");
			}
			

		}
		
		public double GetCalculo() {
			

			return calculo_jubilacion;	
		}
	
	
}
