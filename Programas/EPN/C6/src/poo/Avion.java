package poo;

public class Avion {


	//Atributos generales del avion
	private int alas;
	private int ruedas;
	private int ancho;
	private int largo;
	private int peso;
	private String color;

	//Metodo contructor
	public Avion(){
		alas=2;
		ruedas=10;
		largo=300;
		ancho=50;
		peso=40000;
	
	}

	//Metodos Setters
	public void SetColor(String color) {
		this.color=color;
		
	}

	//Dimensiones
	public String GetDimensiones() {
		return "El avion tiene las siguiente dimensiones: "+largo + " x "+ancho;
		
	}
	//Color
	public String GetColor() {
		return "La aeronave tiene es de color: "+color;
		
	}
	//Peso
	public String GetPeso() {
		return "El avion tiene el sigueinte peso: "+peso;
		
	}
	
	//Ruedas
	public String GetRuedas() {
		
		return "La aeronave tiene: "+ruedas +" ruedas";
			
	}

}
