//HERENCIA
package poo;

public class TestVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1) Crear mi objeto
		Vehiculo vehiculo_1=new Vehiculo("Daniel");
		Vehiculo vehiculo_2=new Vehiculo("Miguel");//Creamos otro objeto de clase Vehiculo
		//Muy diferente a crear un objeto de otra clase...
		Bus autobus_1=new Bus(260, 2,"Luis");
		
		vehiculo_1.SetColor("Verde");
		vehiculo_1.SetMarca("AudiX");
		vehiculo_1.SetPuertas(4);
		vehiculo_1.SetSeguro(true);
		
		System.out.println(vehiculo_1.GetColor());
		System.out.println(vehiculo_1.GetDimensiones());
		System.out.println(vehiculo_1.GetMarca());
		System.out.println(vehiculo_1.GetSeguro());
		System.out.println("...................");
		
		Bus bus_1=new Bus(2000,10, "Maria"); //Me sale error, eso es porque me falta algo muy importante.... extends"
		//Los argumentos, tambi�n, no olvides, no tengo metodos setter y geter 
		//bus_1.SetColor("Rojo");
		//stem.out.println(bus_1.GetColor());

	}

}
