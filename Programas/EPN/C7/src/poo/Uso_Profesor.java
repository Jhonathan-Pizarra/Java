package Poo;

public class Uso_Profesor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profesor profe_1=new Profesor("Jhonathan", 200); //Tomó del contrctor a
		System.out.println(profe_1.GetNombre());
		//System.out.println(profe_1.FechaIngreso()); //No fue definida en el constrcutor a, por lo quebería hacerse un setter para esta fecha... 

		Profesor profe_2=new Profesor("Omar");//Tomo el contrcutroe c
		System.out.println(profe_2.GetSueldo()); //Su sueldp ya estaba preedefinido, solo neceitaba un parámetro
	
		
		Profesor profe_3=new Profesor("Zulema", 300, 20, 11, 13);//Toma el contrcutor b
		System.out.println(profe_3.FechaIngreso()); //Obvio, todo ya definimos aqui jaja
	
		System.out.println("......................................");
		System.out.println("Nombre: "+profe_3.GetNombre());
		System.out.println("Sueldo: "+profe_3.GetSueldo());
		System.out.println("Ingreso: "+profe_3.FechaIngreso());
		profe_3.SetSueldo(50);
		System.out.println("Sueldo Aumentado: "+ profe_3.GetSueldo());
	}

}
