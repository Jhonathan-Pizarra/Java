package poo;

public class Uso_Policia {

	public static void main(String[] args) {
		
		General general_1=new General();
		
		System.out.println("Nombre(Del primer constructor): "+general_1.GetNombre());
		//general_1.SetCalendario(1996, 11, 9);
		
		General general_2=new General("Jhonathan",200);
		System.out.println("Nombre(Del segundo constructor): "+general_2.GetNombre());
		//general_2.SetCalendario(1997, 10, 1);  //Tendria que hacer un get para ver esta fecha...
		
		//Estos Calendarios estan seteados, ya que en el constructor no los defini, pero ahora si va uno que yo defini
		
		General general_3=new General("Arturo");
		//Ahora ya se me deber�an haber definido la fecha solita.. porque lo hice en el policia (Que luego herede a general)
		System.out.println("Nombre(Del tercer constructor): "+general_3.GetNombre());
		System.out.println("Fecha(Heredada): "+general_3.GetCalendario());

		
		General general_4=new General("Jose", 500, 1996, 11,19);
		System.out.println("Nombre(Del cuarto constructor): "+general_4.GetNombre());
	
		
		System.out.println("..................");
		System.out.println("Sueldo: "+general_1.GetSueldo());
		general_1.SetAumento();
		System.out.println("Sueldo+Aumento: "+general_1.GetSueldo());
		//Ahora debemos settear el incentivo...
		general_1.SetIncentivo();
		System.out.println("Sueldo General: "+general_1.GetSueldoGeneral());
		
	}

}
