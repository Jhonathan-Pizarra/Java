package Poo;

public class Uso_Policia {

	public static void main(String[] args) {
		
		Policia cabo_1=new Policia("Juan", 200, 2001, 10, 12);
		
		System.out.println("Nombre: "+cabo_1.GetNombre());
		System.out.println("Sueldo: "+cabo_1.GetSueldo());
		cabo_1.SetSueldoAumentado(50);
		System.out.println("Sueldo Aumentado: "+cabo_1.GetSueldo());
		System.out.println(".................");
		
		Teniente teniente_1=new Teniente("Victor", 100, 2002, 10, 11);
		System.out.println("Nombre: "+teniente_1.GetNombre());
		System.out.println("Sueldo: "+teniente_1.GetSueldo());
		teniente_1.SetIncentvo(3000);
		//teniente_1.SetSueldo(300);
		System.out.println("Sueldo Aumentado: "+teniente_1.GetSueldo());

		System.out.println("...POLIMORFISMO...");
		//Policia cabo_2=new Teniente("Xavier", 300, 2007, 11, 14);
		
		//cabo_2.set.. Aún así, no me presenta ninguna de las opciones de teniente... 
		//Para ello, lo que hacemos es un... truncar x3 ¿Y cómo lo hago?
		
		//Siempre respondete esta pregunta... Yo puedo convdrtir a un policia en un teniente... pero no puedo transformar un teniente a un poliocia
		//Lo primero que hay que hacer es POLIMORFISMO xD, tal y como arriba.
		
		Policia cabo_alfa=new Teniente("Jose", 600, 2009, 2, 1);
		//LUEGO:
		/* Sintaxis 
		 * Tipo de dato al que se desea truncar + "Quiero convertir a (Teniente)
		 * Nombre de el nuevo dato "un objeto de nombre teniente_alfa
		 * = a  "igualado a 
		 * ( Tipo de dato al que se desea truncar ) + "Un nuevo "Teniente" 
		 * Nombre del objeto (Del que haremos polimorfismo): que antes solía ser un Policia y se llamaba: ".....Es decir, heredar sus formas pero con la opcion a definirlas de otra manera
		 * */
		Teniente teniente_omega=(Teniente)cabo_alfa;
		
		System.out.println("Nombre: "+teniente_omega.GetNombre()); //Getnombre solo esta definido en la clase policia, sin embargo ahora se adapto para ser ademas de un objeto de tipo Teniente, uno de tipo Policia tambien
		System.out.println("Sueldo: "+teniente_omega.GetSueldo()); //Sueldo también se heredo en principio de la clase Policia, pero ahora tiene las caracterisitcas de sueldo Teneinte, por lo que si seteo un incentivo (Que solo existe en teniente) ese get sueldo se modificará al Getsuedo de teniente
		teniente_omega.SetIncentvo(3000);
		//teniente_omega.SetSueldo(300);
		System.out.println("Sueldo Aumentado: "+teniente_omega.GetSueldo());
		teniente_omega.SetSueldoAumentado(50);
		
		//RESUMEN
		//HERENCIA DICE: ¿Policia es un teniente? NO
					//   ¿Teniente es un Policia? SI
		
		//POLIMORFISMO DICE: ¿Policia puede convertirse en teniente? SI
					// ¿Teniente puede convertirse en un policia? NO
	
	}
}
