package poo;

public class Uso_Profesor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Decano decano_1=new Decano("Oliver", 200, 20, 11, 11);
		
		System.out.println(decano_1.GetNombre());
		System.out.println(decano_1.GetSueldoDecano());
		System.out.println(decano_1.FechaIngreso());
	}

}
