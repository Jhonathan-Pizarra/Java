package Poo;

/* final */ public class Decano extends Profesor { //Para que ya nadie pueda heredar a partir de esta clase
	///Atributos
	private double incentivo;
	
	//2) Contructor
	
	public Decano(String nombre, double sueldo, int year, int month, int day) { 
		//Si yo creo un objto de tipo decano, el cual tenga sueldo, mes, año dia,. Hace referencia al metodo Profesor
		//Para generer ese viculo usamos: extends
		
		//Luego salda un error, diceniendo que estos parametros ya estan en la clase padre". ENtonces, usamos la palabra super
	super(nombre, sueldo, year, month, day); //Le pasamos los parametros para de este contructor
	}
	
	//Stter
	public void establecerIncentvo(double incentivo) {
		this.incentivo=incentivo;
	}
	
	//EL suelo del decano ya esta es el del profesor, lo esta heredando, pero no contempla el incentivo
	public double obtenerSueldo() {
		double sueldoDecano= super.obtenerSueldo(); //ENtonces, ya heredo el sueldo 
		return sueldoDecano+incentivo; //SUeldo no esta definido aqui, sino en profesor entonces, necesitamos guardar ese valor del sueldo .... 
	}
		
	//Triangulito negro, dice que si bien lo hereda de su superclase, este esta definido de manera diferente para esta clase.
		
}
