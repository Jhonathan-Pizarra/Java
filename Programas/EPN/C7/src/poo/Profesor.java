package Poo;
import java.util.*;;
public class Profesor {
	
	//1) Atributos generales
		private String nombre;
		private int sueldo;
		private Date fecha_ingreso;
		
		//2) Método Constrcutor a
		public Profesor(String nombre, int sueldo){
			this.nombre=nombre;
			this.sueldo=sueldo;
				
		}
		//2) Método contrcutor b
		public Profesor(String nombre, int sueldo, int year, int month, int day){
			this.nombre=nombre;
			this.sueldo=sueldo;
			
			GregorianCalendar calendario=new GregorianCalendar(year, month-1, day);
			fecha_ingreso=calendario.getTime();
			
		}
		//2.1) SOBRECARGA DE CONSTRUCTORES
		//No es más que una clase con más de un contrcutor (Lo que hace es que el objeto pueda tener un estado incial distinto, dependiendo de lo que se requeira)
		public Profesor(String nombre) { //Puede tener el mismo atributo, nada tiene que ver con el constructor de arriba
		//this.nombre=nombre; //No habría mucho sentido en hacer esto, puesto que decimos que hay más atributos, que si bien, no se definen en el contrcutor, deberan definirse en los metodos setters y getter
		this( nombre, 200, 30,12,10);

		//Sólo pasandole como argumento : nombre, me dará un error.	 ¿Por qué?
		//Porque lo que hacemos al moemnto de usar el this es estableciendo que este atributo tiene esta caracteristica, de este método... pero aqui..
		// Primero, es una estructura recursiva por lo que necesita de más parámetros
		
		//Al pasarle los otros parámetros (Que ya fueron previamente definidos) estoy diciendo que
		//Este medoto, solo recibe estos parametros, y los demás me los llena automáticamente con los datos que le escribí ahorita en el this(....) donde solo nombre entraria como parametro, para que entonces, this le reconozca
		
		//La neceisdad de usar este this, suegre de que haya sobrecarga de contrcutroes, ya que, dependiendo el parámetro que mandemos, el compilador irá reconocniendo entre construcotrs para ver cual cumple con lo especificadoy seleccionar ese
		
		//Por ejemplo, si le paso solo como parametro el sueldo, entonces todo lo demas ya tendré que definirlo, asi mimsmo si mandara ya todo definido en el this (Aunque me puda que psase como parametro sueldo) esete ya vendría establecido o si se quiere, puede ser sobreescrito
		
		//¿Pero que pasa si tengo 2 contrcutrores, y cada uno pasa parametors difetenes?
		//Lo que pasa es que, está bien , mientras el numero de parametros quemados en el this conicida con el numero de paramtreos de algun contrcutor, inmediatamente va a tomar los valores de ese contructor
		
		//Vuelvo y repito, el uso de este this es para que el compilador no se confunda al momento de elegir un contructor
		}
		
		public String GetNombre() {
			
			return nombre;
		}
		
		public int GetSueldo() {
			
			return sueldo;
		}
		public Date FechaIngreso() {
			
			return fecha_ingreso;
		}
		
		//A mas de esto , digamos que queremos que tenga un sueldo aumentado, no es ncesario crear un atributo sueldo aumentado , pero si quieres hazlo
		
		public void SetSueldo(double porcentaje) {
			double aumento=(sueldo*(porcentaje/100));
			sueldo=(int) (sueldo+aumento);
			
		}
}
