package Poo;

public class Uso_Profesor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profesor [] misProfesores=new Profesor[8]; //Guarda en memoria, 8 objetos del tipo Profesor
		
		//misProfesores[0].//Hasta ahi, obtiene los metodos de la clase profesores, y solo esos
		//1) Creamos un objeto del tipo Profesor (Que se alamcena en un espacio de memoria) 
		misProfesores[0]=new Profesor("Jhonathan", 500, 2009, 11, 14);
		misProfesores[1]=new Profesor("Omar"); //Solo le di el otro constructor
		misProfesores[2]=new Profesor("Miguel", 300, 2004, 12, 14);
		misProfesores[3]=new Profesor("Jimena", 100, 2010, 8, 12);
		misProfesores[4]=new Profesor("Carla", 200, 2009, 11, 11);
		misProfesores[5]=new Profesor("Xavier", 500, 2009, 11, 14);
		//Hasta aqui, lo unico que hemos hecho es crear un areglo de objetos del tipo Profesor...
		
		//MIRA BIEN: Profesor teacher=new Decano("Mauricio", 200, 1996, 12, 12);
	/*---> Aqui esta la fecha*/	misProfesores[6]=new Decano("Chsitian", 500, 2007, 12, 1);//UN OBJETO DE LA SUBCLASE PUEDE METERSE EN UN CONTENEDOR DE LA SUPERCLASE : POLIMORFISMO
		//AL Momento en que le meto a este conetendedor, ya no es solo un objeto de tipo decano sino uno de tipo Profesor tambien
		
		//También puedo definir así: Crear un objeto del tipo Decano
		Decano decano_1=new Decano("Juan", 230, 2006, 12, 12);
		misProfesores[7]=decano_1; //Listo, los parametros ya fueron definidos, entonces si es válido
		
		decano_1.establecerIncentvo(4000); //Notese que se puede establecer incentivo cuando lo hacemos de esta forma...
		//Pero así:
		//misProfesores[6].//No tiene la opcion, a pesar de que allí se aloja un Objeto de tipo empleado, entonces ¿Qué deberíamos hacer?		
		//Para establecer el incentivo debemos hacer una "refundicion de objetos"
				//Tipo de dato que quiero crear
				//ESta en el objeto decano_x , lo esta generandoun objeto de tipo decano que inicialmete era un profesor
				Decano decano_x=(Decano)misProfesores[6];
				decano_x.establecerIncentvo(3000);
		//<-- sigue la flecha para q entiendas esta parte		//Puedo hacer este cambio siempre y cuando yo haya declarado a este objeto de tipo profesor como tipo decano
				
				/*EROOOR
				 * Aqui pasó algo curioso, ya que profesores es un tipo Profesor y yo intente hacerlo decano...
				Decano decano_y=(Decano)misProfesores[5];
				decano_y.establecerIncentvo(2000); */
				
				//YO NO PUEDO TRANSOFRMAR A UN TIPO DE DATO PROFESRO A UNN DECANO (UN decano es un profesor, pero no viceverssa , ademas en misProfesores[0] yo declare como tipo Profesor
				/*Decano decana_petorleos=(Decano)misProfesores[0];
				decana_petorleos.establecerIncentvo(3000);*/
		
		for (Profesor each: misProfesores) { //Este bucle lo que hará es recorrer el arreglo subiendo suel sueldo a
			// todos los profesores (Y cuando llegue a decano, acturaá en funcuon del sueldo de decano, en ese momento, solo en ese momento cambiará su funcionalidad)
			//each, variable de tipo Profesor...
			each.subierSueldo(5);
			
		}
		//each: lo que hace es que cada iteracion va asumiendo el objeto que se va poniendo
		
		for(Profesor each: misProfesores) {
			
			System.out.println("Nombre: "+each.obtenerNombre()
			+" Sueldo: "+each.obtenerSueldo()
			+" Fecha: "+each.obtenerFechaIngreso());
			
		}
		
		
		
	}
}