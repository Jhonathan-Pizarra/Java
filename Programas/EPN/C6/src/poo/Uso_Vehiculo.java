package poo;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo_1=new Vehiculo(2, 200,300);
		
		System.out.println(vehiculo_1.GetRuedas());
		vehiculo_1.SetPuertas();
		System.out.println(vehiculo_1.GetPuertas());
		//Setea el color.. y la marca tambien..
		vehiculo_1.SetColor();
		System.out.println(vehiculo_1.GetColor());
		vehiculo_1.SetMarca();
		System.out.println(vehiculo_1.GetMarca()); //NULL porque nunca le indique nada al setter xD
		System.out.println("....................");
		
		//Si bien. tanto vehiculo como autobus, tienen parecidos atributos, solo
		//Autobus tiene el metodo get capacidad o get veolocidad, y no fue necesario crear metodos
		//para las demas cosas (color, ruedas) porque ya fueron, heredados
		Autobus autobus_1=new Autobus(4,550, 360);
		autobus_1.SetColor();
		System.out.println(autobus_1.GetColor()); //"heredado de vehuclo"
		System.out.println(autobus_1.GetRuedas());//"Heredado de vehuculo"
		autobus_1.SetCapacidadAuto_bus();
		System.out.println(autobus_1.GetCapacidad_Autobus()); //Propia de autobus
		
	}

}
