package Poo;

public class Teniente extends Policia{
	///Atributos
		private double incentivo;
		
		//2) Contructor
		
		public Teniente(String nombre, double sueldo, int year, int month, int day) { 
		super(nombre, sueldo, year, month, day);
		
		
		}
		
		//Stter
		public void SetIncentvo(double incentivo) {
			this.incentivo=incentivo;
		}
		
		//EL suelo del decano ya esta es el del profesor, lo esta heredando, pero no contempla el incentivo
		public double GetSueldo() {
			double sueldoDecano= super.GetSueldo(); //ENtonces, ya heredo el sueldo 
			return sueldoDecano+incentivo; //SUeldo no esta definido aqui, sino en profesor entonces, necesitamos guardar ese valor del sueldo .... 
		}
		
		//Triangulito negro, dice que si bien lo hereda de su superclase, este esta definido de manera diferente para esta clase.

			
}
