package poo;

public class Autobus extends Vehiculo {

		//3) Atributos Especificos
		private int velocidad_maxima;
		private int capacidad_pasajeros;
		
		//2) Meotod Contructre
		public Autobus(int ruedas, int largo, int ancho /*,int velocidad_m�xima*/) { //Deben de esdcribirse los parametros del metodo padre, constructor del que quedramos heredar, (E igual en el super)
			//Esto le dar� en estado incial a nuestro autobus, y a parte le podremos poner los atributos especificos
			//1) Aqui ser�a los atributos generales
			super(ruedas, largo, ancho);
			//Tambien podriamos poner otro parametro, que existiria solo en esta clase para este objeto
			//this.velocidad_m�xima= velocidad_m�xima;
		}
		//LO QUE HICIMOS FUE, heredamos las condiciones iniciales de nuestro Autobus, basado en veh�culo
		
		//Pero ahora, para los atributos especificos de mi Autobus, �C�mo lo hago?
		//4) METODOS SETTERS Y GETTERS
		//YA NO ES NECESARIO CREAR GETTERS PARA LOS ATRIBUTOS GENERALES, porque ya los hereda...
		public void SetVelocidadAuto_bus() {
			velocidad_maxima=100;
		}
		public void SetCapacidadAuto_bus() {
			capacidad_pasajeros=200;
		}
		//4.1) Getter de Settrs que no son heredados
		public int GetCapacidad_Autobus() {
			//capacidad_pasajeros=200; //Hacer esto ser�a un error, ya que es como si fuera un constrctor, dandole el mismo valor para cada objeto que se cree ... (Recuerda, elegir y escribir algun atributo para un objeto son cosas diferentes..., pero en amos usamos el setter)
			
			return capacidad_pasajeros;
		}
		
		public int GetVelocidad_Autobus() {
			
			return velocidad_maxima;
		}
		
		

}
