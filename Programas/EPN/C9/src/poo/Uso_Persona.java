package poo;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Persona persona_1=new Persona(); //No puedo instanciar porque es un metodo abstracto...
		Hombres man_1=new Hombres("Jhonathan Pizarra", 1953, 11, 01, 500, "Privado");

		System.out.println("Nombre: "+man_1.GetNombre());
		System.out.println("Fecha: "+man_1.GetFechaNacimiento());
		man_1.SetID("1725358525");
		//System.out.println("ID: "+man_1.GetID());
		System.out.println("Sueldo Promedio: "+man_1.GetSueldo_Promedio());
		man_1.SetAnios_Servicio(60);
		System.out.println("A�os de Servicio: "+man_1.GetAnios_Servicio());
		System.out.println("Edad: "+man_1.GetEdad());
		man_1.SetCalculo();
		System.out.println("Calculo-Jubilaci�n: "+man_1.GetCalculo());
		System.out.println("...........................");
		
		Mujeres woman_1=new Mujeres("Nicole Cantuña", 19, 1997, 05, 14, 1725358524, 25, 200);
		
		System.out.println("Nombre: "+woman_1.GetNombre());
		System.out.println("Fecha: "+woman_1.GetFechaNacimiento());
		System.out.println("ID: "+woman_1.GetID());
		System.out.println("Sueldo Promedio: "+woman_1.GetSueldo_Promedio());
		System.out.println("A�os de Servicio: "+woman_1.GetAnios_Servicio());
		woman_1.SetCalculo();
		System.out.println("Jubilaci�n: "+woman_1.GetCalculo());
		

		
	}

}
