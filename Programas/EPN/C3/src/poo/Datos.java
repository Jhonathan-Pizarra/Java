/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* Uso de setter para que nos pida de un estudiante: Nombre, Apellido, año de nacimiento  y a travez del getter nos de el nombre completo ,y la edad*/
//Pasar  por parámetros los atributos comunes, y por medio de setters los atributos especificos
package poo;
public class Datos {
	
	//1) Atributos comunes
	private String facultad;
	private String universidad;
	
	//4) Atributos especificos
	private String nombre;
	private String apellido;
	private int año_nacimiento;
	private int dia_nacimiento;
	private int mes_nacimiento;
	
	//2) Método contructor (De hecho podríamos mandar todos los atrubutos tanto comunes como especificos por el metodo constructor)
	public Datos(String facultad, String universidad) {
		this.facultad=facultad;
		this.universidad=universidad;
	}
	//3) GETTERS
	public String GetFacultad(){
		
		return facultad;
	}
	public String GetUniversidad(){
		
		return universidad;
	}
	
	
	//3) GETTERS Y SETTERS
	//SETTERS
	//Set Nombre
	public void SetNombre(String nombre) {
		this.nombre=nombre;
	}
	//Set Apellido
	public void SetApellido(String apellido) {
		this.apellido=apellido;
		
	}
	//Set Mes
	public void SetMes(int mes_nacimiento) {
		this.mes_nacimiento=mes_nacimiento;
		
	}
	//Set Año
	public void SetAño(int año_nacimiento) {
		this.año_nacimiento=año_nacimiento;
		
	}
	//Set Dia
	public void SetDia(int dia_nacimiento) {
		this.dia_nacimiento=dia_nacimiento;
		
	}
	
	//GETTERS
	public String GetNombre() {
		
		return nombre;
	}
	public String GetApellido() {
		
		return apellido;
	}
	public int GetMes() {
		
		return mes_nacimiento;
	}
	public int GetDia() {
		
		return dia_nacimiento;
	}
	public int GetAño() {
		
		return año_nacimiento;
	}
	
	

}
