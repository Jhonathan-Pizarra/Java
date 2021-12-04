package poo;

public class Decano extends Profesor{ //2)Al momento que pusimos extends, nos dio error en el constrcutor, eso se debe a que ahora nuestro constructor necestia saber, de donde va a heredar los atrivutos iniciales
	
	//Atributos generales 
	private int incentivo;
	
	//2) M�todo contrcutor
	public Decano (String nombre, int sueldo, int year, int month, int day) { //1)Hasta este punto solo hemos creado la clase, y dato un atributo, pero si vemos en el uso profesor, si creamos un objeto de tipo decano:
		//No tiene acceso a ningun atributo, por lo que deber�amos crear atributos, y luego setters y getters para tener acceso a esos atribtuos
		//Pro que pasa, que resulta que Decano tiene los mimsmos atributos que profesro, con excepcion del incetivo, por lo que deber�amos heredarlooo
		

		super( nombre,  sueldo,  year,  month-1,  day); //3) Le puse super, y a�n as� me sigue dando error, es porque, primero, el contrcturo padre tiene parametros... por lo que deber�a mndar esos mismo parametros a buscar aqui en el super 
		//4) A�n as�, aunque le mand� los parametros, de un contrcutor (constrcutro c me parece) , toav�a me da error, es porque este contructor nuestro, no tiene los parametros del padre, y as� no puede heredar nada....
		//6) recuerda que en el super, no se deben pasar los tipos de datos y los nombres de los atributos, solo los nombres de los atributos...
	}
	//7) Listo !, ya hemos heredado las condiciones inciales para nuestro decano
	//8) �Pero que pasa si yo no quer�a heredar de este metodo, sino de otro?
	
	public Decano(String nombre, int sueldo) {
		
		super(nombre, sueldo);
	
	}//9) Hacer lo mismo que haciamos para con this, solo que ahora, heredamos jaja
	//La diferencia es qeu ahora, no estamos definiendo nada, y estamso pasando el valor a otra clase

	
	//10) Por �ltimo usar Getters y Setters para los atributos generales (Propios de esta calase)
	
	public void SetIncentivo() {
		incentivo=1000;
		
	}
	
	public int GetSueldoDecano() {
		int sueldo_decano=super.GetSueldo(); // super.GetSueldo(); me da acceso al atributo sueldo de la clase profesor... Eso se usa cuando queremos heredar un atributo que nos sirviera de la clase padre (Obvio solo hay que usarla en un Getter)
		
		return sueldo_decano+incentivo;
	}
	
	
}
