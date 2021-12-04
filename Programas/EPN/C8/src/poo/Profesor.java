package Poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Profesor {
	//1) Atributos
		private String nombre;
		private double sueldo;
		private Date fecha_ingreso;
		
		//2) Constructor
		public Profesor(String nom, double suel, int year, int month, int day) {
		
			nombre=nom;
			sueldo=suel;
			GregorianCalendar calendario=new GregorianCalendar(year, month-1, day);
			fecha_ingreso=calendario.getTime();
			
		}
		
		
		//4) COnstructores
		public Profesor(String nom) {
			this(nom, 300, 2010,1,2); //Pasa el resto de los atributos de esta manera, excepto nom, ese te lo pedir
			
		}

		//3) Getters
		
		
		public String obtenerNombre() {
			return nombre;
		}
		/*final*/ public double obtenerSueldo() { //EL RATO QUE YO PONGO el final en el metodo, la persona que herda mis metodos, ya no podra sobreescribir mis metodos..Entonces el metodo de obtener sueldo de profesor ya no seria lo mismo que el metodo objetern sueldo para el decano . YA NO PUEDE SOBREESCRIBIR 
			return sueldo;
		}
		public Date obtenerFechaIngreso() {
			return fecha_ingreso;
		}
		
		//4) Setter
		public void subierSueldo(double porcentaje) {
			double aumento=(sueldo*porcentaje/100);
			sueldo=sueldo+aumento;
		}
	}

	//Circulo rojo, son atriburos,
	//Los verdes son metodos (Seeters o Geetters)
	//LOs verdes con c, son metodos contructores
	//Aqui obtener sueldo, no tiene nada, pero en Decano, obtener sueldo tieen un triangulo, eso significa que esta heredadno de aqui el sueldo hacia decano