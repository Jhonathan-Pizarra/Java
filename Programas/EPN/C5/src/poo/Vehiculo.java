//HERENCIA
package Poo;

public class Vehiculo {
	
	//1) Atributos Generales
	private int peso;
	private int ruedas;
	private int largo;
	private int ancho;
	
	//3) Atributos específicos
	private int puertas;
	private String color;
	private String marca;
	private boolean seguro;
	private String copilotos;
	//2) Método Constructor
	public Vehiculo(String copilotos) {
		peso=2000;
		ruedas=4;
		largo=5;
		ancho=3;
	}
	
	//4) METODOS SETTERS Y GETTERS
	//................Setters.........
	//Setter puertas
	public void SetPuertas(int puertas) {
		this.puertas=puertas;
	}
	//Setter Color
	public void SetColor(String color) {
		this.color=color;
	}
	//Setter Marca
	public void SetMarca(String marca) {
		this.marca=marca;
	}
	//Setter Seguro
	public void SetSeguro(boolean seguro) {
		this.seguro=seguro;
	}
	//...................Getters..........
	//Getter puertas
	public int GetPuertas() {
		
		return puertas;
	}
	//Getter Color
	public String GetColor() {
		
		return color;
	}
	//Getter Marca
	public String GetMarca() {
		
		return marca;
	}
	//Getter Color
	public boolean GetSeguro() {
			
		return seguro;	
	}
	//Get Dimensiones
	public String GetDimensiones() {
		
		return "Las dimesiones son: "+largo+" x "+ancho;
	}
	//Get Peso
	public String obtenerPeso() {
	
		return "El peso del vehiculo: "+peso;
			
	}
	//Get Ruedas	
	public String obtenerRuedas() {
		
		return "El vehículo tiene: "+ruedas +" ruedas";
				
	}
	//Get Copilotos
	public String obtenerCopilotos() {
		
		return "Copiloto: "+copilotos;
	}
		
}
