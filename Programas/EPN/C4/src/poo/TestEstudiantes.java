package Poo;
import java.util.*;
public class TestEstudiantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1) Crear un objeto
		/*
		Estudiantes estudiante_1=new Estudiantes("Jhonathan Pizarra", 1725358525,1996,11,19);
		
		System.out.println(":"+estudiante_1.GetNombre());
		System.out.println(":"+estudiante_1.GetCedula());
		System.out.println(":"+estudiante_1.GetFechaIngreso()); */
		
		//Pero si quisieramos crear varios objetos del tipo estudiante???
		Estudiantes[] estudiante=new Estudiantes[2];
		//Fijate que, aunque pasamos por paramteos algunos atributos, el arreglo actua muy diferente. �Per como entonces llenamos esos atributos?
		//As�, en cada item ir creando el objeto
		estudiante[0]=new Estudiantes("Armando Casas", 1725358522, 1998, 12,12);
		estudiante[1]=new Estudiantes("Aquiles Castro ", 1725454522, 1988, 10,1);
		//estudiante[2]=new Estudiantes("Orlando Piezas ", 1722328565, 1968, 9,2);
		
		//ESOS los definimos as� porque fueron pasados como parametros en el contructor...pero y los otros???
		for(int i=0; i<2; i++) {
			//Si quiesieras poner atributos diferntes de un mismo objeto, deber�amos ir por aqui
			// Pero si quisieramos poner atributos diferentes de entre 2 objetos (Y no quisieramos hacer tantos getters y setters) lo que har�amos ser�a heredar y abstraer...
			Scanner entrada=new Scanner(System.in);
			System.out.print("Ingrese la carrera: ");
			String carrera=entrada.next();
	
			estudiante[i].SetCarrera(carrera);
			//Para la carrera UNA COSA ES ELEGIR ENTRE OOCIONES Y OTRA ES ESCRIBIRLAS TU
			System.out.print("Ingrese Numero_matricula: ");
			int semestre=entrada.nextInt();
			estudiante[i].SetSemestre(semestre);
			//Para el semestre
			System.out.print("Ingrese el monto que paga: $");
			double valor_matricula=entrada.nextDouble();
			estudiante[i].SetValorMatricula(valor_matricula);
			//Para el valor de la matricula...
			System.out.print("Ingrese un monto de aumento: ");
			double valor_aumento=entrada.nextDouble();
			estudiante[i].SetAumentoMatricula(valor_aumento);	
			System.out.println("..............................");
			
			//No te confundas, use el mismo nombre para de los atributos para las variables, pero no tienen naa que ver, porque el metodo, los atributos ya fueron especificados el rato que yo le di un valor a la variable (Que repito, nada tiene que ver con el atributo, solo quise almacenar valor para que el metodo haa el trabaj)
		}
		for(int i=0; i<2; i++) {
			System.out.println("ID: "+estudiante[i].GetID()); //ir� registrando a cada estudainte..1 , 2, 3, 4, 5, n....
			System.out.println("Nombre: "+estudiante[i].GetNombre());
			System.out.println("Cedula: "+estudiante[i].GetCedula());
			System.out.println("Fecha de ingreso: "+estudiante[i].GetFechaIngreso());
			System.out.println("Carrera: "+estudiante[i].GetCarrera());
			System.out.println("Numero_matricula: "+estudiante[i].GetNumeroMatricula());
			System.out.println("Valor de Matricula: "+estudiante[i].GetValorMatricula());
			System.out.println(".............................................");
		}

		

	}

}
