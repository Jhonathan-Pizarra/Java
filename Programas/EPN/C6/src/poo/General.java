package poo;

public class General extends Policia{
	
	private double incentivo;
	
	public General() {
		super();
	}//Me va a heredar lo del primer constrcutro
	
	public General(String nombre, double sueldo ) {
		super(nombre,sueldo);
	}
	
	public General(String nombre) {
		super(nombre);
	}
	
	public General(String nombre, double sueldo, int year, int month, int day ) {
		super(nombre,sueldo, year, month-1, day);
	}
	
	
	public void SetIncentivo() {
		incentivo=1000;
	}
	
	public double GetSueldoGeneral() {
		//En este caso, lo que hice fue que en el mismo getter hice lo que se hace en los setter
		/* �Pero por que?, primero, porque no defini (no necesite) definir un atributo... 
		 * Sino que solo necesitaba modificar un poco el queya tenia, del sueldo de un policia
		 * De hecho, ser�a m�s aconsejable hacer un set para este chiste... y con el getter solo tener acceso {^^
		 * */
		double sueldo_general=super.GetSueldo();
		
		return sueldo_general+incentivo;
	}
	
}
