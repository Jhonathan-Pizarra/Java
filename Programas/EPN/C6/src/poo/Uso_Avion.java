package poo;

public class Uso_Avion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avion avion1=new Avion();
		
		avion1.SetColor("azul");/* Vamos a heredarlo*/
		System.out.println(avion1.GetColor());
		System.out.println(avion1.GetDimensiones());
		System.out.println(avion1.GetPeso());
		System.out.println(avion1.GetRuedas());
		
		//Notese que pasajeros es propio del jet, pero no fue definido en avion...
		//Y ahora color, no fue definido en Jet, pero si en avion.... 
		//La solucion para esteblecer un color a jet ser�a creando un Getter y un setter (O pasarlo por par�mtro) (Lo cual involucra una nueva variable)}
		//O podriamos heredar ese atributo de nuestra clase padre: Avion
		System.out.println(".....................................");
		Jet jet1=new Jet(1000,20);//Le pas� parametros a este objeto, porque es una clase difeerente...
		System.out.println(jet1.GetPasajeros());
		jet1.SetColor("verde");/* Se ha heredado */
		
		System.out.println(jet1.GetColor());
		System.out.println(jet1.GetDimensiones());
		/*System.out.println(avion1.getvelocida);//No aparece la opcion velocidad, porque es propia de Jet
		System.out.println(jet1.getruedas);//Si puedo heredad las del avion
		//Un hijo puede heredar de un padre, pero un padre no hereda del hijo
		
		//Si usamos herencia, no tendremos que reedefinis los atributopds
		 */
		System.out.println("@......");
		Avion_Militar avion_xyz=new Avion_Militar("ETx-34", 34);
		avion_xyz.SetArmas();
		System.out.println(avion_xyz.GetArmas());
		System.out.println(avion_xyz.GetCanitdad());

	}

}
