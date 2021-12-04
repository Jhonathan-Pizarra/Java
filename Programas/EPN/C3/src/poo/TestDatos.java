/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* Uso de setter para que nos pida: Nombre, Apellido, año de nacimiento  y a travez del getter nos de el nombre completo ,y la edad*/
//Pasar todo por parámetros
package poo;
public class TestDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1) Crear el objeto
		Datos dato_1=new Datos("ASI", "EPN");
		
		//Pasamos los parametros
		dato_1.SetNombre("Jhonathan");
		dato_1.SetApellido("Pizarra");
		dato_1.SetDia(19);
		dato_1.SetMes(11);
		dato_1.SetAño(1996);
		
		//Imprimimos
		System.out.println("Facultad: "+dato_1.GetFacultad());
		System.out.println("Universidad: "+dato_1.GetUniversidad());
		//Nota: Hasta aqui, para todos los objetois que hemos creado tendran como comun la facultad y la universidad, lo demas lo iremos definiendo...	
		System.out.println("Nombre: "+dato_1.GetNombre());
		System.out.println("Apellido: "+dato_1.GetApellido());
		System.out.println("Dia-Mes-Año: "+dato_1.GetDia()+ "/"+dato_1.GetMes()+"/"+dato_1.GetAño());
		System.out.println(".................................................");
		
		//2) Creamos otro objeto
		Datos dato_2=new Datos("ASI", "EPN");
		
		//Pasamos los parametros
		dato_2.SetNombre("Miguel");
		dato_2.SetApellido("Iturralde");
		dato_2.SetDia(18);
		dato_2.SetMes(10);
		dato_2.SetAño(1995);
		
		//Imprimimos
		System.out.println("Facultad: "+dato_1.GetFacultad());
		System.out.println("Universidad: "+dato_1.GetUniversidad());
		//Nota: Hasta aqui, para todos los objetois que hemos creado tendran como comun la facultad y la universidad, lo demas lo iremos definiendo...	
		System.out.println("Nombre: "+dato_2.GetNombre());
		System.out.println("Apellido: "+dato_2.GetApellido());
		System.out.println("Dia-Mes-Año: "+dato_2.GetDia()+ "/"+dato_2.GetMes()+"/"+dato_2.GetAño());
		System.out.println(".................................................");
		

	}

}
