package Poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Policia {
	
	//1) Atributos
			private String nombre;
			private double sueldo;
			private Date fecha_ingreso;
			
			//2) Constructor
			public Policia(String nombre, double sueldo, int year, int month, int day) {
			
				this.nombre=nombre;
				this.sueldo=sueldo;
				GregorianCalendar calendario=new GregorianCalendar(year, month-1, day);
				fecha_ingreso=calendario.getTime();
				
			}
			//3) Getters
			
			
			public String GetNombre() {
				return nombre;
			}
			public double GetSueldo() { //EL RATO QUE YO PONGO el final en el metodo, la persona que herda mis metodos, ya no podra sobreescribir mis metodos..Entonces el metodo de obtener sueldo de profesor ya no seria lo mismo que el metodo objetern sueldo para el decano . YA NO PUEDE SOBREESCRIBIR 
				return sueldo;
			}
			public Date GetFechaIngreso() {
				return fecha_ingreso;
			}
			
			//4) Setter
			public void SetSueldoAumentado(double porcentaje) {
				double aumento=(sueldo*porcentaje/100);
				sueldo=sueldo+aumento;
			}	
			
}


