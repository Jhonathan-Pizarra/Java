//Gregorian Calendar
//Hasta ahora, pasar como argumentos la fecha, el dia y el mes, resulta muy molesto ...
//Esto, cuando se pasa por parámetro.. cuando se pasa por teclado es peor (Peor no tanto)jaja
//Este Gregorian Calendar nos sirve para cuando queramos pasar por parámetros

/*Programa que nos pida
 * ID del estudiante (El primero será el 1, el sigueinte 2, y así...)
 * Nombre Compelto
 * Fecha de ingreso: Año, Mes, Día
 * Numero de cédula
 * Semestre que está atravesando
 * Numero de Matricula (1 o 2) Primera o segunda  
 * Hacer que pase  por parametro el nombre completo, la fecha y ....la cedula. Lo demas a traves de setters
 * 
 * Y aparte, hacer que, si es segunda matricula se le cobre un monto adicional a la matricula
 */
package Poo;
//Siempre que queramos importar, debajo de nuestro packete ¿ok?
import java.util.*; //Para improtar el tipo DATE

public class Estudiantes {
	
	//1) Atributos Generales
	private String nombre;
	private long cedula;
	private Date fecha_ingreso; //java.util nos permite crear objetos de tipo Date
	
	//2) Atributos Especificos
	private String carrera;
	private int numero_matricula;
	private double valor_matricula;
	private double valor_aumento;
	private int id;
	
	//6) Variable
	private static int id_siguiente=1;//Static puede ser utiliada en constanes, o metodos, o variables (EN este caso esta variable se vuelve una variable de clase, (o un atributo)
	
	//3) Metodo Constructor
	//Pudimos poner el ano, mes y dia sin registrarlo en los atributos,porque todo se encuetra en DATE
	public Estudiantes(String nombre, long cedula, int year, int month, int day ) {
		this.nombre=nombre;
		this.cedula=cedula;
		
		//ATENCION:
		//GregorianCalendar+(nombre del calendarion)= new GregorianCalendar(year, month-1, day); //Los parametros que estableciomos fueron los del constructor
		//Restamos 1 a month porque este comienza a contar desde 1....
		GregorianCalendar calendario=new GregorianCalendar(year, month-1,day);
		//Los parametors, no necesitan estar precedidos por el tipo de dato, poque ya los definimos arriba en el contructor (Y deben ser tipo int)
		
		//Solo fanta igualar a una variable , para que reciba estos valores que están en el objeto calendario
		fecha_ingreso=calendario.getTime(); 
		//Y HASTA AQUI ES TODO EL LIO DEL GREGORIAN CALENDAR : Atributo: Date, improtar java.util, definir en los parametros año, mes y dia, y luego crear el objeto del tipo Gregorian calendar, y luego igualarlo a un dato (que sea de tipo date) que ya tenga contendio toda esa informacion... 
		
		//A PARTIR DE AQUI TAMBIEN VAMOS A HACER QUE EL USUARIO INGRESE LOS DATOS QUE QUIERE SE IMPRIMAN
		//Finalmente, voy a trabajdor con el constante Lo que hice aqui fue que le igualé y le sume 1
		//Asi el id irá cambiando en cada iteración del bucle
		id=id_siguiente;
		id_siguiente++;
	}
	
	//4) GETTERS 
	public String GetNombre() {
		
		return nombre;
	}
	public long GetCedula() {
		
		return cedula;
	}
	public Date GetFechaIngreso() {
		
		return fecha_ingreso;
	}
	//Como defini tambien un id, tengo que tener acceso a él..
	public int GetID() {
		
		return id;
	}
//A PARTIR DE AQUI VOY A IR HACIENDO LO DEMÁS....
	
	//5) SETTERS Y GETTERS
	//Set Carrera //Puedo hacer de 2 formas, pasando como parametro, y luego ir definiendo en el Uso_Estuidantes
	//O bien, psasr los argumentos dentro de este Set Carrera... Pero que pasa, que si hiciera lo segundo sería si tviera un monton de opciones a escoger y en este caso yo quiero ingresar la carrera, no escogerla.....
	//Por eso voy a hacer por el primer metodo
	public void SetCarrera(String carrera) {
		this.carrera=carrera;
		//¿Por qué no le defino una carrera? Nuevamente, porque yo quiero escribier la carrera, no quiero seleccionar entre una o muchas...
	}
	//Set Semestre
	public void SetSemestre(int numero_matricula) {
		this.numero_matricula=numero_matricula;
	}
	public void SetValorMatricula(double valor_matricula) {
		this.valor_matricula=valor_matricula;
	}
	public void SetAumentoMatricula(double valor_aumento) {
		this.valor_aumento=valor_aumento; //Pra imprimir el valor aumentado (No el monto del aumento, ojo, son cosas diferentes)
	}
	//EN RESUMEN, SI YO PASO POR PARAMETROS ES PORQUE YO QUUERO ESCRIBIR, PERO SI PASO POR ARGUMENTOS (OSEA LLENANDO EL SETTER ASÍ CON IFS Y SWITCHS SIN PASAR PARAMETROS) ES PORQUE YO VOY A ESCOGER DE ENTRE UNA LISTA

	//6) GETTERS DE SETTERS
	public String GetCarrera() {
		
		return carrera;
	}
	public double GetNumeroMatricula() {
		
		return numero_matricula;
	}
	public double GetValorMatricula() {
		if(numero_matricula==2) {
			valor_matricula=valor_matricula+valor_aumento;
		}
		
		return valor_matricula;
	}
			
}
