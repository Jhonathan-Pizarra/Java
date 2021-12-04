/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;


public class TestDatos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Datos2 estudiante_1=new Datos2();
		Datos2 estudiante_2=new Datos2();
		Datos2 estudiante_3=new Datos2();
		
		estudiante_1.definir_nombre("Jhonathan");
		//Aqui podríamos definir todo lo demas atributos de este objeto
		
		estudiante_2.definir_nombre("Omar");
		estudiante_2.definir_apellido("Pizarra");
		estudiante_2.definir_año_nacimiento(1984);
		
		System.out.println(estudiante_2.obtener_nombre());
		System.out.println(estudiante_2.obtener_apellido());
		System.out.println(estudiante_2.obtener_año_nacimiento());


	}

}

//EN RESUMEN El paso por parametros sirve mas para cuando queramos mandar valores quemados
//Es un poco más trabajoso si se tiene muchos usuarios .... porque deberíamos crear muchos objetos y darles muchos diferentes atributos
// Si no pasamos por parametros, significa que tendremos varias opciones, por lo que pasar en el setter sería lo mejor (Ver POO C_2)
