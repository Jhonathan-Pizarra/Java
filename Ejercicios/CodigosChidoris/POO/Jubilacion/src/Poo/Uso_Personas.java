package Poo;

public class Uso_Personas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hombres trabajador_1= new Hombres("Jhonathan", "Pizarra", "Publico", 125.90);
		
		/*System.out.println("Nombre: "+trabajador_1.GetNombre());
		System.out.println("Apellido: "+trabajador_1.GetApellido());
		System.out.println(trabajador_1.GetID("1725358525"));
		System.out.println("Años de Servicio: "+trabajador_1.GetAnios_Servicio(56));
		System.out.println("Nacimiento: "+trabajador_1.GetFecha_Nacimiento(1996, 11, 19));
		System.out.println("Edad: "+trabajador_1.GetEdad_Hombre()+" años");
		System.out.println("Tipo de Empleo: "+trabajador_1.GetTipo_Empleo());
		System.out.println("Sueldo: "+trabajador_1.GetSueldo_Promedio());
	*/
		//trabajador_1.SetID();
		System.out.println(".................................................."); 
		
	
		Mujeres trabajador_2=new Mujeres("Jessica", "Naranjo", 171025865, 25, "Privado", 35, 125.9, 1996, 11, 10);
		System.out.println("Nombre: "+ trabajador_2.GetNombre());
		System.out.println("Apellido: "+ trabajador_2.GetApellido());
		System.out.println(trabajador_2.GetID("1725358525"));
		System.out.println(trabajador_2.GetAnios_Servicio());
		System.out.println("Nacimiento: "+ trabajador_2.GetFecha_Nacimiento());
		System.out.println("Edad: "+trabajador_2.GetEdad_Mujer()+" años");
		System.out.println("Tipo de Empleo: "+ trabajador_2.GetTipo_Empleo());
		System.out.println("Sueldo: "+ trabajador_2.GetSueldo_Promedio());
		System.out.println("..................................................");
	//	System.out.println("Jubilacion Hombre: "+trabajador_1.GetCalculo_Jubilacion());
		System.out.println("Jubilacion Mujer: "+trabajador_2.GetCalculo_Jubilacion());
		
		
	}

}
 