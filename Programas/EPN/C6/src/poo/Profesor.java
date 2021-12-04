package poo;
import java.util.*;

public class Profesor {
	//1) Atributos generales
			private String nombre;
			private int sueldo;
			private Date fecha_ingreso;
			
			//2) M�todo Constrcutor a
			public Profesor(String nombre, int sueldo){
				this.nombre=nombre;
				this.sueldo=sueldo;
					
			}
			//2) M�todo contrcutor b
			public Profesor(String nombre, int sueldo, int year, int month, int day){
				this.nombre=nombre;
				this.sueldo=sueldo;
				
				GregorianCalendar calendario=new GregorianCalendar(year, month-1, day);
				fecha_ingreso=calendario.getTime();
				
			}
			//2.1) SOBRECARGA DE CONSTRUCTORES
			public Profesor(String nombre) { //Metodo constructor c
				this( nombre, 200, 30,12,10);//Este this, lo que hace es
				//Toma el parametro que le mandemos, el de nombre y los demas ya los define asi como estan..200.30.12.. Esto es utli cuando 
				//Al momento de crear nuestro objeto, no desseemos ponerle tantos parametros, sino que ya vengan establecidos
				//Pero no es muy recomendable si queremos otros objetos con otros valores (O tal vez para herencia)
			}
			
			
			//METODS SETTER Y GETTERS
			public String GetNombre() {
				
				return nombre;
			}
			
			public int GetSueldo() {
				
				return sueldo;
			}
			public Date FechaIngreso() {
				
				return fecha_ingreso;
			}
			
			
			public void SetSueldo(double porcentaje) {
				double aumento=(sueldo*(porcentaje/100));
				sueldo=(int) (sueldo+aumento);
				
			}
	
	
}
