//HERENCIA
package poo;

public class Bus extends Vehiculo{

	//1) Atributos
		private int velocidad_maxima;
		private int capacidad_pasajeros;
		
		//2) Meotod Contructre
		public Bus(int velocidad_maxima, int capacidad_pasajeros, String copilotos) {
			super(copilotos);
			this.velocidad_maxima=velocidad_maxima;
			this.capacidad_pasajeros=capacidad_pasajeros;	
		}
		
		//3) Meotodos Setters y Getters
		//Setters
		//Getters
		//Getter velocidad
		public int GetVelocidad() {
			
			return velocidad_maxima;
		}
		
		//Getter Capacidad
		public int GetCpacidad() {
			
			return capacidad_pasajeros;
		}
		
		public String GetCopilotos(String copilotos) {
			
			return copilotos;
		}
}
