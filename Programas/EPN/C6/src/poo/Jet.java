package poo;

public class Jet extends Avion { //Ahora si, puedo pasar el color (Atributo del padre) a esta clase (Clase hijo)
		//Atributos del Jet
		private int velocidad_maxima;
		private int pasajeros;
		
		//Constructor (Del Jet)
		public Jet(int velocidad , int pasajeros) {
			super(); //Dentro del contrutctor de la clase que va a heredar, osea Jet va a heredar de la clase avion sus mismos atributos
			//lo uque hace el super es pedir el metodo contructor al padre.
			//Siempre usar el super...
			
			//EN SESTE CASO VALIO SIN QUE usemos el super(), pero eso no es sino porque el padre no tiene paramtros... Asi que, si el padre tuviera al menos un par�metro, entoncessi deberiamos usar el super
			//HAGAMOS otro, el de Bus, para que se vea la diferencia.
			velocidad_maxima=velocidad;
			this.pasajeros=pasajeros;
		}
		
		public String GetVelociad() {
			return "La aeronave puede alcanzar una velocidad de: "+velocidad_maxima;
		}
		
		public String GetPasajeros() {
			return "La aeronave puede transportar: "+pasajeros;
		}

}
