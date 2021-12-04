package Poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Mujeres extends Personas{
	//1) Atributos
		private String nombre;
		private String apellido;
		private long ID;
		private Date fecha_nacimiento;
		private String tipo_empleo;
		private int anios_servicio;
		private double sueldo_promedio;
		private int edad_mujer;
		private double calculo_jubilacion;
		//private double jubilacion;
				
		//2) Metodo Cosntructor
		public Mujeres(String nombre, String apellido, long ID, int edad_mujer, String tipo_empleo, int anios_servicio, double sueldo_promedio, int year, int month, int day){
			this.nombre=nombre;
			this.apellido=apellido;
			GregorianCalendar calendario=new GregorianCalendar(year, month-1, day);
			fecha_nacimiento=calendario.getTime();	
			this.edad_mujer= (2018-year);
			this.ID=ID;
			if(tipo_empleo=="Publico") {
				this.tipo_empleo=tipo_empleo;
				this.sueldo_promedio=(sueldo_promedio+0);
			}else if(tipo_empleo=="Privado") {
				this.tipo_empleo=tipo_empleo;
				this.sueldo_promedio=(sueldo_promedio+300);
			}
			this.anios_servicio=anios_servicio;
			
		}
		
		//3) Getters y Setters
		
		public String GetNombre() {
			
			return nombre;
		}
		public String GetApellido() {
			
			return apellido;
		}

		public String GetTipo_Empleo() {
		
			return tipo_empleo;
		}
		public Date GetFecha_Nacimiento() {
			
			return fecha_nacimiento;
		}
	
		
		public double GetSueldo_Promedio() {
			
			return sueldo_promedio;
		}
		public int GetEdad_Mujer() {
			
			
			return edad_mujer;
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
		
				
		public int GetAnios_Servicio() {
			
			
			return anios_servicio;
		}
		
		public double GetCalculo_Jubilacion() {
			
			
			if(tipo_empleo=="Privado") {
				sueldo_promedio=sueldo_promedio+300;
				
			}else if(edad_mujer >=60) {
				System.out.println("Jubilacion: SI");
				calculo_jubilacion=((sueldo_promedio*anios_servicio)/30)*(45/100);

			}else if (edad_mujer <60) {
				System.out.println("No puede jubilarse todavia");
			}
			
			return calculo_jubilacion;
		}
		

}
