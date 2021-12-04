package poo;

public class Vehiculo {
	
	//1) Atributos generales
	private int ruedas;
	private int largo;
	private int ancho;
	
	//3) Atributos especificos
	private int puertas;
	private String color;
	private String marca;
	
	//2) Metodo contructor
	public Vehiculo(int ruedas, int largo, int ancho) {
		this.ruedas=ruedas;
		this.largo=largo;
		this.ancho=ancho;
		
	}
	
	//4) METODOS SETTERS Y GETTERS
	//4.|) SETTERs
	//Set puertas
	public void SetPuertas() {
		puertas=2;
	}
	//Srt color
	public void SetColor() {
		color="Rojo";
	}
	//Sert marca
	public void SetMarca() {
		
	}
	//4.2) GERRETS
	//Get puertas
	public int GetPuertas() {
		
		return puertas;
	}
	//Get color
	public String GetColor() {
		
		return color;
	}
	//Get marca
	public String GetMarca() {
		
		return marca;
	}
	
	//Getters de atributos generales
	//Get Ruedas
	public int GetRuedas() {
		
		return ruedas;
	}
	public int GetAncho() {
		
		return ancho;
	}
	public int GetLargo() {
		
		return largo;
	}
	
}
