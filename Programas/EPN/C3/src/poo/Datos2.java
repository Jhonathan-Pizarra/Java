/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;


public class Datos2 {
	//Caracteristicas comunes
		private String curso;
		private String facutad;
		
		
		//Caracterisitcas propias
		private String nombre; //lo encapsulamos...
		private String apellido;
		private int año_nacimiento;
		
		//NO ES NECESARIO DEFINIR UN METODO CONTRUCTOR SI SE QUIERE PASAR CADA COSA POR COSA PRO PARAMETROS
		//Pero esto no es muy recomendable,produciría un dódigo spaguetti

		//Metodo Getter : Drfiniremos propiedades genereales de los objetos
		public String obtener_nombre() {
			return "Estudiante: "+ nombre;
		}
		
		public String obtener_apellido() {
			return "Apellido: "+ apellido;
		}
		
		public String obtener_año_nacimiento() {
			return "Año de nacimiento: "+ año_nacimiento;
		}
		
		//Metodo setter: Definiremos los atrubots especificos
		public void definir_nombre(String nombre_est) {
			nombre=nombre_est;
		}
		
		public void definir_apellido(String apellido_est) {
			apellido=apellido_est;
		
		}
		
		public void definir_año_nacimiento(int año_nacimiento) {
			this.año_nacimiento=año_nacimiento;
		
		}
}
