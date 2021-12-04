/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Aqui si vamos a poder imprimir, porque tiene metodo main
//Esta plantilla se va a usar para el uso (El anterior era para las caracteristicas generales)
package poo;
public class TestAvion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lo primero que hay que hacer es crear un objeto
		//1) Objeto
		//Sintaxis: Clase nombredelobjeto = nuevo Metodo_de la Clase: Avion
		//Es decir: //Clase + nombre_del_objeto=nuevo objeto de la clase: Avion
		Avion avion_1=new Avion() ;
		Avion avion_2=new Avion();
		
		//avion_1.ruedas=3;		ERROR, primero, ruedas está encapsulado, por lo que no tenemos acceso a ese atributo...
		//Lo segundo es que esto no debe (Se puede, quitando la encapsulación) pero no debe hacerse, modificar desde una clae ajena, sería una violación ya que la idea es definir ese valor en la Clase avión, sino ¿Para que hacemos la clase? ...Eso no sería POO sería una programación estrcuturada...
		
		//System.out.println("El numero de rudas del avion: "+nuevo_avion.ruedas);
		
		//SI nosotros definimos atriubuts, el objeto que creemos se va a crear con todos esos atributos (Aplicamos el principio de modulacion)
	
				
	//Sin embargo me salio un error, al querer imprimir en ruedas, fue porque le puse el private a int ruedas... Lo encapsulé, así que otras cases (Como es esta) no tienen acceso a ese atributo...
	//Las otras clases ya no tiene acceso a esta clase
		/*¿Como puedo hacer que tenga acceso a esta?
		 * a TRÁVES DE LOS MÉTODOS SETTER Y GETTERS */
		System.out.println("El numero de ruedas es: "+avion_1.GetterRuedas());
		System.out.println("El avion tiene: "+avion_1.GetterAlas()+" alas");
		System.out.println("El avion pesa: "+avion_1.GetterPeso()+" Kg");
		System.out.println(" .................................");
		avion_1.SetterPesoFinal();
		avion_1.SetterInternet();
		System.out.println("El peso final es: "+avion_1.GetterPesoFinal());
		System.out.println("Internet: "+avion_1.internet); //Lo usé así para boolean pero en realidad , puedo hacerlo para con cualquier setter que no tenga parámetros.
		System.out.println(" .................................");
		System.out.println("Paso por parámetro: ");
		avion_1.SetterColor("Azul"); //Colocamos el color para este objeto... Si quiero, puedo crear otro objeto y mandarle como parámetro, otro color.
		System.out.println("El avion tiene color: "+avion_1.GetterColor());
		System.out.println(" .................................");
		System.out.println("Avion 2.");
		avion_2.SetterColor("Verde");
		avion_2.SetterPesoFinal();
		System.out.println("El avion 2 tiene color: "+avion_2.GetterColor());
		System.out.println("El avión 2 tiene peso final de: "+avion_2.GetterPesoFinal());
		
		
		
		//Conclusión, si quisiera que los valores sean diferentes para uno y otro objeto, lo más optimo serí ahacer pasos por parámetro
		//O bien, generar, dentro del setter, un menu de opciones , y realizar operaciones en torno a elecciones :) 
		
	}

}
