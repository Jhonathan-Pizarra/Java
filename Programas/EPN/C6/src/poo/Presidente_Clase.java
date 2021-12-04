package poo;

public class Presidente_Clase extends Estudiante{
	
	//1) Atrivtos del presidente de la clse
	private String porta_estandarte; //Esa franja que llevan los presidentes
	private int puntos_extra; //Presidentes desarollan actividades especiales, por lo que tienen puntos extra
	
	public Presidente_Clase(int edad, String porta_estandarte){
		super(edad);
		this.porta_estandarte=porta_estandarte;
	}
	
	public void SetPuntos(int puntos) {
		this.puntos_extra=puntos;
	}
	
	public int Getpuntos() {
		
		return puntos_extra;
	}
	
}
